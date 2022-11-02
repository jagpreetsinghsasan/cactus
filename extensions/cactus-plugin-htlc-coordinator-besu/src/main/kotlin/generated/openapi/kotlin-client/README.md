# org.openapitools.client - Kotlin client library for Hyperledger Cactus Plugin - HTLC Coordinator

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

All URIs are relative to *https://www.cactus.stream*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**counterpartyHtlcV1**](docs/DefaultApi.md#counterpartyhtlcv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-coordinator-besu/counterparty-htlc | Create an instance to interact with the counterparty HTLC
*DefaultApi* | [**ownHtlcV1**](docs/DefaultApi.md#ownhtlcv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-coordinator-besu/own-htlc | Create an instance to interact with the own HTLC.
*DefaultApi* | [**withdrawCounterpartyV1**](docs/DefaultApi.md#withdrawcounterpartyv1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-coordinator-besu/withdraw-counterparty | Withdraw funds of the counterparty HTLC


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.CounterpartyHTLCRequest](docs/CounterpartyHTLCRequest.md)
 - [org.openapitools.client.models.HtlcPackage](docs/HtlcPackage.md)
 - [org.openapitools.client.models.OwnHTLCRequest](docs/OwnHTLCRequest.md)
 - [org.openapitools.client.models.Web3SigningCredential](docs/Web3SigningCredential.md)
 - [org.openapitools.client.models.Web3SigningCredentialCactusKeychainRef](docs/Web3SigningCredentialCactusKeychainRef.md)
 - [org.openapitools.client.models.Web3SigningCredentialNone](docs/Web3SigningCredentialNone.md)
 - [org.openapitools.client.models.Web3SigningCredentialPrivateKeyHex](docs/Web3SigningCredentialPrivateKeyHex.md)
 - [org.openapitools.client.models.Web3SigningCredentialType](docs/Web3SigningCredentialType.md)
 - [org.openapitools.client.models.WithdrawCounterpartyRequest](docs/WithdrawCounterpartyRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
