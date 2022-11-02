# org.openapitools.client - Kotlin client library for Hyperledger Cactus Plugin - Connector Xdai

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
*DefaultApi* | [**deployContractJsonObjectV1**](docs/DefaultApi.md#deploycontractjsonobjectv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/deploy-contract-solidity-bytecode-json-object | Deploys the bytecode of a Solidity contract.
*DefaultApi* | [**deployContractV1**](docs/DefaultApi.md#deploycontractv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract.
*DefaultApi* | [**getPrometheusMetricsV1**](docs/DefaultApi.md#getprometheusmetricsv1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/get-prometheus-exporter-metrics | Get the Prometheus Metrics
*DefaultApi* | [**invokeContractJsonObject**](docs/DefaultApi.md#invokecontractjsonobject) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/invoke-contract-json-object | Invokes a contract on a besu ledger
*DefaultApi* | [**invokeContractV1**](docs/DefaultApi.md#invokecontractv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/invoke-contract | Invokes a contract on a xdai ledger
*DefaultApi* | [**runTransactionV1**](docs/DefaultApi.md#runtransactionv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/run-transaction | Executes a transaction on a xdai ledger


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.ConsistencyStrategy](docs/ConsistencyStrategy.md)
 - [org.openapitools.client.models.ContractJSON](docs/ContractJSON.md)
 - [org.openapitools.client.models.DeployContractJsonObjectV1Request](docs/DeployContractJsonObjectV1Request.md)
 - [org.openapitools.client.models.DeployContractV1Request](docs/DeployContractV1Request.md)
 - [org.openapitools.client.models.DeployContractV1Response](docs/DeployContractV1Response.md)
 - [org.openapitools.client.models.DeployRequestBaseV1](docs/DeployRequestBaseV1.md)
 - [org.openapitools.client.models.EthContractInvocationType](docs/EthContractInvocationType.md)
 - [org.openapitools.client.models.InvokeContractJsonObjectV1Request](docs/InvokeContractJsonObjectV1Request.md)
 - [org.openapitools.client.models.InvokeContractV1Request](docs/InvokeContractV1Request.md)
 - [org.openapitools.client.models.InvokeContractV1Response](docs/InvokeContractV1Response.md)
 - [org.openapitools.client.models.InvokeRequestBaseV1](docs/InvokeRequestBaseV1.md)
 - [org.openapitools.client.models.ReceiptType](docs/ReceiptType.md)
 - [org.openapitools.client.models.RunTransactionV1Request](docs/RunTransactionV1Request.md)
 - [org.openapitools.client.models.RunTransactionV1Response](docs/RunTransactionV1Response.md)
 - [org.openapitools.client.models.SolidityContractJsonArtifact](docs/SolidityContractJsonArtifact.md)
 - [org.openapitools.client.models.Web3SigningCredential](docs/Web3SigningCredential.md)
 - [org.openapitools.client.models.Web3SigningCredentialCactusKeychainRef](docs/Web3SigningCredentialCactusKeychainRef.md)
 - [org.openapitools.client.models.Web3SigningCredentialNone](docs/Web3SigningCredentialNone.md)
 - [org.openapitools.client.models.Web3SigningCredentialPrivateKeyHex](docs/Web3SigningCredentialPrivateKeyHex.md)
 - [org.openapitools.client.models.Web3SigningCredentialType](docs/Web3SigningCredentialType.md)
 - [org.openapitools.client.models.Web3TransactionReceipt](docs/Web3TransactionReceipt.md)
 - [org.openapitools.client.models.XdaiTransactionConfig](docs/XdaiTransactionConfig.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
