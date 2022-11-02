# DefaultApi

All URIs are relative to *https://www.cactus.stream*

Method | HTTP request | Description
------------- | ------------- | -------------
[**counterpartyHtlcV1**](DefaultApi.md#counterpartyHtlcV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-coordinator-besu/counterparty-htlc | Create an instance to interact with the counterparty HTLC
[**ownHtlcV1**](DefaultApi.md#ownHtlcV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-coordinator-besu/own-htlc | Create an instance to interact with the own HTLC.
[**withdrawCounterpartyV1**](DefaultApi.md#withdrawCounterpartyV1) | **POST** /api/v1/plugins/@hyperledger/cactus-plugin-htlc-coordinator-besu/withdraw-counterparty | Withdraw funds of the counterparty HTLC


<a name="counterpartyHtlcV1"></a>
# **counterpartyHtlcV1**
> AnyType counterpartyHtlcV1(counterpartyHTLCRequest)

Create an instance to interact with the counterparty HTLC

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val counterpartyHTLCRequest : CounterpartyHTLCRequest =  // CounterpartyHTLCRequest | 
try {
    val result : AnyType = apiInstance.counterpartyHtlcV1(counterpartyHTLCRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#counterpartyHtlcV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#counterpartyHtlcV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterpartyHTLCRequest** | [**CounterpartyHTLCRequest**](CounterpartyHTLCRequest.md)|  | [optional]

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ownHtlcV1"></a>
# **ownHtlcV1**
> AnyType ownHtlcV1(ownHTLCRequest)

Create an instance to interact with the own HTLC.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val ownHTLCRequest : OwnHTLCRequest =  // OwnHTLCRequest | 
try {
    val result : AnyType = apiInstance.ownHtlcV1(ownHTLCRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#ownHtlcV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#ownHtlcV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ownHTLCRequest** | [**OwnHTLCRequest**](OwnHTLCRequest.md)|  | [optional]

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="withdrawCounterpartyV1"></a>
# **withdrawCounterpartyV1**
> AnyType withdrawCounterpartyV1(withdrawCounterpartyRequest)

Withdraw funds of the counterparty HTLC

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val withdrawCounterpartyRequest : WithdrawCounterpartyRequest =  // WithdrawCounterpartyRequest | 
try {
    val result : AnyType = apiInstance.withdrawCounterpartyV1(withdrawCounterpartyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#withdrawCounterpartyV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#withdrawCounterpartyV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **withdrawCounterpartyRequest** | [**WithdrawCounterpartyRequest**](WithdrawCounterpartyRequest.md)|  | [optional]

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

