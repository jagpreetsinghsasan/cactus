

# TransferInitializationV1Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageType** | **String** |  |  |
|**sessionID** | **String** |  |  |
|**sequenceNumber** | **BigDecimal** |  |  |
|**odapPhase** | [**OdapPhaseEnum**](#OdapPhaseEnum) |  |  [optional] |
|**initialRequestMessageHash** | **String** |  |  |
|**destination** | **String** |  |  [optional] |
|**timeStamp** | **String** |  |  |
|**processedTimeStamp** | **String** |  |  |
|**serverIdentityPubkey** | **String** |  |  |
|**signature** | **String** |  |  |
|**backupGatewaysAllowed** | **List&lt;String&gt;** |  |  |



## Enum: OdapPhaseEnum

| Name | Value |
|---- | -----|
| TRANSFERINITIALIZATION | &quot;TransferInitialization&quot; |
| LOCKEVIDENCEVERIFICATION | &quot;LockEvidenceVerification&quot; |
| COMMITMENTESTABLISHMENT | &quot;CommitmentEstablishment&quot; |



