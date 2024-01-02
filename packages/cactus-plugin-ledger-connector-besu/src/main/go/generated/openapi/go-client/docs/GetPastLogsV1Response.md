# GetPastLogsV1Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Logs** | [**[]EvmLog**](EvmLog.md) |  | 

## Methods

### NewGetPastLogsV1Response

`func NewGetPastLogsV1Response(logs []EvmLog, ) *GetPastLogsV1Response`

NewGetPastLogsV1Response instantiates a new GetPastLogsV1Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGetPastLogsV1ResponseWithDefaults

`func NewGetPastLogsV1ResponseWithDefaults() *GetPastLogsV1Response`

NewGetPastLogsV1ResponseWithDefaults instantiates a new GetPastLogsV1Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLogs

`func (o *GetPastLogsV1Response) GetLogs() []EvmLog`

GetLogs returns the Logs field if non-nil, zero value otherwise.

### GetLogsOk

`func (o *GetPastLogsV1Response) GetLogsOk() (*[]EvmLog, bool)`

GetLogsOk returns a tuple with the Logs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogs

`func (o *GetPastLogsV1Response) SetLogs(v []EvmLog)`

SetLogs sets Logs field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


