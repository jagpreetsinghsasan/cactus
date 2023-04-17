import { execSync } from "child_process";
import { existsSync } from "fs";
import jsDependencyExtractor from "js-dependency-extractor";
let testToolingPackageAffected = false;

const pathsToCiJobsMapping = new Map([
  ["tools/docker/besu-all-in-one", ["ghcr-tools-besu-all-in-one"]],
  ["packages/cactus-cmd-api-server", ["ghcr-packages-cactus-cmd-api-server"]],
  [
    "packages/cactus-plugin-ledger-connector-besu",
    ["ghcr-packages-cactus-plugin-ledger-connector-besu"],
  ],
  [
    "packages/cactus-plugin-ledger-connector-corda",
    ["ghcr-packages-cactus-plugin-ledger-connector-corda-server"],
  ],
  [
    "packages/cactus-plugin-ledger-connector-fabric",
    ["ghcr-packages-cactus-plugin-ledger-connector-fabric"],
  ],
  [
    "tools/docker/corda-all-in-one",
    [
      "ghcr-tools-corda-all-in-one",
      "ghcr-tools-corda-all-in-one-flowdb",
      "ghcr-tools-corda-all-in-one-obligation",
    ],
  ],
  [".devcontainer", ["ghcr-dev-container-vscode"]],
  ["examples/carbon-accounting", ["ghcr-examples-carbon-accounting"]],
  ["examples/supply-chain-app", ["ghcr-examples-supply-chain-app"]],
  [
    "tools/docker/fabric-all-in-one",
    ["ghcr-tools-fabric-all-in-one", "ghcr-tools-fabric2-all-in-one"],
  ],
  ["tools/docker/iroha-all-in-one", ["ghcr-tools-iroha-all-in-one"]],
  [
    "packages/cactus-plugin-keychain-vault/src/cactus-keychain-vault-server",
    ["ghcr-packages-cactus-plugin-keychain-vault-server"],
  ],
  ["tools/docker/quorum-all-in-one", ["ghcr-tools-quorum-all-in-one"]],
  [
    "tools/docker/quorum-multi-party-all-in-one",
    ["ghcr-tools-quorum-multi-party-all-in-one"],
  ],
  ["tools/docker/rust-compiler", ["ghcr-tools-rust-compiler"]],
  ["tools/docker/test-npm-registry", ["ghcr-tools-test-npm-registry"]],
  ["whitepaper", ["ghcr-whitepaper"]],
]);

// this function returns an array of "ghcr-*" ci jobs which needs to be executed
// Sample output: [ 'ghcr-tools-besu-all-in-one', 'ghcr-packages-cactus-cmd-api-server' ]
function listOfGhcrJobsToRun(gitDiffFilePaths) {
  let listOfGhcrJobsToRun = [];
  let gitDiffFilePathsJoined = gitDiffFilePaths.join("|");
  pathsToCiJobsMapping.forEach((_ghcrJobs, pathForImage) => {
    if (gitDiffFilePathsJoined.includes(pathForImage)) {
      listOfGhcrJobsToRun.push(...pathsToCiJobsMapping.get(pathForImage));
    }
  });
  return listOfGhcrJobsToRun;
}

// this function generates a list of packages and extensions which need to be
// tested by the CI due to a given git diff
// NOTE: execute this function to get the package list for CI only when
// testToolingPackageAffected == true;
async function packagesAndExtensionsAffectedByDiff(gitDiffFilePaths) {
  let uniquePackagesAndExtensionsAffectedByDiff = [];
  const dependencyGraph = await generateDependencyGraph();
  //for each package
  const uniquePackagesAffectedByDiff = extractUniquePackagesFromDiff(
    gitDiffFilePaths,
  );
  const allPackagesAndDependenciesAffectedByDiff = new Set();
  uniquePackagesAffectedByDiff.forEach((uniquePackage) => {
    dependencyGraph.forEach((cactusPackageDependencySet, cactusPackage) => {
      if (cactusPackageDependencySet.has(uniquePackage)) {
        allPackagesAndDependenciesAffectedByDiff.add(cactusPackage);
      }
    });
    allPackagesAndDependenciesAffectedByDiff.add(uniquePackage);
  });

  //for each extension
  const uniqueExtensionsAffectedByDiff = extractUniqueExtensionsFromDiff(
    gitDiffFilePaths,
  );
  const allExtensionsAndDependenciesAffectedByDiff = new Set();
  uniqueExtensionsAffectedByDiff.forEach((uniqueExtension) => {
    dependencyGraph.forEach((cactusExtensionDependencySet, cactusExtension) => {
      if (cactusExtensionDependencySet.has(uniqueExtension)) {
        allExtensionsAndDependenciesAffectedByDiff.add(cactusExtension);
      }
    });
    allExtensionsAndDependenciesAffectedByDiff.add(uniqueExtension);
  });

  uniquePackagesAndExtensionsAffectedByDiff.push(
    ...allPackagesAndDependenciesAffectedByDiff,
  );
  uniquePackagesAndExtensionsAffectedByDiff.push(
    ...allExtensionsAndDependenciesAffectedByDiff,
  );
  return uniquePackagesAndExtensionsAffectedByDiff;
}

function checkIfCactiPackage(packageName) {
  return packageName.includes("cactus");
}

// generate a dependency graph
async function generateDependencyGraph() {
  const dependencyGraph = new Map();
  // for each package, add the hyperledger cacti package dependencies
  const allCactusPackages = getAllCactusPackages();
  for (let cactusPackage of allCactusPackages) {
    const packagePath = "packages/" + cactusPackage;
    const packageJsonPath = "packages/" + cactusPackage + "/package.json";
    if (existsSync(packageJsonPath)) {
      let dependencies = await jsDependencyExtractor({
        path: packagePath,
      });
      dependencies = dependencies.filter(checkIfCactiPackage);
      dependencies.forEach((cactusDependency, index) => {
        dependencies[index] = cactusDependency.replace("@hyperledger/", "");
      });
      dependencyGraph.set(cactusPackage, new Set(dependencies));
    }
  }

  //for each extension, add the hyperledger cacti package dependencies
  const allCactusExtensions = getAllCactusExtensions();
  for (let cactusExtension of allCactusExtensions) {
    const packagePath = "extensions/" + cactusExtension;
    const packageJsonPath = "extensions/" + cactusExtension + "/package.json";
    if (existsSync(packageJsonPath)) {
      let dependencies = await jsDependencyExtractor({
        path: packagePath,
      });
      dependencies = dependencies.filter(checkIfCactiPackage);
      dependencies.forEach((cactusDependency, index) => {
        dependencies[index] = cactusDependency.replace("@hyperledger/", "");
      });
      dependencyGraph.set(cactusExtension, new Set(dependencies));
    }
  }
  return dependencyGraph;
}

// this function get all the packages except for cactus-test-tooling packages
// NOTE: any changes to the test tooling package currently will trigger the entire CI
function getAllCactusPackages() {
  const allCactusPackagesCmd = "cd packages" + " && ls | grep cactus-";
  const allCactusPackages = execSync(allCactusPackagesCmd)
    .toString("utf-8")
    .split("\n");
  allCactusPackages.splice(allCactusPackages.indexOf(""), 1);
  allCactusPackages.splice(allCactusPackages.indexOf("cactus-test-tooling"), 1);
  return allCactusPackages;
}

// this function gets all the extensions
function getAllCactusExtensions() {
  const allCactusExtensionsCmd = "cd extensions" + " && ls | grep cactus-";
  const allCactusExtensions = execSync(allCactusExtensionsCmd)
    .toString("utf-8")
    .split("\n");
  allCactusExtensions.splice(allCactusExtensions.indexOf(""), 1);
  return allCactusExtensions;
}

// this function extracts unique packages, from the git diff
function extractUniquePackagesFromDiff(gitDiffFilePaths) {
  let uniquePackages = new Set();
  gitDiffFilePaths.forEach((filePath) => {
    const fileExtension = filePath.substring(
      filePath.lastIndexOf(".") + 1,
      filePath.length,
    );
    const filePathSplit = filePath.split("/");
    if (
      filePathSplit.length > 2 &&
      filePathSplit[0] == "packages" &&
      (filePath.includes("docs/") == false || fileExtension != "md") &&
      filePathSplit[1] != "cactus-test-tooling"
    ) {
      uniquePackages.add(filePathSplit[1]);
    }
    if (
      filePathSplit[1] == "cactus-test-tooling" &&
      (filePath.includes("docs/") == false || fileExtension != "md")
    ) {
      testToolingPackageAffected = true;
    }
  });
  return uniquePackages;
}

// this function extracts the unique extensions from the git diff
function extractUniqueExtensionsFromDiff(gitDiffFilePaths) {
  let uniqueExtensions = new Set();
  gitDiffFilePaths.forEach((filePath) => {
    const fileExtension = filePath.substring(
      filePath.lastIndexOf(".") + 1,
      filePath.length,
    );
    const filePathSplit = filePath.split("/");
    if (
      filePathSplit.length > 2 &&
      filePathSplit[0] == "extensions" &&
      (filePath.includes("docs/") == false || fileExtension != "md")
    ) {
      uniqueExtensions.add(filePathSplit[1]);
    }
  });
  return uniqueExtensions;
}

// return true when there is no difference between the main branch and this branch
function checkIfNoDiff(filePaths) {
  return filePaths.length == 0 ? true : false;
}

// return true when diff exists and contains only markdown file changes
function checkIfOnlyDocsDiff(filePaths) {
  let onlyDocsDiff = true;
  if (checkIfNoDiff(filePaths)) onlyDocsDiff = false;
  filePaths.forEach((filePath) => {
    if (filePath.includes("docs/") == false || fileExtension != "md")
      onlyDocsDiff = false;
  });
  return onlyDocsDiff;
}

// return string[] containing all the filepaths in git diff with main branch
// example output (below)
// [
//   'packages/cactus-api-client/test1.txt',
//   'packages/cactus-cmd-api-server/test2.txt',
//   'packages/cactus-cmd-socketio-server/test3.txt',
//   'packages/cactus-cmd-socketio-server/test4.txt',
//   'tools/magic-script.js'
// ]
function getGitDiff() {
  const cliCommand = "git diff main --name-only";
  return execSync(cliCommand).toString("utf-8").split("\n").sort().splice(1);
}

// ------------------------------------------------------------------------------------------------

let optimizedCliOutput = new Map();

// getting the git diff
const gitDiffFilePaths = getGitDiff();

// checking if its a documentation PR
// TODO: Update this task to work on docs/ folder of packages
// instead of checking for .md files
optimizedCliOutput.set("onlyDocsDiff", checkIfOnlyDocsDiff(gitDiffFilePaths));

// printing a list of all packages which need to be tested by CI as they are affected
// NOTE: Testing the entire CI for cactus-test-tooling due to urgent requirements
// TODO: Update the case of cactus-test-tooling for more optimized CI
const allPackagesExtensionsAndDependenciesAffectedByDiff = await packagesAndExtensionsAffectedByDiff(
  gitDiffFilePaths,
);
if (testToolingPackageAffected) {
  const allPackagesAndExtensions =
    getAllCactusExtensions() + getAllCactusExtensions();
  optimizedCliOutput.set(
    "affectedPluginsAndExtensions",
    allPackagesAndExtensions,
  );
} else {
  optimizedCliOutput.set(
    "affectedPluginsAndExtensions",
    await packagesAndExtensionsAffectedByDiff(gitDiffFilePaths),
  );
}

optimizedCliOutput.set(
  "affectedGhcrCiJobs",
  listOfGhcrJobsToRun(gitDiffFilePaths),
);

console.log(JSON.stringify(Object.fromEntries(optimizedCliOutput)));
