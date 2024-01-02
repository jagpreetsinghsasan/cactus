# HasObjectResponseV1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **string** | The key that was used to check the presence of the value in the object store. | 
**CheckedAt** | **string** | Date and time encoded as JSON when the presence check was performed by the plugin backend. | 
**IsPresent** | **bool** | The boolean true or false indicating the presence or absence of an object under &#39;key&#39;. | 

## Methods

### NewHasObjectResponseV1

`func NewHasObjectResponseV1(key string, checkedAt string, isPresent bool, ) *HasObjectResponseV1`

NewHasObjectResponseV1 instantiates a new HasObjectResponseV1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewHasObjectResponseV1WithDefaults

`func NewHasObjectResponseV1WithDefaults() *HasObjectResponseV1`

NewHasObjectResponseV1WithDefaults instantiates a new HasObjectResponseV1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKey

`func (o *HasObjectResponseV1) GetKey() string`

GetKey returns the Key field if non-nil, zero value otherwise.

### GetKeyOk

`func (o *HasObjectResponseV1) GetKeyOk() (*string, bool)`

GetKeyOk returns a tuple with the Key field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKey

`func (o *HasObjectResponseV1) SetKey(v string)`

SetKey sets Key field to given value.


### GetCheckedAt

`func (o *HasObjectResponseV1) GetCheckedAt() string`

GetCheckedAt returns the CheckedAt field if non-nil, zero value otherwise.

### GetCheckedAtOk

`func (o *HasObjectResponseV1) GetCheckedAtOk() (*string, bool)`

GetCheckedAtOk returns a tuple with the CheckedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCheckedAt

`func (o *HasObjectResponseV1) SetCheckedAt(v string)`

SetCheckedAt sets CheckedAt field to given value.


### GetIsPresent

`func (o *HasObjectResponseV1) GetIsPresent() bool`

GetIsPresent returns the IsPresent field if non-nil, zero value otherwise.

### GetIsPresentOk

`func (o *HasObjectResponseV1) GetIsPresentOk() (*bool, bool)`

GetIsPresentOk returns a tuple with the IsPresent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPresent

`func (o *HasObjectResponseV1) SetIsPresent(v bool)`

SetIsPresent sets IsPresent field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


