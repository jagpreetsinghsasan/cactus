

# ConsortiumDatabase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**consortium** | [**List&lt;Consortium&gt;**](Consortium.md) | A collection of Consortium entities. In practice this should only ever contain a single consortium, but we defined it as an array to keep the convention up with the rest of the collections defined in the Consortium data in general. Also, if we ever decide to somehow have some sort of consortium to consortium integration (which does not make much sense in the current frame of mind of the author in the year 2020) then having this as an array will have proven itself to be an excellent long term compatibility/extensibility decision indeed. |  |
|**ledger** | [**List&lt;Ledger&gt;**](Ledger.md) | The complete collection of all ledger entities in existence within the consortium. |  |
|**consortiumMember** | [**List&lt;ConsortiumMember&gt;**](ConsortiumMember.md) | The complete collection of all consortium member entities in existence within the consortium. |  |
|**cactusNode** | [**List&lt;CactusNode&gt;**](CactusNode.md) | The complete collection of all cactus nodes entities in existence within the consortium. |  |
|**pluginInstance** | [**List&lt;PluginInstance&gt;**](PluginInstance.md) | The complete collection of all plugin instance entities in existence within the consortium. |  |



