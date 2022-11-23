
# InvokeRawWeb3EthContractV1Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**abi** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) | The application binary interface of the solidity contract | 
**address** | **kotlin.String** | Deployed solidity contract address | 
**invocationType** | [**EthContractInvocationWeb3Method**](EthContractInvocationWeb3Method.md) |  | 
**contractMethod** | **kotlin.String** | Method of deployed solidity contract to execute | 
**invocationParams** | [**kotlin.Any**](.md) | The list of arguments for contract invocation method (send, call, etc...) |  [optional]
**contractMethodArgs** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) | The list of arguments for deployed solidity contract method |  [optional]



