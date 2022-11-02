
# OdapMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sequenceNumber** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**phase** | [**inline**](#PhaseEnum) |  |  [optional]
**resourceURL** | **kotlin.String** |  |  [optional]
**developerURN** | **kotlin.String** |  |  [optional]
**actionResponse** | [**OdapMessageActionResponse**](OdapMessageActionResponse.md) |  |  [optional]
**credentialProfile** | [**inline**](#CredentialProfileEnum) |  |  [optional]
**credentialBlock** | [**kotlin.collections.List&lt;AnyType&gt;**](AnyType.md) |  |  [optional]
**credentialsProfile** | [**PayloadProfile**](PayloadProfile.md) |  |  [optional]
**applicationProfile** | [**kotlin.Any**](.md) |  |  [optional]
**payload** | [**kotlin.Any**](.md) |  |  [optional]
**payloadHash** | **kotlin.String** |  |  [optional]
**messageSignature** | **kotlin.String** |  |  [optional]


<a name="PhaseEnum"></a>
## Enum: Phase
Name | Value
---- | -----
phase | TransferInitialization, LockEvidenceVerification, CommitmentEstablishment


<a name="CredentialProfileEnum"></a>
## Enum: CredentialProfile
Name | Value
---- | -----
credentialProfile | SAML, OAuth, X509



