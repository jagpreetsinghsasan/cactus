

# IrohaBaseConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**irohaHost** | **String** |  |  [optional] |
|**irohaPort** | **BigDecimal** |  |  [optional] |
|**creatorAccountId** | **String** |  |  [optional] |
|**privKey** | **List&lt;Object&gt;** |  |  [optional] |
|**quorum** | **BigDecimal** |  |  [optional] |
|**timeoutLimit** | **BigDecimal** |  |  [optional] |
|**tls** | **Boolean** | Can only be set to false for an insecure grpc connection. |  [optional] |
|**monitorMode** | **Boolean** | Flag used for monitoring. It changes default beahviour of transaction wrapper so it return error to caller instead of throwing RuntimeError straight away. |  [optional] |



