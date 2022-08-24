# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateTransactionV1**](DefaultApi.md#generateTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/generate-transaction | Generate transaction that can be signed locally.
[**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/get-prometheus-exporter-metrics | Get the Prometheus Metrics
[**runTransactionV1**](DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha/run-transaction | Executes a transaction on a Iroha ledger


<a name="generateTransactionV1"></a>
# **generateTransactionV1**
> java.io.File generateTransactionV1(generateTransactionRequestV1)

Generate transaction that can be signed locally.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val generateTransactionRequestV1 : GenerateTransactionRequestV1 =  // GenerateTransactionRequestV1 | 
try {
    val result : java.io.File = apiInstance.generateTransactionV1(generateTransactionRequestV1)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#generateTransactionV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#generateTransactionV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateTransactionRequestV1** | [**GenerateTransactionRequestV1**](GenerateTransactionRequestV1.md)|  | [optional]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream, application/json

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

<a name="runTransactionV1"></a>
# **runTransactionV1**
> RunTransactionResponse runTransactionV1(UNKNOWN_BASE_TYPE)

Executes a transaction on a Iroha ledger

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val UNKNOWN_BASE_TYPE : UNKNOWN_BASE_TYPE =  // UNKNOWN_BASE_TYPE | 
try {
    val result : RunTransactionResponse = apiInstance.runTransactionV1(UNKNOWN_BASE_TYPE)
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
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional]

### Return type

[**RunTransactionResponse**](RunTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

