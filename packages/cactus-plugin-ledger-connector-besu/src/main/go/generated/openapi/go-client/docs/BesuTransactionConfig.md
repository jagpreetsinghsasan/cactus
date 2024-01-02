# BesuTransactionConfig

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RawTransaction** | Pointer to **string** |  | [optional] 
**From** | Pointer to [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  | [optional] 
**To** | Pointer to [**BesuTransactionConfigTo**](BesuTransactionConfigTo.md) |  | [optional] 
**Value** | Pointer to [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  | [optional] 
**Gas** | Pointer to [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  | [optional] 
**GasPrice** | Pointer to [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  | [optional] 
**Nonce** | Pointer to **float32** |  | [optional] 
**Data** | Pointer to [**BesuTransactionConfigTo**](BesuTransactionConfigTo.md) |  | [optional] 

## Methods

### NewBesuTransactionConfig

`func NewBesuTransactionConfig() *BesuTransactionConfig`

NewBesuTransactionConfig instantiates a new BesuTransactionConfig object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBesuTransactionConfigWithDefaults

`func NewBesuTransactionConfigWithDefaults() *BesuTransactionConfig`

NewBesuTransactionConfigWithDefaults instantiates a new BesuTransactionConfig object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRawTransaction

`func (o *BesuTransactionConfig) GetRawTransaction() string`

GetRawTransaction returns the RawTransaction field if non-nil, zero value otherwise.

### GetRawTransactionOk

`func (o *BesuTransactionConfig) GetRawTransactionOk() (*string, bool)`

GetRawTransactionOk returns a tuple with the RawTransaction field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRawTransaction

`func (o *BesuTransactionConfig) SetRawTransaction(v string)`

SetRawTransaction sets RawTransaction field to given value.

### HasRawTransaction

`func (o *BesuTransactionConfig) HasRawTransaction() bool`

HasRawTransaction returns a boolean if a field has been set.

### GetFrom

`func (o *BesuTransactionConfig) GetFrom() Web3BlockHeaderTimestamp`

GetFrom returns the From field if non-nil, zero value otherwise.

### GetFromOk

`func (o *BesuTransactionConfig) GetFromOk() (*Web3BlockHeaderTimestamp, bool)`

GetFromOk returns a tuple with the From field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrom

`func (o *BesuTransactionConfig) SetFrom(v Web3BlockHeaderTimestamp)`

SetFrom sets From field to given value.

### HasFrom

`func (o *BesuTransactionConfig) HasFrom() bool`

HasFrom returns a boolean if a field has been set.

### GetTo

`func (o *BesuTransactionConfig) GetTo() BesuTransactionConfigTo`

GetTo returns the To field if non-nil, zero value otherwise.

### GetToOk

`func (o *BesuTransactionConfig) GetToOk() (*BesuTransactionConfigTo, bool)`

GetToOk returns a tuple with the To field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTo

`func (o *BesuTransactionConfig) SetTo(v BesuTransactionConfigTo)`

SetTo sets To field to given value.

### HasTo

`func (o *BesuTransactionConfig) HasTo() bool`

HasTo returns a boolean if a field has been set.

### GetValue

`func (o *BesuTransactionConfig) GetValue() Web3BlockHeaderTimestamp`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *BesuTransactionConfig) GetValueOk() (*Web3BlockHeaderTimestamp, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *BesuTransactionConfig) SetValue(v Web3BlockHeaderTimestamp)`

SetValue sets Value field to given value.

### HasValue

`func (o *BesuTransactionConfig) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetGas

`func (o *BesuTransactionConfig) GetGas() Web3BlockHeaderTimestamp`

GetGas returns the Gas field if non-nil, zero value otherwise.

### GetGasOk

`func (o *BesuTransactionConfig) GetGasOk() (*Web3BlockHeaderTimestamp, bool)`

GetGasOk returns a tuple with the Gas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGas

`func (o *BesuTransactionConfig) SetGas(v Web3BlockHeaderTimestamp)`

SetGas sets Gas field to given value.

### HasGas

`func (o *BesuTransactionConfig) HasGas() bool`

HasGas returns a boolean if a field has been set.

### GetGasPrice

`func (o *BesuTransactionConfig) GetGasPrice() Web3BlockHeaderTimestamp`

GetGasPrice returns the GasPrice field if non-nil, zero value otherwise.

### GetGasPriceOk

`func (o *BesuTransactionConfig) GetGasPriceOk() (*Web3BlockHeaderTimestamp, bool)`

GetGasPriceOk returns a tuple with the GasPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasPrice

`func (o *BesuTransactionConfig) SetGasPrice(v Web3BlockHeaderTimestamp)`

SetGasPrice sets GasPrice field to given value.

### HasGasPrice

`func (o *BesuTransactionConfig) HasGasPrice() bool`

HasGasPrice returns a boolean if a field has been set.

### GetNonce

`func (o *BesuTransactionConfig) GetNonce() float32`

GetNonce returns the Nonce field if non-nil, zero value otherwise.

### GetNonceOk

`func (o *BesuTransactionConfig) GetNonceOk() (*float32, bool)`

GetNonceOk returns a tuple with the Nonce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonce

`func (o *BesuTransactionConfig) SetNonce(v float32)`

SetNonce sets Nonce field to given value.

### HasNonce

`func (o *BesuTransactionConfig) HasNonce() bool`

HasNonce returns a boolean if a field has been set.

### GetData

`func (o *BesuTransactionConfig) GetData() BesuTransactionConfigTo`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *BesuTransactionConfig) GetDataOk() (*BesuTransactionConfigTo, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *BesuTransactionConfig) SetData(v BesuTransactionConfigTo)`

SetData sets Data field to given value.

### HasData

`func (o *BesuTransactionConfig) HasData() bool`

HasData returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


