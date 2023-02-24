package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.hyperledger.cactus.plugin.ledger.connector.corda.server.model.NetworkHostAndPort
import org.hyperledger.cactus.plugin.ledger.connector.corda.server.model.Party
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param addresses 
 * @param platformVersion 
 * @param serial 
 * @param legalIdentities 
 * @param legalIdentitiesAndCerts 
 */
data class NodeInfo(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("addresses", required = true) val addresses: kotlin.collections.List<NetworkHostAndPort>,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("platformVersion", required = true) val platformVersion: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("serial", required = true) val serial: java.math.BigDecimal,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("legalIdentities", required = true) val legalIdentities: kotlin.collections.List<Party>,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("legalIdentitiesAndCerts", required = true) val legalIdentitiesAndCerts: kotlin.collections.List<kotlin.Any>
) {

}

