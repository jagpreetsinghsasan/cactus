import { execSync } from "child_process";
import { existsSync, readFileSync } from "fs";
import { NpmExtractor } from '@h4ad/dependency-extractor';

// this function generates a list of packages, extensions and examples which need to be
// tested by the CI due to a given git diff
async function packagesExtensionsAndExamplesAffectedByDiff(gitDiffFilePaths) {
  let uniquePackagesExtensionsAndExamplesAffectedByDiff = new Set();
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

  //for each example
  const uniqueExamplesAffectedByDiff = extractUniqueExamplesFromDiff(
    gitDiffFilePaths,
  );
  const allExamplesAndDependenciesAffectedByDiff = new Set();
  uniqueExamplesAffectedByDiff.forEach((uniqueExample) => {
    dependencyGraph.forEach((cactusExampleDependencySet, cactusExample) => {
      if (cactusExampleDependencySet.has(uniqueExample)) {
        allExamplesAndDependenciesAffectedByDiff.add(cactusExample);
      }
    });
    allExamplesAndDependenciesAffectedByDiff.add(uniqueExample);
  });

  allPackagesAndDependenciesAffectedByDiff.forEach((impactedPackage) =>
    uniquePackagesExtensionsAndExamplesAffectedByDiff.add(impactedPackage),
  );

  allExamplesAndDependenciesAffectedByDiff.forEach((impactedPackage) =>
    uniquePackagesExtensionsAndExamplesAffectedByDiff.add(impactedPackage),
  );

  allExtensionsAndDependenciesAffectedByDiff.forEach((impactedPackage) =>
    uniquePackagesExtensionsAndExamplesAffectedByDiff.add(impactedPackage),
  );

  return Array.from(uniquePackagesExtensionsAndExamplesAffectedByDiff);
}

function checkIfCactiPackage(packageName) {
  return packageName.name.includes("cactus");
}

// generate a dependency graph
async function generateDependencyGraph() {
  const dependencyGraph = new Map();
  const extractor = new NpmExtractor();
  // for each package, add the hyperledger cacti dependencies
  const allCactusPackages = getAllCactusPackages();
  for (let cactusPackage of allCactusPackages) {
    const packageJsonPath = "packages/" + cactusPackage + "/package.json";
    if (existsSync(packageJsonPath)) {
      const packageLock = readFileSync(packageJsonPath).toString("utf-8");
      const dependencyContainer = extractor.parse(packageLock);
      const cactiDependencies = dependencyContainer
        .getAllDependencies()
        .filter(checkIfCactiPackage);
      const dependencies = cactiDependencies.map(
        (dependencyObject) => dependencyObject.name,
      );
      dependencies.forEach((cactusDependency, index) => {
        dependencies[index] = cactusDependency.replace("@hyperledger/", "");
      });
      dependencyGraph.set(cactusPackage, new Set(dependencies));
    }
  }

  //for each extension, add the hyperledger cacti dependencies
  const allCactusExtensions = getAllCactusExtensions();
  for (let cactusExtension of allCactusExtensions) {
    const packageJsonPath = "extensions/" + cactusExtension + "/package.json";
    if (existsSync(packageJsonPath)) {
      const packageLock = readFileSync(packageJsonPath).toString("utf-8");
      const dependencyContainer = extractor.parse(packageLock);
      const cactiDependencies = dependencyContainer
        .getAllDependencies()
        .filter(checkIfCactiPackage);
      const dependencies = cactiDependencies.map(
        (dependencyObject) => dependencyObject.name,
      );
      dependencies.forEach((cactusDependency, index) => {
        dependencies[index] = cactusDependency.replace("@hyperledger/", "");
      });
      dependencyGraph.set(cactusExtension, new Set(dependencies));
    }
  }

  //for each example, add the hyperledger cacti dependencies
  const allCactusExamples = getAllCactusExamples();
  for (let cactusExample of allCactusExamples) {
    const packageJsonPath = "examples/" + cactusExample + "/package.json";
    if (existsSync(packageJsonPath)) {
      const packageLock = readFileSync(packageJsonPath).toString("utf-8");
      const dependencyContainer = extractor.parse(packageLock);
      const cactiDependencies = dependencyContainer
        .getAllDependencies()
        .filter(checkIfCactiPackage);
      const dependencies = cactiDependencies.map(
        (dependencyObject) => dependencyObject.name,
      );
      dependencies.forEach((cactusDependency, index) => {
        dependencies[index] = cactusDependency.replace("@hyperledger/", "");
      });
      dependencyGraph.set(cactusExample, new Set(dependencies));
    }
  }
  return dependencyGraph;
}

// this function get all the packages
function getAllCactusPackages() {
  const allCactusPackagesCmd = "cd packages" + " && ls | grep cactus-";
  const allCactusPackages = execSync(allCactusPackagesCmd)
    .toString("utf-8")
    .split("\n");
  allCactusPackages.splice(allCactusPackages.indexOf(""), 1);
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

// this function gets all the examples
function getAllCactusExamples() {
  const allCactusExamplesCmd = "cd examples" + " && ls | grep cactus-";
  const allCactusExamples = execSync(allCactusExamplesCmd)
    .toString("utf-8")
    .split("\n");
  allCactusExamples.splice(allCactusExamples.indexOf(""), 1);
  return allCactusExamples;
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
      filePath.includes("docs/") == false &&
      fileExtension != "md"
    ) {
      uniquePackages.add(filePathSplit[1]);
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
      filePath.includes("docs/") == false &&
      fileExtension != "md"
    ) {
      uniqueExtensions.add(filePathSplit[1]);
    }
  });
  return uniqueExtensions;
}

// this function extracts the unique examples from the git diff
function extractUniqueExamplesFromDiff(gitDiffFilePaths) {
  let uniqueExamples = new Set();
  gitDiffFilePaths.forEach((filePath) => {
    const fileExtension = filePath.substring(
      filePath.lastIndexOf(".") + 1,
      filePath.length,
    );
    const filePathSplit = filePath.split("/");
    if (
      filePathSplit.length > 2 &&
      filePathSplit[0] == "examples" &&
      filePath.includes("docs/") == false &&
      fileExtension != "md"
    ) {
      uniqueExamples.add(filePathSplit[1]);
    }
  });
  return uniqueExamples;
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
    const fileExtension = filePath.substring(
      filePath.lastIndexOf(".") + 1,
      filePath.length,
    );
    if (
      !(filePath.includes("docs/") || filePath.includes(".github/workflows/"))
    ) {
      if (
        fileExtension != "md" &&
        filePath != "package.json" &&
        filePath != "yarn.lock" &&
        filePath != "tools/optimize-ci.js"
      )
        onlyDocsDiff = false;
    }
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
// ]
function getGitDiff() {
  // uncomment the below commented lines if you want to test this locally
  // const cliCommand = "git diff origin/main --name-only";
  // return execSync(cliCommand).toString("utf-8").split("\n").sort().splice(1);

  // comment these lines if you want to test the CI
  const commaSeperatedDiffFiles = process.argv[2];
  return commaSeperatedDiffFiles.split(",");
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
optimizedCliOutput.set(
  "affectedPluginsExamplesAndExtensions",
  await packagesExtensionsAndExamplesAffectedByDiff(gitDiffFilePaths),
);

// This outputs something like
// {
//   "onlyDocsDiff": false,
//   "affectedPluginsExamplesAndExtensions": [
//     "cactus-cmd-api-server",
//     "cactus-plugin-htlc-coordinator-besu",
//     "cactus-plugin-object-store-ipfs",
//     "cactus-example-carbon-accounting-business-logic-plugin",
//     "cactus-example-carbon-accounting-frontend",
//     "cactus-example-supply-chain-business-logic-plugin",
//     "cactus-example-supply-chain-frontend",
//     "cactus-check-connection-ethereum-validator",
//     "cactus-example-supply-chain-backend"
//   ]
// }
console.log(JSON.stringify(Object.fromEntries(optimizedCliOutput)));
