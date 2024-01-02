# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleStatusV1**](DefaultApi.md#getSingleStatusV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu-erc20/get-single-status |  |
| [**getStatusV1**](DefaultApi.md#getStatusV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu-erc20/get-status |  |
| [**initializeV1**](DefaultApi.md#initializeV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu-erc20/initialize | Initialize contract |
| [**newContractV1**](DefaultApi.md#newContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu-erc20/new-contract | Create a new hashtimelock contract |
| [**refundV1**](DefaultApi.md#refundV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu-erc20/refund | Refund a hashtimelock contract |
| [**withdrawV1**](DefaultApi.md#withdrawV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu-erc20/withdraw | Withdraw a hashtimelock contract |


<a id="getSingleStatusV1"></a>
# **getSingleStatusV1**
> Integer getSingleStatusV1(getSingleStatusRequest)



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
    GetSingleStatusRequest getSingleStatusRequest = new GetSingleStatusRequest(); // GetSingleStatusRequest | 
    try {
      Integer result = apiInstance.getSingleStatusV1(getSingleStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getSingleStatusV1");
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
| **getSingleStatusRequest** | [**GetSingleStatusRequest**](GetSingleStatusRequest.md)|  | [optional] |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Status |  -  |

<a id="getStatusV1"></a>
# **getStatusV1**
> List&lt;Integer&gt; getStatusV1(getStatusRequest)



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
    GetStatusRequest getStatusRequest = new GetStatusRequest(); // GetStatusRequest | 
    try {
      List<Integer> result = apiInstance.getStatusV1(getStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getStatusV1");
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
| **getStatusRequest** | [**GetStatusRequest**](GetStatusRequest.md)|  | [optional] |

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of status |  -  |

<a id="initializeV1"></a>
# **initializeV1**
> RunTransactionResponse initializeV1(initializeRequest)

Initialize contract

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
    InitializeRequest initializeRequest = new InitializeRequest(); // InitializeRequest | 
    try {
      RunTransactionResponse result = apiInstance.initializeV1(initializeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#initializeV1");
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
| **initializeRequest** | [**InitializeRequest**](InitializeRequest.md)|  | [optional] |

### Return type

[**RunTransactionResponse**](RunTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="newContractV1"></a>
# **newContractV1**
> InvokeContractV1Response newContractV1(newContractRequest)

Create a new hashtimelock contract

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
    NewContractRequest newContractRequest = new NewContractRequest(); // NewContractRequest | 
    try {
      InvokeContractV1Response result = apiInstance.newContractV1(newContractRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#newContractV1");
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
| **newContractRequest** | [**NewContractRequest**](NewContractRequest.md)|  | [optional] |

### Return type

[**InvokeContractV1Response**](InvokeContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="refundV1"></a>
# **refundV1**
> InvokeContractV1Response refundV1(refundRequest)

Refund a hashtimelock contract

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
    RefundRequest refundRequest = new RefundRequest(); // RefundRequest | 
    try {
      InvokeContractV1Response result = apiInstance.refundV1(refundRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#refundV1");
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
| **refundRequest** | [**RefundRequest**](RefundRequest.md)|  | [optional] |

### Return type

[**InvokeContractV1Response**](InvokeContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="withdrawV1"></a>
# **withdrawV1**
> InvokeContractV1Response withdrawV1(withdrawRequest)

Withdraw a hashtimelock contract

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
    WithdrawRequest withdrawRequest = new WithdrawRequest(); // WithdrawRequest | 
    try {
      InvokeContractV1Response result = apiInstance.withdrawV1(withdrawRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#withdrawV1");
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
| **withdrawRequest** | [**WithdrawRequest**](WithdrawRequest.md)|  | [optional] |

### Return type

[**InvokeContractV1Response**](InvokeContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

