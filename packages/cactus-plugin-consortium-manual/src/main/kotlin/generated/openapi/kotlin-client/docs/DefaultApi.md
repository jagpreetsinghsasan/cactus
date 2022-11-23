# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConsortiumJwsV1**](DefaultApi.md#getConsortiumJwsV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-consortium-manual/consortium/jws | Retrieves a consortium JWS
[**getNodeJwsV1**](DefaultApi.md#getNodeJwsV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-consortium-manual/node/jws | Retrieves the JWT of a Cactus Node
[**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-consortium-manual/get-prometheus-exporter-metrics | Get the Prometheus Metrics


<a name="getConsortiumJwsV1"></a>
# **getConsortiumJwsV1**
> GetConsortiumJwsResponse getConsortiumJwsV1(body)

Retrieves a consortium JWS

The JWS asserting the consortium metadata (pub keys and hosts of nodes)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : GetConsortiumJwsResponse = apiInstance.getConsortiumJwsV1(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getConsortiumJwsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getConsortiumJwsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.Any**|  | [optional]

### Return type

[**GetConsortiumJwsResponse**](GetConsortiumJwsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeJwsV1"></a>
# **getNodeJwsV1**
> GetNodeJwsResponse getNodeJwsV1(body)

Retrieves the JWT of a Cactus Node

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : GetNodeJwsResponse = apiInstance.getNodeJwsV1(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getNodeJwsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getNodeJwsV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.Any**|  | [optional]

### Return type

[**GetNodeJwsResponse**](GetNodeJwsResponse.md)

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

