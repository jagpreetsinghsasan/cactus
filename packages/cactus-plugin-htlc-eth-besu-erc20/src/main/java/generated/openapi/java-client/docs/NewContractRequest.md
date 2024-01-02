

# NewContractRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractAddress** | **String** | Contract address |  |
|**inputAmount** | **BigDecimal** | Input amount to lock |  |
|**outputAmount** | **BigDecimal** | Output amount to lock |  |
|**expiration** | **BigDecimal** | Timestamp to expire the contract |  |
|**hashLock** | **String** | Hashlock needed to refund the amount |  |
|**tokenAddress** | **String** | The token address |  |
|**receiver** | **String** | The receiver address |  |
|**outputNetwork** | **String** | The output network id |  |
|**outputAddress** | **String** | The output address to receive the tokens |  |
|**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  |  |
|**connectorId** | **String** | connectorId for the connector besu plugin |  |
|**keychainId** | **String** | keychainId for the keychian plugin |  |
|**gas** | [**NewContractRequestGas**](NewContractRequestGas.md) |  |  [optional] |



