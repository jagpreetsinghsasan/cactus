package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param filter 
 */
data class ListFlowsV1Request(

    @Schema(example = "null", description = "")
    @get:JsonProperty("filter") val filter: kotlin.String? = null
) {

}

