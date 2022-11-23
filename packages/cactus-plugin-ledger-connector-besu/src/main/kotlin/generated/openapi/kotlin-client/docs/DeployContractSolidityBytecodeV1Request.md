
# DeployContractSolidityBytecodeV1Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractName** | **kotlin.String** | The contract name for retrieve the contracts json on the keychain. | 
**contractAbi** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) | The application binary interface of the solidity contract | 
**constructorArgs** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  | 
**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**bytecode** | **kotlin.String** | See https://ethereum.stackexchange.com/a/47556 regarding the maximum length of the bytecode | 
**keychainId** | **kotlin.String** | The keychainId for retrieve the contracts json. | 
**gas** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**gasPrice** | **kotlin.String** |  |  [optional]
**timeoutMs** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The amount of milliseconds to wait for a transaction receipt with theaddress of the contract(which indicates successful deployment) beforegiving up and crashing. |  [optional]
**privateTransactionConfig** | [**BesuPrivateTransactionConfig**](BesuPrivateTransactionConfig.md) |  |  [optional]



