

# TransactRequestV1

Request to transact endpoint.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**signedTransaction** | **String** | Signed transaction binary data received from generate-transaction endpoint. |  [optional] |
|**transaction** | [**IrohaTransactionDefinitionV1**](IrohaTransactionDefinitionV1.md) |  |  [optional] |
|**waitForCommit** | **Boolean** | Wait unitl transaction is sent and return the final status (committed / rejected) |  [optional] |
|**baseConfig** | [**Iroha2BaseConfig**](Iroha2BaseConfig.md) |  |  [optional] |



