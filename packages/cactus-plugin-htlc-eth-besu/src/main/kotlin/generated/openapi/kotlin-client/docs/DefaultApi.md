# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSingleStatusV1**](DefaultApi.md#getSingleStatusV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu/get-single-status | 
[**getStatusV1**](DefaultApi.md#getStatusV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu/get-status | 
[**initializeV1**](DefaultApi.md#initializeV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu/initialize | 
[**newContractV1**](DefaultApi.md#newContractV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu/new-contract | 
[**refundV1**](DefaultApi.md#refundV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu/refund | 
[**withdrawV1**](DefaultApi.md#withdrawV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-eth-besu/withdraw | 


<a name="getSingleStatusV1"></a>
# **getSingleStatusV1**
> kotlin.Int getSingleStatusV1(getSingleStatusRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val getSingleStatusRequest : GetSingleStatusRequest =  // GetSingleStatusRequest | 
try {
    val result : kotlin.Int = apiInstance.getSingleStatusV1(getSingleStatusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getSingleStatusV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getSingleStatusV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getSingleStatusRequest** | [**GetSingleStatusRequest**](GetSingleStatusRequest.md)|  | [optional]

### Return type

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatusV1"></a>
# **getStatusV1**
> kotlin.collections.List&lt;kotlin.Int&gt; getStatusV1(getStatusRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val getStatusRequest : GetStatusRequest =  // GetStatusRequest | 
try {
    val result : kotlin.collections.List<kotlin.Int> = apiInstance.getStatusV1(getStatusRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getStatusV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getStatusV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getStatusRequest** | [**GetStatusRequest**](GetStatusRequest.md)|  | [optional]

### Return type

**kotlin.collections.List&lt;kotlin.Int&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="initializeV1"></a>
# **initializeV1**
> RunTransactionResponse initializeV1(initializeRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val initializeRequest : InitializeRequest =  // InitializeRequest | 
try {
    val result : RunTransactionResponse = apiInstance.initializeV1(initializeRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#initializeV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#initializeV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **initializeRequest** | [**InitializeRequest**](InitializeRequest.md)|  | [optional]

### Return type

[**RunTransactionResponse**](RunTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newContractV1"></a>
# **newContractV1**
> InvokeContractV1Response newContractV1(newContractObj)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val newContractObj : NewContractObj =  // NewContractObj | 
try {
    val result : InvokeContractV1Response = apiInstance.newContractV1(newContractObj)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#newContractV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#newContractV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newContractObj** | [**NewContractObj**](NewContractObj.md)|  | [optional]

### Return type

[**InvokeContractV1Response**](InvokeContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refundV1"></a>
# **refundV1**
> InvokeContractV1Response refundV1(refundReq)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val refundReq : RefundReq =  // RefundReq | 
try {
    val result : InvokeContractV1Response = apiInstance.refundV1(refundReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#refundV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#refundV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refundReq** | [**RefundReq**](RefundReq.md)|  | [optional]

### Return type

[**InvokeContractV1Response**](InvokeContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="withdrawV1"></a>
# **withdrawV1**
> InvokeContractV1Response withdrawV1(withdrawReq)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val withdrawReq : WithdrawReq =  // WithdrawReq | 
try {
    val result : InvokeContractV1Response = apiInstance.withdrawV1(withdrawReq)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#withdrawV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#withdrawV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawReq** | [**WithdrawReq**](WithdrawReq.md)|  | [optional]

### Return type

[**InvokeContractV1Response**](InvokeContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

