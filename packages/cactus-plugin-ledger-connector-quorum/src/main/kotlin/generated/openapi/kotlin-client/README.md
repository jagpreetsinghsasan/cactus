# org.openapitools.client - Kotlin client library for Hyperledger Cactus Plugin - Connector Quorum

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deployContractSolBytecodeJsonObjectV1**](docs/DefaultApi.md#deploycontractsolbytecodejsonobjectv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/deploy-contract-solidity-bytecode-json-object | Deploys the bytecode of a Solidity contract.
*DefaultApi* | [**deployContractSolBytecodeV1**](docs/DefaultApi.md#deploycontractsolbytecodev1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract.
*DefaultApi* | [**getPrometheusMetricsV1**](docs/DefaultApi.md#getprometheusmetricsv1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/get-prometheus-exporter-metrics | Get the Prometheus Metrics
*DefaultApi* | [**invokeContractV1**](docs/DefaultApi.md#invokecontractv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-contract | Invokes a contract on a besu ledger
*DefaultApi* | [**invokeContractV1NoKeychain**](docs/DefaultApi.md#invokecontractv1nokeychain) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-contract-json-object | Invokes a contract on a besu ledger
*DefaultApi* | [**invokeRawWeb3EthContractV1**](docs/DefaultApi.md#invokerawweb3ethcontractv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-raw-web3eth-contract | Low-level endpoint to invoke a method on deployed contract.
*DefaultApi* | [**invokeWeb3EthMethodV1**](docs/DefaultApi.md#invokeweb3ethmethodv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-raw-web3eth-method | Invoke any method from web3.eth (low-level)
*DefaultApi* | [**runTransactionV1**](docs/DefaultApi.md#runtransactionv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/run-transaction | Executes a transaction on a quorum ledger


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.ContractJSON](docs/ContractJSON.md)
 - [org.openapitools.client.models.DeployContractSolidityBytecodeJsonObjectV1Request](docs/DeployContractSolidityBytecodeJsonObjectV1Request.md)
 - [org.openapitools.client.models.DeployContractSolidityBytecodeV1Request](docs/DeployContractSolidityBytecodeV1Request.md)
 - [org.openapitools.client.models.DeployContractSolidityBytecodeV1Response](docs/DeployContractSolidityBytecodeV1Response.md)
 - [org.openapitools.client.models.EthContractInvocationType](docs/EthContractInvocationType.md)
 - [org.openapitools.client.models.EthContractInvocationWeb3Method](docs/EthContractInvocationWeb3Method.md)
 - [org.openapitools.client.models.InvokeContractJsonObjectV1Request](docs/InvokeContractJsonObjectV1Request.md)
 - [org.openapitools.client.models.InvokeContractV1Request](docs/InvokeContractV1Request.md)
 - [org.openapitools.client.models.InvokeContractV1Response](docs/InvokeContractV1Response.md)
 - [org.openapitools.client.models.InvokeRawWeb3EthContractV1Request](docs/InvokeRawWeb3EthContractV1Request.md)
 - [org.openapitools.client.models.InvokeRawWeb3EthContractV1Response](docs/InvokeRawWeb3EthContractV1Response.md)
 - [org.openapitools.client.models.InvokeRawWeb3EthMethodV1Request](docs/InvokeRawWeb3EthMethodV1Request.md)
 - [org.openapitools.client.models.InvokeRawWeb3EthMethodV1Response](docs/InvokeRawWeb3EthMethodV1Response.md)
 - [org.openapitools.client.models.QuorumTransactionConfig](docs/QuorumTransactionConfig.md)
 - [org.openapitools.client.models.RunTransactionRequest](docs/RunTransactionRequest.md)
 - [org.openapitools.client.models.RunTransactionResponse](docs/RunTransactionResponse.md)
 - [org.openapitools.client.models.SolidityContractJsonArtifact](docs/SolidityContractJsonArtifact.md)
 - [org.openapitools.client.models.WatchBlocksV1](docs/WatchBlocksV1.md)
 - [org.openapitools.client.models.WatchBlocksV1BlockData](docs/WatchBlocksV1BlockData.md)
 - [org.openapitools.client.models.WatchBlocksV1Options](docs/WatchBlocksV1Options.md)
 - [org.openapitools.client.models.WatchBlocksV1Progress](docs/WatchBlocksV1Progress.md)
 - [org.openapitools.client.models.Web3BlockHeader](docs/Web3BlockHeader.md)
 - [org.openapitools.client.models.Web3SigningCredential](docs/Web3SigningCredential.md)
 - [org.openapitools.client.models.Web3SigningCredentialCactusKeychainRef](docs/Web3SigningCredentialCactusKeychainRef.md)
 - [org.openapitools.client.models.Web3SigningCredentialGethKeychainPassword](docs/Web3SigningCredentialGethKeychainPassword.md)
 - [org.openapitools.client.models.Web3SigningCredentialNone](docs/Web3SigningCredentialNone.md)
 - [org.openapitools.client.models.Web3SigningCredentialPrivateKeyHex](docs/Web3SigningCredentialPrivateKeyHex.md)
 - [org.openapitools.client.models.Web3SigningCredentialType](docs/Web3SigningCredentialType.md)
 - [org.openapitools.client.models.Web3Transaction](docs/Web3Transaction.md)
 - [org.openapitools.client.models.Web3TransactionReceipt](docs/Web3TransactionReceipt.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
