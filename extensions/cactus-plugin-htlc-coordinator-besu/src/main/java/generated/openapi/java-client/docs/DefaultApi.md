# DefaultApi

All URIs are relative to *https://www.cactus.stream*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**counterpartyHtlcV1**](DefaultApi.md#counterpartyHtlcV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-coordinator-besu/counterparty-htlc | Create an instance to interact with the counterparty HTLC |
| [**ownHtlcV1**](DefaultApi.md#ownHtlcV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-coordinator-besu/own-htlc | Create an instance to interact with the own HTLC. |
| [**withdrawCounterpartyV1**](DefaultApi.md#withdrawCounterpartyV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-coordinator-besu/withdraw-counterparty | Withdraw funds of the counterparty HTLC |


<a id="counterpartyHtlcV1"></a>
# **counterpartyHtlcV1**
> Object counterpartyHtlcV1(counterpartyHTLCRequest)

Create an instance to interact with the counterparty HTLC

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
    CounterpartyHTLCRequest counterpartyHTLCRequest = new CounterpartyHTLCRequest(); // CounterpartyHTLCRequest | 
    try {
      Object result = apiInstance.counterpartyHtlcV1(counterpartyHTLCRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#counterpartyHtlcV1");
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
| **counterpartyHTLCRequest** | [**CounterpartyHTLCRequest**](CounterpartyHTLCRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="ownHtlcV1"></a>
# **ownHtlcV1**
> Object ownHtlcV1(ownHTLCRequest)

Create an instance to interact with the own HTLC.

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
    OwnHTLCRequest ownHTLCRequest = new OwnHTLCRequest(); // OwnHTLCRequest | 
    try {
      Object result = apiInstance.ownHtlcV1(ownHTLCRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#ownHtlcV1");
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
| **ownHTLCRequest** | [**OwnHTLCRequest**](OwnHTLCRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="withdrawCounterpartyV1"></a>
# **withdrawCounterpartyV1**
> Object withdrawCounterpartyV1(withdrawCounterpartyRequest)

Withdraw funds of the counterparty HTLC

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
    WithdrawCounterpartyRequest withdrawCounterpartyRequest = new WithdrawCounterpartyRequest(); // WithdrawCounterpartyRequest | 
    try {
      Object result = apiInstance.withdrawCounterpartyV1(withdrawCounterpartyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#withdrawCounterpartyV1");
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
| **withdrawCounterpartyRequest** | [**WithdrawCounterpartyRequest**](WithdrawCounterpartyRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

