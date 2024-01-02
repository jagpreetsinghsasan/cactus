# SetObjectRequestV1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **string** | The key for the entry to set in the object store. | 
**Value** | **string** | The value that will be associated with the key in the object store. | 

## Methods

### NewSetObjectRequestV1

`func NewSetObjectRequestV1(key string, value string, ) *SetObjectRequestV1`

NewSetObjectRequestV1 instantiates a new SetObjectRequestV1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSetObjectRequestV1WithDefaults

`func NewSetObjectRequestV1WithDefaults() *SetObjectRequestV1`

NewSetObjectRequestV1WithDefaults instantiates a new SetObjectRequestV1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *SetObjectRequestV1) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *SetObjectRequestV1) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *SetObjectRequestV1) SetKey(v string)`

SetKey sets Key field to given value.


### GetValue

`func (o *SetObjectRequestV1) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *SetObjectRequestV1) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *SetObjectRequestV1) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


