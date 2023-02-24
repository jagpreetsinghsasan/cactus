package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param success Flag set to true if operation completed correctly.
 * @param msg Message describing operation status or any errors that occurred.
 */
data class ClearMonitorTransactionsV1Response(

    @Schema(example = "null", required = true, description = "Flag set to true if operation completed correctly.")
    @get:JsonProperty("success", required = true) val success: kotlin.Boolean,

    @Schema(example = "null", required = true, description = "Message describing operation status or any errors that occurred.")
    @get:JsonProperty("msg", required = true) val msg: kotlin.String
) {

}

