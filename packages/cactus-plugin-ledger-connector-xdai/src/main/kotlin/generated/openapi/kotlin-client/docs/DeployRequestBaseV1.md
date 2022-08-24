
# DeployRequestBaseV1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractJSON** | [**ContractJSON**](ContractJSON.md) |  | 
**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**constructorArgs** | [**kotlin.collections.List&lt;AnyType&gt;**](AnyType.md) |  |  [optional]
**gas** | [**OneOfLessThanStringCommaNumberGreaterThan**](OneOfLessThanStringCommaNumberGreaterThan.md) |  |  [optional]
**gasPrice** | [**OneOfLessThanStringCommaNumberGreaterThan**](OneOfLessThanStringCommaNumberGreaterThan.md) |  |  [optional]
**timeoutMs** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The amount of milliseconds to wait for a transaction receipt with theaddress of the contract(which indicates successful deployment) beforegiving up and crashing. |  [optional]



