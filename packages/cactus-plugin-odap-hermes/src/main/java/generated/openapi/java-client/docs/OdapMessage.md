

# OdapMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sequenceNumber** | **BigDecimal** |  |  [optional] |
|**phase** | [**PhaseEnum**](#PhaseEnum) |  |  [optional] |
|**resourceURL** | **String** |  |  [optional] |
|**developerURN** | **String** |  |  [optional] |
|**actionResponse** | [**OdapMessageActionResponse**](OdapMessageActionResponse.md) |  |  [optional] |
|**credentialProfile** | [**CredentialProfileEnum**](#CredentialProfileEnum) |  |  [optional] |
|**credentialBlock** | **List&lt;Object&gt;** |  |  [optional] |
|**credentialsProfile** | [**PayloadProfile**](PayloadProfile.md) |  |  [optional] |
|**applicationProfile** | **Object** |  |  [optional] |
|**payload** | **Object** |  |  [optional] |
|**payloadHash** | **String** |  |  [optional] |
|**messageSignature** | **String** |  |  [optional] |



## Enum: PhaseEnum

| Name | Value |
|---- | -----|
| TRANSFERINITIALIZATION | &quot;TransferInitialization&quot; |
| LOCKEVIDENCEVERIFICATION | &quot;LockEvidenceVerification&quot; |
| COMMITMENTESTABLISHMENT | &quot;CommitmentEstablishment&quot; |



## Enum: CredentialProfileEnum

| Name | Value |
|---- | -----|
| SAML | &quot;SAML&quot; |
| OAUTH | &quot;OAuth&quot; |
| X509 | &quot;X509&quot; |



