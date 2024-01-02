

# StatusResponseV1

Response with plugin status report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instanceId** | **String** | Plugin instance id. |  |
|**connected** | **Boolean** | True if successfully connected to the database, false otherwise. |  |
|**webServicesRegistered** | **Boolean** | True if web services were correctly exported. |  |
|**monitoredTokensCount** | **BigDecimal** | Total number of tokens being monitored by the plugin. |  |
|**operationsRunning** | [**List&lt;TrackedOperationV1&gt;**](TrackedOperationV1.md) |  |  |
|**monitorRunning** | **Boolean** | True if block monitoring is running, false otherwise. |  |
|**lastSeenBlock** | **BigDecimal** | Number of the last block seen by the block monitor. |  |



