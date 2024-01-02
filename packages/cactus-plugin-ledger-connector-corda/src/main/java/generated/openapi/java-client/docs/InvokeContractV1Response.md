

# InvokeContractV1Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**success** | **Boolean** |  |  |
|**callOutput** | **Object** | Data returned from the JVM when no transaction is running |  |
|**transactionId** | **String** | The net.corda.core.flows.StateMachineRunId value returned by the flow execution. |  [optional] |
|**progress** | **List&lt;String&gt;** | An array of strings representing the aggregated stream of progress updates provided by a *tracked* flow invocation. If the flow invocation was not tracked, this array is still returned, but as empty. |  [optional] |
|**flowId** | **String** | The id for the flow handle |  |



