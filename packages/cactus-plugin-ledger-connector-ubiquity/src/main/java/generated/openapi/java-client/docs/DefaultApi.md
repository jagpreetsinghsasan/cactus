# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTransactionByAddressV1**](DefaultApi.md#getTransactionByAddressV1) | **POST** /api/v1/@hyperledger/cactus-plugin-ledger-connector-ubiquity/GetTransactionByAddress |  |


<a id="getTransactionByAddressV1"></a>
# **getTransactionByAddressV1**
> getTransactionByAddressV1(getTransactionsByAddressEndpoint)





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
    GetTransactionsByAddressEndpoint getTransactionsByAddressEndpoint = new GetTransactionsByAddressEndpoint(); // GetTransactionsByAddressEndpoint | 
    try {
      apiInstance.getTransactionByAddressV1(getTransactionsByAddressEndpoint);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTransactionByAddressV1");
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
| **getTransactionsByAddressEndpoint** | [**GetTransactionsByAddressEndpoint**](GetTransactionsByAddressEndpoint.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

