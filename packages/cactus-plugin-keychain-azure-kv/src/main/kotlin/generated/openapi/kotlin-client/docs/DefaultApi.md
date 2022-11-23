# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteKeychainEntryV1**](DefaultApi.md#deleteKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-azure-kv/delete-keychain-entry | Deletes a value under a key on the keychain backend.
[**getKeychainEntryV1**](DefaultApi.md#getKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-azure-kv/get-keychain-entry | Retrieves the contents of a keychain entry from the backend.
[**hasKeychainEntryV1**](DefaultApi.md#hasKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-azure-kv/has-keychain-entry | Checks that an entry exists under a key on the keychain backend
[**setKeychainEntryV1**](DefaultApi.md#setKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-azure-kv/set-keychain-entry | Sets a value under a key on the keychain backend.


<a name="deleteKeychainEntryV1"></a>
# **deleteKeychainEntryV1**
> DeleteKeychainEntryResponseV1 deleteKeychainEntryV1(deleteKeychainEntryRequestV1)

Deletes a value under a key on the keychain backend.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val deleteKeychainEntryRequestV1 : DeleteKeychainEntryRequestV1 =  // DeleteKeychainEntryRequestV1 | Request body to delete a keychain entry via its key
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
 **deleteKeychainEntryRequestV1** | [**DeleteKeychainEntryRequestV1**](DeleteKeychainEntryRequestV1.md)| Request body to delete a keychain entry via its key |

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

<a name="hasKeychainEntryV1"></a>
# **hasKeychainEntryV1**
> HasKeychainEntryResponseV1 hasKeychainEntryV1(hasKeychainEntryRequestV1)

Checks that an entry exists under a key on the keychain backend

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val hasKeychainEntryRequestV1 : HasKeychainEntryRequestV1 =  // HasKeychainEntryRequestV1 | Request body for checking a keychain entry via its key
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
 **hasKeychainEntryRequestV1** | [**HasKeychainEntryRequestV1**](HasKeychainEntryRequestV1.md)| Request body for checking a keychain entry via its key |

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

