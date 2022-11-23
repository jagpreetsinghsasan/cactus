
# DeployContractJsonObjectV1Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**contractJSON** | [**ContractJSON**](ContractJSON.md) |  | 
**gas** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**gasPrice** | **kotlin.String** |  |  [optional]
**timeoutMs** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The amount of milliseconds to wait for a transaction receipt with theaddress of the contract(which indicates successful deployment) beforegiving up and crashing. |  [optional]
**constructorArgs** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) | The list of arguments to pass in to the constructor of the contract being deployed. |  [optional]



