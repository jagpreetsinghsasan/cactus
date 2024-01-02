# StatusResponseV1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InstanceId** | **string** | Plugin instance id. | 
**Connected** | **bool** | True if successfully connected to the database, false otherwise. | 
**WebServicesRegistered** | **bool** | True if web services were correctly exported. | 
**MonitoredTokensCount** | **float32** | Total number of tokens being monitored by the plugin. | 
**OperationsRunning** | [**[]TrackedOperationV1**](TrackedOperationV1.md) |  | 
**MonitorRunning** | **bool** | True if block monitoring is running, false otherwise. | 
**LastSeenBlock** | **float32** | Number of the last block seen by the block monitor. | 

## Methods

### NewStatusResponseV1

`func NewStatusResponseV1(instanceId string, connected bool, webServicesRegistered bool, monitoredTokensCount float32, operationsRunning []TrackedOperationV1, monitorRunning bool, lastSeenBlock float32, ) *StatusResponseV1`

NewStatusResponseV1 instantiates a new StatusResponseV1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewStatusResponseV1WithDefaults

`func NewStatusResponseV1WithDefaults() *StatusResponseV1`

NewStatusResponseV1WithDefaults instantiates a new StatusResponseV1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetInstanceId

`func (o *StatusResponseV1) GetInstanceId() string`

GetInstanceId returns the InstanceId field if non-nil, zero value otherwise.

### GetInstanceIdOk

`func (o *StatusResponseV1) GetInstanceIdOk() (*string, bool)`

GetInstanceIdOk returns a tuple with the InstanceId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInstanceId

`func (o *StatusResponseV1) SetInstanceId(v string)`

SetInstanceId sets InstanceId field to given value.


### GetConnected

`func (o *StatusResponseV1) GetConnected() bool`

GetConnected returns the Connected field if non-nil, zero value otherwise.

### GetConnectedOk

`func (o *StatusResponseV1) GetConnectedOk() (*bool, bool)`

GetConnectedOk returns a tuple with the Connected field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnected

`func (o *StatusResponseV1) SetConnected(v bool)`

SetConnected sets Connected field to given value.


### GetWebServicesRegistered

`func (o *StatusResponseV1) GetWebServicesRegistered() bool`

GetWebServicesRegistered returns the WebServicesRegistered field if non-nil, zero value otherwise.

### GetWebServicesRegisteredOk

`func (o *StatusResponseV1) GetWebServicesRegisteredOk() (*bool, bool)`

GetWebServicesRegisteredOk returns a tuple with the WebServicesRegistered field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWebServicesRegistered

`func (o *StatusResponseV1) SetWebServicesRegistered(v bool)`

SetWebServicesRegistered sets WebServicesRegistered field to given value.


### GetMonitoredTokensCount

`func (o *StatusResponseV1) GetMonitoredTokensCount() float32`

GetMonitoredTokensCount returns the MonitoredTokensCount field if non-nil, zero value otherwise.

### GetMonitoredTokensCountOk

`func (o *StatusResponseV1) GetMonitoredTokensCountOk() (*float32, bool)`

GetMonitoredTokensCountOk returns a tuple with the MonitoredTokensCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonitoredTokensCount

`func (o *StatusResponseV1) SetMonitoredTokensCount(v float32)`

SetMonitoredTokensCount sets MonitoredTokensCount field to given value.


### GetOperationsRunning

`func (o *StatusResponseV1) GetOperationsRunning() []TrackedOperationV1`

GetOperationsRunning returns the OperationsRunning field if non-nil, zero value otherwise.

### GetOperationsRunningOk

`func (o *StatusResponseV1) GetOperationsRunningOk() (*[]TrackedOperationV1, bool)`

GetOperationsRunningOk returns a tuple with the OperationsRunning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOperationsRunning

`func (o *StatusResponseV1) SetOperationsRunning(v []TrackedOperationV1)`

SetOperationsRunning sets OperationsRunning field to given value.


### GetMonitorRunning

`func (o *StatusResponseV1) GetMonitorRunning() bool`

GetMonitorRunning returns the MonitorRunning field if non-nil, zero value otherwise.

### GetMonitorRunningOk

`func (o *StatusResponseV1) GetMonitorRunningOk() (*bool, bool)`

GetMonitorRunningOk returns a tuple with the MonitorRunning field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMonitorRunning

`func (o *StatusResponseV1) SetMonitorRunning(v bool)`

SetMonitorRunning sets MonitorRunning field to given value.


### GetLastSeenBlock

`func (o *StatusResponseV1) GetLastSeenBlock() float32`

GetLastSeenBlock returns the LastSeenBlock field if non-nil, zero value otherwise.

### GetLastSeenBlockOk

`func (o *StatusResponseV1) GetLastSeenBlockOk() (*float32, bool)`

GetLastSeenBlockOk returns a tuple with the LastSeenBlock field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastSeenBlock

`func (o *StatusResponseV1) SetLastSeenBlock(v float32)`

SetLastSeenBlock sets LastSeenBlock field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


