
# OdapMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sequenceNumber** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**phase** | [**inline**](#Phase) |  |  [optional]
**resourceURL** | **kotlin.String** |  |  [optional]
**developerURN** | **kotlin.String** |  |  [optional]
**actionResponse** | [**OdapMessageActionResponse**](OdapMessageActionResponse.md) |  |  [optional]
**credentialProfile** | [**inline**](#CredentialProfile) |  |  [optional]
**credentialBlock** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**credentialsProfile** | [**PayloadProfile**](PayloadProfile.md) |  |  [optional]
**applicationProfile** | [**kotlin.Any**](.md) |  |  [optional]
**payload** | [**kotlin.Any**](.md) |  |  [optional]
**payloadHash** | **kotlin.String** |  |  [optional]
**messageSignature** | **kotlin.String** |  |  [optional]


<a name="Phase"></a>
## Enum: Phase
Name | Value
---- | -----
phase | TransferInitialization, LockEvidenceVerification, CommitmentEstablishment


<a name="CredentialProfile"></a>
## Enum: CredentialProfile
Name | Value
---- | -----
credentialProfile | SAML, OAuth, X509



