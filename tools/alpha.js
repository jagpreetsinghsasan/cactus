import { NpmExtractor } from '@h4ad/dependency-extractor';
import { readFileSync } from 'fs';

const extractor = new NpmExtractor();
const packageLock = readFileSync('examples/cactus-example-supply-chain-frontend/package.json').toString('utf-8');

function checkIfCactiPackage(cactusPackage) {
  return cactusPackage.name.includes("cactus");
}

const dependencyContainer = extractor.parse(packageLock);
const cactiDependencies = dependencyContainer
  .getAllDependencies()
  .filter(checkIfCactiPackage);

const namesOfDependencies = cactiDependencies.map((alpha) => alpha.name);
console.log(namesOfDependencies);

