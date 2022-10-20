#!/usr/bin/env node

import { ConfigService } from "@hyperledger/cactus-cmd-api-server";
import { LoggerProvider } from "@hyperledger/cactus-common";
import { ISupplyChainAppOptions, SupplyChainApp } from "./supply-chain-app";

export async function launchApp(
  env?: NodeJS.ProcessEnv,
  args?: string[],
): Promise<void> {
  const configService = new ConfigService();
  const config = await configService.getOrCreate({ args, env });
  const serverOptions = config.getProperties();
  LoggerProvider.setLogLevel(serverOptions.logLevel);

  const proxyEnvVars = new Map();
  process.env.HTTP_PROXY
    ? proxyEnvVars.set("HTTP_PROXY", process.env.HTTP_PROXY)
    : null;
  process.env.HTTPS_PROXY
    ? proxyEnvVars.set("HTTPS_PROXY", process.env.HTTPS_PROXY)
    : null;
  process.env.FTP_PROXY
    ? proxyEnvVars.set("FTP_PROXY", process.env.FTP_PROXY)
    : null;
  process.env.NO_PROXY
    ? proxyEnvVars.set("NO_PROXY", process.env.NO_PROXY)
    : null;

  const appOptions: ISupplyChainAppOptions = {
    logLevel: serverOptions.logLevel,
  };
  proxyEnvVars.size > 0 ? (appOptions.proxyEnvVars = proxyEnvVars) : null;

  const supplyChainApp = new SupplyChainApp(appOptions);
  try {
    await supplyChainApp.start();
  } catch (ex) {
    console.error(`SupplyChainApp crashed. Existing...`, ex);
    await supplyChainApp?.stop();
    process.exit(-1);
  }
}

if (require.main === module) {
  launchApp(process.env, process.argv);
}
