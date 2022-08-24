
# InvokeContractV1Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractName** | **kotlin.String** | The contract name to find it in the keychain plugin | 
**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**invocationType** | [**EthContractInvocationType**](EthContractInvocationType.md) |  | 
**methodName** | **kotlin.String** | The name of the contract method to invoke. | 
**params** | [**kotlin.collections.List&lt;AnyType&gt;**](AnyType.md) | The list of arguments to pass in to the contract method being invoked. | 
**keychainId** | **kotlin.String** | The keychainId for retrieve the contracts json. | 
**value** | [**OneOfLessThanStringCommaNumberGreaterThan**](OneOfLessThanStringCommaNumberGreaterThan.md) |  |  [optional]
**gas** | [**OneOfLessThanStringCommaNumberGreaterThan**](OneOfLessThanStringCommaNumberGreaterThan.md) |  |  [optional]
**gasPrice** | [**OneOfLessThanStringCommaNumberGreaterThan**](OneOfLessThanStringCommaNumberGreaterThan.md) |  |  [optional]
**nonce** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**timeoutMs** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The amount of milliseconds to wait for a transaction receipt beforegiving up and crashing. Only has any effect if the invocation type is SEND |  [optional]



