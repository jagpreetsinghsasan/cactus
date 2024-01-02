

# DeployContractV1Request


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ccLang** | **ChainCodeProgrammingLanguage** |  |  |
|**caFile** | **String** | File-system path pointing at the CA file. |  |
|**orderer** | **String** | Ordering service endpoint specified as &lt;hostname or IP address&gt;:&lt;port&gt; |  |
|**ordererTLSHostnameOverride** | **String** | The hostname override to use when validating the TLS connection to the orderer |  |
|**connTimeout** | **Integer** | Timeout for client to connect (default 3s) |  [optional] |
|**signaturePolicy** | **String** | Passed in to the peer via the --signature-policy argument on the command line. See also: https://hyperledger-fabric.readthedocs.io/en/release-2.2/endorsement-policies.html#setting-chaincode-level-endorsement-policies |  [optional] |
|**collectionsConfigFile** | **String** | Name of the collections config file as present in the sourceFiles array of the request. |  [optional] |
|**channelId** | **String** | The name of the Fabric channel where the contract will get instantiated. |  |
|**targetOrganizations** | [**List&lt;DeploymentTargetOrganization&gt;**](DeploymentTargetOrganization.md) |  |  |
|**constructorArgs** | [**DeployContractGoSourceV1RequestConstructorArgs**](DeployContractGoSourceV1RequestConstructorArgs.md) |  |  [optional] |
|**ccSequence** | **BigDecimal** |  |  |
|**ccVersion** | **String** |  |  |
|**ccName** | **String** |  |  |
|**ccLabel** | **String** | Human readable label to uniquely identify the contract. Recommended to include in this at least the contract name and the exact version in order to make it easily distinguishable from other deployments of the same contract. |  |
|**sourceFiles** | [**List&lt;FileBase64&gt;**](FileBase64.md) | The your-smart-contract.go file where the functionality of your contract is implemented. |  |



