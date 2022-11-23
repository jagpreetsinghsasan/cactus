
# OwnHTLCRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**htlcPackage** | [**HtlcPackage**](HtlcPackage.md) |  | 
**connectorInstanceId** | **kotlin.String** | connector Instance Id for the connector plugin | 
**keychainId** | **kotlin.String** | keychainId for the keychain plugin | 
**constructorArgs** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  | 
**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**inputAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Input amount to lock | 
**outputAmount** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Output amount to lock | 
**expiration** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Timestamp to expire the contract | 
**hashLock** | **kotlin.String** | Hashlock needed to refund the amount | 
**tokenAddress** | **kotlin.String** | The token address | 
**&#x60;receiver&#x60;** | **kotlin.String** | The receiver address | 
**outputNetwork** | **kotlin.String** | The output network id | 
**outputAddress** | **kotlin.String** | The output addreess to receive the tokens | 
**gas** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]



