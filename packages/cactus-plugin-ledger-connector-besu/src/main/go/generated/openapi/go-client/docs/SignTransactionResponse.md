# SignTransactionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Signature** | **string** | The signatures of ledger from the corresponding transaction hash. | 

## Methods

### NewSignTransactionResponse

`func NewSignTransactionResponse(signature string, ) *SignTransactionResponse`

NewSignTransactionResponse instantiates a new SignTransactionResponse object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSignTransactionResponseWithDefaults

`func NewSignTransactionResponseWithDefaults() *SignTransactionResponse`

NewSignTransactionResponseWithDefaults instantiates a new SignTransactionResponse object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSignature

`func (o *SignTransactionResponse) GetSignature() string`

GetSignature returns the Signature field if non-nil, zero value otherwise.

### GetSignatureOk

`func (o *SignTransactionResponse) GetSignatureOk() (*string, bool)`

GetSignatureOk returns a tuple with the Signature field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSignature

`func (o *SignTransactionResponse) SetSignature(v string)`

SetSignature sets Signature field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


