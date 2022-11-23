
# TransferInitializationV1Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageType** | **kotlin.String** |  | 
**sessionID** | **kotlin.String** |  | 
**payloadProfile** | [**PayloadProfile**](PayloadProfile.md) |  | 
**applicationProfile** | **kotlin.String** |  | 
**loggingProfile** | **kotlin.String** |  | 
**accessControlProfile** | **kotlin.String** |  | 
**signature** | **kotlin.String** |  | 
**sourceGatewayPubkey** | **kotlin.String** |  | 
**sourceGatewayDltSystem** | **kotlin.String** |  | 
**recipientGatewayPubkey** | **kotlin.String** |  | 
**recipientGatewayDltSystem** | **kotlin.String** |  | 
**sequenceNumber** | **kotlin.Int** |  | 
**sourceBasePath** | **kotlin.String** |  | 
**recipientBasePath** | **kotlin.String** |  | 
**maxRetries** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**maxTimeout** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**backupGatewaysAllowed** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**recipientLedgerAssetID** | **kotlin.String** |  | 
**sourceLedgerAssetID** | **kotlin.String** |  | 
**version** | **kotlin.String** |  |  [optional]
**developerURN** | **kotlin.String** |  |  [optional]
**credentialProfile** | [**CredentialProfile**](CredentialProfile.md) |  |  [optional]
**escrowType** | [**inline**](#EscrowType) |  |  [optional]
**expiryTime** | **kotlin.String** |  |  [optional]
**multipleClaimsAllowed** | **kotlin.Boolean** |  |  [optional]
**multipleCancelsAllowed** | **kotlin.Boolean** |  |  [optional]
**permissions** | [**kotlin.Any**](.md) |  |  [optional]
**origin** | **kotlin.String** |  |  [optional]
**destination** | **kotlin.String** |  |  [optional]
**subsequentCalls** | [**kotlin.Any**](.md) |  |  [optional]
**histories** | [**kotlin.collections.List&lt;History&gt;**](History.md) |  |  [optional]


<a name="EscrowType"></a>
## Enum: escrowType
Name | Value
---- | -----
escrowType | FAUCET, TIMELOCK, HASHLOCK, HASHTIMELOCK, MULTICLAIMPC, DESTROY, BURN



