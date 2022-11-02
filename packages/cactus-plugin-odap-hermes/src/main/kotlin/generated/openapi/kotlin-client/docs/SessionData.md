
# SessionData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** |  |  [optional]
**step** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**version** | **kotlin.String** |  |  [optional]
**lastSequenceNumber** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**loggingProfile** | **kotlin.String** |  |  [optional]
**accessControlProfile** | **kotlin.String** |  |  [optional]
**applicationProfile** | **kotlin.String** |  |  [optional]
**payloadProfile** | [**PayloadProfile**](PayloadProfile.md) |  |  [optional]
**assetProfile** | [**AssetProfile**](AssetProfile.md) |  |  [optional]
**allowedSourceBackupGateways** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**allowedRecipientBackupGateways** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**sourceBasePath** | **kotlin.String** |  |  [optional]
**recipientBasePath** | **kotlin.String** |  |  [optional]
**originatorPubkey** | **kotlin.String** |  |  [optional]
**beneficiaryPubkey** | **kotlin.String** |  |  [optional]
**sourceGatewayPubkey** | **kotlin.String** |  |  [optional]
**sourceGatewayDltSystem** | **kotlin.String** |  |  [optional]
**recipientGatewayPubkey** | **kotlin.String** |  |  [optional]
**recipientGatewayDltSystem** | **kotlin.String** |  |  [optional]
**initializationRequestMessageHash** | **kotlin.String** |  |  [optional]
**initializationResponseMessageHash** | **kotlin.String** |  |  [optional]
**initializationRequestMessageRcvTimeStamp** | **kotlin.String** |  |  [optional]
**initializationRequestMessageProcessedTimeStamp** | **kotlin.String** |  |  [optional]
**clientSignatureInitializationRequestMessage** | **kotlin.String** |  |  [optional]
**serverSignatureInitializationResponseMessage** | **kotlin.String** |  |  [optional]
**transferCommenceMessageRequestHash** | **kotlin.String** |  |  [optional]
**transferCommenceMessageResponseHash** | **kotlin.String** |  |  [optional]
**clientSignatureTransferCommenceRequestMessage** | **kotlin.String** |  |  [optional]
**serverSignatureTransferCommenceResponseMessage** | **kotlin.String** |  |  [optional]
**lockEvidenceRequestMessageHash** | **kotlin.String** |  |  [optional]
**lockEvidenceResponseMessageHash** | **kotlin.String** |  |  [optional]
**clientSignatureLockEvidenceRequestMessage** | **kotlin.String** |  |  [optional]
**serverSignatureLockEvidenceResponseMessage** | **kotlin.String** |  |  [optional]
**lockEvidenceClaim** | **kotlin.String** |  |  [optional]
**commitPrepareRequestMessageHash** | **kotlin.String** |  |  [optional]
**commitPrepareResponseMessageHash** | **kotlin.String** |  |  [optional]
**clientSignatureCommitPreparationRequestMessage** | **kotlin.String** |  |  [optional]
**serverSignatureCommitPreparationResponseMessage** | **kotlin.String** |  |  [optional]
**commitFinalRequestMessageHash** | **kotlin.String** |  |  [optional]
**commitFinalResponseMessageHash** | **kotlin.String** |  |  [optional]
**commitFinalClaim** | **kotlin.String** |  |  [optional]
**commitFinalClaimFormat** | **kotlin.String** |  |  [optional]
**commitAcknowledgementClaim** | **kotlin.String** |  |  [optional]
**commitAcknowledgementClaimFormat** | **kotlin.String** |  |  [optional]
**clientSignatureCommitFinalRequestMessage** | **kotlin.String** |  |  [optional]
**serverSignatureCommitFinalResponseMessage** | **kotlin.String** |  |  [optional]
**transferCompleteMessageHash** | **kotlin.String** |  |  [optional]
**clientSignatureTransferCompleteMessage** | **kotlin.String** |  |  [optional]
**maxRetries** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**besuAssetID** | **kotlin.String** |  |  [optional]
**fabricAssetID** | **kotlin.String** |  |  [optional]
**fabricAssetSize** | **kotlin.String** |  |  [optional]
**maxTimeout** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**lastLogEntryTimestamp** | **kotlin.String** |  |  [optional]
**unlockAssetClaim** | **kotlin.String** |  |  [optional]
**recreateAssetClaim** | **kotlin.String** |  |  [optional]
**deleteAssetClaim** | **kotlin.String** |  |  [optional]
**lastMessageReceivedTimestamp** | **kotlin.String** |  |  [optional]
**rollback** | **kotlin.Boolean** |  |  [optional]
**rollbackMessageHash** | **kotlin.String** |  |  [optional]
**rollbackProofs** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**rollbackActionsPerformed** | [**inline**](#kotlin.collections.List&lt;RollbackActionsPerformedEnum&gt;) |  |  [optional]


<a name="kotlin.collections.List<RollbackActionsPerformedEnum>"></a>
## Enum: rollbackActionsPerformed
Name | Value
---- | -----
rollbackActionsPerformed | CREATE, DELETE, LOCK, UNLOCK



