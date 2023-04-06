import { execSync } from "child_process";
import { existsSync, readFileSync } from "fs";
let testToolingPackageAffected = false;

// this function generates a list of packages and extensions which need to be
// tested by the CI due to a given git diff
// NOTE: execute this function to get the package list for CI only when
// testToolingPackageAffected == true;
function packagesAndExtensionsAffectedByDiff(diffGitFilePaths) {
  const dependencyGraph = generateDependencyGraph();
  //for each package
  const uniquePackagesAffectedByDiff = extractUniquePackagesFromDiff(
    diffGitFilePaths,
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
    diffGitFilePaths,
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

  return new Set([
    ...allPackagesAndDependenciesAffectedByDiff,
    ...allExtensionsAndDependenciesAffectedByDiff,
  ]);
}

// generate a dependency graph, which looks like
// map(
//      package_alpha -> set(packages on which package_alpha is dependent on),
//      extension_alpha -> set(packages on which extension_alpha is dependent on)
//     )
function generateDependencyGraph() {
  const dependencyGraph = new Map();
  // for each package, add all package dependencies
  const allCactusPackages = getAllCactusPackages();
  allCactusPackages.forEach((cactusPackage) => {
    const packageJSONPath = "packages/" + cactusPackage + "/package.json";
    if (existsSync(packageJSONPath)) {
      const valueSet = new Set();
      const packageJSON = readFileSync(packageJSONPath).toString();
      const dependentCactusPackages = packageJSON.match(
        /@hyperledger\/.*(?=":)/g,
      );
      if (dependentCactusPackages !== null) {
        dependentCactusPackages.forEach((dependentPackage) => {
          valueSet.add(dependentPackage.split("@hyperledger/")[1]);
        });
      }
      if (valueSet.size !== 0) {
        dependencyGraph.set(cactusPackage, valueSet);
      }
    }
  });

  // for all the extensions
  const allCactusExtensions = getAllCactusExtensions();
  allCactusExtensions.forEach((cactusExtension) => {
    const packageJSONPath = "packages/" + cactusExtension + "/package.json";
    if (existsSync(packageJSONPath)) {
      const valueSet = new Set();
      const packageJSON = readFileSync(packageJSONPath).toString();
      const dependentCactusExtension = packageJSON.match(
        /@hyperledger\/.*(?=":)/g,
      );
      if (dependentCactusExtension !== null) {
        dependentCactusExtension.forEach((dependentExtension) => {
          valueSet.add(dependentExtension.split("@hyperledger/")[1]);
        });
      }
      if (valueSet.size !== 0) {
        dependencyGraph.set(cactusExtension, valueSet);
      }
    }
  });
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
function extractUniquePackagesFromDiff(diffGitFilePaths) {
  let uniquePackages = new Set();
  diffGitFilePaths.forEach((filePath) => {
    const fileExtension = filePath.substring(
      filePath.lastIndexOf(".") + 1,
      filePath.length,
    );
    const filePathSplit = filePath.split("/");
    if (
      filePathSplit.length > 2 &&
      filePathSplit[0] == "packages" &&
      fileExtension != "md" &&
      filePathSplit[1] != "cactus-test-tooling"
    ) {
      uniquePackages.add(filePathSplit[1]);
    }
    if (filePathSplit[1] == "cactus-test-tooling" && fileExtension != "md") {
      testToolingPackageAffected = true;
    }
  });
  return uniquePackages;
}

// this function extracts the unique extensions from the git diff
function extractUniqueExtensionsFromDiff(diffGitFilePaths) {
  let uniqueExtensions = new Set();
  diffGitFilePaths.forEach((filePath) => {
    const fileExtension = filePath.substring(
      filePath.lastIndexOf(".") + 1,
      filePath.length,
    );
    const filePathSplit = filePath.split("/");
    if (
      filePathSplit.length > 2 &&
      filePathSplit[0] == "extensions" &&
      fileExtension != "md"
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
  if (checkIfNoDiff(filePaths) == 0) onlyDocsDiff = false;
  filePaths.forEach((filePath) => {
    const extension = filePath.substring(
      filePath.lastIndexOf(".") + 1,
      filePath.length,
    );
    if (extension != "md") onlyDocsDiff = false;
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

// getting the git diff
const diffGitFilePaths = getGitDiff();

// checking if its a documentation PR
// TODO: Update this task to work on docs/ folder of packages
// instead of checking for .md files
console.log(
  `Is this a documentation PR: ` + checkIfOnlyDocsDiff(diffGitFilePaths),
);

// printing a list of all packages which need to be tested by CI as they are affected
// NOTE: Testing the entire CI for cactus-test-tooling due to urgent requirements
// TODO: Update the case of cactus-test-tooling for more optimized CI
const allPackagesExtensionsAndDependenciesAffectedByDiff = packagesAndExtensionsAffectedByDiff(
  diffGitFilePaths,
);
if (testToolingPackageAffected) {
  const allPackagesAndExtensions =
    getAllCactusExtensions() + getAllCactusExtensions();
  console.log("cactus-test-tooling is affected. Running the entire CI");
  console.log(allPackagesAndExtensions);
} else {
  console.log(
    `All packages and extensions for which the CI needs to run are: `,
  );
  console.log(allPackagesExtensionsAndDependenciesAffectedByDiff);
}
