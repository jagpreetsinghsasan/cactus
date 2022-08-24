# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**insertBambooHarvestV1**](DefaultApi.md#insertBambooHarvestV1) | **POST** /api/v1/plugins/@hyperledger/cactus-example-supply-chain-backend/insert-bamboo-harvest | Inserts the provided BambooHarvest entity to the ledger.
[**insertBookshelfV1**](DefaultApi.md#insertBookshelfV1) | **POST** /api/v1/plugins/@hyperledger/cactus-example-supply-chain-backend/insert-bookshelf | Inserts the provided Bookshelf entity to the ledger.
[**insertShipmentV1**](DefaultApi.md#insertShipmentV1) | **POST** /api/v1/plugins/@hyperledger/cactus-example-supply-chain-backend/insert-shipment | Inserts the provided Shipment entity to the ledger.
[**listBambooHarvestV1**](DefaultApi.md#listBambooHarvestV1) | **GET** /api/v1/plugins/@hyperledger/cactus-example-supply-chain-backend/list-bamboo-harvest | Lists all the BambooHarvest entities stored on the ledger.
[**listBookshelfV1**](DefaultApi.md#listBookshelfV1) | **GET** /api/v1/plugins/@hyperledger/cactus-example-supply-chain-backend/list-bookshelf | Lists all the Bookshelf entities stored on the ledger.
[**listShipmentV1**](DefaultApi.md#listShipmentV1) | **GET** /api/v1/plugins/@hyperledger/cactus-example-supply-chain-backend/list-shipment | Lists all the Shipments entities stored on the ledger.


<a name="insertBambooHarvestV1"></a>
# **insertBambooHarvestV1**
> InsertBambooHarvestResponse insertBambooHarvestV1(insertBambooHarvestRequest)

Inserts the provided BambooHarvest entity to the ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val insertBambooHarvestRequest : InsertBambooHarvestRequest =  // InsertBambooHarvestRequest | 
try {
    val result : InsertBambooHarvestResponse = apiInstance.insertBambooHarvestV1(insertBambooHarvestRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#insertBambooHarvestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#insertBambooHarvestV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insertBambooHarvestRequest** | [**InsertBambooHarvestRequest**](InsertBambooHarvestRequest.md)|  | [optional]

### Return type

[**InsertBambooHarvestResponse**](InsertBambooHarvestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertBookshelfV1"></a>
# **insertBookshelfV1**
> InsertBookshelfResponse insertBookshelfV1(insertBookshelfRequest)

Inserts the provided Bookshelf entity to the ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val insertBookshelfRequest : InsertBookshelfRequest =  // InsertBookshelfRequest | 
try {
    val result : InsertBookshelfResponse = apiInstance.insertBookshelfV1(insertBookshelfRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#insertBookshelfV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#insertBookshelfV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insertBookshelfRequest** | [**InsertBookshelfRequest**](InsertBookshelfRequest.md)|  | [optional]

### Return type

[**InsertBookshelfResponse**](InsertBookshelfResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertShipmentV1"></a>
# **insertShipmentV1**
> InsertShipmentResponse insertShipmentV1(insertShipmentRequest)

Inserts the provided Shipment entity to the ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val insertShipmentRequest : InsertShipmentRequest =  // InsertShipmentRequest | 
try {
    val result : InsertShipmentResponse = apiInstance.insertShipmentV1(insertShipmentRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#insertShipmentV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#insertShipmentV1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insertShipmentRequest** | [**InsertShipmentRequest**](InsertShipmentRequest.md)|  | [optional]

### Return type

[**InsertShipmentResponse**](InsertShipmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBambooHarvestV1"></a>
# **listBambooHarvestV1**
> ListBambooHarvestResponse listBambooHarvestV1()

Lists all the BambooHarvest entities stored on the ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : ListBambooHarvestResponse = apiInstance.listBambooHarvestV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listBambooHarvestV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listBambooHarvestV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListBambooHarvestResponse**](ListBambooHarvestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBookshelfV1"></a>
# **listBookshelfV1**
> ListBookshelfResponse listBookshelfV1()

Lists all the Bookshelf entities stored on the ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : ListBookshelfResponse = apiInstance.listBookshelfV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listBookshelfV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listBookshelfV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListBookshelfResponse**](ListBookshelfResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listShipmentV1"></a>
# **listShipmentV1**
> ListShipmentResponse listShipmentV1()

Lists all the Shipments entities stored on the ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : ListShipmentResponse = apiInstance.listShipmentV1()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listShipmentV1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listShipmentV1")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListShipmentResponse**](ListShipmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

