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
*DefaultApi* | [**generateTransactionV1**](docs/DefaultApi.md#generatetransactionv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/generate-transaction | Generate transaction that can be signed locally.
*DefaultApi* | [**getPrometheusMetricsV1**](docs/DefaultApi.md#getprometheusmetricsv1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/get-prometheus-exporter-metrics | Get the Prometheus Metrics
*DefaultApi* | [**runTransactionV1**](docs/DefaultApi.md#runtransactionv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/run-transaction | Executes a transaction on a Iroha ledger


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AddAssetQuantityRequestParameters](docs/AddAssetQuantityRequestParameters.md)
 - [org.openapitools.client.models.AddPeerRequestParameters](docs/AddPeerRequestParameters.md)
 - [org.openapitools.client.models.AddSignatoryRequestParameters](docs/AddSignatoryRequestParameters.md)
 - [org.openapitools.client.models.AppendRoleRequestParameters](docs/AppendRoleRequestParameters.md)
 - [org.openapitools.client.models.CallEngineRequestParameters](docs/CallEngineRequestParameters.md)
 - [org.openapitools.client.models.CompareAndSetAccountDetailRequestParameters](docs/CompareAndSetAccountDetailRequestParameters.md)
 - [org.openapitools.client.models.CreateAccountRequestParameters](docs/CreateAccountRequestParameters.md)
 - [org.openapitools.client.models.CreateAssetRequestParameters](docs/CreateAssetRequestParameters.md)
 - [org.openapitools.client.models.CreateDomainRequestParameters](docs/CreateDomainRequestParameters.md)
 - [org.openapitools.client.models.CreateRoleRequestParameters](docs/CreateRoleRequestParameters.md)
 - [org.openapitools.client.models.DetachRoleRequestParameters](docs/DetachRoleRequestParameters.md)
 - [org.openapitools.client.models.ErrorExceptionJsonResponseV1](docs/ErrorExceptionJsonResponseV1.md)
 - [org.openapitools.client.models.ErrorExceptionResponseV1](docs/ErrorExceptionResponseV1.md)
 - [org.openapitools.client.models.GenerateTransactionRequestV1](docs/GenerateTransactionRequestV1.md)
 - [org.openapitools.client.models.GetAccountAssetTransactionsRequestParameters](docs/GetAccountAssetTransactionsRequestParameters.md)
 - [org.openapitools.client.models.GetAccountAssetsRequestParameters](docs/GetAccountAssetsRequestParameters.md)
 - [org.openapitools.client.models.GetAccountDetailRequestParameters](docs/GetAccountDetailRequestParameters.md)
 - [org.openapitools.client.models.GetAccountRequestParameters](docs/GetAccountRequestParameters.md)
 - [org.openapitools.client.models.GetAccountTransactionsRequestParameters](docs/GetAccountTransactionsRequestParameters.md)
 - [org.openapitools.client.models.GetAssetInfoRequestParameters](docs/GetAssetInfoRequestParameters.md)
 - [org.openapitools.client.models.GetBlockRequestParameters](docs/GetBlockRequestParameters.md)
 - [org.openapitools.client.models.GetEngineReceiptsRequestParameters](docs/GetEngineReceiptsRequestParameters.md)
 - [org.openapitools.client.models.GetPendingTransactionsRequestParameters](docs/GetPendingTransactionsRequestParameters.md)
 - [org.openapitools.client.models.GetRolePermissionsRequestParameters](docs/GetRolePermissionsRequestParameters.md)
 - [org.openapitools.client.models.GetSignatoriesRequestParameters](docs/GetSignatoriesRequestParameters.md)
 - [org.openapitools.client.models.GetTransactionsRequestParameters](docs/GetTransactionsRequestParameters.md)
 - [org.openapitools.client.models.GrantPermissionRequestParameters](docs/GrantPermissionRequestParameters.md)
 - [org.openapitools.client.models.IrohaBaseConfig](docs/IrohaBaseConfig.md)
 - [org.openapitools.client.models.IrohaBlockProgress](docs/IrohaBlockProgress.md)
 - [org.openapitools.client.models.IrohaBlockResponse](docs/IrohaBlockResponse.md)
 - [org.openapitools.client.models.IrohaBlockResponsePayload](docs/IrohaBlockResponsePayload.md)
 - [org.openapitools.client.models.IrohaCommand](docs/IrohaCommand.md)
 - [org.openapitools.client.models.IrohaQuery](docs/IrohaQuery.md)
 - [org.openapitools.client.models.IrohaSocketIOTransactV1](docs/IrohaSocketIOTransactV1.md)
 - [org.openapitools.client.models.KeyPair](docs/KeyPair.md)
 - [org.openapitools.client.models.RemovePeerRequestParameters](docs/RemovePeerRequestParameters.md)
 - [org.openapitools.client.models.RemoveSignatoryRequestParameters](docs/RemoveSignatoryRequestParameters.md)
 - [org.openapitools.client.models.RevokePermissionRequestParameters](docs/RevokePermissionRequestParameters.md)
 - [org.openapitools.client.models.RunTransactionRequestV1](docs/RunTransactionRequestV1.md)
 - [org.openapitools.client.models.RunTransactionRequestV1Body](docs/RunTransactionRequestV1Body.md)
 - [org.openapitools.client.models.RunTransactionRequestV1Params](docs/RunTransactionRequestV1Params.md)
 - [org.openapitools.client.models.RunTransactionResponse](docs/RunTransactionResponse.md)
 - [org.openapitools.client.models.RunTransactionSignedRequestV1](docs/RunTransactionSignedRequestV1.md)
 - [org.openapitools.client.models.SetAccountDetailRequestParameters](docs/SetAccountDetailRequestParameters.md)
 - [org.openapitools.client.models.SetAccountQuorumRequestParameters](docs/SetAccountQuorumRequestParameters.md)
 - [org.openapitools.client.models.SubtractAssetQuantityRequestParameters](docs/SubtractAssetQuantityRequestParameters.md)
 - [org.openapitools.client.models.TransferAssetRequestParameters](docs/TransferAssetRequestParameters.md)
 - [org.openapitools.client.models.WatchBlocksV1](docs/WatchBlocksV1.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
