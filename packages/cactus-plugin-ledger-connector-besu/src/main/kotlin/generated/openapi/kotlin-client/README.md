# org.openapitools.client - Kotlin client library for Hyperledger Cactus Plugin - Connector Besu

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
*DefaultApi* | [**deployContractSolBytecodeV1**](docs/DefaultApi.md#deploycontractsolbytecodev1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract.
*DefaultApi* | [**getBalanceV1**](docs/DefaultApi.md#getbalancev1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-balance | Return balance of an address of a given block
*DefaultApi* | [**getBesuRecordV1**](docs/DefaultApi.md#getbesurecordv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-besu-record | Retrieves an arbitrary record (any piece of information) from the ledger. Ledger records can be call outputs, transaction input, etc.
*DefaultApi* | [**getBlockV1**](docs/DefaultApi.md#getblockv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-block | Returns a block matching the block
*DefaultApi* | [**getPastLogsV1**](docs/DefaultApi.md#getpastlogsv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-past-logs | Gets past logs, matching the given options.
*DefaultApi* | [**getPrometheusMetricsV1**](docs/DefaultApi.md#getprometheusmetricsv1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-prometheus-exporter-metrics | Get the Prometheus Metrics
*DefaultApi* | [**getTransactionV1**](docs/DefaultApi.md#gettransactionv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-transaction | Executes a transaction on a besu ledger
*DefaultApi* | [**invokeContractV1**](docs/DefaultApi.md#invokecontractv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/invoke-contract | Invokes a contract on a besu ledger
*DefaultApi* | [**runTransactionV1**](docs/DefaultApi.md#runtransactionv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/run-transaction | Executes a transaction on a besu ledger
*DefaultApi* | [**signTransactionV1**](docs/DefaultApi.md#signtransactionv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/sign-transaction | Obtain signatures of ledger from the corresponding transaction hash.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.BesuPrivateTransactionConfig](docs/BesuPrivateTransactionConfig.md)
 - [org.openapitools.client.models.BesuTransactionConfig](docs/BesuTransactionConfig.md)
 - [org.openapitools.client.models.ConsistencyStrategy](docs/ConsistencyStrategy.md)
 - [org.openapitools.client.models.DeployContractSolidityBytecodeV1Request](docs/DeployContractSolidityBytecodeV1Request.md)
 - [org.openapitools.client.models.DeployContractSolidityBytecodeV1Response](docs/DeployContractSolidityBytecodeV1Response.md)
 - [org.openapitools.client.models.EthContractInvocationType](docs/EthContractInvocationType.md)
 - [org.openapitools.client.models.EvmBlock](docs/EvmBlock.md)
 - [org.openapitools.client.models.EvmLog](docs/EvmLog.md)
 - [org.openapitools.client.models.EvmTransaction](docs/EvmTransaction.md)
 - [org.openapitools.client.models.GetBalanceV1Request](docs/GetBalanceV1Request.md)
 - [org.openapitools.client.models.GetBalanceV1Response](docs/GetBalanceV1Response.md)
 - [org.openapitools.client.models.GetBesuRecordV1Request](docs/GetBesuRecordV1Request.md)
 - [org.openapitools.client.models.GetBesuRecordV1Response](docs/GetBesuRecordV1Response.md)
 - [org.openapitools.client.models.GetBlockV1Request](docs/GetBlockV1Request.md)
 - [org.openapitools.client.models.GetBlockV1Response](docs/GetBlockV1Response.md)
 - [org.openapitools.client.models.GetPastLogsV1Request](docs/GetPastLogsV1Request.md)
 - [org.openapitools.client.models.GetPastLogsV1Response](docs/GetPastLogsV1Response.md)
 - [org.openapitools.client.models.GetTransactionV1Request](docs/GetTransactionV1Request.md)
 - [org.openapitools.client.models.GetTransactionV1Response](docs/GetTransactionV1Response.md)
 - [org.openapitools.client.models.InvokeContractV1Request](docs/InvokeContractV1Request.md)
 - [org.openapitools.client.models.InvokeContractV1Response](docs/InvokeContractV1Response.md)
 - [org.openapitools.client.models.ReceiptType](docs/ReceiptType.md)
 - [org.openapitools.client.models.RunTransactionRequest](docs/RunTransactionRequest.md)
 - [org.openapitools.client.models.RunTransactionResponse](docs/RunTransactionResponse.md)
 - [org.openapitools.client.models.SignTransactionRequest](docs/SignTransactionRequest.md)
 - [org.openapitools.client.models.SignTransactionResponse](docs/SignTransactionResponse.md)
 - [org.openapitools.client.models.SolidityContractJsonArtifact](docs/SolidityContractJsonArtifact.md)
 - [org.openapitools.client.models.WatchBlocksV1](docs/WatchBlocksV1.md)
 - [org.openapitools.client.models.WatchBlocksV1Progress](docs/WatchBlocksV1Progress.md)
 - [org.openapitools.client.models.Web3BlockHeader](docs/Web3BlockHeader.md)
 - [org.openapitools.client.models.Web3SigningCredential](docs/Web3SigningCredential.md)
 - [org.openapitools.client.models.Web3SigningCredentialCactusKeychainRef](docs/Web3SigningCredentialCactusKeychainRef.md)
 - [org.openapitools.client.models.Web3SigningCredentialNone](docs/Web3SigningCredentialNone.md)
 - [org.openapitools.client.models.Web3SigningCredentialPrivateKeyHex](docs/Web3SigningCredentialPrivateKeyHex.md)
 - [org.openapitools.client.models.Web3SigningCredentialType](docs/Web3SigningCredentialType.md)
 - [org.openapitools.client.models.Web3TransactionReceipt](docs/Web3TransactionReceipt.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
