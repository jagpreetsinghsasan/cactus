# DeployContractSolidityBytecodeV1Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContractName** | **string** | The contract name for retrieve the contracts json on the keychain. | 
**ContractAbi** | **[]interface{}** | The application binary interface of the solidity contract | 
**ConstructorArgs** | **[]interface{}** |  | [default to []]
**Web3SigningCredential** | [**Web3SigningCredential**](Web3SigningCredential.md) |  | 
**Bytecode** | **string** | See https://ethereum.stackexchange.com/a/47556 regarding the maximum length of the bytecode | 
**KeychainId** | **string** | The keychainId for retrieve the contracts json. | 
**Gas** | Pointer to **float32** |  | [optional] 
**GasPrice** | Pointer to **string** |  | [optional] 
**TimeoutMs** | Pointer to **float32** | The amount of milliseconds to wait for a transaction receipt with theaddress of the contract(which indicates successful deployment) beforegiving up and crashing. | [optional] [default to 60000]
**PrivateTransactionConfig** | Pointer to [**BesuPrivateTransactionConfig**](BesuPrivateTransactionConfig.md) |  | [optional] 

## Methods

### NewDeployContractSolidityBytecodeV1Request

`func NewDeployContractSolidityBytecodeV1Request(contractName string, contractAbi []interface{}, constructorArgs []interface{}, web3SigningCredential Web3SigningCredential, bytecode string, keychainId string, ) *DeployContractSolidityBytecodeV1Request`

NewDeployContractSolidityBytecodeV1Request instantiates a new DeployContractSolidityBytecodeV1Request object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDeployContractSolidityBytecodeV1RequestWithDefaults

`func NewDeployContractSolidityBytecodeV1RequestWithDefaults() *DeployContractSolidityBytecodeV1Request`

NewDeployContractSolidityBytecodeV1RequestWithDefaults instantiates a new DeployContractSolidityBytecodeV1Request object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContractName

`func (o *DeployContractSolidityBytecodeV1Request) GetContractName() string`

GetContractName returns the ContractName field if non-nil, zero value otherwise.

### GetContractNameOk

`func (o *DeployContractSolidityBytecodeV1Request) GetContractNameOk() (*string, bool)`

GetContractNameOk returns a tuple with the ContractName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContractName

`func (o *DeployContractSolidityBytecodeV1Request) SetContractName(v string)`

SetContractName sets ContractName field to given value.


### GetContractAbi

`func (o *DeployContractSolidityBytecodeV1Request) GetContractAbi() []interface{}`

GetContractAbi returns the ContractAbi field if non-nil, zero value otherwise.

### GetContractAbiOk

`func (o *DeployContractSolidityBytecodeV1Request) GetContractAbiOk() (*[]interface{}, bool)`

GetContractAbiOk returns a tuple with the ContractAbi field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContractAbi

`func (o *DeployContractSolidityBytecodeV1Request) SetContractAbi(v []interface{})`

SetContractAbi sets ContractAbi field to given value.


### GetConstructorArgs

`func (o *DeployContractSolidityBytecodeV1Request) GetConstructorArgs() []interface{}`

GetConstructorArgs returns the ConstructorArgs field if non-nil, zero value otherwise.

### GetConstructorArgsOk

`func (o *DeployContractSolidityBytecodeV1Request) GetConstructorArgsOk() (*[]interface{}, bool)`

GetConstructorArgsOk returns a tuple with the ConstructorArgs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConstructorArgs

`func (o *DeployContractSolidityBytecodeV1Request) SetConstructorArgs(v []interface{})`

SetConstructorArgs sets ConstructorArgs field to given value.


### GetWeb3SigningCredential

`func (o *DeployContractSolidityBytecodeV1Request) GetWeb3SigningCredential() Web3SigningCredential`

GetWeb3SigningCredential returns the Web3SigningCredential field if non-nil, zero value otherwise.

### GetWeb3SigningCredentialOk

`func (o *DeployContractSolidityBytecodeV1Request) GetWeb3SigningCredentialOk() (*Web3SigningCredential, bool)`

GetWeb3SigningCredentialOk returns a tuple with the Web3SigningCredential field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeb3SigningCredential

`func (o *DeployContractSolidityBytecodeV1Request) SetWeb3SigningCredential(v Web3SigningCredential)`

SetWeb3SigningCredential sets Web3SigningCredential field to given value.


### GetBytecode

`func (o *DeployContractSolidityBytecodeV1Request) GetBytecode() string`

GetBytecode returns the Bytecode field if non-nil, zero value otherwise.

### GetBytecodeOk

`func (o *DeployContractSolidityBytecodeV1Request) GetBytecodeOk() (*string, bool)`

GetBytecodeOk returns a tuple with the Bytecode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBytecode

`func (o *DeployContractSolidityBytecodeV1Request) SetBytecode(v string)`

SetBytecode sets Bytecode field to given value.


### GetKeychainId

`func (o *DeployContractSolidityBytecodeV1Request) GetKeychainId() string`

GetKeychainId returns the KeychainId field if non-nil, zero value otherwise.

### GetKeychainIdOk

`func (o *DeployContractSolidityBytecodeV1Request) GetKeychainIdOk() (*string, bool)`

GetKeychainIdOk returns a tuple with the KeychainId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeychainId

`func (o *DeployContractSolidityBytecodeV1Request) SetKeychainId(v string)`

SetKeychainId sets KeychainId field to given value.


### GetGas

`func (o *DeployContractSolidityBytecodeV1Request) GetGas() float32`

GetGas returns the Gas field if non-nil, zero value otherwise.

### GetGasOk

`func (o *DeployContractSolidityBytecodeV1Request) GetGasOk() (*float32, bool)`

GetGasOk returns a tuple with the Gas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGas

`func (o *DeployContractSolidityBytecodeV1Request) SetGas(v float32)`

SetGas sets Gas field to given value.

### HasGas

`func (o *DeployContractSolidityBytecodeV1Request) HasGas() bool`

HasGas returns a boolean if a field has been set.

### GetGasPrice

`func (o *DeployContractSolidityBytecodeV1Request) GetGasPrice() string`

GetGasPrice returns the GasPrice field if non-nil, zero value otherwise.

### GetGasPriceOk

`func (o *DeployContractSolidityBytecodeV1Request) GetGasPriceOk() (*string, bool)`

GetGasPriceOk returns a tuple with the GasPrice field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasPrice

`func (o *DeployContractSolidityBytecodeV1Request) SetGasPrice(v string)`

SetGasPrice sets GasPrice field to given value.

### HasGasPrice

`func (o *DeployContractSolidityBytecodeV1Request) HasGasPrice() bool`

HasGasPrice returns a boolean if a field has been set.

### GetTimeoutMs

`func (o *DeployContractSolidityBytecodeV1Request) GetTimeoutMs() float32`

GetTimeoutMs returns the TimeoutMs field if non-nil, zero value otherwise.

### GetTimeoutMsOk

`func (o *DeployContractSolidityBytecodeV1Request) GetTimeoutMsOk() (*float32, bool)`

GetTimeoutMsOk returns a tuple with the TimeoutMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeoutMs

`func (o *DeployContractSolidityBytecodeV1Request) SetTimeoutMs(v float32)`

SetTimeoutMs sets TimeoutMs field to given value.

### HasTimeoutMs

`func (o *DeployContractSolidityBytecodeV1Request) HasTimeoutMs() bool`

HasTimeoutMs returns a boolean if a field has been set.

### GetPrivateTransactionConfig

`func (o *DeployContractSolidityBytecodeV1Request) GetPrivateTransactionConfig() BesuPrivateTransactionConfig`

GetPrivateTransactionConfig returns the PrivateTransactionConfig field if non-nil, zero value otherwise.

### GetPrivateTransactionConfigOk

`func (o *DeployContractSolidityBytecodeV1Request) GetPrivateTransactionConfigOk() (*BesuPrivateTransactionConfig, bool)`

GetPrivateTransactionConfigOk returns a tuple with the PrivateTransactionConfig field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivateTransactionConfig

`func (o *DeployContractSolidityBytecodeV1Request) SetPrivateTransactionConfig(v BesuPrivateTransactionConfig)`

SetPrivateTransactionConfig sets PrivateTransactionConfig field to given value.

### HasPrivateTransactionConfig

`func (o *DeployContractSolidityBytecodeV1Request) HasPrivateTransactionConfig() bool`

HasPrivateTransactionConfig returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


