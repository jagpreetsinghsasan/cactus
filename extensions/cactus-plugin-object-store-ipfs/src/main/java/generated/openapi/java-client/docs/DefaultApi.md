# DefaultApi

All URIs are relative to *https://www.cactus.stream*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getObjectV1**](DefaultApi.md#getObjectV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-object-store-ipfs/get-object | Retrieves an object from the object store. |
| [**hasObjectV1**](DefaultApi.md#hasObjectV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-object-store-ipfs/has-object | Checks the presence of an object in the object store. |
| [**setObjectV1**](DefaultApi.md#setObjectV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-object-store-ipfs/set-object | Sets an object in the object store under the specified key. |


<a id="getObjectV1"></a>
# **getObjectV1**
> GetObjectResponseV1 getObjectV1(getObjectRequestV1)

Retrieves an object from the object store.

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
    defaultClient.setBasePath("https://www.cactus.stream");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    GetObjectRequestV1 getObjectRequestV1 = new GetObjectRequestV1(); // GetObjectRequestV1 | Request body to obtain an object via its key.
    try {
      GetObjectResponseV1 result = apiInstance.getObjectV1(getObjectRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getObjectV1");
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
| **getObjectRequestV1** | [**GetObjectRequestV1**](GetObjectRequestV1.md)| Request body to obtain an object via its key. | |

### Return type

[**GetObjectResponseV1**](GetObjectResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="hasObjectV1"></a>
# **hasObjectV1**
> HasObjectResponseV1 hasObjectV1(hasObjectRequestV1)

Checks the presence of an object in the object store.

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
    defaultClient.setBasePath("https://www.cactus.stream");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    HasObjectRequestV1 hasObjectRequestV1 = new HasObjectRequestV1(); // HasObjectRequestV1 | Request body to check presence of an object under a key.
    try {
      HasObjectResponseV1 result = apiInstance.hasObjectV1(hasObjectRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#hasObjectV1");
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
| **hasObjectRequestV1** | [**HasObjectRequestV1**](HasObjectRequestV1.md)| Request body to check presence of an object under a key. | |

### Return type

[**HasObjectResponseV1**](HasObjectResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="setObjectV1"></a>
# **setObjectV1**
> SetObjectResponseV1 setObjectV1(setObjectRequestV1)

Sets an object in the object store under the specified key.

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
    defaultClient.setBasePath("https://www.cactus.stream");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    SetObjectRequestV1 setObjectRequestV1 = new SetObjectRequestV1(); // SetObjectRequestV1 | Request body to set an object under a key.
    try {
      SetObjectResponseV1 result = apiInstance.setObjectV1(setObjectRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#setObjectV1");
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
| **setObjectRequestV1** | [**SetObjectRequestV1**](SetObjectRequestV1.md)| Request body to set an object under a key. | |

### Return type

[**SetObjectResponseV1**](SetObjectResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

