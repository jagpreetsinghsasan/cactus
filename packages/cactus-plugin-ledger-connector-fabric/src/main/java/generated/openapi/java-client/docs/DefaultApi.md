# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deployContractGoSourceV1**](DefaultApi.md#deployContractGoSourceV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/deploy-contract-go-source | Deploys a chaincode contract in the form of a go sources. |
| [**deployContractV1**](DefaultApi.md#deployContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/deploy-contract | Deploys a chaincode contract from a set of source files. Note: This endpoint only supports Fabric 2.x. The &#39;v1&#39; suffix in the method name refers to the Cactus API version, not the supported Fabric ledger version. |
| [**getBlockV1**](DefaultApi.md#getBlockV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/get-block | Get block from the channel using one of selectors from the input. Works only on Fabric 2.x. |
| [**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/get-prometheus-exporter-metrics | Get the Prometheus Metrics |
| [**getTransactionReceiptByTxIDV1**](DefaultApi.md#getTransactionReceiptByTxIDV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/get-transaction-receipt-by-txid | get a transaction receipt by tx id on a Fabric ledger. |
| [**runTransactionV1**](DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/run-transaction | Runs a transaction on a Fabric ledger. |


<a id="deployContractGoSourceV1"></a>
# **deployContractGoSourceV1**
> DeployContractGoSourceV1Response deployContractGoSourceV1(deployContractGoSourceV1Request)

Deploys a chaincode contract in the form of a go sources.

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
    DeployContractGoSourceV1Request deployContractGoSourceV1Request = new DeployContractGoSourceV1Request(); // DeployContractGoSourceV1Request | 
    try {
      DeployContractGoSourceV1Response result = apiInstance.deployContractGoSourceV1(deployContractGoSourceV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deployContractGoSourceV1");
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
| **deployContractGoSourceV1Request** | [**DeployContractGoSourceV1Request**](DeployContractGoSourceV1Request.md)|  | [optional] |

### Return type

[**DeployContractGoSourceV1Response**](DeployContractGoSourceV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **501** | Not implemented |  -  |

<a id="deployContractV1"></a>
# **deployContractV1**
> DeployContractV1Response deployContractV1(deployContractV1Request)

Deploys a chaincode contract from a set of source files. Note: This endpoint only supports Fabric 2.x. The &#39;v1&#39; suffix in the method name refers to the Cactus API version, not the supported Fabric ledger version.

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
    DeployContractV1Request deployContractV1Request = new DeployContractV1Request(); // DeployContractV1Request | 
    try {
      DeployContractV1Response result = apiInstance.deployContractV1(deployContractV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deployContractV1");
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
| **deployContractV1Request** | [**DeployContractV1Request**](DeployContractV1Request.md)|  | [optional] |

### Return type

[**DeployContractV1Response**](DeployContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **501** | Not implemented |  -  |

<a id="getBlockV1"></a>
# **getBlockV1**
> GetBlockResponseV1 getBlockV1(getBlockRequestV1)

Get block from the channel using one of selectors from the input. Works only on Fabric 2.x.

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
    GetBlockRequestV1 getBlockRequestV1 = new GetBlockRequestV1(); // GetBlockRequestV1 | 
    try {
      GetBlockResponseV1 result = apiInstance.getBlockV1(getBlockRequestV1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getBlockV1");
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
| **getBlockRequestV1** | [**GetBlockRequestV1**](GetBlockRequestV1.md)|  | [optional] |

### Return type

[**GetBlockResponseV1**](GetBlockResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

<a id="getPrometheusMetricsV1"></a>
# **getPrometheusMetricsV1**
> String getPrometheusMetricsV1()

Get the Prometheus Metrics

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
    try {
      String result = apiInstance.getPrometheusMetricsV1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getPrometheusMetricsV1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTransactionReceiptByTxIDV1"></a>
# **getTransactionReceiptByTxIDV1**
> GetTransactionReceiptResponse getTransactionReceiptByTxIDV1(runTransactionRequest)

get a transaction receipt by tx id on a Fabric ledger.



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
    RunTransactionRequest runTransactionRequest = new RunTransactionRequest(); // RunTransactionRequest | 
    try {
      GetTransactionReceiptResponse result = apiInstance.getTransactionReceiptByTxIDV1(runTransactionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTransactionReceiptByTxIDV1");
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
| **runTransactionRequest** | [**RunTransactionRequest**](RunTransactionRequest.md)|  | |

### Return type

[**GetTransactionReceiptResponse**](GetTransactionReceiptResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |

<a id="runTransactionV1"></a>
# **runTransactionV1**
> RunTransactionResponse runTransactionV1(runTransactionRequest)

Runs a transaction on a Fabric ledger.



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
    RunTransactionRequest runTransactionRequest = new RunTransactionRequest(); // RunTransactionRequest | 
    try {
      RunTransactionResponse result = apiInstance.runTransactionV1(runTransactionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#runTransactionV1");
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
| **runTransactionRequest** | [**RunTransactionRequest**](RunTransactionRequest.md)|  | |

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
| **404** |  |  -  |

