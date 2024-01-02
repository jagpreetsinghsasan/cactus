

# CactusNode

A Cactus node can be a single server, or a set of servers behind a load balancer acting as one.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodeApiHost** | **String** |  |  |
|**publicKeyPem** | **String** | The PEM encoded public key that was used to generate the JWS included in the response (the jws property) |  |
|**id** | **String** |  |  |
|**consortiumId** | **String** |  |  |
|**memberId** | **String** |  |  |
|**ledgerIds** | **List&lt;String&gt;** | Stores an array of Ledger entity IDs that are reachable (routable) via this Cactus Node. This information is used by the client side SDK API client to figure out at runtime where to send API requests that are specific to a certain ledger such as requests to execute transactions. |  |
|**pluginInstanceIds** | **List&lt;String&gt;** |  |  |



