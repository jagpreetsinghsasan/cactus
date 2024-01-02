

# SessionData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**step** | **BigDecimal** |  |  [optional] |
|**version** | **String** |  |  [optional] |
|**lastSequenceNumber** | **BigDecimal** |  |  [optional] |
|**loggingProfile** | **String** |  |  [optional] |
|**accessControlProfile** | **String** |  |  [optional] |
|**applicationProfile** | **String** |  |  [optional] |
|**payloadProfile** | [**PayloadProfile**](PayloadProfile.md) |  |  [optional] |
|**assetProfile** | [**AssetProfile**](AssetProfile.md) |  |  [optional] |
|**allowedSourceBackupGateways** | **List&lt;String&gt;** |  |  [optional] |
|**allowedRecipientBackupGateways** | **List&lt;String&gt;** |  |  [optional] |
|**sourceBasePath** | **String** |  |  [optional] |
|**recipientBasePath** | **String** |  |  [optional] |
|**originatorPubkey** | **String** |  |  [optional] |
|**beneficiaryPubkey** | **String** |  |  [optional] |
|**sourceGatewayPubkey** | **String** |  |  [optional] |
|**sourceGatewayDltSystem** | **String** |  |  [optional] |
|**recipientGatewayPubkey** | **String** |  |  [optional] |
|**recipientGatewayDltSystem** | **String** |  |  [optional] |
|**initializationRequestMessageHash** | **String** |  |  [optional] |
|**initializationResponseMessageHash** | **String** |  |  [optional] |
|**initializationRequestMessageRcvTimeStamp** | **String** |  |  [optional] |
|**initializationRequestMessageProcessedTimeStamp** | **String** |  |  [optional] |
|**clientSignatureInitializationRequestMessage** | **String** |  |  [optional] |
|**serverSignatureInitializationResponseMessage** | **String** |  |  [optional] |
|**transferCommenceMessageRequestHash** | **String** |  |  [optional] |
|**transferCommenceMessageResponseHash** | **String** |  |  [optional] |
|**clientSignatureTransferCommenceRequestMessage** | **String** |  |  [optional] |
|**serverSignatureTransferCommenceResponseMessage** | **String** |  |  [optional] |
|**lockEvidenceRequestMessageHash** | **String** |  |  [optional] |
|**lockEvidenceResponseMessageHash** | **String** |  |  [optional] |
|**clientSignatureLockEvidenceRequestMessage** | **String** |  |  [optional] |
|**serverSignatureLockEvidenceResponseMessage** | **String** |  |  [optional] |
|**lockEvidenceClaim** | **String** |  |  [optional] |
|**commitPrepareRequestMessageHash** | **String** |  |  [optional] |
|**commitPrepareResponseMessageHash** | **String** |  |  [optional] |
|**clientSignatureCommitPreparationRequestMessage** | **String** |  |  [optional] |
|**serverSignatureCommitPreparationResponseMessage** | **String** |  |  [optional] |
|**commitFinalRequestMessageHash** | **String** |  |  [optional] |
|**commitFinalResponseMessageHash** | **String** |  |  [optional] |
|**commitFinalClaim** | **String** |  |  [optional] |
|**commitFinalClaimFormat** | **String** |  |  [optional] |
|**commitAcknowledgementClaim** | **String** |  |  [optional] |
|**commitAcknowledgementClaimFormat** | **String** |  |  [optional] |
|**clientSignatureCommitFinalRequestMessage** | **String** |  |  [optional] |
|**serverSignatureCommitFinalResponseMessage** | **String** |  |  [optional] |
|**transferCompleteMessageHash** | **String** |  |  [optional] |
|**clientSignatureTransferCompleteMessage** | **String** |  |  [optional] |
|**maxRetries** | **BigDecimal** |  |  [optional] |
|**recipientLedgerAssetID** | **String** |  |  [optional] |
|**sourceLedgerAssetID** | **String** |  |  [optional] |
|**maxTimeout** | **BigDecimal** |  |  [optional] |
|**lastLogEntryTimestamp** | **String** |  |  [optional] |
|**unlockAssetClaim** | **String** |  |  [optional] |
|**recreateAssetClaim** | **String** |  |  [optional] |
|**deleteAssetClaim** | **String** |  |  [optional] |
|**lastMessageReceivedTimestamp** | **String** |  |  [optional] |
|**rollback** | **Boolean** |  |  [optional] |
|**rollbackMessageHash** | **String** |  |  [optional] |
|**rollbackProofs** | **List&lt;String&gt;** |  |  [optional] |
|**rollbackActionsPerformed** | [**List&lt;RollbackActionsPerformedEnum&gt;**](#List&lt;RollbackActionsPerformedEnum&gt;) |  |  [optional] |



## Enum: List&lt;RollbackActionsPerformedEnum&gt;

| Name | Value |
|---- | -----|
| CREATE | &quot;CREATE&quot; |
| DELETE | &quot;DELETE&quot; |
| LOCK | &quot;LOCK&quot; |
| UNLOCK | &quot;UNLOCK&quot; |



