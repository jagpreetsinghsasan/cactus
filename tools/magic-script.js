import { execSync } from "child_process";
import { existsSync, readFileSync } from "fs";

// this function generates a list of packages and extensions which need to be
// tested by the CI due to a given git diff
// NOTE: 
function packagesAndExtensionsAffectedByDiff(diffGitFilePaths) {
  const uniquePackagesAffectedByDiff = extractUniquePackagesFromDiff(
    diffGitFilePaths,
  );
  const dependencyGraph = generateDependencyGraph();
  const allPackagesAndDependenciesAffectedByDiff = new Set();
  uniquePackagesAffectedByDiff.forEach((uniquePackage) => {
    if (dependencyGraph.get(uniquePackage) !== undefined) {
      Array.from(dependencyGraph.get(uniquePackage)).forEach(
        (cactusPackage) => {
          allPackagesAndDependenciesAffectedByDiff.add(cactusPackage);
        },
      );
    }
  });
  const allPackagesExtensionsAndDependenciesAffectedByDiff = new Set([
    ...allPackagesAndDependenciesAffectedByDiff,
    ...extractUniqueExtensionsFromDiff(diffGitFilePaths),
  ]);
  return allPackagesExtensionsAndDependenciesAffectedByDiff;
}

// generate a dependency graph, which looks like
// map(
//      package_alpha -> set(packages on which package_alpha is dependent on),
//      extension_alpha -> set(packages on which extension_alpha is dependent on)
//     )
function generateDependencyGraph() {
  const dependencyGraph = new Map();
  // for all the packages
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

function extractUniquePackagesFromDiff(diffGitFilePaths) {
  let uniquePackages = new Set();
  diffGitFilePaths.forEach((filePath) => {
    let filePathSplit = filePath.split("/");
    if (filePathSplit.length > 2 && filePathSplit[0] == "packages") {
      uniquePackages.add(filePathSplit[1]);
    }
  });
  return uniquePackages;
}

function extractUniqueExtensionsFromDiff(diffGitFilePaths) {
  let uniqueExtensions = new Set();
  diffGitFilePaths.forEach((filePath) => {
    let filePathSplit = filePath.split("/");
    if (filePathSplit.length > 2 && filePathSplit[0] == "extensions") {
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

const diffGitFilePaths = getGitDiff();
console.log(
  `Is this a documentation PR: ` + checkIfOnlyDocsDiff(diffGitFilePaths),
);
const allPackagesExtensionsAndDependenciesAffectedByDiff = packagesAndExtensionsAffectedByDiff(
  diffGitFilePaths,
);
console.log(`All packagesa and extensions for which the CI needs to run are: `);
console.log(allPackagesExtensionsAndDependenciesAffectedByDiff);
