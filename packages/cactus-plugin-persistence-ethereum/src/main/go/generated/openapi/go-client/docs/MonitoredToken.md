# MonitoredToken

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**TokenTypeV1**](TokenTypeV1.md) |  | 
**Name** | **string** | Token name | 
**Symbol** | **string** | Token symbol | 

## Methods

### NewMonitoredToken

`func NewMonitoredToken(type_ TokenTypeV1, name string, symbol string, ) *MonitoredToken`

NewMonitoredToken instantiates a new MonitoredToken object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMonitoredTokenWithDefaults

`func NewMonitoredTokenWithDefaults() *MonitoredToken`

NewMonitoredTokenWithDefaults instantiates a new MonitoredToken object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MonitoredToken) GetType() TokenTypeV1`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MonitoredToken) GetTypeOk() (*TokenTypeV1, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MonitoredToken) SetType(v TokenTypeV1)`

SetType sets Type field to given value.


### GetName

`func (o *MonitoredToken) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MonitoredToken) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MonitoredToken) SetName(v string)`

SetName sets Name field to given value.


### GetSymbol

`func (o *MonitoredToken) GetSymbol() string`

GetSymbol returns the Symbol field if non-nil, zero value otherwise.

### GetSymbolOk

`func (o *MonitoredToken) GetSymbolOk() (*string, bool)`

GetSymbolOk returns a tuple with the Symbol field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbol

`func (o *MonitoredToken) SetSymbol(v string)`

SetSymbol sets Symbol field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


