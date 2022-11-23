# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployContractJsonObjectV1**](DefaultApi.md#deployContractJsonObjectV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/deploy-contract-solidity-bytecode-json-object | Deploys the bytecode of a Solidity contract.
[**deployContractV1**](DefaultApi.md#deployContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract.
[**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/get-prometheus-exporter-metrics | Get the Prometheus Metrics
[**invokeContractJsonObject**](DefaultApi.md#invokeContractJsonObject) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/invoke-contract-json-object | Invokes a contract on a besu ledger
[**invokeContractV1**](DefaultApi.md#invokeContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/invoke-contract | Invokes a contract on a xdai ledger
[**runTransactionV1**](DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/run-transaction | Executes a transaction on a xdai ledger


<a name="deployContractJsonObjectV1"></a>
# **deployContractJsonObjectV1**
> DeployContractV1Response deployContractJsonObjectV1(deployContractJsonObjectV1Request)

Deploys the bytecode of a Solidity contract.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val deployContractJsonObjectV1Request : DeployContractJsonObjectV1Request =  // DeployContractJsonObjectV1Request | 
try {
    val result : DeployContractV1Response = apiInstance.deployContractJsonObjectV1(deployContractJsonObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deployContractJsonObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deployContractJsonObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployContractJsonObjectV1Request** | [**DeployContractJsonObjectV1Request**](DeployContractJsonObjectV1Request.md)|  | [optional]

### Return type

[**DeployContractV1Response**](DeployContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deployContractV1"></a>
# **deployContractV1**
> DeployContractV1Response deployContractV1(deployContractV1Request)

Deploys the bytecode of a Solidity contract.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val deployContractV1Request : DeployContractV1Request =  // DeployContractV1Request | 
try {
    val result : DeployContractV1Response = apiInstance.deployContractV1(deployContractV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deployContractV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deployContractV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployContractV1Request** | [**DeployContractV1Request**](DeployContractV1Request.md)|  | [optional]

### Return type

[**DeployContractV1Response**](DeployContractV1Response.md)

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

<a name="invokeContractJsonObject"></a>
# **invokeContractJsonObject**
> InvokeContractV1Response invokeContractJsonObject(invokeContractJsonObjectV1Request)

Invokes a contract on a besu ledger

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val invokeContractJsonObjectV1Request : InvokeContractJsonObjectV1Request =  // InvokeContractJsonObjectV1Request | 
try {
    val result : InvokeContractV1Response = apiInstance.invokeContractJsonObject(invokeContractJsonObjectV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#invokeContractJsonObject")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#invokeContractJsonObject")
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

<a name="invokeContractV1"></a>
# **invokeContractV1**
> InvokeContractV1Response invokeContractV1(invokeContractV1Request)

Invokes a contract on a xdai ledger

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
> RunTransactionV1Response runTransactionV1(runTransactionV1Request)

Executes a transaction on a xdai ledger

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val runTransactionV1Request : RunTransactionV1Request =  // RunTransactionV1Request | 
try {
    val result : RunTransactionV1Response = apiInstance.runTransactionV1(runTransactionV1Request)
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
 **runTransactionV1Request** | [**RunTransactionV1Request**](RunTransactionV1Request.md)|  | [optional]

### Return type

[**RunTransactionV1Response**](RunTransactionV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

