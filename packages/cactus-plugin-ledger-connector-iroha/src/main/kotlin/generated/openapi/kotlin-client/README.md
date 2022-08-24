# org.openapitools.client - Kotlin client library for Hyperledger Cactus Plugin - Connector Iroha

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
*DefaultApi* | [**getPrometheusMetricsV1**](docs/DefaultApi.md#getprometheusmetricsv1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/get-prometheus-exporter-metrics | Get the Prometheus Metrics
*DefaultApi* | [**invokeContractV1**](docs/DefaultApi.md#invokecontractv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/invoke-contract | Invokes a contract on a Iroha ledger
*DefaultApi* | [**runTransactionV1**](docs/DefaultApi.md#runtransactionv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/run-transaction | Executes a transaction on a Iroha ledger


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.InlineResponse501](docs/InlineResponse501.md)
 - [org.openapitools.client.models.InvokeContractV1Request](docs/InvokeContractV1Request.md)
 - [org.openapitools.client.models.IrohaBaseConfig](docs/IrohaBaseConfig.md)
 - [org.openapitools.client.models.IrohaCommand](docs/IrohaCommand.md)
 - [org.openapitools.client.models.IrohaQuery](docs/IrohaQuery.md)
 - [org.openapitools.client.models.KeyPair](docs/KeyPair.md)
 - [org.openapitools.client.models.RunTransactionRequestV1](docs/RunTransactionRequestV1.md)
 - [org.openapitools.client.models.RunTransactionResponse](docs/RunTransactionResponse.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
