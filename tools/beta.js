import jsDependencyExtractor from "js-dependency-extractor";

function checkIfCactiPackage(packageName) {
  return packageName.includes("cactus");
}

let dependencies = await jsDependencyExtractor({
  path: "examples/cactus-example-supply-chain-frontend",
});
dependencies = dependencies.filter(checkIfCactiPackage);

console.log(dependencies);
