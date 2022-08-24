
# InvokeContractJsonObjectV1Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**invocationType** | [**EthContractInvocationType**](EthContractInvocationType.md) |  | 
**methodName** | **kotlin.String** | The name of the contract method to invoke. | 
**params** | [**kotlin.collections.List&lt;AnyType&gt;**](AnyType.md) | The list of arguments to pass in to the contract method being invoked. | 
**contractAddress** | **kotlin.String** | Address of the solidity contract | 
**contractJSON** | [**ContractJSON**](ContractJSON.md) |  | 
**value** | [**OneOfLessThanStringCommaNumberGreaterThan**](OneOfLessThanStringCommaNumberGreaterThan.md) |  |  [optional]
**gas** | [**OneOfLessThanStringCommaNumberGreaterThan**](OneOfLessThanStringCommaNumberGreaterThan.md) |  |  [optional]
**gasPrice** | [**OneOfLessThanStringCommaNumberGreaterThan**](OneOfLessThanStringCommaNumberGreaterThan.md) |  |  [optional]
**nonce** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**timeoutMs** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The amount of milliseconds to wait for a transaction receipt beforegiving up and crashing. Only has any effect if the invocation type is SEND |  [optional]



