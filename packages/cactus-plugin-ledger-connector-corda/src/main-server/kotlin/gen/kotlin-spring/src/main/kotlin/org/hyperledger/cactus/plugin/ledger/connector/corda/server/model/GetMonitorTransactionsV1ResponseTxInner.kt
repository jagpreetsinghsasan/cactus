package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param index 
 * @param &#x60;data&#x60; 
 */
data class GetMonitorTransactionsV1ResponseTxInner(

    @Schema(example = "null", description = "")
    @get:JsonProperty("index") val index: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: kotlin.String? = null
) {

}

