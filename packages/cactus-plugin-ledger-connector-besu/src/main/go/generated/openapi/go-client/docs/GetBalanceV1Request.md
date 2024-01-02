# GetBalanceV1Request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | **string** |  | 
**DefaultBlock** | Pointer to **interface{}** |  | [optional] 

## Methods

### NewGetBalanceV1Request

`func NewGetBalanceV1Request(address string, ) *GetBalanceV1Request`

NewGetBalanceV1Request instantiates a new GetBalanceV1Request object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetBalanceV1RequestWithDefaults

`func NewGetBalanceV1RequestWithDefaults() *GetBalanceV1Request`

NewGetBalanceV1RequestWithDefaults instantiates a new GetBalanceV1Request object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAddress

`func (o *GetBalanceV1Request) GetAddress() string`

GetAddress returns the Address field if non-nil, zero value otherwise.

### GetAddressOk

`func (o *GetBalanceV1Request) GetAddressOk() (*string, bool)`

GetAddressOk returns a tuple with the Address field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddress

`func (o *GetBalanceV1Request) SetAddress(v string)`

SetAddress sets Address field to given value.


### GetDefaultBlock

`func (o *GetBalanceV1Request) GetDefaultBlock() interface{}`

GetDefaultBlock returns the DefaultBlock field if non-nil, zero value otherwise.

### GetDefaultBlockOk

`func (o *GetBalanceV1Request) GetDefaultBlockOk() (*interface{}, bool)`

GetDefaultBlockOk returns a tuple with the DefaultBlock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultBlock

`func (o *GetBalanceV1Request) SetDefaultBlock(v interface{})`

SetDefaultBlock sets DefaultBlock field to given value.

### HasDefaultBlock

`func (o *GetBalanceV1Request) HasDefaultBlock() bool`

HasDefaultBlock returns a boolean if a field has been set.

### SetDefaultBlockNil

`func (o *GetBalanceV1Request) SetDefaultBlockNil(b bool)`

 SetDefaultBlockNil sets the value for DefaultBlock to be an explicit nil

### UnsetDefaultBlock
`func (o *GetBalanceV1Request) UnsetDefaultBlock()`

UnsetDefaultBlock ensures that no value is present for DefaultBlock, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


