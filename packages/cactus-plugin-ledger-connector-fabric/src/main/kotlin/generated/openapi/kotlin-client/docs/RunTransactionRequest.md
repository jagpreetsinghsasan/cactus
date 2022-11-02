
# RunTransactionRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**signingCredential** | [**FabricSigningCredential**](FabricSigningCredential.md) |  | 
**channelName** | **kotlin.String** |  | 
**contractName** | **kotlin.String** |  | 
**invocationType** | [**FabricContractInvocationType**](FabricContractInvocationType.md) |  | 
**methodName** | **kotlin.String** |  | 
**params** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**endorsingPeers** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of MSP IDs to set as the list of endorsing peers for the transaction. |  [optional]
**transientData** | [**kotlin.Any**](.md) |  |  [optional]
**gatewayOptions** | [**GatewayOptions**](GatewayOptions.md) |  |  [optional]
**endorsingParties** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]



