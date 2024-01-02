# Web3SigningCredentialCactusKeychainRef

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**Web3SigningCredentialType**](Web3SigningCredentialType.md) |  | 
**EthAccount** | **string** | The ethereum account (public key) that the credential  belongs to. Basically the username in the traditional  terminology of authentication. | 
**KeychainEntryKey** | **string** | The key to use when looking up the the keychain entry holding the secret pointed to by the  keychainEntryKey parameter. | 
**KeychainId** | **string** | The keychain ID to use when looking up the the keychain plugin instance that will be used to retrieve the secret pointed to by the keychainEntryKey parameter. | 

## Methods

### NewWeb3SigningCredentialCactusKeychainRef

`func NewWeb3SigningCredentialCactusKeychainRef(type_ Web3SigningCredentialType, ethAccount string, keychainEntryKey string, keychainId string, ) *Web3SigningCredentialCactusKeychainRef`

NewWeb3SigningCredentialCactusKeychainRef instantiates a new Web3SigningCredentialCactusKeychainRef object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWeb3SigningCredentialCactusKeychainRefWithDefaults

`func NewWeb3SigningCredentialCactusKeychainRefWithDefaults() *Web3SigningCredentialCactusKeychainRef`

NewWeb3SigningCredentialCactusKeychainRefWithDefaults instantiates a new Web3SigningCredentialCactusKeychainRef object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *Web3SigningCredentialCactusKeychainRef) GetType() Web3SigningCredentialType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *Web3SigningCredentialCactusKeychainRef) GetTypeOk() (*Web3SigningCredentialType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *Web3SigningCredentialCactusKeychainRef) SetType(v Web3SigningCredentialType)`

SetType sets Type field to given value.


### GetEthAccount

`func (o *Web3SigningCredentialCactusKeychainRef) GetEthAccount() string`

GetEthAccount returns the EthAccount field if non-nil, zero value otherwise.

### GetEthAccountOk

`func (o *Web3SigningCredentialCactusKeychainRef) GetEthAccountOk() (*string, bool)`

GetEthAccountOk returns a tuple with the EthAccount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEthAccount

`func (o *Web3SigningCredentialCactusKeychainRef) SetEthAccount(v string)`

SetEthAccount sets EthAccount field to given value.


### GetKeychainEntryKey

`func (o *Web3SigningCredentialCactusKeychainRef) GetKeychainEntryKey() string`

GetKeychainEntryKey returns the KeychainEntryKey field if non-nil, zero value otherwise.

### GetKeychainEntryKeyOk

`func (o *Web3SigningCredentialCactusKeychainRef) GetKeychainEntryKeyOk() (*string, bool)`

GetKeychainEntryKeyOk returns a tuple with the KeychainEntryKey field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeychainEntryKey

`func (o *Web3SigningCredentialCactusKeychainRef) SetKeychainEntryKey(v string)`

SetKeychainEntryKey sets KeychainEntryKey field to given value.


### GetKeychainId

`func (o *Web3SigningCredentialCactusKeychainRef) GetKeychainId() string`

GetKeychainId returns the KeychainId field if non-nil, zero value otherwise.

### GetKeychainIdOk

`func (o *Web3SigningCredentialCactusKeychainRef) GetKeychainIdOk() (*string, bool)`

GetKeychainIdOk returns a tuple with the KeychainId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeychainId

`func (o *Web3SigningCredentialCactusKeychainRef) SetKeychainId(v string)`

SetKeychainId sets KeychainId field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


