

# Web3SigningCredential


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **Web3SigningCredentialType** |  |  |
|**ethAccount** | **String** | The ethereum account (public key) that the credential belongs to. Basically the username in the traditional terminology of authentication. |  |
|**keychainEntryKey** | **String** | The key to use when looking up the the keychain entry holding the secret pointed to by the  keychainEntryKey parameter. |  |
|**keychainId** | **String** | The keychain ID to use when looking up the the keychain plugin instance that will be used to retrieve the secret pointed to by the keychainEntryKey parameter. |  |
|**secret** | **String** | The HEX encoded private key of an eth account. |  |



