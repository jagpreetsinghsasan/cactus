# GetTransactionV1Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Transaction** | [**EvmTransaction**](EvmTransaction.md) |  | 

## Methods

### NewGetTransactionV1Response

`func NewGetTransactionV1Response(transaction EvmTransaction, ) *GetTransactionV1Response`

NewGetTransactionV1Response instantiates a new GetTransactionV1Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetTransactionV1ResponseWithDefaults

`func NewGetTransactionV1ResponseWithDefaults() *GetTransactionV1Response`

NewGetTransactionV1ResponseWithDefaults instantiates a new GetTransactionV1Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTransaction

`func (o *GetTransactionV1Response) GetTransaction() EvmTransaction`

GetTransaction returns the Transaction field if non-nil, zero value otherwise.

### GetTransactionOk

`func (o *GetTransactionV1Response) GetTransactionOk() (*EvmTransaction, bool)`

GetTransactionOk returns a tuple with the Transaction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransaction

`func (o *GetTransactionV1Response) SetTransaction(v EvmTransaction)`

SetTransaction sets Transaction field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


