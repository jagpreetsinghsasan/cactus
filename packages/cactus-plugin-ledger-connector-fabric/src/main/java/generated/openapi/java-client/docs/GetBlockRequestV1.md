

# GetBlockRequestV1

Request for GetBlock endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelName** | **String** | Fabric channel which we want to query. |  |
|**connectionChannelName** | **String** | Fabric channel we want to connect to. If not provided, then one from channelName parameter will be used |  [optional] |
|**gatewayOptions** | [**GatewayOptions**](GatewayOptions.md) |  |  |
|**query** | [**GetBlockRequestV1Query**](GetBlockRequestV1Query.md) |  |  |
|**skipDecode** | **Boolean** | If true, encoded buffer will be returned. Otherwise, entire block object is returned. |  [optional] |



