

# DeployContractSolidityBytecodeV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractName** | **String** | The contract name for retrieve the contracts json on the keychain. |  |
|**contractAbi** | **List&lt;Object&gt;** | The application binary interface of the solidity contract |  [optional] |
|**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  |  |
|**bytecode** | **String** | See https://ethereum.stackexchange.com/a/47556 regarding the maximum length of the bytecode |  [optional] |
|**keychainId** | **String** | The keychainId for retrieve the contracts json. |  |
|**gas** | **BigDecimal** |  |  [optional] |
|**gasPrice** | **BigDecimal** |  |  [optional] |
|**nonce** | **BigDecimal** |  |  [optional] |
|**value** | **BigDecimal** |  |  [optional] |
|**timeoutMs** | **BigDecimal** | The amount of milliseconds to wait for a transaction receipt with theaddress of the contract(which indicates successful deployment) beforegiving up and crashing. |  [optional] |
|**contractJSON** | **Object** | For use when not using keychain, pass the contract in as this variable |  [optional] |
|**constructorArgs** | **List&lt;Object&gt;** | The list of arguments to pass in to the constructor of the contract being deployed. |  [optional] |



