# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deployContractSolBytecodeV1**](DefaultApi.md#deployContractSolBytecodeV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract. |
| [**getBalanceV1**](DefaultApi.md#getBalanceV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-balance | Return balance of an address of a given block |
| [**getBesuRecordV1**](DefaultApi.md#getBesuRecordV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-besu-record | Retrieves an arbitrary record (any piece of information) from the ledger. Ledger records can be call outputs, transaction input, etc. |
| [**getBlockV1**](DefaultApi.md#getBlockV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-block | Returns a block matching the block |
| [**getOpenApiSpecV1**](DefaultApi.md#getOpenApiSpecV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-open-api-spec | Retrieves the .json file that contains the OpenAPI specification for the plugin. |
| [**getPastLogsV1**](DefaultApi.md#getPastLogsV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-past-logs | Gets past logs, matching the given options. |
| [**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-prometheus-exporter-metrics | Get the Prometheus Metrics |
| [**getTransactionV1**](DefaultApi.md#getTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-transaction | Executes a transaction on a besu ledger |
| [**invokeContractV1**](DefaultApi.md#invokeContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/invoke-contract | Invokes a contract on a besu ledger |
| [**runTransactionV1**](DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/run-transaction | Executes a transaction on a besu ledger |
| [**signTransactionV1**](DefaultApi.md#signTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/sign-transaction | Obtain signatures of ledger from the corresponding transaction hash. |


<a id="deployContractSolBytecodeV1"></a>
# **deployContractSolBytecodeV1**
> DeployContractSolidityBytecodeV1Response deployContractSolBytecodeV1(deployContractSolidityBytecodeV1Request)

Deploys the bytecode of a Solidity contract.

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
    DeployContractSolidityBytecodeV1Request deployContractSolidityBytecodeV1Request = new DeployContractSolidityBytecodeV1Request(); // DeployContractSolidityBytecodeV1Request | 
    try {
      DeployContractSolidityBytecodeV1Response result = apiInstance.deployContractSolBytecodeV1(deployContractSolidityBytecodeV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deployContractSolBytecodeV1");
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
| **deployContractSolidityBytecodeV1Request** | [**DeployContractSolidityBytecodeV1Request**](DeployContractSolidityBytecodeV1Request.md)|  | [optional] |

### Return type

[**DeployContractSolidityBytecodeV1Response**](DeployContractSolidityBytecodeV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBalanceV1"></a>
# **getBalanceV1**
> GetBalanceV1Response getBalanceV1(getBalanceV1Request)

Return balance of an address of a given block

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
    GetBalanceV1Request getBalanceV1Request = new GetBalanceV1Request(); // GetBalanceV1Request | 
    try {
      GetBalanceV1Response result = apiInstance.getBalanceV1(getBalanceV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getBalanceV1");
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
| **getBalanceV1Request** | [**GetBalanceV1Request**](GetBalanceV1Request.md)|  | [optional] |

### Return type

[**GetBalanceV1Response**](GetBalanceV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBesuRecordV1"></a>
# **getBesuRecordV1**
> GetBesuRecordV1Response getBesuRecordV1(getBesuRecordV1Request)

Retrieves an arbitrary record (any piece of information) from the ledger. Ledger records can be call outputs, transaction input, etc.

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
    GetBesuRecordV1Request getBesuRecordV1Request = new GetBesuRecordV1Request(); // GetBesuRecordV1Request | 
    try {
      GetBesuRecordV1Response result = apiInstance.getBesuRecordV1(getBesuRecordV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getBesuRecordV1");
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
| **getBesuRecordV1Request** | [**GetBesuRecordV1Request**](GetBesuRecordV1Request.md)|  | [optional] |

### Return type

[**GetBesuRecordV1Response**](GetBesuRecordV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getBlockV1"></a>
# **getBlockV1**
> GetBlockV1Response getBlockV1(getBlockV1Request)

Returns a block matching the block

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
    GetBlockV1Request getBlockV1Request = new GetBlockV1Request(); // GetBlockV1Request | 
    try {
      GetBlockV1Response result = apiInstance.getBlockV1(getBlockV1Request);
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
| **getBlockV1Request** | [**GetBlockV1Request**](GetBlockV1Request.md)|  | [optional] |

### Return type

[**GetBlockV1Response**](GetBlockV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getOpenApiSpecV1"></a>
# **getOpenApiSpecV1**
> String getOpenApiSpecV1()

Retrieves the .json file that contains the OpenAPI specification for the plugin.

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
      String result = apiInstance.getOpenApiSpecV1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getOpenApiSpecV1");
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
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getPastLogsV1"></a>
# **getPastLogsV1**
> GetPastLogsV1Response getPastLogsV1(getPastLogsV1Request)

Gets past logs, matching the given options.

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
    GetPastLogsV1Request getPastLogsV1Request = new GetPastLogsV1Request(); // GetPastLogsV1Request | 
    try {
      GetPastLogsV1Response result = apiInstance.getPastLogsV1(getPastLogsV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getPastLogsV1");
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
| **getPastLogsV1Request** | [**GetPastLogsV1Request**](GetPastLogsV1Request.md)|  | [optional] |

### Return type

[**GetPastLogsV1Response**](GetPastLogsV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

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

<a id="getTransactionV1"></a>
# **getTransactionV1**
> GetTransactionV1Response getTransactionV1(getTransactionV1Request)

Executes a transaction on a besu ledger

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
    GetTransactionV1Request getTransactionV1Request = new GetTransactionV1Request(); // GetTransactionV1Request | 
    try {
      GetTransactionV1Response result = apiInstance.getTransactionV1(getTransactionV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getTransactionV1");
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
| **getTransactionV1Request** | [**GetTransactionV1Request**](GetTransactionV1Request.md)|  | [optional] |

### Return type

[**GetTransactionV1Response**](GetTransactionV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="invokeContractV1"></a>
# **invokeContractV1**
> InvokeContractV1Response invokeContractV1(invokeContractV1Request)

Invokes a contract on a besu ledger

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
    InvokeContractV1Request invokeContractV1Request = new InvokeContractV1Request(); // InvokeContractV1Request | 
    try {
      InvokeContractV1Response result = apiInstance.invokeContractV1(invokeContractV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#invokeContractV1");
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
| **invokeContractV1Request** | [**InvokeContractV1Request**](InvokeContractV1Request.md)|  | [optional] |

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

<a id="runTransactionV1"></a>
# **runTransactionV1**
> RunTransactionResponse runTransactionV1(runTransactionRequest)

Executes a transaction on a besu ledger

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
| **runTransactionRequest** | [**RunTransactionRequest**](RunTransactionRequest.md)|  | [optional] |

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

<a id="signTransactionV1"></a>
# **signTransactionV1**
> SignTransactionResponse signTransactionV1(signTransactionRequest)

Obtain signatures of ledger from the corresponding transaction hash.

Obtain signatures of ledger from the corresponding transaction hash.

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
    SignTransactionRequest signTransactionRequest = new SignTransactionRequest(); // SignTransactionRequest | 
    try {
      SignTransactionResponse result = apiInstance.signTransactionV1(signTransactionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#signTransactionV1");
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
| **signTransactionRequest** | [**SignTransactionRequest**](SignTransactionRequest.md)|  | |

### Return type

[**SignTransactionResponse**](SignTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not able to find the corresponding tranaction from the transaction hash |  -  |

