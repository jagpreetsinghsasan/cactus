
# DeployContractV1Request

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ccLang** | [**ChainCodeProgrammingLanguage**](ChainCodeProgrammingLanguage.md) |  | 
**caFile** | **kotlin.String** | File-system path pointing at the CA file. | 
**orderer** | **kotlin.String** | Ordering service endpoint specified as &lt;hostname or IP address&gt;:&lt;port&gt; | 
**ordererTLSHostnameOverride** | **kotlin.String** | The hostname override to use when validating the TLS connection to the orderer | 
**channelId** | **kotlin.String** | The name of the Fabric channel where the contract will get instantiated. | 
**targetOrganizations** | [**kotlin.collections.List&lt;DeploymentTargetOrganization&gt;**](DeploymentTargetOrganization.md) |  | 
**ccSequence** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  | 
**ccVersion** | **kotlin.String** |  | 
**ccName** | **kotlin.String** |  | 
**ccLabel** | **kotlin.String** | Human readable label to uniquely identify the contract. Recommended to include in this at least the contract name and the exact version in order to make it easily distinguishable from other deployments of the same contract. | 
**sourceFiles** | [**kotlin.collections.List&lt;FileBase64&gt;**](FileBase64.md) | The your-smart-contract.go file where the functionality of your contract is implemented. | 
**connTimeout** | **kotlin.Int** | Timeout for client to connect (default 3s) |  [optional]
**signaturePolicy** | **kotlin.String** | Passed in to the peer via the --signature-policy argument on the command line. See also: https://hyperledger-fabric.readthedocs.io/en/release-2.2/endorsement-policies.html#setting-chaincode-level-endorsement-policies |  [optional]
**collectionsConfigFile** | **kotlin.String** | Name of the collections config file as present in the sourceFiles array of the request. |  [optional]
**constructorArgs** | [**DeployContractGoSourceV1RequestConstructorArgs**](DeployContractGoSourceV1RequestConstructorArgs.md) |  |  [optional]



