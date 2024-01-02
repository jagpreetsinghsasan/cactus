

# TransactResponseV1

Response from transaction endpoint with operation status.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hash** | **String** | Hexadecimal hash of the transaction sent to the ledger. |  |
|**status** | **TransactionStatusV1** |  |  |
|**rejectReason** | **String** | When waitForCommit was suplied and the transaction was rejected, contains the reason of the rejection. |  [optional] |



