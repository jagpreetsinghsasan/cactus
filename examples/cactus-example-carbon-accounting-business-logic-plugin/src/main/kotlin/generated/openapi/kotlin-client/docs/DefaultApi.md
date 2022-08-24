# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**daoTokenGetAllowanceV1**](DefaultApi.md#daoTokenGetAllowanceV1) | **POST** /api/v1/plugins/@hyperledger/cactus-example-carbon-accounting-backend/dao-token/get-allowance | Get the number of tokens &#x60;spender&#x60; is approved to spend on behalf of &#x60;account&#x60;
[**enrollAdminV1**](DefaultApi.md#enrollAdminV1) | **POST** /api/v1/utilityemissionchannel/registerEnroll/admin | Registers an admin account within the Fabric organization specified.


<a name="daoTokenGetAllowanceV1"></a>
# **daoTokenGetAllowanceV1**
> DaoTokenGetAllowanceResponse daoTokenGetAllowanceV1(daoTokenGetAllowanceRequest)

Get the number of tokens &#x60;spender&#x60; is approved to spend on behalf of &#x60;account&#x60;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val daoTokenGetAllowanceRequest : DaoTokenGetAllowanceRequest =  // DaoTokenGetAllowanceRequest | 
try {
    val result : DaoTokenGetAllowanceResponse = apiInstance.daoTokenGetAllowanceV1(daoTokenGetAllowanceRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#daoTokenGetAllowanceV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#daoTokenGetAllowanceV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **daoTokenGetAllowanceRequest** | [**DaoTokenGetAllowanceRequest**](DaoTokenGetAllowanceRequest.md)|  | [optional]

### Return type

[**DaoTokenGetAllowanceResponse**](DaoTokenGetAllowanceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enrollAdminV1"></a>
# **enrollAdminV1**
> EnrollAdminV1Response enrollAdminV1(enrollAdminV1Request)

Registers an admin account within the Fabric organization specified.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val enrollAdminV1Request : EnrollAdminV1Request =  // EnrollAdminV1Request | 
try {
    val result : EnrollAdminV1Response = apiInstance.enrollAdminV1(enrollAdminV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#enrollAdminV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#enrollAdminV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrollAdminV1Request** | [**EnrollAdminV1Request**](EnrollAdminV1Request.md)|  | [optional]

### Return type

[**EnrollAdminV1Response**](EnrollAdminV1Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

