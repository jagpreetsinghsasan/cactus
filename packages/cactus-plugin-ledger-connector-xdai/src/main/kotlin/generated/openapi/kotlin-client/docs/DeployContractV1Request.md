
# DeployContractV1Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractName** | **kotlin.String** | The contract name for retrieve the contracts json on the keychain. | 
**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**keychainId** | **kotlin.String** | The keychainId for retrieve the contracts json. | 
**constructorArgs** | [**kotlin.collections.List&lt;AnyType&gt;**](AnyType.md) |  |  [optional]
**gas** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**gasPrice** | **kotlin.String** |  |  [optional]
**timeoutMs** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The amount of milliseconds to wait for a transaction receipt with theaddress of the contract(which indicates successful deployment) beforegiving up and crashing. |  [optional]



