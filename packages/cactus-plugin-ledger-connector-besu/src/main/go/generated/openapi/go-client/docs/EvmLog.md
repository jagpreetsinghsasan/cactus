# EvmLog

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | **string** |  | 
**Data** | **string** |  | 
**BlockHash** | **string** |  | 
**TransactionHash** | **string** |  | 
**Topics** | **[]string** |  | 
**LogIndex** | **float32** |  | 
**TransactionIndex** | **float32** |  | 
**BlockNumber** | **float32** |  | 

## Methods

### NewEvmLog

`func NewEvmLog(address string, data string, blockHash string, transactionHash string, topics []string, logIndex float32, transactionIndex float32, blockNumber float32, ) *EvmLog`

NewEvmLog instantiates a new EvmLog object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvmLogWithDefaults

`func NewEvmLogWithDefaults() *EvmLog`

NewEvmLogWithDefaults instantiates a new EvmLog object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *EvmLog) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *EvmLog) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *EvmLog) SetAddress(v string)`

SetAddress sets Address field to given value.


### GetData

`func (o *EvmLog) GetData() string`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *EvmLog) GetDataOk() (*string, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *EvmLog) SetData(v string)`

SetData sets Data field to given value.


### GetBlockHash

`func (o *EvmLog) GetBlockHash() string`

GetBlockHash returns the BlockHash field if non-nil, zero value otherwise.

### GetBlockHashOk

`func (o *EvmLog) GetBlockHashOk() (*string, bool)`

GetBlockHashOk returns a tuple with the BlockHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockHash

`func (o *EvmLog) SetBlockHash(v string)`

SetBlockHash sets BlockHash field to given value.


### GetTransactionHash

`func (o *EvmLog) GetTransactionHash() string`

GetTransactionHash returns the TransactionHash field if non-nil, zero value otherwise.

### GetTransactionHashOk

`func (o *EvmLog) GetTransactionHashOk() (*string, bool)`

GetTransactionHashOk returns a tuple with the TransactionHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionHash

`func (o *EvmLog) SetTransactionHash(v string)`

SetTransactionHash sets TransactionHash field to given value.


### GetTopics

`func (o *EvmLog) GetTopics() []string`

GetTopics returns the Topics field if non-nil, zero value otherwise.

### GetTopicsOk

`func (o *EvmLog) GetTopicsOk() (*[]string, bool)`

GetTopicsOk returns a tuple with the Topics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopics

`func (o *EvmLog) SetTopics(v []string)`

SetTopics sets Topics field to given value.


### GetLogIndex

`func (o *EvmLog) GetLogIndex() float32`

GetLogIndex returns the LogIndex field if non-nil, zero value otherwise.

### GetLogIndexOk

`func (o *EvmLog) GetLogIndexOk() (*float32, bool)`

GetLogIndexOk returns a tuple with the LogIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogIndex

`func (o *EvmLog) SetLogIndex(v float32)`

SetLogIndex sets LogIndex field to given value.


### GetTransactionIndex

`func (o *EvmLog) GetTransactionIndex() float32`

GetTransactionIndex returns the TransactionIndex field if non-nil, zero value otherwise.

### GetTransactionIndexOk

`func (o *EvmLog) GetTransactionIndexOk() (*float32, bool)`

GetTransactionIndexOk returns a tuple with the TransactionIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionIndex

`func (o *EvmLog) SetTransactionIndex(v float32)`

SetTransactionIndex sets TransactionIndex field to given value.


### GetBlockNumber

`func (o *EvmLog) GetBlockNumber() float32`

GetBlockNumber returns the BlockNumber field if non-nil, zero value otherwise.

### GetBlockNumberOk

`func (o *EvmLog) GetBlockNumberOk() (*float32, bool)`

GetBlockNumberOk returns a tuple with the BlockNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockNumber

`func (o *EvmLog) SetBlockNumber(v float32)`

SetBlockNumber sets BlockNumber field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


