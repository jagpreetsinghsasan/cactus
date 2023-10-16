import {globby} from "globby";
import { rm } from "fs";
let paths = await globby(["packages/*/src/main/kotlin/generated/openapi/*"],{gitignore: true, onlyDirectories: true});
paths = paths.concat(await globby(["packages/*/src/main/typescript/generated/openapi/typescript-axios/**"],{gitignore: true, onlyDirectories: true}));

if (paths.length!=0){
  for (let i in paths) {
    paths[i] = "./" + paths[i];
    rm(paths[i], { recursive: true, force: true }, () => {})
  }
}
