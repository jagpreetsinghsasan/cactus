

# TransferInitializationV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageType** | **String** |  |  |
|**sessionID** | **String** |  |  |
|**version** | **String** |  |  [optional] |
|**developerURN** | **String** |  |  [optional] |
|**credentialProfile** | **CredentialProfile** |  |  [optional] |
|**payloadProfile** | [**PayloadProfile**](PayloadProfile.md) |  |  |
|**applicationProfile** | **String** |  |  |
|**loggingProfile** | **String** |  |  |
|**accessControlProfile** | **String** |  |  |
|**signature** | **String** |  |  |
|**sourceGatewayPubkey** | **String** |  |  |
|**sourceGatewayDltSystem** | **String** |  |  |
|**recipientGatewayPubkey** | **String** |  |  |
|**recipientGatewayDltSystem** | **String** |  |  |
|**escrowType** | [**EscrowTypeEnum**](#EscrowTypeEnum) |  |  [optional] |
|**expiryTime** | **String** |  |  [optional] |
|**multipleClaimsAllowed** | **Boolean** |  |  [optional] |
|**multipleCancelsAllowed** | **Boolean** |  |  [optional] |
|**permissions** | **Object** |  |  [optional] |
|**origin** | **String** |  |  [optional] |
|**destination** | **String** |  |  [optional] |
|**subsequentCalls** | **Object** |  |  [optional] |
|**histories** | [**List&lt;History&gt;**](History.md) |  |  [optional] |
|**sequenceNumber** | **Integer** |  |  |
|**sourceBasePath** | **String** |  |  |
|**recipientBasePath** | **String** |  |  |
|**maxRetries** | **BigDecimal** |  |  |
|**maxTimeout** | **BigDecimal** |  |  |
|**backupGatewaysAllowed** | **List&lt;String&gt;** |  |  |
|**recipientLedgerAssetID** | **String** |  |  |
|**sourceLedgerAssetID** | **String** |  |  |



## Enum: EscrowTypeEnum

| Name | Value |
|---- | -----|
| FAUCET | &quot;FAUCET&quot; |
| TIMELOCK | &quot;TIMELOCK&quot; |
| HASHLOCK | &quot;HASHLOCK&quot; |
| HASHTIMELOCK | &quot;HASHTIMELOCK&quot; |
| MULTICLAIMPC | &quot;MULTICLAIMPC&quot; |
| DESTROY | &quot;DESTROY&quot; |
| BURN | &quot;BURN&quot; |



