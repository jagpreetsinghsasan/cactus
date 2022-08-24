# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/get-prometheus-exporter-metrics | Get the Prometheus Metrics
[**invokeContractV1**](DefaultApi.md#invokeContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/invoke-contract | Invokes a contract on a Iroha ledger
[**runTransactionV1**](DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/run-transaction | Executes a transaction on a Iroha ledger


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
> invokeContractV1(invokeContractV1Request)

Invokes a contract on a Iroha ledger

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val invokeContractV1Request : InvokeContractV1Request =  // InvokeContractV1Request | 
try {
    apiInstance.invokeContractV1(invokeContractV1Request)
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runTransactionV1"></a>
# **runTransactionV1**
> RunTransactionResponse runTransactionV1(runTransactionRequestV1)

Executes a transaction on a Iroha ledger

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val runTransactionRequestV1 : RunTransactionRequestV1 =  // RunTransactionRequestV1 | 
try {
    val result : RunTransactionResponse = apiInstance.runTransactionV1(runTransactionRequestV1)
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
 **runTransactionRequestV1** | [**RunTransactionRequestV1**](RunTransactionRequestV1.md)|  | [optional]

### Return type

[**RunTransactionResponse**](RunTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

