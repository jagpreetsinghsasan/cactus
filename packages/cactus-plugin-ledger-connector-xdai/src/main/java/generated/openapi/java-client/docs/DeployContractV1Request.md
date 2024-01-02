

# DeployContractV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contractName** | **String** | The contract name for retrieve the contracts json on the keychain. |  |
|**constructorArgs** | **List&lt;Object&gt;** |  |  [optional] |
|**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  |  |
|**keychainId** | **String** | The keychainId for retrieve the contracts json. |  |
|**gas** | **BigDecimal** |  |  [optional] |
|**gasPrice** | **String** |  |  [optional] |
|**timeoutMs** | **BigDecimal** | The amount of milliseconds to wait for a transaction receipt with theaddress of the contract(which indicates successful deployment) beforegiving up and crashing. |  [optional] |



