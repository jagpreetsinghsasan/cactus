// import test, { Test } from "tape-promise/tape";
// import { v4 as uuidv4 } from "uuid";
// import { createServer } from "http";
// import { AddressInfo } from "net";
// import express from "express";
// import bodyParser from "body-parser";
// import http from "http";
// import {
//   DefaultApi as BesuApi,
//   PluginFactoryHTLCCoordinator,
//   IPluginHTLCCoordinatorOptions,
//   HtlcPackage,
//   OwnHTLCRequest,
//   CounterpartyHTLCRequest,
//   WithdrawCounterpartyRequest,
//   Configuration,
// } from "../../../../main/typescript/public-api";
// import {
//   EthContractInvocationType,
//   PluginFactoryLedgerConnector,
//   PluginLedgerConnectorBesu,
//   Web3SigningCredentialType,
//   Web3SigningCredential,
// } from "@hyperledger/cactus-plugin-ledger-connector-besu";
// import {
//   LogLevelDesc,
//   IListenOptions,
//   Servers,
// } from "@hyperledger/cactus-common";
// import { PluginRegistry } from "@hyperledger/cactus-core";
// import { PluginImportType } from "@hyperledger/cactus-core-api";
// import {
//   BesuTestLedger,
//   pruneDockerAllIfGithubAction,
// } from "@hyperledger/cactus-test-tooling";
// import { PluginKeychainMemory } from "@hyperledger/cactus-plugin-keychain-memory";

// import HashTimeLockJSON from "@hyperledger/cactus-plugin-htlc-eth-besu-erc20/src/main/solidity/contracts/HashedTimeLockContract.json";
// import TestTokenJSON from "../../../../../../../packages/cactus-test-plugin-htlc-eth-besu-erc20/src/test/solidity/token-erc20-contract/Test_Token.json";
// import DemoHelperJSON from "../../../../../../../packages/cactus-test-plugin-htlc-eth-besu-erc20/src/test/solidity/token-erc20-contract/DemoHelpers.json";
// import { InvokeContractV1Response } from "../../../../../../../packages/cactus-plugin-htlc-eth-besu-erc20/dist/types/main/typescript";

// const logLevel: LogLevelDesc = "INFO";
// const estimatedGas = 6721975;
// const expiration = 2147483648;
// const secret =
//   "0x3853485acd2bfc3c632026ee365279743af107a30492e3ceaa7aefc30c2a048a";
// const receiver = "0x627306090abaB3A6e1400e9345bC60c78a8BEf57";
// const hashLock =
//   "0x3c335ba7f06a8b01d0596589f73c19069e21c81e5013b91f408165d1bf623d32";
// const firstHighNetWorthAccount = "0x90F8bf6A479f320ead074411a4B0e7944Ea8c9C1";
// const privateKey =
//   "0x4f3edf983ac636a65a842ce7c78d9aa706d3b113bce9c46f30d7d21715b23b1d";
// const connectorInstanceId = uuidv4();
// const web3SigningCredential: Web3SigningCredential = {
//   ethAccount: firstHighNetWorthAccount,
//   secret: privateKey,
//   type: Web3SigningCredentialType.PrivateKeyHex,
// } as Web3SigningCredential;
// const contractAddress = "0xCfEB869F69431e42cdB54A4F4f105C19C080A601";

// const testCase = "Test own htlc endpoint";

// test("BEFORE " + testCase, async (t: Test) => {
//   const pruning = pruneDockerAllIfGithubAction({ logLevel });
//   await t.doesNotReject(pruning, "Pruning did not throw OK");
//   t.end();
// });

// test(testCase, async (t: Test) => {
//   t.comment("Starting Besu Test Ledger");
//   const besuTestLedger = new BesuTestLedger();
//   await besuTestLedger.start();

//   test.onFinish(async () => {
//     await besuTestLedger.stop();
//     await besuTestLedger.destroy();
//   });

//   const rpcApiHttpHost = await besuTestLedger.getRpcApiHttpHost();
//   const rpcApiWsHost = await besuTestLedger.getRpcApiWsHost();
//   const keychainId = uuidv4();
//   const keychainPlugin = new PluginKeychainMemory({
//     instanceId: uuidv4(),
//     keychainId,
//     // pre-provision keychain with mock backend holding the private key of the
//     // test account that we'll reference while sending requests with the
//     // signing credential pointing to this keychain entry.
//     backend: new Map([[TestTokenJSON.contractName, TestTokenJSON]]),
//     logLevel,
//   });
//   keychainPlugin.set(DemoHelperJSON.contractName, DemoHelperJSON);
//   keychainPlugin.set(HashTimeLockJSON.contractName, HashTimeLockJSON);

//   const factory = new PluginFactoryLedgerConnector({
//     pluginImportType: PluginImportType.Local,
//   });

//   const pluginRegistry = new PluginRegistry({});
//   const connector: PluginLedgerConnectorBesu = await factory.create({
//     rpcApiHttpHost,
//     rpcApiWsHost,
//     logLevel,
//     instanceId: connectorInstanceId,
//     pluginRegistry: new PluginRegistry({ plugins: [keychainPlugin] }),
//   });

//   const httpServer = createServer();
//   await new Promise((resolve, reject) => {
//     httpServer.once("error", reject);
//     httpServer.once("listening", resolve);
//     httpServer.listen(0, "127.0.0.1");
//   });

//   pluginRegistry.add(connector);
//   const pluginOptions: IPluginHTLCCoordinatorOptions = {
//     instanceId: uuidv4(),
//     logLevel,
//     pluginRegistry,
//   };

//   const factoryHTLC = new PluginFactoryHTLCCoordinator({
//     pluginImportType: PluginImportType.Local,
//   });
//   const pluginHTLCCoordinator = await factoryHTLC.create(pluginOptions);
//   pluginRegistry.add(pluginHTLCCoordinator);

//   const expressApp = express();
//   expressApp.use(bodyParser.json({ limit: "250mb" }));
//   const server = http.createServer(expressApp);
//   const listenOptions: IListenOptions = {
//     hostname: "0.0.0.0",
//     port: 0,
//     server,
//   };
//   const addressInfo = (await Servers.listen(listenOptions)) as AddressInfo;
//   test.onFinish(async () => await Servers.shutdown(server));
//   const { address, port } = addressInfo;
//   const apiHost = `http://${address}:${port}`;

//   const configuration = new Configuration({ basePath: apiHost });
//   const api = new BesuApi(configuration);

//   await pluginHTLCCoordinator.getOrCreateWebServices();
//   await pluginHTLCCoordinator.registerWebServices(expressApp);
//   t.comment("Deploys TestToken via .json file on deployContract function");
//   const deployOutToken = await connector.deployContract({
//     contractName: TestTokenJSON.contractName,
//     contractAbi: TestTokenJSON.abi,
//     bytecode: TestTokenJSON.bytecode,
//     web3SigningCredential,
//     keychainId,
//     constructorArgs: ["100", "token", "2", "TKN"],
//     gas: estimatedGas,
//   });
//   t.ok(deployOutToken, "deployContract() output is truthy OK");
//   t.ok(
//     deployOutToken.transactionReceipt,
//     "deployContract() output.transactionReceipt is truthy OK",
//   );
//   t.ok(
//     deployOutToken.transactionReceipt.contractAddress,
//     "deployContract() output.transactionReceipt.contractAddress is truthy OK",
//   );
//   const tokenAddress = deployOutToken.transactionReceipt
//     .contractAddress as string;

//   t.comment("Approve 10 Tokens to HashTimeLockAddress");
//   const { success } = await connector.invokeContract({
//     contractName: TestTokenJSON.contractName,
//     keychainId,
//     signingCredential: web3SigningCredential,
//     invocationType: EthContractInvocationType.Send,
//     methodName: "approve",
//     params: [contractAddress, "10"],
//     gas: estimatedGas,
//   });
//   t.equal(success, true, "approve() transactionReceipt.status is true OK");

//   t.comment("Get account balance");
//   const responseBalance = await connector.invokeContract({
//     contractName: TestTokenJSON.contractName,
//     keychainId,
//     signingCredential: web3SigningCredential,
//     invocationType: EthContractInvocationType.Call,
//     methodName: "balanceOf",
//     params: [firstHighNetWorthAccount],
//   });
//   t.equal(responseBalance.callOutput, "100", "balance of account is 100 OK");

//   t.comment("Get HashTimeLock contract and account allowance");
//   const { callOutput } = await connector.invokeContract({
//     contractName: TestTokenJSON.contractName,
//     keychainId,
//     signingCredential: web3SigningCredential,
//     invocationType: EthContractInvocationType.Call,
//     methodName: "allowance",
//     params: [firstHighNetWorthAccount, contractAddress],
//   });
//   t.equal(callOutput, "10", "callOutput() is 10 OK");

//   t.comment("Create and initialize own HTLC");
//   const ownHTLCRequest: OwnHTLCRequest = {
//     htlcPackage: HtlcPackage.BesuErc20,
//     connectorInstanceId,
//     keychainId,
//     constructorArgs: [],
//     web3SigningCredential,
//     inputAmount: 10,
//     outputAmount: 1,
//     expiration,
//     hashLock,
//     tokenAddress,
//     receiver,
//     outputNetwork: "BTC",
//     outputAddress: "1AcVYm7M3kkJQH28FXAvyBFQzFRL6xPKu8",
//     gas: estimatedGas,
//   };

//   const coordinatorResponse: InvokeContractV1Response = await pluginHTLCCoordinator.ownHTLC(
//     ownHTLCRequest,
//   );
//   t.equal(
//     coordinatorResponse.success,
//     true,
//     "coordinator response success is true",
//   );
//   // t.comment(JSON.stringify(coordinatorResponse))
//   const coordinatorResponseTransactionReceipt = JSON.parse(
//     JSON.stringify(coordinatorResponse),
//   ).out.transactionReceipt;
//   // t.comment(JSON.stringify(JSON.parse(JSON.stringify(coordinatorResponse)).out.transactionReceipt))
//   t.ok(
//     coordinatorResponseTransactionReceipt,
//     "pluginHTLCCoordinator.ownHtlcV1() output.transactionReceipt is truthy OK",
//   );

//   t.comment("Get HTLC id");
//   const responseTxId = await connector.invokeContract({
//     contractName: DemoHelperJSON.contractName,
//     keychainId,
//     signingCredential: web3SigningCredential,
//     invocationType: EthContractInvocationType.Call,
//     methodName: "getTxId",
//     params: [
//       firstHighNetWorthAccount,
//       receiver,
//       10,
//       hashLock,
//       expiration,
//       tokenAddress,
//     ],
//     gas: estimatedGas,
//   });

//   t.comment("Get counterparty HTLC");
//   const counterpartyHTLCRequest: CounterpartyHTLCRequest = {
//     htlcPackage: HtlcPackage.BesuErc20,
//     connectorInstanceId,
//     keychainId,
//     htlcId: responseTxId.callOutput,
//     web3SigningCredential,
//     gas: estimatedGas,
//   };

//   const coordinatorResponse2 = await pluginHTLCCoordinator.counterpartyHTLC(
//     counterpartyHTLCRequest,
//   );
//   // t.comment(JSON.stringify(coordinatorResponse2))
//   t.equal(coordinatorResponse2.success, true, "response success is true");
//   t.equal(
//     coordinatorResponse2.callOutput,
//     "1",
//     "the contract status is 1 - Active",
//   );

//   t.comment("Get counterparty HTLC");
//   const withdrawCounterpartyRequest: WithdrawCounterpartyRequest = {
//     htlcPackage: HtlcPackage.BesuErc20,
//     connectorInstanceId,
//     keychainId,
//     web3SigningCredential,
//     htlcId: responseTxId.callOutput,
//     secret,
//     gas: estimatedGas,
//   };

//   const coordinatorResponse3 = await pluginHTLCCoordinator.withdrawCounterparty(
//     withdrawCounterpartyRequest,
//   );
//   // t.comment(JSON.stringify(coordinatorResponse3))
//   t.equal(coordinatorResponse3.success, true, "coordinatorResponse is true");

//   t.comment("Get balance of receiver account");
//   const responseFinalBalance = await connector.invokeContract({
//     contractName: TestTokenJSON.contractName,
//     keychainId,
//     signingCredential: web3SigningCredential,
//     invocationType: EthContractInvocationType.Call,
//     methodName: "balanceOf",
//     params: [receiver],
//   });
//   t.equal(responseFinalBalance.callOutput, "10", "balance of account is 10 OK");
//   t.end();
// });

// test("AFTER " + testCase, async (t: Test) => {
//   const pruning = pruneDockerAllIfGithubAction({ logLevel });
//   await t.doesNotReject(pruning, "Pruning did not throw OK");
//   t.end();
// });