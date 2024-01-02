

# GetBlockRequestV1Query

Query selector, caller must provide at least one of them. First found will be used, rest will be ignored, so it's recommended to pass single selector.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockNumber** | **String** | Select block by it&#39;s number. |  [optional] |
|**blockHash** | [**GetBlockRequestV1QueryBlockHash**](GetBlockRequestV1QueryBlockHash.md) |  |  [optional] |
|**transactionId** | **String** | Select block by id of transaction that it contains. |  [optional] |



