# GetObjectResponseV1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **string** | The key that was used to retrieve the value from the object store. | 
**Value** | **string** | The value associated with the requested key in the object store as a string. | 

## Methods

### NewGetObjectResponseV1

`func NewGetObjectResponseV1(key string, value string, ) *GetObjectResponseV1`

NewGetObjectResponseV1 instantiates a new GetObjectResponseV1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetObjectResponseV1WithDefaults

`func NewGetObjectResponseV1WithDefaults() *GetObjectResponseV1`

NewGetObjectResponseV1WithDefaults instantiates a new GetObjectResponseV1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *GetObjectResponseV1) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *GetObjectResponseV1) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *GetObjectResponseV1) SetKey(v string)`

SetKey sets Key field to given value.


### GetValue

`func (o *GetObjectResponseV1) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *GetObjectResponseV1) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *GetObjectResponseV1) SetValue(v string)`

SetValue sets Value field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


