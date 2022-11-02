
# CactusNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodeApiHost** | **kotlin.String** |  | 
**publicKeyPem** | **kotlin.String** | The PEM encoded public key that was used to generate the JWS included in the response (the jws property) | 
**id** | **kotlin.String** |  | 
**consortiumId** | **kotlin.String** |  | 
**memberId** | **kotlin.String** |  | 
**ledgerIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | Stores an array of Ledger entity IDs that are reachable (routable) via this Cactus Node. This information is used by the client side SDK API client to figure out at runtime where to send API requests that are specific to a certain ledger such as requests to execute transactions. | 
**pluginInstanceIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  | 



