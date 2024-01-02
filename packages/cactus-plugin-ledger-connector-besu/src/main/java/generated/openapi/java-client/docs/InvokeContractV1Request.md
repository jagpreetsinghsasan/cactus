

# InvokeContractV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractName** | **String** |  |  |
|**signingCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  |  |
|**invocationType** | **EthContractInvocationType** |  |  |
|**methodName** | **String** | The name of the contract method to invoke. |  |
|**params** | **List&lt;Object&gt;** | The list of arguments to pass in to the contract method being invoked. |  |
|**contractAbi** | **List&lt;Object&gt;** | The application binary interface of the solidity contract, optional parameter |  [optional] |
|**contractAddress** | **String** | Address of the solidity contract, optional parameter |  [optional] |
|**value** | [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  |  [optional] |
|**gas** | [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  |  [optional] |
|**gasPrice** | [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  |  [optional] |
|**nonce** | **BigDecimal** |  |  [optional] |
|**timeoutMs** | **BigDecimal** | The amount of milliseconds to wait for a transaction receipt beforegiving up and crashing. Only has any effect if the invocation type is SEND |  [optional] |
|**keychainId** | **String** | The keychainId for retrieve the contracts json. |  [optional] |
|**privateTransactionConfig** | [**BesuPrivateTransactionConfig**](BesuPrivateTransactionConfig.md) |  |  [optional] |



