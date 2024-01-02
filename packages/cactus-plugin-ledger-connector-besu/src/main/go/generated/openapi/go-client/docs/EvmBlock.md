# EvmBlock

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Number** | Pointer to **float32** |  | [optional] 
**Hash** | Pointer to **string** |  | [optional] 
**ParentHash** | Pointer to **string** |  | [optional] 
**Nonce** | Pointer to **string** |  | [optional] 
**Sha3Uncles** | Pointer to **string** |  | [optional] 
**LogsBloom** | Pointer to **string** |  | [optional] 
**TransactionsRoot** | Pointer to **string** |  | [optional] 
**StateRoot** | Pointer to **string** |  | [optional] 
**Miner** | Pointer to **string** |  | [optional] 
**Difficulty** | Pointer to **float32** |  | [optional] 
**TotalDifficulty** | Pointer to **float32** |  | [optional] 
**ExtraData** | Pointer to **string** |  | [optional] 
**Size** | Pointer to **float32** |  | [optional] 
**GasLimit** | Pointer to **float32** |  | [optional] 
**GasUsed** | Pointer to **float32** |  | [optional] 
**Timestamp** | Pointer to **interface{}** |  | [optional] 
**Transactions** | Pointer to **[]interface{}** |  | [optional] 
**Uncles** | Pointer to **[]interface{}** |  | [optional] 

## Methods

### NewEvmBlock

`func NewEvmBlock() *EvmBlock`

NewEvmBlock instantiates a new EvmBlock object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEvmBlockWithDefaults

`func NewEvmBlockWithDefaults() *EvmBlock`

NewEvmBlockWithDefaults instantiates a new EvmBlock object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNumber

`func (o *EvmBlock) GetNumber() float32`

GetNumber returns the Number field if non-nil, zero value otherwise.

### GetNumberOk

`func (o *EvmBlock) GetNumberOk() (*float32, bool)`

GetNumberOk returns a tuple with the Number field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumber

`func (o *EvmBlock) SetNumber(v float32)`

SetNumber sets Number field to given value.

### HasNumber

`func (o *EvmBlock) HasNumber() bool`

HasNumber returns a boolean if a field has been set.

### GetHash

`func (o *EvmBlock) GetHash() string`

GetHash returns the Hash field if non-nil, zero value otherwise.

### GetHashOk

`func (o *EvmBlock) GetHashOk() (*string, bool)`

GetHashOk returns a tuple with the Hash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHash

`func (o *EvmBlock) SetHash(v string)`

SetHash sets Hash field to given value.

### HasHash

`func (o *EvmBlock) HasHash() bool`

HasHash returns a boolean if a field has been set.

### GetParentHash

`func (o *EvmBlock) GetParentHash() string`

GetParentHash returns the ParentHash field if non-nil, zero value otherwise.

### GetParentHashOk

`func (o *EvmBlock) GetParentHashOk() (*string, bool)`

GetParentHashOk returns a tuple with the ParentHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentHash

`func (o *EvmBlock) SetParentHash(v string)`

SetParentHash sets ParentHash field to given value.

### HasParentHash

`func (o *EvmBlock) HasParentHash() bool`

HasParentHash returns a boolean if a field has been set.

### GetNonce

`func (o *EvmBlock) GetNonce() string`

GetNonce returns the Nonce field if non-nil, zero value otherwise.

### GetNonceOk

`func (o *EvmBlock) GetNonceOk() (*string, bool)`

GetNonceOk returns a tuple with the Nonce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonce

`func (o *EvmBlock) SetNonce(v string)`

SetNonce sets Nonce field to given value.

### HasNonce

`func (o *EvmBlock) HasNonce() bool`

HasNonce returns a boolean if a field has been set.

### GetSha3Uncles

`func (o *EvmBlock) GetSha3Uncles() string`

GetSha3Uncles returns the Sha3Uncles field if non-nil, zero value otherwise.

### GetSha3UnclesOk

`func (o *EvmBlock) GetSha3UnclesOk() (*string, bool)`

GetSha3UnclesOk returns a tuple with the Sha3Uncles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSha3Uncles

`func (o *EvmBlock) SetSha3Uncles(v string)`

SetSha3Uncles sets Sha3Uncles field to given value.

### HasSha3Uncles

`func (o *EvmBlock) HasSha3Uncles() bool`

HasSha3Uncles returns a boolean if a field has been set.

### GetLogsBloom

`func (o *EvmBlock) GetLogsBloom() string`

GetLogsBloom returns the LogsBloom field if non-nil, zero value otherwise.

### GetLogsBloomOk

`func (o *EvmBlock) GetLogsBloomOk() (*string, bool)`

GetLogsBloomOk returns a tuple with the LogsBloom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogsBloom

`func (o *EvmBlock) SetLogsBloom(v string)`

SetLogsBloom sets LogsBloom field to given value.

### HasLogsBloom

`func (o *EvmBlock) HasLogsBloom() bool`

HasLogsBloom returns a boolean if a field has been set.

### GetTransactionsRoot

`func (o *EvmBlock) GetTransactionsRoot() string`

GetTransactionsRoot returns the TransactionsRoot field if non-nil, zero value otherwise.

### GetTransactionsRootOk

`func (o *EvmBlock) GetTransactionsRootOk() (*string, bool)`

GetTransactionsRootOk returns a tuple with the TransactionsRoot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionsRoot

`func (o *EvmBlock) SetTransactionsRoot(v string)`

SetTransactionsRoot sets TransactionsRoot field to given value.

### HasTransactionsRoot

`func (o *EvmBlock) HasTransactionsRoot() bool`

HasTransactionsRoot returns a boolean if a field has been set.

### GetStateRoot

`func (o *EvmBlock) GetStateRoot() string`

GetStateRoot returns the StateRoot field if non-nil, zero value otherwise.

### GetStateRootOk

`func (o *EvmBlock) GetStateRootOk() (*string, bool)`

GetStateRootOk returns a tuple with the StateRoot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStateRoot

`func (o *EvmBlock) SetStateRoot(v string)`

SetStateRoot sets StateRoot field to given value.

### HasStateRoot

`func (o *EvmBlock) HasStateRoot() bool`

HasStateRoot returns a boolean if a field has been set.

### GetMiner

`func (o *EvmBlock) GetMiner() string`

GetMiner returns the Miner field if non-nil, zero value otherwise.

### GetMinerOk

`func (o *EvmBlock) GetMinerOk() (*string, bool)`

GetMinerOk returns a tuple with the Miner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMiner

`func (o *EvmBlock) SetMiner(v string)`

SetMiner sets Miner field to given value.

### HasMiner

`func (o *EvmBlock) HasMiner() bool`

HasMiner returns a boolean if a field has been set.

### GetDifficulty

`func (o *EvmBlock) GetDifficulty() float32`

GetDifficulty returns the Difficulty field if non-nil, zero value otherwise.

### GetDifficultyOk

`func (o *EvmBlock) GetDifficultyOk() (*float32, bool)`

GetDifficultyOk returns a tuple with the Difficulty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDifficulty

`func (o *EvmBlock) SetDifficulty(v float32)`

SetDifficulty sets Difficulty field to given value.

### HasDifficulty

`func (o *EvmBlock) HasDifficulty() bool`

HasDifficulty returns a boolean if a field has been set.

### GetTotalDifficulty

`func (o *EvmBlock) GetTotalDifficulty() float32`

GetTotalDifficulty returns the TotalDifficulty field if non-nil, zero value otherwise.

### GetTotalDifficultyOk

`func (o *EvmBlock) GetTotalDifficultyOk() (*float32, bool)`

GetTotalDifficultyOk returns a tuple with the TotalDifficulty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalDifficulty

`func (o *EvmBlock) SetTotalDifficulty(v float32)`

SetTotalDifficulty sets TotalDifficulty field to given value.

### HasTotalDifficulty

`func (o *EvmBlock) HasTotalDifficulty() bool`

HasTotalDifficulty returns a boolean if a field has been set.

### GetExtraData

`func (o *EvmBlock) GetExtraData() string`

GetExtraData returns the ExtraData field if non-nil, zero value otherwise.

### GetExtraDataOk

`func (o *EvmBlock) GetExtraDataOk() (*string, bool)`

GetExtraDataOk returns a tuple with the ExtraData field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExtraData

`func (o *EvmBlock) SetExtraData(v string)`

SetExtraData sets ExtraData field to given value.

### HasExtraData

`func (o *EvmBlock) HasExtraData() bool`

HasExtraData returns a boolean if a field has been set.

### GetSize

`func (o *EvmBlock) GetSize() float32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *EvmBlock) GetSizeOk() (*float32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *EvmBlock) SetSize(v float32)`

SetSize sets Size field to given value.

### HasSize

`func (o *EvmBlock) HasSize() bool`

HasSize returns a boolean if a field has been set.

### GetGasLimit

`func (o *EvmBlock) GetGasLimit() float32`

GetGasLimit returns the GasLimit field if non-nil, zero value otherwise.

### GetGasLimitOk

`func (o *EvmBlock) GetGasLimitOk() (*float32, bool)`

GetGasLimitOk returns a tuple with the GasLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasLimit

`func (o *EvmBlock) SetGasLimit(v float32)`

SetGasLimit sets GasLimit field to given value.

### HasGasLimit

`func (o *EvmBlock) HasGasLimit() bool`

HasGasLimit returns a boolean if a field has been set.

### GetGasUsed

`func (o *EvmBlock) GetGasUsed() float32`

GetGasUsed returns the GasUsed field if non-nil, zero value otherwise.

### GetGasUsedOk

`func (o *EvmBlock) GetGasUsedOk() (*float32, bool)`

GetGasUsedOk returns a tuple with the GasUsed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasUsed

`func (o *EvmBlock) SetGasUsed(v float32)`

SetGasUsed sets GasUsed field to given value.

### HasGasUsed

`func (o *EvmBlock) HasGasUsed() bool`

HasGasUsed returns a boolean if a field has been set.

### GetTimestamp

`func (o *EvmBlock) GetTimestamp() interface{}`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *EvmBlock) GetTimestampOk() (*interface{}, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *EvmBlock) SetTimestamp(v interface{})`

SetTimestamp sets Timestamp field to given value.

### HasTimestamp

`func (o *EvmBlock) HasTimestamp() bool`

HasTimestamp returns a boolean if a field has been set.

### SetTimestampNil

`func (o *EvmBlock) SetTimestampNil(b bool)`

 SetTimestampNil sets the value for Timestamp to be an explicit nil

### UnsetTimestamp
`func (o *EvmBlock) UnsetTimestamp()`

UnsetTimestamp ensures that no value is present for Timestamp, not even an explicit nil
### GetTransactions

`func (o *EvmBlock) GetTransactions() []interface{}`

GetTransactions returns the Transactions field if non-nil, zero value otherwise.

### GetTransactionsOk

`func (o *EvmBlock) GetTransactionsOk() (*[]interface{}, bool)`

GetTransactionsOk returns a tuple with the Transactions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactions

`func (o *EvmBlock) SetTransactions(v []interface{})`

SetTransactions sets Transactions field to given value.

### HasTransactions

`func (o *EvmBlock) HasTransactions() bool`

HasTransactions returns a boolean if a field has been set.

### GetUncles

`func (o *EvmBlock) GetUncles() []interface{}`

GetUncles returns the Uncles field if non-nil, zero value otherwise.

### GetUnclesOk

`func (o *EvmBlock) GetUnclesOk() (*[]interface{}, bool)`

GetUnclesOk returns a tuple with the Uncles field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUncles

`func (o *EvmBlock) SetUncles(v []interface{})`

SetUncles sets Uncles field to given value.

### HasUncles

`func (o *EvmBlock) HasUncles() bool`

HasUncles returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


