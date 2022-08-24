
# DeployContractGoSourceV1Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policyDslSource** | **kotlin.String** |  | 
**tlsRootCertFiles** | **kotlin.String** | The TLS root cert files that will be passed to the chaincode instantiation command. | 
**channelId** | **kotlin.String** | The name of the Fabric channel where the contract will get instantiated. | 
**targetOrganizations** | [**kotlin.collections.List&lt;DeploymentTargetOrganization&gt;**](DeploymentTargetOrganization.md) |  | 
**targetPeerAddresses** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of peer addresses where the contract will be instantiated. Note that at present only the first item from this array will be used which is the behavior taken from the official Fabric samples repository and therefore it is assumed to be correct usage. | 
**chainCodeVersion** | **kotlin.String** |  | 
**goSource** | [**FileBase64**](FileBase64.md) |  | 
**constructorArgs** | [**DeployContractGoSourceV1RequestConstructorArgs**](DeployContractGoSourceV1RequestConstructorArgs.md) |  |  [optional]
**goMod** | [**FileBase64**](FileBase64.md) |  |  [optional]
**moduleName** | **kotlin.String** | The go module name that will be used for the go compilation process. |  [optional]
**pinnedDeps** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional]
**modTidyOnly** | **kotlin.Boolean** | Indicates to the go chaincode compiler of Cactus if it should do an actual go compilation with the contact source or if it should just execute the go mod tidy command. |  [optional]



