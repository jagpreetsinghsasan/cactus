# openapi-java-client

Hyperledger Cactus Plugin - Connector Besu
- API version: v2.0.0-alpha.1
  - Build date: 2023-09-27T17:03:27.847578276+05:30[Asia/Kolkata]

Can perform basic tasks on a Besu ledger


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v2.0.0-alpha.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:v2.0.0-alpha.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v2.0.0-alpha.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    DeployContractSolidityBytecodeV1Request deployContractSolidityBytecodeV1Request = new DeployContractSolidityBytecodeV1Request(); // DeployContractSolidityBytecodeV1Request | 
    try {
      DeployContractSolidityBytecodeV1Response result = apiInstance.deployContractSolBytecodeV1(deployContractSolidityBytecodeV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deployContractSolBytecodeV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**deployContractSolBytecodeV1**](docs/DefaultApi.md#deployContractSolBytecodeV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract.
*DefaultApi* | [**getBalanceV1**](docs/DefaultApi.md#getBalanceV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-balance | Return balance of an address of a given block
*DefaultApi* | [**getBesuRecordV1**](docs/DefaultApi.md#getBesuRecordV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-besu-record | Retrieves an arbitrary record (any piece of information) from the ledger. Ledger records can be call outputs, transaction input, etc.
*DefaultApi* | [**getBlockV1**](docs/DefaultApi.md#getBlockV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-block | Returns a block matching the block
*DefaultApi* | [**getOpenApiSpecV1**](docs/DefaultApi.md#getOpenApiSpecV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-open-api-spec | Retrieves the .json file that contains the OpenAPI specification for the plugin.
*DefaultApi* | [**getPastLogsV1**](docs/DefaultApi.md#getPastLogsV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-past-logs | Gets past logs, matching the given options.
*DefaultApi* | [**getPrometheusMetricsV1**](docs/DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-prometheus-exporter-metrics | Get the Prometheus Metrics
*DefaultApi* | [**getTransactionV1**](docs/DefaultApi.md#getTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-transaction | Executes a transaction on a besu ledger
*DefaultApi* | [**invokeContractV1**](docs/DefaultApi.md#invokeContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/invoke-contract | Invokes a contract on a besu ledger
*DefaultApi* | [**runTransactionV1**](docs/DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/run-transaction | Executes a transaction on a besu ledger
*DefaultApi* | [**signTransactionV1**](docs/DefaultApi.md#signTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/sign-transaction | Obtain signatures of ledger from the corresponding transaction hash.


## Documentation for Models

 - [BesuPrivateTransactionConfig](docs/BesuPrivateTransactionConfig.md)
 - [BesuTransactionConfig](docs/BesuTransactionConfig.md)
 - [BesuTransactionConfigTo](docs/BesuTransactionConfigTo.md)
 - [ConsistencyStrategy](docs/ConsistencyStrategy.md)
 - [DeployContractSolidityBytecodeV1Request](docs/DeployContractSolidityBytecodeV1Request.md)
 - [DeployContractSolidityBytecodeV1Response](docs/DeployContractSolidityBytecodeV1Response.md)
 - [EthContractInvocationType](docs/EthContractInvocationType.md)
 - [EvmBlock](docs/EvmBlock.md)
 - [EvmLog](docs/EvmLog.md)
 - [EvmTransaction](docs/EvmTransaction.md)
 - [GetBalanceV1Request](docs/GetBalanceV1Request.md)
 - [GetBalanceV1Response](docs/GetBalanceV1Response.md)
 - [GetBesuRecordV1Request](docs/GetBesuRecordV1Request.md)
 - [GetBesuRecordV1Response](docs/GetBesuRecordV1Response.md)
 - [GetBlockV1Request](docs/GetBlockV1Request.md)
 - [GetBlockV1Response](docs/GetBlockV1Response.md)
 - [GetPastLogsV1Request](docs/GetPastLogsV1Request.md)
 - [GetPastLogsV1Response](docs/GetPastLogsV1Response.md)
 - [GetTransactionV1Request](docs/GetTransactionV1Request.md)
 - [GetTransactionV1Response](docs/GetTransactionV1Response.md)
 - [InvokeContractV1Request](docs/InvokeContractV1Request.md)
 - [InvokeContractV1Response](docs/InvokeContractV1Response.md)
 - [ReceiptType](docs/ReceiptType.md)
 - [RunTransactionRequest](docs/RunTransactionRequest.md)
 - [RunTransactionResponse](docs/RunTransactionResponse.md)
 - [SignTransactionRequest](docs/SignTransactionRequest.md)
 - [SignTransactionResponse](docs/SignTransactionResponse.md)
 - [SolidityContractJsonArtifact](docs/SolidityContractJsonArtifact.md)
 - [SolidityContractJsonArtifactCompiler](docs/SolidityContractJsonArtifactCompiler.md)
 - [SolidityContractJsonArtifactGasEstimates](docs/SolidityContractJsonArtifactGasEstimates.md)
 - [SolidityContractJsonArtifactGasEstimatesCreation](docs/SolidityContractJsonArtifactGasEstimatesCreation.md)
 - [WatchBlocksV1](docs/WatchBlocksV1.md)
 - [WatchBlocksV1Progress](docs/WatchBlocksV1Progress.md)
 - [Web3BlockHeader](docs/Web3BlockHeader.md)
 - [Web3BlockHeaderTimestamp](docs/Web3BlockHeaderTimestamp.md)
 - [Web3SigningCredential](docs/Web3SigningCredential.md)
 - [Web3SigningCredentialCactusKeychainRef](docs/Web3SigningCredentialCactusKeychainRef.md)
 - [Web3SigningCredentialNone](docs/Web3SigningCredentialNone.md)
 - [Web3SigningCredentialPrivateKeyHex](docs/Web3SigningCredentialPrivateKeyHex.md)
 - [Web3SigningCredentialType](docs/Web3SigningCredentialType.md)
 - [Web3TransactionReceipt](docs/Web3TransactionReceipt.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


