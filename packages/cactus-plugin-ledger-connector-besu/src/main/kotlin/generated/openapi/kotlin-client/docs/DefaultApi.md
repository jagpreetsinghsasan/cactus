# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployContractSolBytecodeV1**](DefaultApi.md#deployContractSolBytecodeV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract.
[**getBalanceV1**](DefaultApi.md#getBalanceV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-balance | Return balance of an address of a given block
[**getBesuRecordV1**](DefaultApi.md#getBesuRecordV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-besu-record | Retrieves an arbitrary record (any piece of information) from the ledger. Ledger records can be call outputs, transaction input, etc.
[**getBlockV1**](DefaultApi.md#getBlockV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-block | Returns a block matching the block
[**getPastLogsV1**](DefaultApi.md#getPastLogsV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-past-logs | Gets past logs, matching the given options.
[**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-prometheus-exporter-metrics | Get the Prometheus Metrics
[**getTransactionV1**](DefaultApi.md#getTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-transaction | Executes a transaction on a besu ledger
[**invokeContractV1**](DefaultApi.md#invokeContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/invoke-contract | Invokes a contract on a besu ledger
[**runTransactionV1**](DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/run-transaction | Executes a transaction on a besu ledger
[**signTransactionV1**](DefaultApi.md#signTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/sign-transaction | Obtain signatures of ledger from the corresponding transaction hash.


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

<a name="getBalanceV1"></a>
# **getBalanceV1**
> GetBalanceV1Response getBalanceV1(getBalanceV1Request)

Return balance of an address of a given block

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val getBalanceV1Request : GetBalanceV1Request =  // GetBalanceV1Request | 
try {
    val result : GetBalanceV1Response = apiInstance.getBalanceV1(getBalanceV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBalanceV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBalanceV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getBalanceV1Request** | [**GetBalanceV1Request**](GetBalanceV1Request.md)|  | [optional]

### Return type

[**GetBalanceV1Response**](GetBalanceV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBesuRecordV1"></a>
# **getBesuRecordV1**
> GetBesuRecordV1Response getBesuRecordV1(getBesuRecordV1Request)

Retrieves an arbitrary record (any piece of information) from the ledger. Ledger records can be call outputs, transaction input, etc.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val getBesuRecordV1Request : GetBesuRecordV1Request =  // GetBesuRecordV1Request | 
try {
    val result : GetBesuRecordV1Response = apiInstance.getBesuRecordV1(getBesuRecordV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBesuRecordV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBesuRecordV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getBesuRecordV1Request** | [**GetBesuRecordV1Request**](GetBesuRecordV1Request.md)|  | [optional]

### Return type

[**GetBesuRecordV1Response**](GetBesuRecordV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getBlockV1"></a>
# **getBlockV1**
> GetBlockV1Response getBlockV1(getBlockV1Request)

Returns a block matching the block

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val getBlockV1Request : GetBlockV1Request =  // GetBlockV1Request | 
try {
    val result : GetBlockV1Response = apiInstance.getBlockV1(getBlockV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getBlockV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getBlockV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getBlockV1Request** | [**GetBlockV1Request**](GetBlockV1Request.md)|  | [optional]

### Return type

[**GetBlockV1Response**](GetBlockV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPastLogsV1"></a>
# **getPastLogsV1**
> GetPastLogsV1Response getPastLogsV1(getPastLogsV1Request)

Gets past logs, matching the given options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val getPastLogsV1Request : GetPastLogsV1Request =  // GetPastLogsV1Request | 
try {
    val result : GetPastLogsV1Response = apiInstance.getPastLogsV1(getPastLogsV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getPastLogsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getPastLogsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getPastLogsV1Request** | [**GetPastLogsV1Request**](GetPastLogsV1Request.md)|  | [optional]

### Return type

[**GetPastLogsV1Response**](GetPastLogsV1Response.md)

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
 - **Accept**: Not defined

<a name="getTransactionV1"></a>
# **getTransactionV1**
> GetTransactionV1Response getTransactionV1(getTransactionV1Request)

Executes a transaction on a besu ledger

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val getTransactionV1Request : GetTransactionV1Request =  // GetTransactionV1Request | 
try {
    val result : GetTransactionV1Response = apiInstance.getTransactionV1(getTransactionV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getTransactionV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getTransactionV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getTransactionV1Request** | [**GetTransactionV1Request**](GetTransactionV1Request.md)|  | [optional]

### Return type

[**GetTransactionV1Response**](GetTransactionV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

<a name="runTransactionV1"></a>
# **runTransactionV1**
> RunTransactionResponse runTransactionV1(runTransactionRequest)

Executes a transaction on a besu ledger

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

<a name="signTransactionV1"></a>
# **signTransactionV1**
> SignTransactionResponse signTransactionV1(signTransactionRequest)

Obtain signatures of ledger from the corresponding transaction hash.

Obtain signatures of ledger from the corresponding transaction hash.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val signTransactionRequest : SignTransactionRequest =  // SignTransactionRequest | 
try {
    val result : SignTransactionResponse = apiInstance.signTransactionV1(signTransactionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#signTransactionV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#signTransactionV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signTransactionRequest** | [**SignTransactionRequest**](SignTransactionRequest.md)|  |

### Return type

[**SignTransactionResponse**](SignTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

