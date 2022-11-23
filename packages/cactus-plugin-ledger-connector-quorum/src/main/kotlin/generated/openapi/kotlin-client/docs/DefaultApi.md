# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployContractSolBytecodeJsonObjectV1**](DefaultApi.md#deployContractSolBytecodeJsonObjectV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/deploy-contract-solidity-bytecode-json-object | Deploys the bytecode of a Solidity contract.
[**deployContractSolBytecodeV1**](DefaultApi.md#deployContractSolBytecodeV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract.
[**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/get-prometheus-exporter-metrics | Get the Prometheus Metrics
[**invokeContractV1**](DefaultApi.md#invokeContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-contract | Invokes a contract on a besu ledger
[**invokeContractV1NoKeychain**](DefaultApi.md#invokeContractV1NoKeychain) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-contract-json-object | Invokes a contract on a besu ledger
[**invokeRawWeb3EthContractV1**](DefaultApi.md#invokeRawWeb3EthContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-raw-web3eth-contract | Low-level endpoint to invoke a method on deployed contract.
[**invokeWeb3EthMethodV1**](DefaultApi.md#invokeWeb3EthMethodV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-raw-web3eth-method | Invoke any method from web3.eth (low-level)
[**runTransactionV1**](DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/run-transaction | Executes a transaction on a quorum ledger


<a name="deployContractSolBytecodeJsonObjectV1"></a>
# **deployContractSolBytecodeJsonObjectV1**
> DeployContractSolidityBytecodeV1Response deployContractSolBytecodeJsonObjectV1(deployContractSolidityBytecodeJsonObjectV1Request)

Deploys the bytecode of a Solidity contract.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val deployContractSolidityBytecodeJsonObjectV1Request : DeployContractSolidityBytecodeJsonObjectV1Request =  // DeployContractSolidityBytecodeJsonObjectV1Request | 
try {
    val result : DeployContractSolidityBytecodeV1Response = apiInstance.deployContractSolBytecodeJsonObjectV1(deployContractSolidityBytecodeJsonObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deployContractSolBytecodeJsonObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deployContractSolBytecodeJsonObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployContractSolidityBytecodeJsonObjectV1Request** | [**DeployContractSolidityBytecodeJsonObjectV1Request**](DeployContractSolidityBytecodeJsonObjectV1Request.md)|  | [optional]

### Return type

[**DeployContractSolidityBytecodeV1Response**](DeployContractSolidityBytecodeV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deployContractSolBytecodeV1"></a>
# **deployContractSolBytecodeV1**
> DeployContractSolidityBytecodeV1Response deployContractSolBytecodeV1(deployContractSolidityBytecodeV1Request)

Deploys the bytecode of a Solidity contract.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val deployContractSolidityBytecodeV1Request : DeployContractSolidityBytecodeV1Request =  // DeployContractSolidityBytecodeV1Request | 
try {
    val result : DeployContractSolidityBytecodeV1Response = apiInstance.deployContractSolBytecodeV1(deployContractSolidityBytecodeV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deployContractSolBytecodeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deployContractSolBytecodeV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployContractSolidityBytecodeV1Request** | [**DeployContractSolidityBytecodeV1Request**](DeployContractSolidityBytecodeV1Request.md)|  | [optional]

### Return type

[**DeployContractSolidityBytecodeV1Response**](DeployContractSolidityBytecodeV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPrometheusMetricsV1"></a>
# **getPrometheusMetricsV1**
> kotlin.String getPrometheusMetricsV1()

Get the Prometheus Metrics

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.String = apiInstance.getPrometheusMetricsV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getPrometheusMetricsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getPrometheusMetricsV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="invokeContractV1"></a>
# **invokeContractV1**
> InvokeContractV1Response invokeContractV1(invokeContractV1Request)

Invokes a contract on a besu ledger

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val invokeContractV1Request : InvokeContractV1Request =  // InvokeContractV1Request | 
try {
    val result : InvokeContractV1Response = apiInstance.invokeContractV1(invokeContractV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#invokeContractV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#invokeContractV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invokeContractV1Request** | [**InvokeContractV1Request**](InvokeContractV1Request.md)|  | [optional]

### Return type

[**InvokeContractV1Response**](InvokeContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invokeContractV1NoKeychain"></a>
# **invokeContractV1NoKeychain**
> InvokeContractV1Response invokeContractV1NoKeychain(invokeContractJsonObjectV1Request)

Invokes a contract on a besu ledger

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val invokeContractJsonObjectV1Request : InvokeContractJsonObjectV1Request =  // InvokeContractJsonObjectV1Request | 
try {
    val result : InvokeContractV1Response = apiInstance.invokeContractV1NoKeychain(invokeContractJsonObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#invokeContractV1NoKeychain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#invokeContractV1NoKeychain")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invokeContractJsonObjectV1Request** | [**InvokeContractJsonObjectV1Request**](InvokeContractJsonObjectV1Request.md)|  | [optional]

### Return type

[**InvokeContractV1Response**](InvokeContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invokeRawWeb3EthContractV1"></a>
# **invokeRawWeb3EthContractV1**
> InvokeRawWeb3EthContractV1Response invokeRawWeb3EthContractV1(invokeRawWeb3EthContractV1Request)

Low-level endpoint to invoke a method on deployed contract.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val invokeRawWeb3EthContractV1Request : InvokeRawWeb3EthContractV1Request =  // InvokeRawWeb3EthContractV1Request | 
try {
    val result : InvokeRawWeb3EthContractV1Response = apiInstance.invokeRawWeb3EthContractV1(invokeRawWeb3EthContractV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#invokeRawWeb3EthContractV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#invokeRawWeb3EthContractV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invokeRawWeb3EthContractV1Request** | [**InvokeRawWeb3EthContractV1Request**](InvokeRawWeb3EthContractV1Request.md)|  | [optional]

### Return type

[**InvokeRawWeb3EthContractV1Response**](InvokeRawWeb3EthContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="invokeWeb3EthMethodV1"></a>
# **invokeWeb3EthMethodV1**
> InvokeRawWeb3EthMethodV1Response invokeWeb3EthMethodV1(invokeRawWeb3EthMethodV1Request)

Invoke any method from web3.eth (low-level)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val invokeRawWeb3EthMethodV1Request : InvokeRawWeb3EthMethodV1Request =  // InvokeRawWeb3EthMethodV1Request | 
try {
    val result : InvokeRawWeb3EthMethodV1Response = apiInstance.invokeWeb3EthMethodV1(invokeRawWeb3EthMethodV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#invokeWeb3EthMethodV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#invokeWeb3EthMethodV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invokeRawWeb3EthMethodV1Request** | [**InvokeRawWeb3EthMethodV1Request**](InvokeRawWeb3EthMethodV1Request.md)|  | [optional]

### Return type

[**InvokeRawWeb3EthMethodV1Response**](InvokeRawWeb3EthMethodV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="runTransactionV1"></a>
# **runTransactionV1**
> RunTransactionResponse runTransactionV1(runTransactionRequest)

Executes a transaction on a quorum ledger

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val runTransactionRequest : RunTransactionRequest =  // RunTransactionRequest | 
try {
    val result : RunTransactionResponse = apiInstance.runTransactionV1(runTransactionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#runTransactionV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#runTransactionV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runTransactionRequest** | [**RunTransactionRequest**](RunTransactionRequest.md)|  | [optional]

### Return type

[**RunTransactionResponse**](RunTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

