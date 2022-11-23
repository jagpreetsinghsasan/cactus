
# GetBlockRequestV1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channelName** | **kotlin.String** | Fabric channel which we want to query. | 
**gatewayOptions** | [**GatewayOptions**](GatewayOptions.md) |  | 
**query** | [**GetBlockRequestV1Query**](GetBlockRequestV1Query.md) |  | 
**connectionChannelName** | **kotlin.String** | Fabric channel we want to connect to. If not provided, then one from channelName parameter will be used |  [optional]
**skipDecode** | **kotlin.Boolean** | If true, encoded buffer will be returned. Otherwise, entire block object is returned. |  [optional]



