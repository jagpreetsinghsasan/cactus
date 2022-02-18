import test, { Test } from "tape-promise/tape";
import { v4 as internalIpV4 } from "internal-ip";
import { v4 as uuidv4 } from "uuid";
import http from "http";
import bodyParser from "body-parser";
import express from "express";
import { AddressInfo } from "net";

import { Containers, CordaTestLedger } from "@hyperledger/cactus-test-tooling";
import {
  LogLevelDesc,
  IListenOptions,
  Servers,
} from "@hyperledger/cactus-common";
import {
  SampleCordappEnum,
  CordaConnectorContainer,
} from "@hyperledger/cactus-test-tooling";

import {
  CordappDeploymentConfig,
  DefaultApi as CordaApi,
  DeployContractJarsV1Request,
  FlowInvocationType,
  InvokeContractV1Request,
  JvmTypeKind,
} from "../../../main/typescript/generated/openapi/typescript-axios/index";
import { Configuration } from "@hyperledger/cactus-core-api";

import {
  IPluginLedgerConnectorCordaOptions,
  PluginLedgerConnectorCorda,
} from "../../../main/typescript/plugin-ledger-connector-corda";
import { K_CACTUS_CORDA_TOTAL_TX_COUNT } from "../../../main/typescript/prometheus-exporter/metrics";

const logLevel: LogLevelDesc = "TRACE";

test("Tests are passing on the JVM side", async (t: Test) => {
  test.onFailure(async () => {
    await Containers.logDiagnostics({ logLevel });
  });

  const ledger = new CordaTestLedger({
    imageName: "jasinsa/cenm",
    imageVersion: "1.14",
    logLevel,
  });
  t.ok(ledger, "CordaTestLedger v4.8 instantaited OK");

  test.onFinish(async () => {
    await ledger.stop();
    await ledger.destroy();
  });
  const ledgerContainer = await ledger.start();
  t.ok(
    ledgerContainer,
    "CordaTestLedger v4.8 container truthy post-start() OK",
  );

  const corDappsDirPartyA = "/home/node1/cordapps";
  const corDappsDirPartyB = "/home/node2/cordapps";
  // const corDappsDirPartyA = await ledger.getCorDappsDirPartyA();
  // const corDappsDirPartyB = await ledger.getCorDappsDirPartyB();
  t.comment(`corDappsDirPartyA=${corDappsDirPartyA}`);
  t.comment(`corDappsDirPartyB=${corDappsDirPartyB}`);

  await ledger.logDebugPorts();
  const partyARpcPort = await ledger.getRpcAPublicPort();
  const partyBRpcPort = await ledger.getRpcBPublicPort();

  const jarFiles = await ledger.pullCordappJars(
    SampleCordappEnum.BASIC_CORDAPP,
  );
  t.comment(`Fetched ${jarFiles.length} cordapp jars OK`);

  const internalIpOrUndefined = await internalIpV4();
  t.ok(internalIpOrUndefined, "Determined LAN IPv4 address successfully OK");
  const internalIp = internalIpOrUndefined as string;
  t.comment(`Internal IP (based on default gateway): ${internalIp}`);

  // TODO: parse the gradle build files to extract the credentials?
  const partyARpcUsername = "user1";
  const partyARpcPassword = "password";
  const partyBRpcUsername = partyARpcUsername;
  const partyBRpcPassword = partyARpcPassword;
  const springAppConfig = {
    logging: {
      level: {
        root: "INFO",
        "net.corda": "INFO",
        "org.hyperledger.cactus": "DEBUG",
      },
    },
    cactus: {
      corda: {
        node: { host: internalIp },
        rpc: {
          port: partyARpcPort,
          username: partyARpcUsername,
          password: partyARpcPassword,
        },
      },
    },
  };
  const springApplicationJson = JSON.stringify(springAppConfig);
  const envVarSpringAppJson = `SPRING_APPLICATION_JSON=${springApplicationJson}`;
  t.comment(envVarSpringAppJson);

  const connector = new CordaConnectorContainer({
    logLevel,
    imageName: "ghcr.io/hyperledger/cactus-connector-corda-server",
    imageVersion: "2021-11-23--feat-1493",
    envVars: [envVarSpringAppJson],
  });
  t.ok(CordaConnectorContainer, "CordaConnectorContainer instantiated OK");

  test.onFinish(async () => {
    try {
      await connector.stop();
    } finally {
      await connector.destroy();
    }
  });

  const connectorContainer = await connector.start();
  t.ok(connectorContainer, "CordaConnectorContainer started OK");

  await connector.logDebugPorts();
  const apiUrl = await connector.getApiLocalhostUrl();

  const config = new Configuration({ basePath: apiUrl });
  const apiClient = new CordaApi(config);

  const flowsRes1 = await apiClient.listFlowsV1();
  t.ok(flowsRes1.status === 200, "flowsRes1.status === 200 OK");
  t.ok(flowsRes1.data, "flowsRes1.data truthy OK");
  t.ok(flowsRes1.data.flowNames, "flowsRes1.data.flowNames truthy OK");
  t.comment(`apiClient.listFlowsV1() => ${JSON.stringify(flowsRes1.data)}`);
  const flowNamesPreDeploy = flowsRes1.data.flowNames;

  const sshConfig = await ledger.getSshConfig();
  const hostKeyEntry = "not-used-right-now-so-this-does-not-matter... ;-(";

  const cdcA: CordappDeploymentConfig = {
    cordappDir: corDappsDirPartyA,
    cordaNodeStartCmd: "supervisorctl start 6-party-a",
    cordaJarPath: "/home/node1/corda-4.8.jar",
    nodeBaseDirPath: "/home/node1/",
    rpcCredentials: {
      hostname: internalIp,
      port: partyARpcPort,
      username: partyARpcUsername,
      password: partyARpcPassword,
    },
    sshCredentials: {
      hostKeyEntry,
      hostname: internalIp,
      password: "root",
      port: sshConfig.port as number,
      username: sshConfig.username as string,
    },
  };

  const cdcB: CordappDeploymentConfig = {
    cordappDir: corDappsDirPartyB,
    cordaNodeStartCmd: "supervisorctl start 7-party-b",
    cordaJarPath: "/home/node2/corda-4.8.jar",
    nodeBaseDirPath: "/home/node2/",
    rpcCredentials: {
      hostname: internalIp,
      port: partyBRpcPort,
      username: partyBRpcUsername,
      password: partyBRpcPassword,
    },
    sshCredentials: {
      hostKeyEntry,
      hostname: internalIp,
      password: "root",
      port: sshConfig.port as number,
      username: sshConfig.username as string,
    },
  };

  const cordappDeploymentConfigs: CordappDeploymentConfig[] = [cdcA, cdcB];
  const depReq: DeployContractJarsV1Request = {
    jarFiles,
    cordappDeploymentConfigs,
  };
  const depRes = await apiClient.deployContractJarsV1(depReq);
  t.ok(depRes, "Jar deployment response truthy OK");
  t.equal(depRes.status, 200, "Jar deployment status code === 200 OK");
  t.ok(depRes.data, "Jar deployment response body truthy OK");
  t.ok(depRes.data.deployedJarFiles, "Jar deployment body deployedJarFiles OK");
  t.equal(
    depRes.data.deployedJarFiles.length,
    jarFiles.length,
    "Deployed jar file count equals count in request OK",
  );

  t.end();
});
