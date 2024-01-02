# Web3SigningCredentialPrivateKeyHex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**Web3SigningCredentialType**](Web3SigningCredentialType.md) |  | 
**EthAccount** | **string** | The ethereum account (public key) that the credential belongs to. Basically the username in the traditional terminology of authentication. | 
**Secret** | **string** | The HEX encoded private key of an eth account. | 

## Methods

### NewWeb3SigningCredentialPrivateKeyHex

`func NewWeb3SigningCredentialPrivateKeyHex(type_ Web3SigningCredentialType, ethAccount string, secret string, ) *Web3SigningCredentialPrivateKeyHex`

NewWeb3SigningCredentialPrivateKeyHex instantiates a new Web3SigningCredentialPrivateKeyHex object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWeb3SigningCredentialPrivateKeyHexWithDefaults

`func NewWeb3SigningCredentialPrivateKeyHexWithDefaults() *Web3SigningCredentialPrivateKeyHex`

NewWeb3SigningCredentialPrivateKeyHexWithDefaults instantiates a new Web3SigningCredentialPrivateKeyHex object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *Web3SigningCredentialPrivateKeyHex) GetType() Web3SigningCredentialType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Web3SigningCredentialPrivateKeyHex) GetTypeOk() (*Web3SigningCredentialType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Web3SigningCredentialPrivateKeyHex) SetType(v Web3SigningCredentialType)`

SetType sets Type field to given value.


### GetEthAccount

`func (o *Web3SigningCredentialPrivateKeyHex) GetEthAccount() string`

GetEthAccount returns the EthAccount field if non-nil, zero value otherwise.

### GetEthAccountOk

`func (o *Web3SigningCredentialPrivateKeyHex) GetEthAccountOk() (*string, bool)`

GetEthAccountOk returns a tuple with the EthAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEthAccount

`func (o *Web3SigningCredentialPrivateKeyHex) SetEthAccount(v string)`

SetEthAccount sets EthAccount field to given value.


### GetSecret

`func (o *Web3SigningCredentialPrivateKeyHex) GetSecret() string`

GetSecret returns the Secret field if non-nil, zero value otherwise.

### GetSecretOk

`func (o *Web3SigningCredentialPrivateKeyHex) GetSecretOk() (*string, bool)`

GetSecretOk returns a tuple with the Secret field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSecret

`func (o *Web3SigningCredentialPrivateKeyHex) SetSecret(v string)`

SetSecret sets Secret field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


