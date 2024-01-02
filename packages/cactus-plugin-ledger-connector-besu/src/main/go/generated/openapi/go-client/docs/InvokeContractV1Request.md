# InvokeContractV1Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContractName** | **string** |  | 
**SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**InvocationType** | [**EthContractInvocationType**](EthContractInvocationType.md) |  | 
**MethodName** | **string** | The name of the contract method to invoke. | 
**Params** | **[]interface{}** | The list of arguments to pass in to the contract method being invoked. | [default to []]
**ContractAbi** | Pointer to **[]interface{}** | The application binary interface of the solidity contract, optional parameter | [optional] 
**ContractAddress** | Pointer to **string** | Address of the solidity contract, optional parameter | [optional] 
**Value** | Pointer to [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  | [optional] 
**Gas** | Pointer to [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  | [optional] 
**GasPrice** | Pointer to [**Web3BlockHeaderTimestamp**](Web3BlockHeaderTimestamp.md) |  | [optional] 
**Nonce** | Pointer to **float32** |  | [optional] 
**TimeoutMs** | Pointer to **float32** | The amount of milliseconds to wait for a transaction receipt beforegiving up and crashing. Only has any effect if the invocation type is SEND | [optional] [default to 60000]
**KeychainId** | Pointer to **string** | The keychainId for retrieve the contracts json. | [optional] 
**PrivateTransactionConfig** | Pointer to [**BesuPrivateTransactionConfig**](BesuPrivateTransactionConfig.md) |  | [optional] 

## Methods

### NewInvokeContractV1Request

`func NewInvokeContractV1Request(contractName string, signingCredential Web3SigningCredential, invocationType EthContractInvocationType, methodName string, params []interface{}, ) *InvokeContractV1Request`

NewInvokeContractV1Request instantiates a new InvokeContractV1Request object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewInvokeContractV1RequestWithDefaults

`func NewInvokeContractV1RequestWithDefaults() *InvokeContractV1Request`

NewInvokeContractV1RequestWithDefaults instantiates a new InvokeContractV1Request object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContractName

`func (o *InvokeContractV1Request) GetContractName() string`

GetContractName returns the ContractName field if non-nil, zero value otherwise.

### GetContractNameOk

`func (o *InvokeContractV1Request) GetContractNameOk() (*string, bool)`

GetContractNameOk returns a tuple with the ContractName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContractName

`func (o *InvokeContractV1Request) SetContractName(v string)`

SetContractName sets ContractName field to given value.


### GetSigningCredential

`func (o *InvokeContractV1Request) GetSigningCredential() Web3SigningCredential`

GetSigningCredential returns the SigningCredential field if non-nil, zero value otherwise.

### GetSigningCredentialOk

`func (o *InvokeContractV1Request) GetSigningCredentialOk() (*Web3SigningCredential, bool)`

GetSigningCredentialOk returns a tuple with the SigningCredential field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSigningCredential

`func (o *InvokeContractV1Request) SetSigningCredential(v Web3SigningCredential)`

SetSigningCredential sets SigningCredential field to given value.


### GetInvocationType

`func (o *InvokeContractV1Request) GetInvocationType() EthContractInvocationType`

GetInvocationType returns the InvocationType field if non-nil, zero value otherwise.

### GetInvocationTypeOk

`func (o *InvokeContractV1Request) GetInvocationTypeOk() (*EthContractInvocationType, bool)`

GetInvocationTypeOk returns a tuple with the InvocationType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvocationType

`func (o *InvokeContractV1Request) SetInvocationType(v EthContractInvocationType)`

SetInvocationType sets InvocationType field to given value.


### GetMethodName

`func (o *InvokeContractV1Request) GetMethodName() string`

GetMethodName returns the MethodName field if non-nil, zero value otherwise.

### GetMethodNameOk

`func (o *InvokeContractV1Request) GetMethodNameOk() (*string, bool)`

GetMethodNameOk returns a tuple with the MethodName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMethodName

`func (o *InvokeContractV1Request) SetMethodName(v string)`

SetMethodName sets MethodName field to given value.


### GetParams

`func (o *InvokeContractV1Request) GetParams() []interface{}`

GetParams returns the Params field if non-nil, zero value otherwise.

### GetParamsOk

`func (o *InvokeContractV1Request) GetParamsOk() (*[]interface{}, bool)`

GetParamsOk returns a tuple with the Params field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParams

`func (o *InvokeContractV1Request) SetParams(v []interface{})`

SetParams sets Params field to given value.


### GetContractAbi

`func (o *InvokeContractV1Request) GetContractAbi() []interface{}`

GetContractAbi returns the ContractAbi field if non-nil, zero value otherwise.

### GetContractAbiOk

`func (o *InvokeContractV1Request) GetContractAbiOk() (*[]interface{}, bool)`

GetContractAbiOk returns a tuple with the ContractAbi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContractAbi

`func (o *InvokeContractV1Request) SetContractAbi(v []interface{})`

SetContractAbi sets ContractAbi field to given value.

### HasContractAbi

`func (o *InvokeContractV1Request) HasContractAbi() bool`

HasContractAbi returns a boolean if a field has been set.

### GetContractAddress

`func (o *InvokeContractV1Request) GetContractAddress() string`

GetContractAddress returns the ContractAddress field if non-nil, zero value otherwise.

### GetContractAddressOk

`func (o *InvokeContractV1Request) GetContractAddressOk() (*string, bool)`

GetContractAddressOk returns a tuple with the ContractAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContractAddress

`func (o *InvokeContractV1Request) SetContractAddress(v string)`

SetContractAddress sets ContractAddress field to given value.

### HasContractAddress

`func (o *InvokeContractV1Request) HasContractAddress() bool`

HasContractAddress returns a boolean if a field has been set.

### GetValue

`func (o *InvokeContractV1Request) GetValue() Web3BlockHeaderTimestamp`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *InvokeContractV1Request) GetValueOk() (*Web3BlockHeaderTimestamp, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *InvokeContractV1Request) SetValue(v Web3BlockHeaderTimestamp)`

SetValue sets Value field to given value.

### HasValue

`func (o *InvokeContractV1Request) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetGas

`func (o *InvokeContractV1Request) GetGas() Web3BlockHeaderTimestamp`

GetGas returns the Gas field if non-nil, zero value otherwise.

### GetGasOk

`func (o *InvokeContractV1Request) GetGasOk() (*Web3BlockHeaderTimestamp, bool)`

GetGasOk returns a tuple with the Gas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGas

`func (o *InvokeContractV1Request) SetGas(v Web3BlockHeaderTimestamp)`

SetGas sets Gas field to given value.

### HasGas

`func (o *InvokeContractV1Request) HasGas() bool`

HasGas returns a boolean if a field has been set.

### GetGasPrice

`func (o *InvokeContractV1Request) GetGasPrice() Web3BlockHeaderTimestamp`

GetGasPrice returns the GasPrice field if non-nil, zero value otherwise.

### GetGasPriceOk

`func (o *InvokeContractV1Request) GetGasPriceOk() (*Web3BlockHeaderTimestamp, bool)`

GetGasPriceOk returns a tuple with the GasPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasPrice

`func (o *InvokeContractV1Request) SetGasPrice(v Web3BlockHeaderTimestamp)`

SetGasPrice sets GasPrice field to given value.

### HasGasPrice

`func (o *InvokeContractV1Request) HasGasPrice() bool`

HasGasPrice returns a boolean if a field has been set.

### GetNonce

`func (o *InvokeContractV1Request) GetNonce() float32`

GetNonce returns the Nonce field if non-nil, zero value otherwise.

### GetNonceOk

`func (o *InvokeContractV1Request) GetNonceOk() (*float32, bool)`

GetNonceOk returns a tuple with the Nonce field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNonce

`func (o *InvokeContractV1Request) SetNonce(v float32)`

SetNonce sets Nonce field to given value.

### HasNonce

`func (o *InvokeContractV1Request) HasNonce() bool`

HasNonce returns a boolean if a field has been set.

### GetTimeoutMs

`func (o *InvokeContractV1Request) GetTimeoutMs() float32`

GetTimeoutMs returns the TimeoutMs field if non-nil, zero value otherwise.

### GetTimeoutMsOk

`func (o *InvokeContractV1Request) GetTimeoutMsOk() (*float32, bool)`

GetTimeoutMsOk returns a tuple with the TimeoutMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeoutMs

`func (o *InvokeContractV1Request) SetTimeoutMs(v float32)`

SetTimeoutMs sets TimeoutMs field to given value.

### HasTimeoutMs

`func (o *InvokeContractV1Request) HasTimeoutMs() bool`

HasTimeoutMs returns a boolean if a field has been set.

### GetKeychainId

`func (o *InvokeContractV1Request) GetKeychainId() string`

GetKeychainId returns the KeychainId field if non-nil, zero value otherwise.

### GetKeychainIdOk

`func (o *InvokeContractV1Request) GetKeychainIdOk() (*string, bool)`

GetKeychainIdOk returns a tuple with the KeychainId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeychainId

`func (o *InvokeContractV1Request) SetKeychainId(v string)`

SetKeychainId sets KeychainId field to given value.

### HasKeychainId

`func (o *InvokeContractV1Request) HasKeychainId() bool`

HasKeychainId returns a boolean if a field has been set.

### GetPrivateTransactionConfig

`func (o *InvokeContractV1Request) GetPrivateTransactionConfig() BesuPrivateTransactionConfig`

GetPrivateTransactionConfig returns the PrivateTransactionConfig field if non-nil, zero value otherwise.

### GetPrivateTransactionConfigOk

`func (o *InvokeContractV1Request) GetPrivateTransactionConfigOk() (*BesuPrivateTransactionConfig, bool)`

GetPrivateTransactionConfigOk returns a tuple with the PrivateTransactionConfig field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivateTransactionConfig

`func (o *InvokeContractV1Request) SetPrivateTransactionConfig(v BesuPrivateTransactionConfig)`

SetPrivateTransactionConfig sets PrivateTransactionConfig field to given value.

### HasPrivateTransactionConfig

`func (o *InvokeContractV1Request) HasPrivateTransactionConfig() bool`

HasPrivateTransactionConfig returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


