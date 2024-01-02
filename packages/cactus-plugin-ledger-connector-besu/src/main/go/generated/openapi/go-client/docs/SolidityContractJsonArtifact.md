# SolidityContractJsonArtifact

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContractName** | **string** |  | 
**Metadata** | Pointer to **string** |  | [optional] 
**Bytecode** | Pointer to **string** |  | [optional] 
**DeployedBytecode** | Pointer to **string** |  | [optional] 
**SourceMap** | Pointer to **string** |  | [optional] 
**DeployedSourceMap** | Pointer to **string** |  | [optional] 
**SourcePath** | Pointer to **string** |  | [optional] 
**Compiler** | Pointer to [**SolidityContractJsonArtifactCompiler**](SolidityContractJsonArtifactCompiler.md) |  | [optional] 
**FunctionHashes** | Pointer to **map[string]interface{}** |  | [optional] 
**GasEstimates** | Pointer to [**SolidityContractJsonArtifactGasEstimates**](SolidityContractJsonArtifactGasEstimates.md) |  | [optional] 

## Methods

### NewSolidityContractJsonArtifact

`func NewSolidityContractJsonArtifact(contractName string, ) *SolidityContractJsonArtifact`

NewSolidityContractJsonArtifact instantiates a new SolidityContractJsonArtifact object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSolidityContractJsonArtifactWithDefaults

`func NewSolidityContractJsonArtifactWithDefaults() *SolidityContractJsonArtifact`

NewSolidityContractJsonArtifactWithDefaults instantiates a new SolidityContractJsonArtifact object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetContractName

`func (o *SolidityContractJsonArtifact) GetContractName() string`

GetContractName returns the ContractName field if non-nil, zero value otherwise.

### GetContractNameOk

`func (o *SolidityContractJsonArtifact) GetContractNameOk() (*string, bool)`

GetContractNameOk returns a tuple with the ContractName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContractName

`func (o *SolidityContractJsonArtifact) SetContractName(v string)`

SetContractName sets ContractName field to given value.


### GetMetadata

`func (o *SolidityContractJsonArtifact) GetMetadata() string`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *SolidityContractJsonArtifact) GetMetadataOk() (*string, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *SolidityContractJsonArtifact) SetMetadata(v string)`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *SolidityContractJsonArtifact) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### GetBytecode

`func (o *SolidityContractJsonArtifact) GetBytecode() string`

GetBytecode returns the Bytecode field if non-nil, zero value otherwise.

### GetBytecodeOk

`func (o *SolidityContractJsonArtifact) GetBytecodeOk() (*string, bool)`

GetBytecodeOk returns a tuple with the Bytecode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBytecode

`func (o *SolidityContractJsonArtifact) SetBytecode(v string)`

SetBytecode sets Bytecode field to given value.

### HasBytecode

`func (o *SolidityContractJsonArtifact) HasBytecode() bool`

HasBytecode returns a boolean if a field has been set.

### GetDeployedBytecode

`func (o *SolidityContractJsonArtifact) GetDeployedBytecode() string`

GetDeployedBytecode returns the DeployedBytecode field if non-nil, zero value otherwise.

### GetDeployedBytecodeOk

`func (o *SolidityContractJsonArtifact) GetDeployedBytecodeOk() (*string, bool)`

GetDeployedBytecodeOk returns a tuple with the DeployedBytecode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeployedBytecode

`func (o *SolidityContractJsonArtifact) SetDeployedBytecode(v string)`

SetDeployedBytecode sets DeployedBytecode field to given value.

### HasDeployedBytecode

`func (o *SolidityContractJsonArtifact) HasDeployedBytecode() bool`

HasDeployedBytecode returns a boolean if a field has been set.

### GetSourceMap

`func (o *SolidityContractJsonArtifact) GetSourceMap() string`

GetSourceMap returns the SourceMap field if non-nil, zero value otherwise.

### GetSourceMapOk

`func (o *SolidityContractJsonArtifact) GetSourceMapOk() (*string, bool)`

GetSourceMapOk returns a tuple with the SourceMap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceMap

`func (o *SolidityContractJsonArtifact) SetSourceMap(v string)`

SetSourceMap sets SourceMap field to given value.

### HasSourceMap

`func (o *SolidityContractJsonArtifact) HasSourceMap() bool`

HasSourceMap returns a boolean if a field has been set.

### GetDeployedSourceMap

`func (o *SolidityContractJsonArtifact) GetDeployedSourceMap() string`

GetDeployedSourceMap returns the DeployedSourceMap field if non-nil, zero value otherwise.

### GetDeployedSourceMapOk

`func (o *SolidityContractJsonArtifact) GetDeployedSourceMapOk() (*string, bool)`

GetDeployedSourceMapOk returns a tuple with the DeployedSourceMap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeployedSourceMap

`func (o *SolidityContractJsonArtifact) SetDeployedSourceMap(v string)`

SetDeployedSourceMap sets DeployedSourceMap field to given value.

### HasDeployedSourceMap

`func (o *SolidityContractJsonArtifact) HasDeployedSourceMap() bool`

HasDeployedSourceMap returns a boolean if a field has been set.

### GetSourcePath

`func (o *SolidityContractJsonArtifact) GetSourcePath() string`

GetSourcePath returns the SourcePath field if non-nil, zero value otherwise.

### GetSourcePathOk

`func (o *SolidityContractJsonArtifact) GetSourcePathOk() (*string, bool)`

GetSourcePathOk returns a tuple with the SourcePath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourcePath

`func (o *SolidityContractJsonArtifact) SetSourcePath(v string)`

SetSourcePath sets SourcePath field to given value.

### HasSourcePath

`func (o *SolidityContractJsonArtifact) HasSourcePath() bool`

HasSourcePath returns a boolean if a field has been set.

### GetCompiler

`func (o *SolidityContractJsonArtifact) GetCompiler() SolidityContractJsonArtifactCompiler`

GetCompiler returns the Compiler field if non-nil, zero value otherwise.

### GetCompilerOk

`func (o *SolidityContractJsonArtifact) GetCompilerOk() (*SolidityContractJsonArtifactCompiler, bool)`

GetCompilerOk returns a tuple with the Compiler field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompiler

`func (o *SolidityContractJsonArtifact) SetCompiler(v SolidityContractJsonArtifactCompiler)`

SetCompiler sets Compiler field to given value.

### HasCompiler

`func (o *SolidityContractJsonArtifact) HasCompiler() bool`

HasCompiler returns a boolean if a field has been set.

### GetFunctionHashes

`func (o *SolidityContractJsonArtifact) GetFunctionHashes() map[string]interface{}`

GetFunctionHashes returns the FunctionHashes field if non-nil, zero value otherwise.

### GetFunctionHashesOk

`func (o *SolidityContractJsonArtifact) GetFunctionHashesOk() (*map[string]interface{}, bool)`

GetFunctionHashesOk returns a tuple with the FunctionHashes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFunctionHashes

`func (o *SolidityContractJsonArtifact) SetFunctionHashes(v map[string]interface{})`

SetFunctionHashes sets FunctionHashes field to given value.

### HasFunctionHashes

`func (o *SolidityContractJsonArtifact) HasFunctionHashes() bool`

HasFunctionHashes returns a boolean if a field has been set.

### GetGasEstimates

`func (o *SolidityContractJsonArtifact) GetGasEstimates() SolidityContractJsonArtifactGasEstimates`

GetGasEstimates returns the GasEstimates field if non-nil, zero value otherwise.

### GetGasEstimatesOk

`func (o *SolidityContractJsonArtifact) GetGasEstimatesOk() (*SolidityContractJsonArtifactGasEstimates, bool)`

GetGasEstimatesOk returns a tuple with the GasEstimates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGasEstimates

`func (o *SolidityContractJsonArtifact) SetGasEstimates(v SolidityContractJsonArtifactGasEstimates)`

SetGasEstimates sets GasEstimates field to given value.

### HasGasEstimates

`func (o *SolidityContractJsonArtifact) HasGasEstimates() bool`

HasGasEstimates returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


