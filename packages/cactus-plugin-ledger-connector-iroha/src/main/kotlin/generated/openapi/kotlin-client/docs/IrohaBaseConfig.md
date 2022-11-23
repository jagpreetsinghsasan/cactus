
# IrohaBaseConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**irohaHost** | **kotlin.String** |  |  [optional]
**irohaPort** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**creatorAccountId** | **kotlin.String** |  |  [optional]
**privKey** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional]
**quorum** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**timeoutLimit** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional]
**tls** | **kotlin.Boolean** | Can only be set to false for an insecure grpc connection. |  [optional]
**monitorMode** | **kotlin.Boolean** | Flag used for monitoring. It changes default beahviour of transaction wrapper so it return error to caller instead of throwing RuntimeError straight away. |  [optional]



