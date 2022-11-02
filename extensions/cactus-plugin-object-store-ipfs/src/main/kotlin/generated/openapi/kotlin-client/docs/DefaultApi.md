# DefaultApi

All URIs are relative to *https://www.cactus.stream*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getObjectV1**](DefaultApi.md#getObjectV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-object-store-ipfs/get-object | Retrieves an object from the object store.
[**hasObjectV1**](DefaultApi.md#hasObjectV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-object-store-ipfs/has-object | Checks the presence of an object in the object store.
[**setObjectV1**](DefaultApi.md#setObjectV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-object-store-ipfs/set-object | Sets an object in the object store under the specified key.


<a name="getObjectV1"></a>
# **getObjectV1**
> GetObjectResponseV1 getObjectV1(getObjectRequestV1)

Retrieves an object from the object store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val getObjectRequestV1 : GetObjectRequestV1 =  // GetObjectRequestV1 | Request body to obtain an object via its key.
try {
    val result : GetObjectResponseV1 = apiInstance.getObjectV1(getObjectRequestV1)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getObjectRequestV1** | [**GetObjectRequestV1**](GetObjectRequestV1.md)| Request body to obtain an object via its key. |

### Return type

[**GetObjectResponseV1**](GetObjectResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="hasObjectV1"></a>
# **hasObjectV1**
> HasObjectResponseV1 hasObjectV1(hasObjectRequestV1)

Checks the presence of an object in the object store.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val hasObjectRequestV1 : HasObjectRequestV1 =  // HasObjectRequestV1 | Request body to check presence of an object under a key.
try {
    val result : HasObjectResponseV1 = apiInstance.hasObjectV1(hasObjectRequestV1)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#hasObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#hasObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hasObjectRequestV1** | [**HasObjectRequestV1**](HasObjectRequestV1.md)| Request body to check presence of an object under a key. |

### Return type

[**HasObjectResponseV1**](HasObjectResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setObjectV1"></a>
# **setObjectV1**
> SetObjectResponseV1 setObjectV1(setObjectRequestV1)

Sets an object in the object store under the specified key.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val setObjectRequestV1 : SetObjectRequestV1 =  // SetObjectRequestV1 | Request body to set an object under a key.
try {
    val result : SetObjectResponseV1 = apiInstance.setObjectV1(setObjectRequestV1)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#setObjectV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#setObjectV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setObjectRequestV1** | [**SetObjectRequestV1**](SetObjectRequestV1.md)| Request body to set an object under a key. |

### Return type

[**SetObjectResponseV1**](SetObjectResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

