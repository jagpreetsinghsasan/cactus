package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param errors 
 */
data class DeployContractJarsBadRequestV1Response(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("errors", required = true) val errors: kotlin.collections.List<kotlin.String>
) {

}

