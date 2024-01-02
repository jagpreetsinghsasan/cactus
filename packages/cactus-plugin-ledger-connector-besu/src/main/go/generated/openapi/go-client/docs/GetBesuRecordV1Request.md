# GetBesuRecordV1Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InvokeCall** | Pointer to [**InvokeContractV1Request**](InvokeContractV1Request.md) |  | [optional] 
**TransactionHash** | Pointer to **string** |  | [optional] 

## Methods

### NewGetBesuRecordV1Request

`func NewGetBesuRecordV1Request() *GetBesuRecordV1Request`

NewGetBesuRecordV1Request instantiates a new GetBesuRecordV1Request object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBesuRecordV1RequestWithDefaults

`func NewGetBesuRecordV1RequestWithDefaults() *GetBesuRecordV1Request`

NewGetBesuRecordV1RequestWithDefaults instantiates a new GetBesuRecordV1Request object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInvokeCall

`func (o *GetBesuRecordV1Request) GetInvokeCall() InvokeContractV1Request`

GetInvokeCall returns the InvokeCall field if non-nil, zero value otherwise.

### GetInvokeCallOk

`func (o *GetBesuRecordV1Request) GetInvokeCallOk() (*InvokeContractV1Request, bool)`

GetInvokeCallOk returns a tuple with the InvokeCall field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvokeCall

`func (o *GetBesuRecordV1Request) SetInvokeCall(v InvokeContractV1Request)`

SetInvokeCall sets InvokeCall field to given value.

### HasInvokeCall

`func (o *GetBesuRecordV1Request) HasInvokeCall() bool`

HasInvokeCall returns a boolean if a field has been set.

### GetTransactionHash

`func (o *GetBesuRecordV1Request) GetTransactionHash() string`

GetTransactionHash returns the TransactionHash field if non-nil, zero value otherwise.

### GetTransactionHashOk

`func (o *GetBesuRecordV1Request) GetTransactionHashOk() (*string, bool)`

GetTransactionHashOk returns a tuple with the TransactionHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionHash

`func (o *GetBesuRecordV1Request) SetTransactionHash(v string)`

SetTransactionHash sets TransactionHash field to given value.

### HasTransactionHash

`func (o *GetBesuRecordV1Request) HasTransactionHash() bool`

HasTransactionHash returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


