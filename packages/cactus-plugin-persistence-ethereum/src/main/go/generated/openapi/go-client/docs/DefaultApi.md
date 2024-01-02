# \DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetStatusV1**](DefaultApi.md#GetStatusV1) | **Get** /api/v1/plugins/@hyperledger/cactus-plugin-persistence-ethereum/status | Get the status of persistence plugin for ethereum



## GetStatusV1

> StatusResponseV1 GetStatusV1(ctx).Execute()

Get the status of persistence plugin for ethereum

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-persistence-ethereum/src/main/go/generated/openapi/go-client"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetStatusV1(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetStatusV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetStatusV1`: StatusResponseV1
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetStatusV1`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetStatusV1Request struct via the builder pattern


### Return type

[**StatusResponseV1**](StatusResponseV1.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

