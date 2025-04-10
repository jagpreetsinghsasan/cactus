/*
Hyperledger Cactus Plugin - Connector Fabric

Can perform basic tasks on a fabric ledger

API version: 2.1.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package cactus-plugin-ledger-connector-fabric

import (
	"encoding/json"
)

// checks if the CactiBlockFullResponseV1 type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CactiBlockFullResponseV1{}

// CactiBlockFullResponseV1 Custom response containing full block summary.
type CactiBlockFullResponseV1 struct {
	CactiFullEvents CactiBlockFullEventV1 `json:"cactiFullEvents"`
}

// NewCactiBlockFullResponseV1 instantiates a new CactiBlockFullResponseV1 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCactiBlockFullResponseV1(cactiFullEvents CactiBlockFullEventV1) *CactiBlockFullResponseV1 {
	this := CactiBlockFullResponseV1{}
	this.CactiFullEvents = cactiFullEvents
	return &this
}

// NewCactiBlockFullResponseV1WithDefaults instantiates a new CactiBlockFullResponseV1 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCactiBlockFullResponseV1WithDefaults() *CactiBlockFullResponseV1 {
	this := CactiBlockFullResponseV1{}
	return &this
}

// GetCactiFullEvents returns the CactiFullEvents field value
func (o *CactiBlockFullResponseV1) GetCactiFullEvents() CactiBlockFullEventV1 {
	if o == nil {
		var ret CactiBlockFullEventV1
		return ret
	}

	return o.CactiFullEvents
}

// GetCactiFullEventsOk returns a tuple with the CactiFullEvents field value
// and a boolean to check if the value has been set.
func (o *CactiBlockFullResponseV1) GetCactiFullEventsOk() (*CactiBlockFullEventV1, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CactiFullEvents, true
}

// SetCactiFullEvents sets field value
func (o *CactiBlockFullResponseV1) SetCactiFullEvents(v CactiBlockFullEventV1) {
	o.CactiFullEvents = v
}

func (o CactiBlockFullResponseV1) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CactiBlockFullResponseV1) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["cactiFullEvents"] = o.CactiFullEvents
	return toSerialize, nil
}

type NullableCactiBlockFullResponseV1 struct {
	value *CactiBlockFullResponseV1
	isSet bool
}

func (v NullableCactiBlockFullResponseV1) Get() *CactiBlockFullResponseV1 {
	return v.value
}

func (v *NullableCactiBlockFullResponseV1) Set(val *CactiBlockFullResponseV1) {
	v.value = val
	v.isSet = true
}

func (v NullableCactiBlockFullResponseV1) IsSet() bool {
	return v.isSet
}

func (v *NullableCactiBlockFullResponseV1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCactiBlockFullResponseV1(val *CactiBlockFullResponseV1) *NullableCactiBlockFullResponseV1 {
	return &NullableCactiBlockFullResponseV1{value: val, isSet: true}
}

func (v NullableCactiBlockFullResponseV1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCactiBlockFullResponseV1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


