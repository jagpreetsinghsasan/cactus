# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteKeychainEntryV1**](DefaultApi.md#deleteKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-vault/delete-keychain-entry | Deletes an entry from the keychain stored under the provided key.
[**getKeychainEntryV1**](DefaultApi.md#getKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-vault/get-keychain-entry | Retrieves the contents of a keychain entry from the backend.
[**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-vault/get-prometheus-exporter-metrics | Get the Prometheus Metrics
[**hasKeychainEntryV1**](DefaultApi.md#hasKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-vault/has-keychain-entry | Retrieves the information regarding a key being present on the keychain or not.
[**setKeychainEntryV1**](DefaultApi.md#setKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-vault/set-keychain-entry | Sets a value under a key on the keychain backend.


<a name="deleteKeychainEntryV1"></a>
# **deleteKeychainEntryV1**
> DeleteKeychainEntryResponseV1 deleteKeychainEntryV1(deleteKeychainEntryRequestV1)

Deletes an entry from the keychain stored under the provided key.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val deleteKeychainEntryRequestV1 : DeleteKeychainEntryRequestV1 =  // DeleteKeychainEntryRequestV1 | 
try {
    val result : DeleteKeychainEntryResponseV1 = apiInstance.deleteKeychainEntryV1(deleteKeychainEntryRequestV1)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deleteKeychainEntryV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deleteKeychainEntryV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deleteKeychainEntryRequestV1** | [**DeleteKeychainEntryRequestV1**](DeleteKeychainEntryRequestV1.md)|  | [optional]

### Return type

[**DeleteKeychainEntryResponseV1**](DeleteKeychainEntryResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKeychainEntryV1"></a>
# **getKeychainEntryV1**
> GetKeychainEntryResponse getKeychainEntryV1(getKeychainEntryRequest)

Retrieves the contents of a keychain entry from the backend.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val getKeychainEntryRequest : GetKeychainEntryRequest =  // GetKeychainEntryRequest | Request body to obtain a keychain entry via its key
try {
    val result : GetKeychainEntryResponse = apiInstance.getKeychainEntryV1(getKeychainEntryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getKeychainEntryV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getKeychainEntryV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getKeychainEntryRequest** | [**GetKeychainEntryRequest**](GetKeychainEntryRequest.md)| Request body to obtain a keychain entry via its key |

### Return type

[**GetKeychainEntryResponse**](GetKeychainEntryResponse.md)

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

<a name="hasKeychainEntryV1"></a>
# **hasKeychainEntryV1**
> HasKeychainEntryResponseV1 hasKeychainEntryV1(hasKeychainEntryRequestV1)

Retrieves the information regarding a key being present on the keychain or not.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val hasKeychainEntryRequestV1 : HasKeychainEntryRequestV1 =  // HasKeychainEntryRequestV1 | 
try {
    val result : HasKeychainEntryResponseV1 = apiInstance.hasKeychainEntryV1(hasKeychainEntryRequestV1)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#hasKeychainEntryV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#hasKeychainEntryV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hasKeychainEntryRequestV1** | [**HasKeychainEntryRequestV1**](HasKeychainEntryRequestV1.md)|  | [optional]

### Return type

[**HasKeychainEntryResponseV1**](HasKeychainEntryResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setKeychainEntryV1"></a>
# **setKeychainEntryV1**
> SetKeychainEntryResponse setKeychainEntryV1(setKeychainEntryRequest)

Sets a value under a key on the keychain backend.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val setKeychainEntryRequest : SetKeychainEntryRequest =  // SetKeychainEntryRequest | Request body to write/update a keychain entry via its key
try {
    val result : SetKeychainEntryResponse = apiInstance.setKeychainEntryV1(setKeychainEntryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#setKeychainEntryV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#setKeychainEntryV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setKeychainEntryRequest** | [**SetKeychainEntryRequest**](SetKeychainEntryRequest.md)| Request body to write/update a keychain entry via its key |

### Return type

[**SetKeychainEntryResponse**](SetKeychainEntryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

