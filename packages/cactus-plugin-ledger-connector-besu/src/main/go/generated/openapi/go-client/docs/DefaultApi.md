# \DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeployContractSolBytecodeV1**](DefaultApi.md#DeployContractSolBytecodeV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/deploy-contract-solidity-bytecode | Deploys the bytecode of a Solidity contract.
[**GetBalanceV1**](DefaultApi.md#GetBalanceV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-balance | Return balance of an address of a given block
[**GetBesuRecordV1**](DefaultApi.md#GetBesuRecordV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-besu-record | Retrieves an arbitrary record (any piece of information) from the ledger. Ledger records can be call outputs, transaction input, etc.
[**GetBlockV1**](DefaultApi.md#GetBlockV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-block | Returns a block matching the block
[**GetOpenApiSpecV1**](DefaultApi.md#GetOpenApiSpecV1) | **Get** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-open-api-spec | Retrieves the .json file that contains the OpenAPI specification for the plugin.
[**GetPastLogsV1**](DefaultApi.md#GetPastLogsV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-past-logs | Gets past logs, matching the given options.
[**GetPrometheusMetricsV1**](DefaultApi.md#GetPrometheusMetricsV1) | **Get** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-prometheus-exporter-metrics | Get the Prometheus Metrics
[**GetTransactionV1**](DefaultApi.md#GetTransactionV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/get-transaction | Executes a transaction on a besu ledger
[**InvokeContractV1**](DefaultApi.md#InvokeContractV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/invoke-contract | Invokes a contract on a besu ledger
[**RunTransactionV1**](DefaultApi.md#RunTransactionV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/run-transaction | Executes a transaction on a besu ledger
[**SignTransactionV1**](DefaultApi.md#SignTransactionV1) | **Post** /api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-besu/sign-transaction | Obtain signatures of ledger from the corresponding transaction hash.



## DeployContractSolBytecodeV1

> DeployContractSolidityBytecodeV1Response DeployContractSolBytecodeV1(ctx).DeployContractSolidityBytecodeV1Request(deployContractSolidityBytecodeV1Request).Execute()

Deploys the bytecode of a Solidity contract.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {
    deployContractSolidityBytecodeV1Request := *openapiclient.NewDeployContractSolidityBytecodeV1Request("ContractName_example", []interface{}{nil}, []interface{}{nil}, openapiclient.Web3SigningCredential{Web3SigningCredentialCactusKeychainRef: openapiclient.NewWeb3SigningCredentialCactusKeychainRef(openapiclient.Web3SigningCredentialType("CACTUS_KEYCHAIN_REF"), "EthAccount_example", "KeychainEntryKey_example", "KeychainId_example")}, "Bytecode_example", "KeychainId_example") // DeployContractSolidityBytecodeV1Request |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.DeployContractSolBytecodeV1(context.Background()).DeployContractSolidityBytecodeV1Request(deployContractSolidityBytecodeV1Request).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.DeployContractSolBytecodeV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `DeployContractSolBytecodeV1`: DeployContractSolidityBytecodeV1Response
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.DeployContractSolBytecodeV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiDeployContractSolBytecodeV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deployContractSolidityBytecodeV1Request** | [**DeployContractSolidityBytecodeV1Request**](DeployContractSolidityBytecodeV1Request.md) |  | 

### Return type

[**DeployContractSolidityBytecodeV1Response**](DeployContractSolidityBytecodeV1Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBalanceV1

> GetBalanceV1Response GetBalanceV1(ctx).GetBalanceV1Request(getBalanceV1Request).Execute()

Return balance of an address of a given block

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {
    getBalanceV1Request := *openapiclient.NewGetBalanceV1Request("Address_example") // GetBalanceV1Request |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetBalanceV1(context.Background()).GetBalanceV1Request(getBalanceV1Request).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetBalanceV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBalanceV1`: GetBalanceV1Response
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetBalanceV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBalanceV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getBalanceV1Request** | [**GetBalanceV1Request**](GetBalanceV1Request.md) |  | 

### Return type

[**GetBalanceV1Response**](GetBalanceV1Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBesuRecordV1

> GetBesuRecordV1Response GetBesuRecordV1(ctx).GetBesuRecordV1Request(getBesuRecordV1Request).Execute()

Retrieves an arbitrary record (any piece of information) from the ledger. Ledger records can be call outputs, transaction input, etc.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {
    getBesuRecordV1Request := *openapiclient.NewGetBesuRecordV1Request() // GetBesuRecordV1Request |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetBesuRecordV1(context.Background()).GetBesuRecordV1Request(getBesuRecordV1Request).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetBesuRecordV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBesuRecordV1`: GetBesuRecordV1Response
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetBesuRecordV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBesuRecordV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getBesuRecordV1Request** | [**GetBesuRecordV1Request**](GetBesuRecordV1Request.md) |  | 

### Return type

[**GetBesuRecordV1Response**](GetBesuRecordV1Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetBlockV1

> GetBlockV1Response GetBlockV1(ctx).GetBlockV1Request(getBlockV1Request).Execute()

Returns a block matching the block

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {
    getBlockV1Request := *openapiclient.NewGetBlockV1Request(interface{}(123)) // GetBlockV1Request |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetBlockV1(context.Background()).GetBlockV1Request(getBlockV1Request).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetBlockV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetBlockV1`: GetBlockV1Response
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetBlockV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetBlockV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getBlockV1Request** | [**GetBlockV1Request**](GetBlockV1Request.md) |  | 

### Return type

[**GetBlockV1Response**](GetBlockV1Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetOpenApiSpecV1

> string GetOpenApiSpecV1(ctx).Execute()

Retrieves the .json file that contains the OpenAPI specification for the plugin.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetOpenApiSpecV1(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetOpenApiSpecV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetOpenApiSpecV1`: string
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetOpenApiSpecV1`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetOpenApiSpecV1Request struct via the builder pattern


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPastLogsV1

> GetPastLogsV1Response GetPastLogsV1(ctx).GetPastLogsV1Request(getPastLogsV1Request).Execute()

Gets past logs, matching the given options.

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {
    getPastLogsV1Request := *openapiclient.NewGetPastLogsV1Request() // GetPastLogsV1Request |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetPastLogsV1(context.Background()).GetPastLogsV1Request(getPastLogsV1Request).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetPastLogsV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPastLogsV1`: GetPastLogsV1Response
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetPastLogsV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetPastLogsV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getPastLogsV1Request** | [**GetPastLogsV1Request**](GetPastLogsV1Request.md) |  | 

### Return type

[**GetPastLogsV1Response**](GetPastLogsV1Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetPrometheusMetricsV1

> string GetPrometheusMetricsV1(ctx).Execute()

Get the Prometheus Metrics

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetPrometheusMetricsV1(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetPrometheusMetricsV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetPrometheusMetricsV1`: string
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetPrometheusMetricsV1`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetPrometheusMetricsV1Request struct via the builder pattern


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetTransactionV1

> GetTransactionV1Response GetTransactionV1(ctx).GetTransactionV1Request(getTransactionV1Request).Execute()

Executes a transaction on a besu ledger

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {
    getTransactionV1Request := *openapiclient.NewGetTransactionV1Request("TransactionHash_example") // GetTransactionV1Request |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.GetTransactionV1(context.Background()).GetTransactionV1Request(getTransactionV1Request).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.GetTransactionV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetTransactionV1`: GetTransactionV1Response
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.GetTransactionV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiGetTransactionV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getTransactionV1Request** | [**GetTransactionV1Request**](GetTransactionV1Request.md) |  | 

### Return type

[**GetTransactionV1Response**](GetTransactionV1Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## InvokeContractV1

> InvokeContractV1Response InvokeContractV1(ctx).InvokeContractV1Request(invokeContractV1Request).Execute()

Invokes a contract on a besu ledger

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {
    invokeContractV1Request := *openapiclient.NewInvokeContractV1Request("ContractName_example", openapiclient.Web3SigningCredential{Web3SigningCredentialCactusKeychainRef: openapiclient.NewWeb3SigningCredentialCactusKeychainRef(openapiclient.Web3SigningCredentialType("CACTUS_KEYCHAIN_REF"), "EthAccount_example", "KeychainEntryKey_example", "KeychainId_example")}, openapiclient.EthContractInvocationType("SEND"), "MethodName_example", []interface{}{nil}) // InvokeContractV1Request |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.InvokeContractV1(context.Background()).InvokeContractV1Request(invokeContractV1Request).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.InvokeContractV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `InvokeContractV1`: InvokeContractV1Response
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.InvokeContractV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiInvokeContractV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invokeContractV1Request** | [**InvokeContractV1Request**](InvokeContractV1Request.md) |  | 

### Return type

[**InvokeContractV1Response**](InvokeContractV1Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RunTransactionV1

> RunTransactionResponse RunTransactionV1(ctx).RunTransactionRequest(runTransactionRequest).Execute()

Executes a transaction on a besu ledger

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {
    runTransactionRequest := *openapiclient.NewRunTransactionRequest(openapiclient.Web3SigningCredential{Web3SigningCredentialCactusKeychainRef: openapiclient.NewWeb3SigningCredentialCactusKeychainRef(openapiclient.Web3SigningCredentialType("CACTUS_KEYCHAIN_REF"), "EthAccount_example", "KeychainEntryKey_example", "KeychainId_example")}, *openapiclient.NewBesuTransactionConfig(), *openapiclient.NewConsistencyStrategy(openapiclient.ReceiptType("NODE_TX_POOL_ACK"), int32(123))) // RunTransactionRequest |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.RunTransactionV1(context.Background()).RunTransactionRequest(runTransactionRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.RunTransactionV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `RunTransactionV1`: RunTransactionResponse
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.RunTransactionV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiRunTransactionV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runTransactionRequest** | [**RunTransactionRequest**](RunTransactionRequest.md) |  | 

### Return type

[**RunTransactionResponse**](RunTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SignTransactionV1

> SignTransactionResponse SignTransactionV1(ctx).SignTransactionRequest(signTransactionRequest).Execute()

Obtain signatures of ledger from the corresponding transaction hash.



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/hyperledger/cactus-plugin-ledger-connector-besu/src/main/go/generated/openapi/go-client"
)

func main() {
    signTransactionRequest := *openapiclient.NewSignTransactionRequest("KeychainId_example", "KeychainRef_example", "TransactionHash_example") // SignTransactionRequest | 

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.DefaultApi.SignTransactionV1(context.Background()).SignTransactionRequest(signTransactionRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `DefaultApi.SignTransactionV1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SignTransactionV1`: SignTransactionResponse
    fmt.Fprintf(os.Stdout, "Response from `DefaultApi.SignTransactionV1`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSignTransactionV1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **signTransactionRequest** | [**SignTransactionRequest**](SignTransactionRequest.md) |  | 

### Return type

[**SignTransactionResponse**](SignTransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

