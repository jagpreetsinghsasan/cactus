# Web3BlockHeader

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Number** | **float32** |  | 
**Hash** | **string** |  | 
**ParentHash** | **string** |  | 
**Nonce** | **string** |  | 
**Sha3Uncles** | **string** |  | 
**LogsBloom** | **string** |  | 
**TransactionRoot** | **string** |  | 
**StateRoot** | **string** |  | 
**ReceiptRoot** | **string** |  | 
**Miner** | **string** |  | 
**ExtraData** | **string** |  | 
**GasLimit** | **int32** |  | 
**GasUsed** | **int32** |  | 
**Timestamp** | [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  | 

## Methods

### NewWeb3BlockHeader

`func NewWeb3BlockHeader(number float32, hash string, parentHash string, nonce string, sha3Uncles string, logsBloom string, transactionRoot string, stateRoot string, receiptRoot string, miner string, extraData string, gasLimit int32, gasUsed int32, timestamp Web3BlockHeaderTimestamp, ) *Web3BlockHeader`

NewWeb3BlockHeader instantiates a new Web3BlockHeader object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewWeb3BlockHeaderWithDefaults

`func NewWeb3BlockHeaderWithDefaults() *Web3BlockHeader`

NewWeb3BlockHeaderWithDefaults instantiates a new Web3BlockHeader object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNumber

`func (o *Web3BlockHeader) GetNumber() float32`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *Web3BlockHeader) GetNumberOk() (*float32, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *Web3BlockHeader) SetNumber(v float32)`

SetNumber sets Number field to given value.


### GetHash

`func (o *Web3BlockHeader) GetHash() string`

GetHash returns the Hash field if non-nil, zero value otherwise.

### GetHashOk

`func (o *Web3BlockHeader) GetHashOk() (*string, bool)`

GetHashOk returns a tuple with the Hash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHash

`func (o *Web3BlockHeader) SetHash(v string)`

SetHash sets Hash field to given value.


### GetParentHash

`func (o *Web3BlockHeader) GetParentHash() string`

GetParentHash returns the ParentHash field if non-nil, zero value otherwise.

### GetParentHashOk

`func (o *Web3BlockHeader) GetParentHashOk() (*string, bool)`

GetParentHashOk returns a tuple with the ParentHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentHash

`func (o *Web3BlockHeader) SetParentHash(v string)`

SetParentHash sets ParentHash field to given value.


### GetNonce

`func (o *Web3BlockHeader) GetNonce() string`

GetNonce returns the Nonce field if non-nil, zero value otherwise.

### GetNonceOk

`func (o *Web3BlockHeader) GetNonceOk() (*string, bool)`

GetNonceOk returns a tuple with the Nonce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonce

`func (o *Web3BlockHeader) SetNonce(v string)`

SetNonce sets Nonce field to given value.


### GetSha3Uncles

`func (o *Web3BlockHeader) GetSha3Uncles() string`

GetSha3Uncles returns the Sha3Uncles field if non-nil, zero value otherwise.

### GetSha3UnclesOk

`func (o *Web3BlockHeader) GetSha3UnclesOk() (*string, bool)`

GetSha3UnclesOk returns a tuple with the Sha3Uncles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSha3Uncles

`func (o *Web3BlockHeader) SetSha3Uncles(v string)`

SetSha3Uncles sets Sha3Uncles field to given value.


### GetLogsBloom

`func (o *Web3BlockHeader) GetLogsBloom() string`

GetLogsBloom returns the LogsBloom field if non-nil, zero value otherwise.

### GetLogsBloomOk

`func (o *Web3BlockHeader) GetLogsBloomOk() (*string, bool)`

GetLogsBloomOk returns a tuple with the LogsBloom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogsBloom

`func (o *Web3BlockHeader) SetLogsBloom(v string)`

SetLogsBloom sets LogsBloom field to given value.


### GetTransactionRoot

`func (o *Web3BlockHeader) GetTransactionRoot() string`

GetTransactionRoot returns the TransactionRoot field if non-nil, zero value otherwise.

### GetTransactionRootOk

`func (o *Web3BlockHeader) GetTransactionRootOk() (*string, bool)`

GetTransactionRootOk returns a tuple with the TransactionRoot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionRoot

`func (o *Web3BlockHeader) SetTransactionRoot(v string)`

SetTransactionRoot sets TransactionRoot field to given value.


### GetStateRoot

`func (o *Web3BlockHeader) GetStateRoot() string`

GetStateRoot returns the StateRoot field if non-nil, zero value otherwise.

### GetStateRootOk

`func (o *Web3BlockHeader) GetStateRootOk() (*string, bool)`

GetStateRootOk returns a tuple with the StateRoot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStateRoot

`func (o *Web3BlockHeader) SetStateRoot(v string)`

SetStateRoot sets StateRoot field to given value.


### GetReceiptRoot

`func (o *Web3BlockHeader) GetReceiptRoot() string`

GetReceiptRoot returns the ReceiptRoot field if non-nil, zero value otherwise.

### GetReceiptRootOk

`func (o *Web3BlockHeader) GetReceiptRootOk() (*string, bool)`

GetReceiptRootOk returns a tuple with the ReceiptRoot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReceiptRoot

`func (o *Web3BlockHeader) SetReceiptRoot(v string)`

SetReceiptRoot sets ReceiptRoot field to given value.


### GetMiner

`func (o *Web3BlockHeader) GetMiner() string`

GetMiner returns the Miner field if non-nil, zero value otherwise.

### GetMinerOk

`func (o *Web3BlockHeader) GetMinerOk() (*string, bool)`

GetMinerOk returns a tuple with the Miner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMiner

`func (o *Web3BlockHeader) SetMiner(v string)`

SetMiner sets Miner field to given value.


### GetExtraData

`func (o *Web3BlockHeader) GetExtraData() string`

GetExtraData returns the ExtraData field if non-nil, zero value otherwise.

### GetExtraDataOk

`func (o *Web3BlockHeader) GetExtraDataOk() (*string, bool)`

GetExtraDataOk returns a tuple with the ExtraData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtraData

`func (o *Web3BlockHeader) SetExtraData(v string)`

SetExtraData sets ExtraData field to given value.


### GetGasLimit

`func (o *Web3BlockHeader) GetGasLimit() int32`

GetGasLimit returns the GasLimit field if non-nil, zero value otherwise.

### GetGasLimitOk

`func (o *Web3BlockHeader) GetGasLimitOk() (*int32, bool)`

GetGasLimitOk returns a tuple with the GasLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasLimit

`func (o *Web3BlockHeader) SetGasLimit(v int32)`

SetGasLimit sets GasLimit field to given value.


### GetGasUsed

`func (o *Web3BlockHeader) GetGasUsed() int32`

GetGasUsed returns the GasUsed field if non-nil, zero value otherwise.

### GetGasUsedOk

`func (o *Web3BlockHeader) GetGasUsedOk() (*int32, bool)`

GetGasUsedOk returns a tuple with the GasUsed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasUsed

`func (o *Web3BlockHeader) SetGasUsed(v int32)`

SetGasUsed sets GasUsed field to given value.


### GetTimestamp

`func (o *Web3BlockHeader) GetTimestamp() Web3BlockHeaderTimestamp`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *Web3BlockHeader) GetTimestampOk() (*Web3BlockHeaderTimestamp, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *Web3BlockHeader) SetTimestamp(v Web3BlockHeaderTimestamp)`

SetTimestamp sets Timestamp field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


