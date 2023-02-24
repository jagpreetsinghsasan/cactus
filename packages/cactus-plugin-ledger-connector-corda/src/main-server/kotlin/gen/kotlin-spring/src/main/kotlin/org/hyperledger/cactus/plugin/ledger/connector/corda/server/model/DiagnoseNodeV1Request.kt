package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param nodeIds Optional property specifying which Corda Node should be the one being diagnosed in case the Connector has multiple connections established for different nodes (which is not yet a supported feature, but we want to keep this possibility open for the future).
 */
data class DiagnoseNodeV1Request(

    @get:Size(min=0,max=1024) 
    @Schema(example = "null", description = "Optional property specifying which Corda Node should be the one being diagnosed in case the Connector has multiple connections established for different nodes (which is not yet a supported feature, but we want to keep this possibility open for the future).")
    @get:JsonProperty("nodeIds") val nodeIds: kotlin.collections.List<kotlin.String>? = arrayListOf()
) {

}

