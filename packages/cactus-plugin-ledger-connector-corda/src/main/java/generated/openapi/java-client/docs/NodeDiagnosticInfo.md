

# NodeDiagnosticInfo

A NodeDiagnosticInfo holds information about the current node version.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cordapps** | [**List&lt;CordappInfo&gt;**](CordappInfo.md) | A list of CorDapps currently installed on this node |  |
|**platformVersion** | **Integer** | The platform version of this node. This number represents a released API version, and should be used to make functionality decisions (e.g. enabling an app feature only if an underlying platform feature exists) |  |
|**revision** | **String** | The git commit hash this node was built from |  |
|**vendor** | **String** | The vendor of this node |  |
|**version** | **String** | The current node version string, e.g. 4.3, 4.4-SNAPSHOT. Note that this string is effectively freeform, and so should only be used for providing diagnostic information. It should not be used to make functionality decisions (the platformVersion is a better fit for this). |  |



