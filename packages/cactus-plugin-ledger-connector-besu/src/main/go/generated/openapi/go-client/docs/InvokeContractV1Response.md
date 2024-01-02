# InvokeContractV1Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TransactionReceipt** | Pointer to [**Web3TransactionReceipt**](Web3TransactionReceipt.md) |  | [optional] 
**CallOutput** | Pointer to **interface{}** |  | [optional] 
**Success** | **bool** |  | 

## Methods

### NewInvokeContractV1Response

`func NewInvokeContractV1Response(success bool, ) *InvokeContractV1Response`

NewInvokeContractV1Response instantiates a new InvokeContractV1Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInvokeContractV1ResponseWithDefaults

`func NewInvokeContractV1ResponseWithDefaults() *InvokeContractV1Response`

NewInvokeContractV1ResponseWithDefaults instantiates a new InvokeContractV1Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTransactionReceipt

`func (o *InvokeContractV1Response) GetTransactionReceipt() Web3TransactionReceipt`

GetTransactionReceipt returns the TransactionReceipt field if non-nil, zero value otherwise.

### GetTransactionReceiptOk

`func (o *InvokeContractV1Response) GetTransactionReceiptOk() (*Web3TransactionReceipt, bool)`

GetTransactionReceiptOk returns a tuple with the TransactionReceipt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionReceipt

`func (o *InvokeContractV1Response) SetTransactionReceipt(v Web3TransactionReceipt)`

SetTransactionReceipt sets TransactionReceipt field to given value.

### HasTransactionReceipt

`func (o *InvokeContractV1Response) HasTransactionReceipt() bool`

HasTransactionReceipt returns a boolean if a field has been set.

### GetCallOutput

`func (o *InvokeContractV1Response) GetCallOutput() interface{}`

GetCallOutput returns the CallOutput field if non-nil, zero value otherwise.

### GetCallOutputOk

`func (o *InvokeContractV1Response) GetCallOutputOk() (*interface{}, bool)`

GetCallOutputOk returns a tuple with the CallOutput field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallOutput

`func (o *InvokeContractV1Response) SetCallOutput(v interface{})`

SetCallOutput sets CallOutput field to given value.

### HasCallOutput

`func (o *InvokeContractV1Response) HasCallOutput() bool`

HasCallOutput returns a boolean if a field has been set.

### SetCallOutputNil

`func (o *InvokeContractV1Response) SetCallOutputNil(b bool)`

 SetCallOutputNil sets the value for CallOutput to be an explicit nil

### UnsetCallOutput
`func (o *InvokeContractV1Response) UnsetCallOutput()`

UnsetCallOutput ensures that no value is present for CallOutput, not even an explicit nil
### GetSuccess

`func (o *InvokeContractV1Response) GetSuccess() bool`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *InvokeContractV1Response) GetSuccessOk() (*bool, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *InvokeContractV1Response) SetSuccess(v bool)`

SetSuccess sets Success field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


