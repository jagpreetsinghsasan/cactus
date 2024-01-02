# BesuPrivateTransactionConfig

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PrivateFrom** | **string** |  | 
**PrivateFor** | **[]interface{}** |  | [default to []]

## Methods

### NewBesuPrivateTransactionConfig

`func NewBesuPrivateTransactionConfig(privateFrom string, privateFor []interface{}, ) *BesuPrivateTransactionConfig`

NewBesuPrivateTransactionConfig instantiates a new BesuPrivateTransactionConfig object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBesuPrivateTransactionConfigWithDefaults

`func NewBesuPrivateTransactionConfigWithDefaults() *BesuPrivateTransactionConfig`

NewBesuPrivateTransactionConfigWithDefaults instantiates a new BesuPrivateTransactionConfig object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPrivateFrom

`func (o *BesuPrivateTransactionConfig) GetPrivateFrom() string`

GetPrivateFrom returns the PrivateFrom field if non-nil, zero value otherwise.

### GetPrivateFromOk

`func (o *BesuPrivateTransactionConfig) GetPrivateFromOk() (*string, bool)`

GetPrivateFromOk returns a tuple with the PrivateFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivateFrom

`func (o *BesuPrivateTransactionConfig) SetPrivateFrom(v string)`

SetPrivateFrom sets PrivateFrom field to given value.


### GetPrivateFor

`func (o *BesuPrivateTransactionConfig) GetPrivateFor() []interface{}`

GetPrivateFor returns the PrivateFor field if non-nil, zero value otherwise.

### GetPrivateForOk

`func (o *BesuPrivateTransactionConfig) GetPrivateForOk() (*[]interface{}, bool)`

GetPrivateForOk returns a tuple with the PrivateFor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrivateFor

`func (o *BesuPrivateTransactionConfig) SetPrivateFor(v []interface{})`

SetPrivateFor sets PrivateFor field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


