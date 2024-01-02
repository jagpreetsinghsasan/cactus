# GetBlockV1Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Block** | [**EvmBlock**](EvmBlock.md) |  | 

## Methods

### NewGetBlockV1Response

`func NewGetBlockV1Response(block EvmBlock, ) *GetBlockV1Response`

NewGetBlockV1Response instantiates a new GetBlockV1Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBlockV1ResponseWithDefaults

`func NewGetBlockV1ResponseWithDefaults() *GetBlockV1Response`

NewGetBlockV1ResponseWithDefaults instantiates a new GetBlockV1Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlock

`func (o *GetBlockV1Response) GetBlock() EvmBlock`

GetBlock returns the Block field if non-nil, zero value otherwise.

### GetBlockOk

`func (o *GetBlockV1Response) GetBlockOk() (*EvmBlock, bool)`

GetBlockOk returns a tuple with the Block field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlock

`func (o *GetBlockV1Response) SetBlock(v EvmBlock)`

SetBlock sets Block field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


