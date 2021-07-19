import test, { Test } from "tape-promise/tape";

import { PluginFactoryHTLCCoordinator } from "../../../main/typescript/public-api";

test("Library can be loaded", (t: Test) => {
  t.ok(PluginFactoryHTLCCoordinator, "PluginFactoryHTLCCoordinator truthy OK");
  t.end();
});
