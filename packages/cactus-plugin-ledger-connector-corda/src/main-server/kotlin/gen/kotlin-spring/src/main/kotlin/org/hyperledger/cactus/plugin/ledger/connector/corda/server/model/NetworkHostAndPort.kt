package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param host 
 * @param port 
 */
data class NetworkHostAndPort(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("host", required = true) val host: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("port", required = true) val port: java.math.BigDecimal
) {

}

