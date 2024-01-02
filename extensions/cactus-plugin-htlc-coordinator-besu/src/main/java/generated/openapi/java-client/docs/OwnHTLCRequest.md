

# OwnHTLCRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**htlcPackage** | **HtlcPackage** |  |  |
|**connectorInstanceId** | **String** | connector Instance Id for the connector plugin |  |
|**keychainId** | **String** | keychainId for the keychain plugin |  |
|**constructorArgs** | **List&lt;Object&gt;** |  |  |
|**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  |  |
|**inputAmount** | **BigDecimal** | Input amount to lock |  |
|**outputAmount** | **BigDecimal** | Output amount to lock |  |
|**expiration** | **BigDecimal** | Timestamp to expire the contract |  |
|**hashLock** | **String** | Hashlock needed to refund the amount |  |
|**tokenAddress** | **String** | The token address |  |
|**receiver** | **String** | The receiver address |  |
|**outputNetwork** | **String** | The output network id |  |
|**outputAddress** | **String** | The output addreess to receive the tokens |  |
|**gas** | **BigDecimal** |  |  [optional] |



