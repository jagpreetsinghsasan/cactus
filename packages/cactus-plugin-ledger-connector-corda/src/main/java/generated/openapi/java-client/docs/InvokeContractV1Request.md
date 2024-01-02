

# InvokeContractV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**flowFullClassName** | **String** | The fully qualified name of the Corda flow to invoke |  |
|**flowInvocationType** | **FlowInvocationType** |  |  |
|**params** | [**List&lt;JvmObject&gt;**](JvmObject.md) | The list of arguments to pass in to the contract method being invoked. |  |
|**timeoutMs** | **Integer** | The amount of milliseconds to wait for a transaction receipt beforegiving up and crashing. |  [optional] |



