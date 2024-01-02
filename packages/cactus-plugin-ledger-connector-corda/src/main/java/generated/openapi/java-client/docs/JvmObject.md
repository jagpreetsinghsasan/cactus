

# JvmObject

Can represent JVM primitive and reference types as well. The jvmTypeKind field indicates which one is being stored. If the jvmTypeKind field is set to REFERENCE then the jvmCtorArgs array is expected to be filled, otherwise (e.g. PRIMITIVE jvmTypeKind) it is expected that the primitiveValue property is filled with a primitive data type supported by the JSON standard such as strings, booleans, numbers, etc.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**jvmTypeKind** | **JvmTypeKind** |  |  |
|**primitiveValue** | **Object** |  |  [optional] |
|**jvmCtorArgs** | [**List&lt;JvmObject&gt;**](JvmObject.md) |  |  [optional] |
|**jvmType** | [**JvmType**](JvmType.md) |  |  |



