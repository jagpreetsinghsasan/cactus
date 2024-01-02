# EvmTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Hash** | Pointer to **string** |  | [optional] 
**Nonce** | Pointer to **float32** |  | [optional] 
**BlockHash** | Pointer to **interface{}** |  | [optional] 
**BlockNumber** | Pointer to **interface{}** |  | [optional] 
**TransactionIndex** | Pointer to **interface{}** |  | [optional] 
**From** | Pointer to **string** |  | [optional] 
**To** | Pointer to **interface{}** |  | [optional] 
**Value** | Pointer to **string** |  | [optional] 
**GasPrice** | Pointer to **string** |  | [optional] 
**Gas** | Pointer to **float32** |  | [optional] 
**Input** | Pointer to **string** |  | [optional] 

## Methods

### NewEvmTransaction

`func NewEvmTransaction() *EvmTransaction`

NewEvmTransaction instantiates a new EvmTransaction object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvmTransactionWithDefaults

`func NewEvmTransactionWithDefaults() *EvmTransaction`

NewEvmTransactionWithDefaults instantiates a new EvmTransaction object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetHash

`func (o *EvmTransaction) GetHash() string`

GetHash returns the Hash field if non-nil, zero value otherwise.

### GetHashOk

`func (o *EvmTransaction) GetHashOk() (*string, bool)`

GetHashOk returns a tuple with the Hash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHash

`func (o *EvmTransaction) SetHash(v string)`

SetHash sets Hash field to given value.

### HasHash

`func (o *EvmTransaction) HasHash() bool`

HasHash returns a boolean if a field has been set.

### GetNonce

`func (o *EvmTransaction) GetNonce() float32`

GetNonce returns the Nonce field if non-nil, zero value otherwise.

### GetNonceOk

`func (o *EvmTransaction) GetNonceOk() (*float32, bool)`

GetNonceOk returns a tuple with the Nonce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonce

`func (o *EvmTransaction) SetNonce(v float32)`

SetNonce sets Nonce field to given value.

### HasNonce

`func (o *EvmTransaction) HasNonce() bool`

HasNonce returns a boolean if a field has been set.

### GetBlockHash

`func (o *EvmTransaction) GetBlockHash() interface{}`

GetBlockHash returns the BlockHash field if non-nil, zero value otherwise.

### GetBlockHashOk

`func (o *EvmTransaction) GetBlockHashOk() (*interface{}, bool)`

GetBlockHashOk returns a tuple with the BlockHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockHash

`func (o *EvmTransaction) SetBlockHash(v interface{})`

SetBlockHash sets BlockHash field to given value.

### HasBlockHash

`func (o *EvmTransaction) HasBlockHash() bool`

HasBlockHash returns a boolean if a field has been set.

### SetBlockHashNil

`func (o *EvmTransaction) SetBlockHashNil(b bool)`

 SetBlockHashNil sets the value for BlockHash to be an explicit nil

### UnsetBlockHash
`func (o *EvmTransaction) UnsetBlockHash()`

UnsetBlockHash ensures that no value is present for BlockHash, not even an explicit nil
### GetBlockNumber

`func (o *EvmTransaction) GetBlockNumber() interface{}`

GetBlockNumber returns the BlockNumber field if non-nil, zero value otherwise.

### GetBlockNumberOk

`func (o *EvmTransaction) GetBlockNumberOk() (*interface{}, bool)`

GetBlockNumberOk returns a tuple with the BlockNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockNumber

`func (o *EvmTransaction) SetBlockNumber(v interface{})`

SetBlockNumber sets BlockNumber field to given value.

### HasBlockNumber

`func (o *EvmTransaction) HasBlockNumber() bool`

HasBlockNumber returns a boolean if a field has been set.

### SetBlockNumberNil

`func (o *EvmTransaction) SetBlockNumberNil(b bool)`

 SetBlockNumberNil sets the value for BlockNumber to be an explicit nil

### UnsetBlockNumber
`func (o *EvmTransaction) UnsetBlockNumber()`

UnsetBlockNumber ensures that no value is present for BlockNumber, not even an explicit nil
### GetTransactionIndex

`func (o *EvmTransaction) GetTransactionIndex() interface{}`

GetTransactionIndex returns the TransactionIndex field if non-nil, zero value otherwise.

### GetTransactionIndexOk

`func (o *EvmTransaction) GetTransactionIndexOk() (*interface{}, bool)`

GetTransactionIndexOk returns a tuple with the TransactionIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionIndex

`func (o *EvmTransaction) SetTransactionIndex(v interface{})`

SetTransactionIndex sets TransactionIndex field to given value.

### HasTransactionIndex

`func (o *EvmTransaction) HasTransactionIndex() bool`

HasTransactionIndex returns a boolean if a field has been set.

### SetTransactionIndexNil

`func (o *EvmTransaction) SetTransactionIndexNil(b bool)`

 SetTransactionIndexNil sets the value for TransactionIndex to be an explicit nil

### UnsetTransactionIndex
`func (o *EvmTransaction) UnsetTransactionIndex()`

UnsetTransactionIndex ensures that no value is present for TransactionIndex, not even an explicit nil
### GetFrom

`func (o *EvmTransaction) GetFrom() string`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *EvmTransaction) GetFromOk() (*string, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *EvmTransaction) SetFrom(v string)`

SetFrom sets From field to given value.

### HasFrom

`func (o *EvmTransaction) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetTo

`func (o *EvmTransaction) GetTo() interface{}`

GetTo returns the To field if non-nil, zero value otherwise.

### GetToOk

`func (o *EvmTransaction) GetToOk() (*interface{}, bool)`

GetToOk returns a tuple with the To field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTo

`func (o *EvmTransaction) SetTo(v interface{})`

SetTo sets To field to given value.

### HasTo

`func (o *EvmTransaction) HasTo() bool`

HasTo returns a boolean if a field has been set.

### SetToNil

`func (o *EvmTransaction) SetToNil(b bool)`

 SetToNil sets the value for To to be an explicit nil

### UnsetTo
`func (o *EvmTransaction) UnsetTo()`

UnsetTo ensures that no value is present for To, not even an explicit nil
### GetValue

`func (o *EvmTransaction) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *EvmTransaction) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *EvmTransaction) SetValue(v string)`

SetValue sets Value field to given value.

### HasValue

`func (o *EvmTransaction) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetGasPrice

`func (o *EvmTransaction) GetGasPrice() string`

GetGasPrice returns the GasPrice field if non-nil, zero value otherwise.

### GetGasPriceOk

`func (o *EvmTransaction) GetGasPriceOk() (*string, bool)`

GetGasPriceOk returns a tuple with the GasPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasPrice

`func (o *EvmTransaction) SetGasPrice(v string)`

SetGasPrice sets GasPrice field to given value.

### HasGasPrice

`func (o *EvmTransaction) HasGasPrice() bool`

HasGasPrice returns a boolean if a field has been set.

### GetGas

`func (o *EvmTransaction) GetGas() float32`

GetGas returns the Gas field if non-nil, zero value otherwise.

### GetGasOk

`func (o *EvmTransaction) GetGasOk() (*float32, bool)`

GetGasOk returns a tuple with the Gas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGas

`func (o *EvmTransaction) SetGas(v float32)`

SetGas sets Gas field to given value.

### HasGas

`func (o *EvmTransaction) HasGas() bool`

HasGas returns a boolean if a field has been set.

### GetInput

`func (o *EvmTransaction) GetInput() string`

GetInput returns the Input field if non-nil, zero value otherwise.

### GetInputOk

`func (o *EvmTransaction) GetInputOk() (*string, bool)`

GetInputOk returns a tuple with the Input field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInput

`func (o *EvmTransaction) SetInput(v string)`

SetInput sets Input field to given value.

### HasInput

`func (o *EvmTransaction) HasInput() bool`

HasInput returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


