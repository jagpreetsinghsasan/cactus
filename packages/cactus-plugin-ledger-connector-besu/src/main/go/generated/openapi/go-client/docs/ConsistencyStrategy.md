# ConsistencyStrategy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReceiptType** | [**ReceiptType**](ReceiptType.md) |  | 
**TimeoutMs** | Pointer to **int32** | The amount of milliseconds to wait for the receipt to arrive to the connector. Defaults to 0 which means to wait for an unlimited amount of time. Note that this wait may be interrupted still by other parts of the infrastructure such as load balancers cutting of HTTP requests after some time even if they are the type that is supposed to be kept alive. The question of re-entrance is a broader topic not in scope to discuss here, but it is important to mention it. | [optional] 
**BlockConfirmations** | **int32** | The number of blocks to wait to be confirmed in addition to the block containing the transaction in question. Note that if the receipt type is set to only wait for node transaction pool ACK and this parameter is set to anything, but zero then the API will not accept the request due to conflicting parameters. | 

## Methods

### NewConsistencyStrategy

`func NewConsistencyStrategy(receiptType ReceiptType, blockConfirmations int32, ) *ConsistencyStrategy`

NewConsistencyStrategy instantiates a new ConsistencyStrategy object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConsistencyStrategyWithDefaults

`func NewConsistencyStrategyWithDefaults() *ConsistencyStrategy`

NewConsistencyStrategyWithDefaults instantiates a new ConsistencyStrategy object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetReceiptType

`func (o *ConsistencyStrategy) GetReceiptType() ReceiptType`

GetReceiptType returns the ReceiptType field if non-nil, zero value otherwise.

### GetReceiptTypeOk

`func (o *ConsistencyStrategy) GetReceiptTypeOk() (*ReceiptType, bool)`

GetReceiptTypeOk returns a tuple with the ReceiptType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceiptType

`func (o *ConsistencyStrategy) SetReceiptType(v ReceiptType)`

SetReceiptType sets ReceiptType field to given value.


### GetTimeoutMs

`func (o *ConsistencyStrategy) GetTimeoutMs() int32`

GetTimeoutMs returns the TimeoutMs field if non-nil, zero value otherwise.

### GetTimeoutMsOk

`func (o *ConsistencyStrategy) GetTimeoutMsOk() (*int32, bool)`

GetTimeoutMsOk returns a tuple with the TimeoutMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeoutMs

`func (o *ConsistencyStrategy) SetTimeoutMs(v int32)`

SetTimeoutMs sets TimeoutMs field to given value.

### HasTimeoutMs

`func (o *ConsistencyStrategy) HasTimeoutMs() bool`

HasTimeoutMs returns a boolean if a field has been set.

### GetBlockConfirmations

`func (o *ConsistencyStrategy) GetBlockConfirmations() int32`

GetBlockConfirmations returns the BlockConfirmations field if non-nil, zero value otherwise.

### GetBlockConfirmationsOk

`func (o *ConsistencyStrategy) GetBlockConfirmationsOk() (*int32, bool)`

GetBlockConfirmationsOk returns a tuple with the BlockConfirmations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockConfirmations

`func (o *ConsistencyStrategy) SetBlockConfirmations(v int32)`

SetBlockConfirmations sets BlockConfirmations field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


