# \DefaultApi

All URIs are relative to *https://www.cactus.stream*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetObjectV1**](DefaultApi.md#GetObjectV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-object-store-ipfs/get-object | Retrieves an object from the object store.
[**HasObjectV1**](DefaultApi.md#HasObjectV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-object-store-ipfs/has-object | Checks the presence of an object in the object store.
[**SetObjectV1**](DefaultApi.md#SetObjectV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-object-store-ipfs/set-object | Sets an object in the object store under the specified key.



## GetObjectV1

> GetObjectResponseV1 GetObjectV1(ctx).GetObjectRequestV1(getObjectRequestV1).Execute()

Retrieves an object from the object store.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-object-store-ipfs/src/main/go/generated/openapi/go-client"
)

func main() {
    getObjectRequestV1 := *openapiclient.NewGetObjectRequestV1("Key_example") // GetObjectRequestV1 | Request body to obtain an object via its key.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetObjectV1(context.Background()).GetObjectRequestV1(getObjectRequestV1).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetObjectV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetObjectV1`: GetObjectResponseV1
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetObjectV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetObjectV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getObjectRequestV1** | [**GetObjectRequestV1**](GetObjectRequestV1.md) | Request body to obtain an object via its key. | 

### Return type

[**GetObjectResponseV1**](GetObjectResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## HasObjectV1

> HasObjectResponseV1 HasObjectV1(ctx).HasObjectRequestV1(hasObjectRequestV1).Execute()

Checks the presence of an object in the object store.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-object-store-ipfs/src/main/go/generated/openapi/go-client"
)

func main() {
    hasObjectRequestV1 := *openapiclient.NewHasObjectRequestV1("Key_example") // HasObjectRequestV1 | Request body to check presence of an object under a key.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.HasObjectV1(context.Background()).HasObjectRequestV1(hasObjectRequestV1).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.HasObjectV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `HasObjectV1`: HasObjectResponseV1
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.HasObjectV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiHasObjectV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hasObjectRequestV1** | [**HasObjectRequestV1**](HasObjectRequestV1.md) | Request body to check presence of an object under a key. | 

### Return type

[**HasObjectResponseV1**](HasObjectResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SetObjectV1

> SetObjectResponseV1 SetObjectV1(ctx).SetObjectRequestV1(setObjectRequestV1).Execute()

Sets an object in the object store under the specified key.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-object-store-ipfs/src/main/go/generated/openapi/go-client"
)

func main() {
    setObjectRequestV1 := *openapiclient.NewSetObjectRequestV1("Key_example", "Value_example") // SetObjectRequestV1 | Request body to set an object under a key.

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.SetObjectV1(context.Background()).SetObjectRequestV1(setObjectRequestV1).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.SetObjectV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SetObjectV1`: SetObjectResponseV1
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.SetObjectV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSetObjectV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setObjectRequestV1** | [**SetObjectRequestV1**](SetObjectRequestV1.md) | Request body to set an object under a key. | 

### Return type

[**SetObjectResponseV1**](SetObjectResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

