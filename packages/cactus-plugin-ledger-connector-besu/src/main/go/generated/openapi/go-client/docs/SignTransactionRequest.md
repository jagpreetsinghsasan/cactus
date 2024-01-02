# SignTransactionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**KeychainId** | **string** |  | 
**KeychainRef** | **string** |  | 
**TransactionHash** | **string** | The transaction hash of ledger will be used to fetch the contain. | 

## Methods

### NewSignTransactionRequest

`func NewSignTransactionRequest(keychainId string, keychainRef string, transactionHash string, ) *SignTransactionRequest`

NewSignTransactionRequest instantiates a new SignTransactionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSignTransactionRequestWithDefaults

`func NewSignTransactionRequestWithDefaults() *SignTransactionRequest`

NewSignTransactionRequestWithDefaults instantiates a new SignTransactionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKeychainId

`func (o *SignTransactionRequest) GetKeychainId() string`

GetKeychainId returns the KeychainId field if non-nil, zero value otherwise.

### GetKeychainIdOk

`func (o *SignTransactionRequest) GetKeychainIdOk() (*string, bool)`

GetKeychainIdOk returns a tuple with the KeychainId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeychainId

`func (o *SignTransactionRequest) SetKeychainId(v string)`

SetKeychainId sets KeychainId field to given value.


### GetKeychainRef

`func (o *SignTransactionRequest) GetKeychainRef() string`

GetKeychainRef returns the KeychainRef field if non-nil, zero value otherwise.

### GetKeychainRefOk

`func (o *SignTransactionRequest) GetKeychainRefOk() (*string, bool)`

GetKeychainRefOk returns a tuple with the KeychainRef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeychainRef

`func (o *SignTransactionRequest) SetKeychainRef(v string)`

SetKeychainRef sets KeychainRef field to given value.


### GetTransactionHash

`func (o *SignTransactionRequest) GetTransactionHash() string`

GetTransactionHash returns the TransactionHash field if non-nil, zero value otherwise.

### GetTransactionHashOk

`func (o *SignTransactionRequest) GetTransactionHashOk() (*string, bool)`

GetTransactionHashOk returns a tuple with the TransactionHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionHash

`func (o *SignTransactionRequest) SetTransactionHash(v string)`

SetTransactionHash sets TransactionHash field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


