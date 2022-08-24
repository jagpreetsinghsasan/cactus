# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployContractGoSourceV1**](DefaultApi.md#deployContractGoSourceV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/deploy-contract-go-source | Deploys a chaincode contract in the form of a go sources.
[**deployContractV1**](DefaultApi.md#deployContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/deploy-contract | Deploys a chaincode contract from a set of source files. Note: This endpoint only supports Fabric 2.x. The &#39;v1&#39; suffix in the method name refers to the Cactus API version, not the supported Fabric ledger version.
[**getPrometheusMetricsV1**](DefaultApi.md#getPrometheusMetricsV1) | **GET** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/get-prometheus-exporter-metrics | Get the Prometheus Metrics
[**getTransactionReceiptByTxIDV1**](DefaultApi.md#getTransactionReceiptByTxIDV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/get-transaction-receipt-by-txid | get a transaction receipt by tx id on a Fabric ledger.
[**runTransactionV1**](DefaultApi.md#runTransactionV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/run-transaction | Runs a transaction on a Fabric ledger.


<a name="deployContractGoSourceV1"></a>
# **deployContractGoSourceV1**
> DeployContractGoSourceV1Response deployContractGoSourceV1(deployContractGoSourceV1Request)

Deploys a chaincode contract in the form of a go sources.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val deployContractGoSourceV1Request : DeployContractGoSourceV1Request =  // DeployContractGoSourceV1Request | 
try {
    val result : DeployContractGoSourceV1Response = apiInstance.deployContractGoSourceV1(deployContractGoSourceV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deployContractGoSourceV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deployContractGoSourceV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployContractGoSourceV1Request** | [**DeployContractGoSourceV1Request**](DeployContractGoSourceV1Request.md)|  | [optional]

### Return type

[**DeployContractGoSourceV1Response**](DeployContractGoSourceV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="deployContractV1"></a>
# **deployContractV1**
> DeployContractV1Response deployContractV1(deployContractV1Request)

Deploys a chaincode contract from a set of source files. Note: This endpoint only supports Fabric 2.x. The &#39;v1&#39; suffix in the method name refers to the Cactus API version, not the supported Fabric ledger version.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val deployContractV1Request : DeployContractV1Request =  // DeployContractV1Request | 
try {
    val result : DeployContractV1Response = apiInstance.deployContractV1(deployContractV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#deployContractV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#deployContractV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployContractV1Request** | [**DeployContractV1Request**](DeployContractV1Request.md)|  | [optional]

### Return type

[**DeployContractV1Response**](DeployContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="getPrometheusMetricsV1"></a>
# **getPrometheusMetricsV1**
> kotlin.String getPrometheusMetricsV1()

Get the Prometheus Metrics

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.String = apiInstance.getPrometheusMetricsV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getPrometheusMetricsV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getPrometheusMetricsV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getTransactionReceiptByTxIDV1"></a>
# **getTransactionReceiptByTxIDV1**
> GetTransactionReceiptResponse getTransactionReceiptByTxIDV1(runTransactionRequest)

get a transaction receipt by tx id on a Fabric ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val runTransactionRequest : RunTransactionRequest =  // RunTransactionRequest | 
try {
    val result : GetTransactionReceiptResponse = apiInstance.getTransactionReceiptByTxIDV1(runTransactionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getTransactionReceiptByTxIDV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getTransactionReceiptByTxIDV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runTransactionRequest** | [**RunTransactionRequest**](RunTransactionRequest.md)|  |

### Return type

[**GetTransactionReceiptResponse**](GetTransactionReceiptResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="runTransactionV1"></a>
# **runTransactionV1**
> RunTransactionResponse runTransactionV1(runTransactionRequest)

Runs a transaction on a Fabric ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val runTransactionRequest : RunTransactionRequest =  // RunTransactionRequest | 
try {
    val result : RunTransactionResponse = apiInstance.runTransactionV1(runTransactionRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#runTransactionV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#runTransactionV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runTransactionRequest** | [**RunTransactionRequest**](RunTransactionRequest.md)|  |

### Return type

[**RunTransactionResponse**](RunTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

