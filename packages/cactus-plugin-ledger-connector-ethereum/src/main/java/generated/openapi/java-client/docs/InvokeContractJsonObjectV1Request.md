

# InvokeContractJsonObjectV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  |  |
|**invocationType** | **EthContractInvocationType** |  |  |
|**methodName** | **String** | The name of the contract method to invoke. |  |
|**params** | **List&lt;Object&gt;** | The list of arguments to pass in to the contract method being invoked. |  |
|**contractAddress** | **String** | Address of the solidity contract |  |
|**value** | [**EthereumTransactionConfigFrom**](EthereumTransactionConfigFrom.md) |  |  [optional] |
|**gas** | [**EthereumTransactionConfigFrom**](EthereumTransactionConfigFrom.md) |  |  [optional] |
|**gasPrice** | [**EthereumTransactionConfigFrom**](EthereumTransactionConfigFrom.md) |  |  [optional] |
|**nonce** | **BigDecimal** |  |  [optional] |
|**timeoutMs** | **BigDecimal** | The amount of milliseconds to wait for a transaction receipt beforegiving up and crashing. Only has any effect if the invocation type is SEND |  [optional] |
|**contractJSON** | **ContractJSON** |  |  |



