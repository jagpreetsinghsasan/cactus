# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteKeychainEntryV1**](DefaultApi.md#deleteKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-google-sm/delete-keychain-entry | Deletes an entry under a key on the keychain backend. |
| [**getKeychainEntryV1**](DefaultApi.md#getKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-google-sm/get-keychain-entry | Retrieves the contents of a keychain entry from the backend. |
| [**hasKeychainEntryV1**](DefaultApi.md#hasKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-google-sm/has-keychain-entry | Checks that an entry exists under a key on the keychain backend. |
| [**setKeychainEntryV1**](DefaultApi.md#setKeychainEntryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-keychain-google-sm/set-keychain-entry | Sets a value under a key on the keychain backend. |


<a id="deleteKeychainEntryV1"></a>
# **deleteKeychainEntryV1**
> DeleteKeychainEntryResponseV1 deleteKeychainEntryV1(deleteKeychainEntryRequestV1)

Deletes an entry under a key on the keychain backend.

### Example
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
    DeleteKeychainEntryRequestV1 deleteKeychainEntryRequestV1 = new DeleteKeychainEntryRequestV1(); // DeleteKeychainEntryRequestV1 | Request body to delete a keychain entry via its key
    try {
      DeleteKeychainEntryResponseV1 result = apiInstance.deleteKeychainEntryV1(deleteKeychainEntryRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteKeychainEntryV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **deleteKeychainEntryRequestV1** | [**DeleteKeychainEntryRequestV1**](DeleteKeychainEntryRequestV1.md)| Request body to delete a keychain entry via its key | |

### Return type

[**DeleteKeychainEntryResponseV1**](DeleteKeychainEntryResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getKeychainEntryV1"></a>
# **getKeychainEntryV1**
> GetKeychainEntryResponseV1 getKeychainEntryV1(getKeychainEntryRequestV1)

Retrieves the contents of a keychain entry from the backend.

### Example
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
    GetKeychainEntryRequestV1 getKeychainEntryRequestV1 = new GetKeychainEntryRequestV1(); // GetKeychainEntryRequestV1 | Request body to obtain a keychain entry via its key
    try {
      GetKeychainEntryResponseV1 result = apiInstance.getKeychainEntryV1(getKeychainEntryRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getKeychainEntryV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **getKeychainEntryRequestV1** | [**GetKeychainEntryRequestV1**](GetKeychainEntryRequestV1.md)| Request body to obtain a keychain entry via its key | |

### Return type

[**GetKeychainEntryResponseV1**](GetKeychainEntryResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. Key must be a string and longer than 0, shorter than 1024 characters. |  -  |
| **401** | Authorization information is missing or invalid. |  -  |
| **404** | A keychain item with the specified key was not found. |  -  |
| **500** | Unexpected error. |  -  |

<a id="hasKeychainEntryV1"></a>
# **hasKeychainEntryV1**
> HasKeychainEntryResponseV1 hasKeychainEntryV1(hasKeychainEntryRequestV1)

Checks that an entry exists under a key on the keychain backend.

### Example
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
    HasKeychainEntryRequestV1 hasKeychainEntryRequestV1 = new HasKeychainEntryRequestV1(); // HasKeychainEntryRequestV1 | Request body for checking a keychain entry via its key
    try {
      HasKeychainEntryResponseV1 result = apiInstance.hasKeychainEntryV1(hasKeychainEntryRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#hasKeychainEntryV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **hasKeychainEntryRequestV1** | [**HasKeychainEntryRequestV1**](HasKeychainEntryRequestV1.md)| Request body for checking a keychain entry via its key | |

### Return type

[**HasKeychainEntryResponseV1**](HasKeychainEntryResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. Key must be a string and longer than 0, shorter than 1024 characters. |  -  |
| **401** | Authorization information is missing or invalid. |  -  |
| **500** | Unexpected error. |  -  |

<a id="setKeychainEntryV1"></a>
# **setKeychainEntryV1**
> SetKeychainEntryResponseV1 setKeychainEntryV1(setKeychainEntryRequestV1)

Sets a value under a key on the keychain backend.

### Example
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
    SetKeychainEntryRequestV1 setKeychainEntryRequestV1 = new SetKeychainEntryRequestV1(); // SetKeychainEntryRequestV1 | Request body to write/update a keychain entry via its key
    try {
      SetKeychainEntryResponseV1 result = apiInstance.setKeychainEntryV1(setKeychainEntryRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#setKeychainEntryV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **setKeychainEntryRequestV1** | [**SetKeychainEntryRequestV1**](SetKeychainEntryRequestV1.md)| Request body to write/update a keychain entry via its key | |

### Return type

[**SetKeychainEntryResponseV1**](SetKeychainEntryResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. Key must be a string and longer than 0, shorter than 1024 characters. |  -  |
| **401** | Authorization information is missing or invalid. |  -  |
| **500** | Unexpected error. |  -  |
