

# WatchBlocksResponseV1

Response block from WatchBlocks endpoint. Depends on 'type' passed in subscription options.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cactusTransactionsEvents** | [**List&lt;WatchBlocksCactusTransactionsEventV1&gt;**](WatchBlocksCactusTransactionsEventV1.md) | List of transactions summary |  |
|**fullBlock** | **Object** | Full commited block. |  |
|**filteredBlock** | **Object** | Filtered commited block. |  |
|**privateBlock** | **Object** | Private commited block. |  |
|**code** | **BigDecimal** | Error code. |  |
|**errorMessage** | **String** | Description of the error. |  |



