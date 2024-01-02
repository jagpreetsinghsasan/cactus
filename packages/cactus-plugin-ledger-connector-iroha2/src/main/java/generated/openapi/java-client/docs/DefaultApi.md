# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateTransactionV1**](DefaultApi.md#generateTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha2/generate-transaction | Generate transaction that can be signed locally. |
| [**queryV1**](DefaultApi.md#queryV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha2/query | Executes a query on a Iroha V2 ledger and returns it&#39;s results. |
| [**transactV1**](DefaultApi.md#transactV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-iroha2/transact | Executes a transaction on a Iroha V2 ledger (by sending some instructions) |


<a id="generateTransactionV1"></a>
# **generateTransactionV1**
> String generateTransactionV1(generateTransactionRequestV1)

Generate transaction that can be signed locally.

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
    GenerateTransactionRequestV1 generateTransactionRequestV1 = new GenerateTransactionRequestV1(); // GenerateTransactionRequestV1 | 
    try {
      String result = apiInstance.generateTransactionV1(generateTransactionRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#generateTransactionV1");
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
| **generateTransactionRequestV1** | [**GenerateTransactionRequestV1**](GenerateTransactionRequestV1.md)|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

<a id="queryV1"></a>
# **queryV1**
> QueryResponseV1 queryV1(queryRequestV1)

Executes a query on a Iroha V2 ledger and returns it&#39;s results.

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
    QueryRequestV1 queryRequestV1 = new QueryRequestV1(); // QueryRequestV1 | 
    try {
      QueryResponseV1 result = apiInstance.queryV1(queryRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#queryV1");
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
| **queryRequestV1** | [**QueryRequestV1**](QueryRequestV1.md)|  | [optional] |

### Return type

[**QueryResponseV1**](QueryResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error. |  -  |

<a id="transactV1"></a>
# **transactV1**
> TransactResponseV1 transactV1(transactRequestV1)

Executes a transaction on a Iroha V2 ledger (by sending some instructions)

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
    TransactRequestV1 transactRequestV1 = new TransactRequestV1(); // TransactRequestV1 | 
    try {
      TransactResponseV1 result = apiInstance.transactV1(transactRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#transactV1");
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
| **transactRequestV1** | [**TransactRequestV1**](TransactRequestV1.md)|  | [optional] |

### Return type

[**TransactResponseV1**](TransactResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error. |  -  |

