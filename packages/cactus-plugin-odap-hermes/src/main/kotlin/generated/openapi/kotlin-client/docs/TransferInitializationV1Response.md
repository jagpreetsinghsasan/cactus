
# TransferInitializationV1Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageType** | **kotlin.String** |  | 
**sessionID** | **kotlin.String** |  | 
**sequenceNumber** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**initialRequestMessageHash** | **kotlin.String** |  | 
**timeStamp** | **kotlin.String** |  | 
**processedTimeStamp** | **kotlin.String** |  | 
**serverIdentityPubkey** | **kotlin.String** |  | 
**signature** | **kotlin.String** |  | 
**backupGatewaysAllowed** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 
**odapPhase** | [**inline**](#OdapPhase) |  |  [optional]
**destination** | **kotlin.String** |  |  [optional]


<a name="OdapPhase"></a>
## Enum: odapPhase
Name | Value
---- | -----
odapPhase | TransferInitialization, LockEvidenceVerification, CommitmentEstablishment



