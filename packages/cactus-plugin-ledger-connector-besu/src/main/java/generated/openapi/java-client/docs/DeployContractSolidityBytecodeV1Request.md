

# DeployContractSolidityBytecodeV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractName** | **String** | The contract name for retrieve the contracts json on the keychain. |  |
|**contractAbi** | **List&lt;Object&gt;** | The application binary interface of the solidity contract |  |
|**constructorArgs** | **List&lt;Object&gt;** |  |  |
|**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  |  |
|**bytecode** | **String** | See https://ethereum.stackexchange.com/a/47556 regarding the maximum length of the bytecode |  |
|**keychainId** | **String** | The keychainId for retrieve the contracts json. |  |
|**gas** | **BigDecimal** |  |  [optional] |
|**gasPrice** | **String** |  |  [optional] |
|**timeoutMs** | **BigDecimal** | The amount of milliseconds to wait for a transaction receipt with theaddress of the contract(which indicates successful deployment) beforegiving up and crashing. |  [optional] |
|**privateTransactionConfig** | [**BesuPrivateTransactionConfig**](BesuPrivateTransactionConfig.md) |  |  [optional] |



