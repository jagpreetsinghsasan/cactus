# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deployContractSolBytecodeJsonObjectV1**](DefaultApi.md#deployContractSolBytecodeJsonObjectV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/deploy-contract-solidity-bytecode-json-object | Deploys the bytecode of a Solidity contract. |
| [**deployContractSolBytecodeV1**](DefaultApi.md#deployContractSolBytecodeV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract. |
| [**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/get-prometheus-exporter-metrics | Get the Prometheus Metrics |
| [**invokeContractV1**](DefaultApi.md#invokeContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-contract | Invokes a contract on a besu ledger |
| [**invokeContractV1NoKeychain**](DefaultApi.md#invokeContractV1NoKeychain) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-contract-json-object | Invokes a contract on a besu ledger |
| [**invokeRawWeb3EthContractV1**](DefaultApi.md#invokeRawWeb3EthContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-raw-web3eth-contract | Low-level endpoint to invoke a method on deployed contract. |
| [**invokeWeb3EthMethodV1**](DefaultApi.md#invokeWeb3EthMethodV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/invoke-raw-web3eth-method | Invoke any method from web3.eth (low-level) |
| [**runTransactionV1**](DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-quorum/run-transaction | Executes a transaction on a quorum ledger |


<a id="deployContractSolBytecodeJsonObjectV1"></a>
# **deployContractSolBytecodeJsonObjectV1**
> DeployContractSolidityBytecodeV1Response deployContractSolBytecodeJsonObjectV1(deployContractSolidityBytecodeJsonObjectV1Request)

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
    DeployContractSolidityBytecodeJsonObjectV1Request deployContractSolidityBytecodeJsonObjectV1Request = new DeployContractSolidityBytecodeJsonObjectV1Request(); // DeployContractSolidityBytecodeJsonObjectV1Request | 
    try {
      DeployContractSolidityBytecodeV1Response result = apiInstance.deployContractSolBytecodeJsonObjectV1(deployContractSolidityBytecodeJsonObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deployContractSolBytecodeJsonObjectV1");
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
| **deployContractSolidityBytecodeJsonObjectV1Request** | [**DeployContractSolidityBytecodeJsonObjectV1Request**](DeployContractSolidityBytecodeJsonObjectV1Request.md)|  | [optional] |

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

<a id="invokeContractV1NoKeychain"></a>
# **invokeContractV1NoKeychain**
> InvokeContractV1Response invokeContractV1NoKeychain(invokeContractJsonObjectV1Request)

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
    InvokeContractJsonObjectV1Request invokeContractJsonObjectV1Request = new InvokeContractJsonObjectV1Request(); // InvokeContractJsonObjectV1Request | 
    try {
      InvokeContractV1Response result = apiInstance.invokeContractV1NoKeychain(invokeContractJsonObjectV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#invokeContractV1NoKeychain");
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
| **invokeContractJsonObjectV1Request** | [**InvokeContractJsonObjectV1Request**](InvokeContractJsonObjectV1Request.md)|  | [optional] |

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

<a id="invokeRawWeb3EthContractV1"></a>
# **invokeRawWeb3EthContractV1**
> InvokeRawWeb3EthContractV1Response invokeRawWeb3EthContractV1(invokeRawWeb3EthContractV1Request)

Low-level endpoint to invoke a method on deployed contract.

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
    InvokeRawWeb3EthContractV1Request invokeRawWeb3EthContractV1Request = new InvokeRawWeb3EthContractV1Request(); // InvokeRawWeb3EthContractV1Request | 
    try {
      InvokeRawWeb3EthContractV1Response result = apiInstance.invokeRawWeb3EthContractV1(invokeRawWeb3EthContractV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#invokeRawWeb3EthContractV1");
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
| **invokeRawWeb3EthContractV1Request** | [**InvokeRawWeb3EthContractV1Request**](InvokeRawWeb3EthContractV1Request.md)|  | [optional] |

### Return type

[**InvokeRawWeb3EthContractV1Response**](InvokeRawWeb3EthContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="invokeWeb3EthMethodV1"></a>
# **invokeWeb3EthMethodV1**
> InvokeRawWeb3EthMethodV1Response invokeWeb3EthMethodV1(invokeRawWeb3EthMethodV1Request)

Invoke any method from web3.eth (low-level)

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
    InvokeRawWeb3EthMethodV1Request invokeRawWeb3EthMethodV1Request = new InvokeRawWeb3EthMethodV1Request(); // InvokeRawWeb3EthMethodV1Request | 
    try {
      InvokeRawWeb3EthMethodV1Response result = apiInstance.invokeWeb3EthMethodV1(invokeRawWeb3EthMethodV1Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#invokeWeb3EthMethodV1");
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
| **invokeRawWeb3EthMethodV1Request** | [**InvokeRawWeb3EthMethodV1Request**](InvokeRawWeb3EthMethodV1Request.md)|  | [optional] |

### Return type

[**InvokeRawWeb3EthMethodV1Response**](InvokeRawWeb3EthMethodV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="runTransactionV1"></a>
# **runTransactionV1**
> RunTransactionResponse runTransactionV1(runTransactionRequest)

Executes a transaction on a quorum ledger

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

