

# DeployContractSolidityBytecodeJsonObjectV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  |  |
|**gas** | **BigDecimal** |  |  [optional] |
|**gasPrice** | **String** |  |  [optional] |
|**timeoutMs** | **BigDecimal** | The amount of milliseconds to wait for a transaction receipt with theaddress of the contract(which indicates successful deployment) beforegiving up and crashing. |  [optional] |
|**contractJSON** | **ContractJSON** |  |  |
|**constructorArgs** | **List&lt;Object&gt;** | The list of arguments to pass in to the constructor of the contract being deployed. |  [optional] |



