

# JvmType

Represents a reference to a JVM type (such as a Java class)

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fqClassName** | **String** |  |  |
|**constructorName** | **String** | This parameter is used to specify that the function used to construct this JvmType is not a constructor function but instead is a factory function. Setting this parameter will cause the plugin to look up methods of the class denoted by fqClassName instead of its constructors. |  [optional] |
|**invocationTarget** | [**JvmObject**](JvmObject.md) |  |  [optional] |



