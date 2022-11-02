# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientRequestV1**](DefaultApi.md#clientRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/clientrequest | 
[**phase1TransferInitiationRequestV1**](DefaultApi.md#phase1TransferInitiationRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase1/transferinitiationrequest | 
[**phase1TransferInitiationResponseV1**](DefaultApi.md#phase1TransferInitiationResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase1/transferinitiationresponse | 
[**phase2LockEvidenceRequestV1**](DefaultApi.md#phase2LockEvidenceRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase2/lockevidencerequest | 
[**phase2LockEvidenceResponseV1**](DefaultApi.md#phase2LockEvidenceResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase2/lockevidenceresponse | 
[**phase2TransferCommenceRequestV1**](DefaultApi.md#phase2TransferCommenceRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase2/transfercommencerequest | 
[**phase2TransferCommenceResponseV1**](DefaultApi.md#phase2TransferCommenceResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase2/transfercommenceresponse | 
[**phase3CommitFinalRequestV1**](DefaultApi.md#phase3CommitFinalRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/commitfinalrequest | 
[**phase3CommitFinalResponseV1**](DefaultApi.md#phase3CommitFinalResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/commitfinalresponse | 
[**phase3CommitPreparationRequestV1**](DefaultApi.md#phase3CommitPreparationRequestV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/commitpreparationrequest | 
[**phase3CommitPreparationResponseV1**](DefaultApi.md#phase3CommitPreparationResponseV1) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/commitpreparationresponse | 
[**phase3TransferCompleteRequestV1**](DefaultApi.md#phase3TransferCompleteRequestV1) | **GET** /api/v1/@hyperledger/cactus-plugin-odap-hermes/phase3/transfercompleterequest | 
[**recoverUpdateAckV1Message**](DefaultApi.md#recoverUpdateAckV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/recoverupdateackmessage | 
[**recoverUpdateV1Message**](DefaultApi.md#recoverUpdateV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/recoverupdatemessage | 
[**recoverV1Message**](DefaultApi.md#recoverV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/recovermessage | 
[**recoverV1Success**](DefaultApi.md#recoverV1Success) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/recoversuccessmessage | 
[**rollbackAckV1Message**](DefaultApi.md#rollbackAckV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/rollbackackmessage | 
[**rollbackV1Message**](DefaultApi.md#rollbackV1Message) | **POST** /api/v1/@hyperledger/cactus-plugin-odap-hermes/rollbackmessage | 


<a name="clientRequestV1"></a>
# **clientRequestV1**
> AnyType clientRequestV1(clientV1Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val clientV1Request : ClientV1Request =  // ClientV1Request | 
try {
    val result : AnyType = apiInstance.clientRequestV1(clientV1Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#clientRequestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#clientRequestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientV1Request** | [**ClientV1Request**](ClientV1Request.md)|  | [optional]

### Return type

[**AnyType**](AnyType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="phase1TransferInitiationRequestV1"></a>
# **phase1TransferInitiationRequestV1**
> phase1TransferInitiationRequestV1(transferInitializationV1Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val transferInitializationV1Request : TransferInitializationV1Request =  // TransferInitializationV1Request | 
try {
    apiInstance.phase1TransferInitiationRequestV1(transferInitializationV1Request)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase1TransferInitiationRequestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase1TransferInitiationRequestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferInitializationV1Request** | [**TransferInitializationV1Request**](TransferInitializationV1Request.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase1TransferInitiationResponseV1"></a>
# **phase1TransferInitiationResponseV1**
> phase1TransferInitiationResponseV1(transferInitializationV1Response)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val transferInitializationV1Response : TransferInitializationV1Response =  // TransferInitializationV1Response | 
try {
    apiInstance.phase1TransferInitiationResponseV1(transferInitializationV1Response)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase1TransferInitiationResponseV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase1TransferInitiationResponseV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferInitializationV1Response** | [**TransferInitializationV1Response**](TransferInitializationV1Response.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase2LockEvidenceRequestV1"></a>
# **phase2LockEvidenceRequestV1**
> phase2LockEvidenceRequestV1(lockEvidenceV1Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val lockEvidenceV1Request : LockEvidenceV1Request =  // LockEvidenceV1Request | 
try {
    apiInstance.phase2LockEvidenceRequestV1(lockEvidenceV1Request)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase2LockEvidenceRequestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase2LockEvidenceRequestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lockEvidenceV1Request** | [**LockEvidenceV1Request**](LockEvidenceV1Request.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase2LockEvidenceResponseV1"></a>
# **phase2LockEvidenceResponseV1**
> phase2LockEvidenceResponseV1(lockEvidenceV1Response)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val lockEvidenceV1Response : LockEvidenceV1Response =  // LockEvidenceV1Response | 
try {
    apiInstance.phase2LockEvidenceResponseV1(lockEvidenceV1Response)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase2LockEvidenceResponseV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase2LockEvidenceResponseV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lockEvidenceV1Response** | [**LockEvidenceV1Response**](LockEvidenceV1Response.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase2TransferCommenceRequestV1"></a>
# **phase2TransferCommenceRequestV1**
> phase2TransferCommenceRequestV1(transferCommenceV1Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val transferCommenceV1Request : TransferCommenceV1Request =  // TransferCommenceV1Request | 
try {
    apiInstance.phase2TransferCommenceRequestV1(transferCommenceV1Request)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase2TransferCommenceRequestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase2TransferCommenceRequestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferCommenceV1Request** | [**TransferCommenceV1Request**](TransferCommenceV1Request.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase2TransferCommenceResponseV1"></a>
# **phase2TransferCommenceResponseV1**
> phase2TransferCommenceResponseV1(transferCommenceV1Response)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val transferCommenceV1Response : TransferCommenceV1Response =  // TransferCommenceV1Response | 
try {
    apiInstance.phase2TransferCommenceResponseV1(transferCommenceV1Response)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase2TransferCommenceResponseV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase2TransferCommenceResponseV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferCommenceV1Response** | [**TransferCommenceV1Response**](TransferCommenceV1Response.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase3CommitFinalRequestV1"></a>
# **phase3CommitFinalRequestV1**
> phase3CommitFinalRequestV1(commitFinalV1Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val commitFinalV1Request : CommitFinalV1Request =  // CommitFinalV1Request | 
try {
    apiInstance.phase3CommitFinalRequestV1(commitFinalV1Request)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase3CommitFinalRequestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase3CommitFinalRequestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commitFinalV1Request** | [**CommitFinalV1Request**](CommitFinalV1Request.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase3CommitFinalResponseV1"></a>
# **phase3CommitFinalResponseV1**
> phase3CommitFinalResponseV1(commitFinalV1Response)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val commitFinalV1Response : CommitFinalV1Response =  // CommitFinalV1Response | 
try {
    apiInstance.phase3CommitFinalResponseV1(commitFinalV1Response)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase3CommitFinalResponseV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase3CommitFinalResponseV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commitFinalV1Response** | [**CommitFinalV1Response**](CommitFinalV1Response.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase3CommitPreparationRequestV1"></a>
# **phase3CommitPreparationRequestV1**
> phase3CommitPreparationRequestV1(commitPreparationV1Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val commitPreparationV1Request : CommitPreparationV1Request =  // CommitPreparationV1Request | 
try {
    apiInstance.phase3CommitPreparationRequestV1(commitPreparationV1Request)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase3CommitPreparationRequestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase3CommitPreparationRequestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commitPreparationV1Request** | [**CommitPreparationV1Request**](CommitPreparationV1Request.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase3CommitPreparationResponseV1"></a>
# **phase3CommitPreparationResponseV1**
> phase3CommitPreparationResponseV1(commitPreparationV1Response)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val commitPreparationV1Response : CommitPreparationV1Response =  // CommitPreparationV1Response | 
try {
    apiInstance.phase3CommitPreparationResponseV1(commitPreparationV1Response)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase3CommitPreparationResponseV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase3CommitPreparationResponseV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **commitPreparationV1Response** | [**CommitPreparationV1Response**](CommitPreparationV1Response.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="phase3TransferCompleteRequestV1"></a>
# **phase3TransferCompleteRequestV1**
> phase3TransferCompleteRequestV1(transferCompleteV1Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val transferCompleteV1Request : TransferCompleteV1Request =  // TransferCompleteV1Request | 
try {
    apiInstance.phase3TransferCompleteRequestV1(transferCompleteV1Request)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#phase3TransferCompleteRequestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#phase3TransferCompleteRequestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferCompleteV1Request** | [**TransferCompleteV1Request**](TransferCompleteV1Request.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="recoverUpdateAckV1Message"></a>
# **recoverUpdateAckV1Message**
> recoverUpdateAckV1Message(recoverUpdateAckV1Message)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val recoverUpdateAckV1Message : RecoverUpdateAckV1Message =  // RecoverUpdateAckV1Message | 
try {
    apiInstance.recoverUpdateAckV1Message(recoverUpdateAckV1Message)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#recoverUpdateAckV1Message")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#recoverUpdateAckV1Message")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recoverUpdateAckV1Message** | [**RecoverUpdateAckV1Message**](RecoverUpdateAckV1Message.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="recoverUpdateV1Message"></a>
# **recoverUpdateV1Message**
> recoverUpdateV1Message(recoverUpdateV1Message)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val recoverUpdateV1Message : RecoverUpdateV1Message =  // RecoverUpdateV1Message | 
try {
    apiInstance.recoverUpdateV1Message(recoverUpdateV1Message)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#recoverUpdateV1Message")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#recoverUpdateV1Message")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recoverUpdateV1Message** | [**RecoverUpdateV1Message**](RecoverUpdateV1Message.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="recoverV1Message"></a>
# **recoverV1Message**
> recoverV1Message(recoverV1Message)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val recoverV1Message : RecoverV1Message =  // RecoverV1Message | 
try {
    apiInstance.recoverV1Message(recoverV1Message)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#recoverV1Message")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#recoverV1Message")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recoverV1Message** | [**RecoverV1Message**](RecoverV1Message.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="recoverV1Success"></a>
# **recoverV1Success**
> recoverV1Success(recoverSuccessV1Message)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val recoverSuccessV1Message : RecoverSuccessV1Message =  // RecoverSuccessV1Message | 
try {
    apiInstance.recoverV1Success(recoverSuccessV1Message)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#recoverV1Success")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#recoverV1Success")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recoverSuccessV1Message** | [**RecoverSuccessV1Message**](RecoverSuccessV1Message.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="rollbackAckV1Message"></a>
# **rollbackAckV1Message**
> rollbackAckV1Message(rollbackAckV1Message)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val rollbackAckV1Message : RollbackAckV1Message =  // RollbackAckV1Message | 
try {
    apiInstance.rollbackAckV1Message(rollbackAckV1Message)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#rollbackAckV1Message")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#rollbackAckV1Message")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rollbackAckV1Message** | [**RollbackAckV1Message**](RollbackAckV1Message.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="rollbackV1Message"></a>
# **rollbackV1Message**
> rollbackV1Message(rollbackV1Message)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val rollbackV1Message : RollbackV1Message =  // RollbackV1Message | 
try {
    apiInstance.rollbackV1Message(rollbackV1Message)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#rollbackV1Message")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#rollbackV1Message")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rollbackV1Message** | [**RollbackV1Message**](RollbackV1Message.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

