

# InvokeContractV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractName** | **String** | The contract name to find it in the keychain plugin |  |
|**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  |  |
|**invocationType** | **EthContractInvocationType** |  |  |
|**methodName** | **String** | The name of the contract method to invoke. |  |
|**params** | **List&lt;Object&gt;** | The list of arguments to pass in to the contract method being invoked. |  |
|**value** | [**EthereumTransactionConfigFrom**](EthereumTransactionConfigFrom.md) |  |  [optional] |
|**gas** | [**EthereumTransactionConfigFrom**](EthereumTransactionConfigFrom.md) |  |  [optional] |
|**gasPrice** | [**EthereumTransactionConfigFrom**](EthereumTransactionConfigFrom.md) |  |  [optional] |
|**nonce** | **BigDecimal** |  |  [optional] |
|**timeoutMs** | **BigDecimal** | The amount of milliseconds to wait for a transaction receipt beforegiving up and crashing. Only has any effect if the invocation type is SEND |  [optional] |
|**keychainId** | **String** | The keychainId for retrieve the contracts json. |  |



