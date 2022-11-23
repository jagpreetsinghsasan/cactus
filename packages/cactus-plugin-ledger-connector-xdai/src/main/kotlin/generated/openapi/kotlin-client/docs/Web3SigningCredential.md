
# Web3SigningCredential

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**Web3SigningCredentialType**](Web3SigningCredentialType.md) |  | 
**ethAccount** | **kotlin.String** | The ethereum account (public key) that the credential belongs to. Basically the username in the traditional terminology of authentication. | 
**keychainEntryKey** | **kotlin.String** | The key to use when looking up the the keychain entry holding the secret pointed to by the  keychainEntryKey parameter. | 
**keychainId** | **kotlin.String** | The keychain ID to use when looking up the the keychain plugin instance that will be used to retrieve the secret pointed to by the keychainEntryKey parameter. | 
**secret** | **kotlin.String** | The HEX encoded private key of an eth account. | 



