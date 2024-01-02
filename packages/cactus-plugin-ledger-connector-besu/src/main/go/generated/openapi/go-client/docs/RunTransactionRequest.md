# RunTransactionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**TransactionConfig** | [**BesuTransactionConfig**](BesuTransactionConfig.md) |  | 
**ConsistencyStrategy** | [**ConsistencyStrategy**](ConsistencyStrategy.md) |  | 
**PrivateTransactionConfig** | Pointer to [**BesuPrivateTransactionConfig**](BesuPrivateTransactionConfig.md) |  | [optional] 

## Methods

### NewRunTransactionRequest

`func NewRunTransactionRequest(web3SigningCredential Web3SigningCredential, transactionConfig BesuTransactionConfig, consistencyStrategy ConsistencyStrategy, ) *RunTransactionRequest`

NewRunTransactionRequest instantiates a new RunTransactionRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRunTransactionRequestWithDefaults

`func NewRunTransactionRequestWithDefaults() *RunTransactionRequest`

NewRunTransactionRequestWithDefaults instantiates a new RunTransactionRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWeb3SigningCredential

`func (o *RunTransactionRequest) GetWeb3SigningCredential() Web3SigningCredential`

GetWeb3SigningCredential returns the Web3SigningCredential field if non-nil, zero value otherwise.

### GetWeb3SigningCredentialOk

`func (o *RunTransactionRequest) GetWeb3SigningCredentialOk() (*Web3SigningCredential, bool)`

GetWeb3SigningCredentialOk returns a tuple with the Web3SigningCredential field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeb3SigningCredential

`func (o *RunTransactionRequest) SetWeb3SigningCredential(v Web3SigningCredential)`

SetWeb3SigningCredential sets Web3SigningCredential field to given value.


### GetTransactionConfig

`func (o *RunTransactionRequest) GetTransactionConfig() BesuTransactionConfig`

GetTransactionConfig returns the TransactionConfig field if non-nil, zero value otherwise.

### GetTransactionConfigOk

`func (o *RunTransactionRequest) GetTransactionConfigOk() (*BesuTransactionConfig, bool)`

GetTransactionConfigOk returns a tuple with the TransactionConfig field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransactionConfig

`func (o *RunTransactionRequest) SetTransactionConfig(v BesuTransactionConfig)`

SetTransactionConfig sets TransactionConfig field to given value.


### GetConsistencyStrategy

`func (o *RunTransactionRequest) GetConsistencyStrategy() ConsistencyStrategy`

GetConsistencyStrategy returns the ConsistencyStrategy field if non-nil, zero value otherwise.

### GetConsistencyStrategyOk

`func (o *RunTransactionRequest) GetConsistencyStrategyOk() (*ConsistencyStrategy, bool)`

GetConsistencyStrategyOk returns a tuple with the ConsistencyStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConsistencyStrategy

`func (o *RunTransactionRequest) SetConsistencyStrategy(v ConsistencyStrategy)`

SetConsistencyStrategy sets ConsistencyStrategy field to given value.


### GetPrivateTransactionConfig

`func (o *RunTransactionRequest) GetPrivateTransactionConfig() BesuPrivateTransactionConfig`

GetPrivateTransactionConfig returns the PrivateTransactionConfig field if non-nil, zero value otherwise.

### GetPrivateTransactionConfigOk

`func (o *RunTransactionRequest) GetPrivateTransactionConfigOk() (*BesuPrivateTransactionConfig, bool)`

GetPrivateTransactionConfigOk returns a tuple with the PrivateTransactionConfig field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivateTransactionConfig

`func (o *RunTransactionRequest) SetPrivateTransactionConfig(v BesuPrivateTransactionConfig)`

SetPrivateTransactionConfig sets PrivateTransactionConfig field to given value.

### HasPrivateTransactionConfig

`func (o *RunTransactionRequest) HasPrivateTransactionConfig() bool`

HasPrivateTransactionConfig returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


