# Web3TransactionReceipt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **bool** |  | 
**TransactionHash** | **string** |  | 
**TransactionIndex** | **float32** |  | 
**BlockHash** | **string** |  | 
**BlockNumber** | **float32** |  | 
**GasUsed** | **float32** |  | 
**ContractAddress** | Pointer to **NullableString** |  | [optional] 
**From** | **string** |  | 
**To** | **string** |  | 

## Methods

### NewWeb3TransactionReceipt

`func NewWeb3TransactionReceipt(status bool, transactionHash string, transactionIndex float32, blockHash string, blockNumber float32, gasUsed float32, from string, to string, ) *Web3TransactionReceipt`

NewWeb3TransactionReceipt instantiates a new Web3TransactionReceipt object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWeb3TransactionReceiptWithDefaults

`func NewWeb3TransactionReceiptWithDefaults() *Web3TransactionReceipt`

NewWeb3TransactionReceiptWithDefaults instantiates a new Web3TransactionReceipt object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStatus

`func (o *Web3TransactionReceipt) GetStatus() bool`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *Web3TransactionReceipt) GetStatusOk() (*bool, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *Web3TransactionReceipt) SetStatus(v bool)`

SetStatus sets Status field to given value.


### GetTransactionHash

`func (o *Web3TransactionReceipt) GetTransactionHash() string`

GetTransactionHash returns the TransactionHash field if non-nil, zero value otherwise.

### GetTransactionHashOk

`func (o *Web3TransactionReceipt) GetTransactionHashOk() (*string, bool)`

GetTransactionHashOk returns a tuple with the TransactionHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionHash

`func (o *Web3TransactionReceipt) SetTransactionHash(v string)`

SetTransactionHash sets TransactionHash field to given value.


### GetTransactionIndex

`func (o *Web3TransactionReceipt) GetTransactionIndex() float32`

GetTransactionIndex returns the TransactionIndex field if non-nil, zero value otherwise.

### GetTransactionIndexOk

`func (o *Web3TransactionReceipt) GetTransactionIndexOk() (*float32, bool)`

GetTransactionIndexOk returns a tuple with the TransactionIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionIndex

`func (o *Web3TransactionReceipt) SetTransactionIndex(v float32)`

SetTransactionIndex sets TransactionIndex field to given value.


### GetBlockHash

`func (o *Web3TransactionReceipt) GetBlockHash() string`

GetBlockHash returns the BlockHash field if non-nil, zero value otherwise.

### GetBlockHashOk

`func (o *Web3TransactionReceipt) GetBlockHashOk() (*string, bool)`

GetBlockHashOk returns a tuple with the BlockHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockHash

`func (o *Web3TransactionReceipt) SetBlockHash(v string)`

SetBlockHash sets BlockHash field to given value.


### GetBlockNumber

`func (o *Web3TransactionReceipt) GetBlockNumber() float32`

GetBlockNumber returns the BlockNumber field if non-nil, zero value otherwise.

### GetBlockNumberOk

`func (o *Web3TransactionReceipt) GetBlockNumberOk() (*float32, bool)`

GetBlockNumberOk returns a tuple with the BlockNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockNumber

`func (o *Web3TransactionReceipt) SetBlockNumber(v float32)`

SetBlockNumber sets BlockNumber field to given value.


### GetGasUsed

`func (o *Web3TransactionReceipt) GetGasUsed() float32`

GetGasUsed returns the GasUsed field if non-nil, zero value otherwise.

### GetGasUsedOk

`func (o *Web3TransactionReceipt) GetGasUsedOk() (*float32, bool)`

GetGasUsedOk returns a tuple with the GasUsed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasUsed

`func (o *Web3TransactionReceipt) SetGasUsed(v float32)`

SetGasUsed sets GasUsed field to given value.


### GetContractAddress

`func (o *Web3TransactionReceipt) GetContractAddress() string`

GetContractAddress returns the ContractAddress field if non-nil, zero value otherwise.

### GetContractAddressOk

`func (o *Web3TransactionReceipt) GetContractAddressOk() (*string, bool)`

GetContractAddressOk returns a tuple with the ContractAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContractAddress

`func (o *Web3TransactionReceipt) SetContractAddress(v string)`

SetContractAddress sets ContractAddress field to given value.

### HasContractAddress

`func (o *Web3TransactionReceipt) HasContractAddress() bool`

HasContractAddress returns a boolean if a field has been set.

### SetContractAddressNil

`func (o *Web3TransactionReceipt) SetContractAddressNil(b bool)`

 SetContractAddressNil sets the value for ContractAddress to be an explicit nil

### UnsetContractAddress
`func (o *Web3TransactionReceipt) UnsetContractAddress()`

UnsetContractAddress ensures that no value is present for ContractAddress, not even an explicit nil
### GetFrom

`func (o *Web3TransactionReceipt) GetFrom() string`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *Web3TransactionReceipt) GetFromOk() (*string, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *Web3TransactionReceipt) SetFrom(v string)`

SetFrom sets From field to given value.


### GetTo

`func (o *Web3TransactionReceipt) GetTo() string`

GetTo returns the To field if non-nil, zero value otherwise.

### GetToOk

`func (o *Web3TransactionReceipt) GetToOk() (*string, bool)`

GetToOk returns a tuple with the To field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTo

`func (o *Web3TransactionReceipt) SetTo(v string)`

SetTo sets To field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


