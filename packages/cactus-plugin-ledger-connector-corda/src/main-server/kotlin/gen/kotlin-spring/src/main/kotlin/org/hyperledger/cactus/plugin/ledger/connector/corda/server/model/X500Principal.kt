package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param name 
 * @param encoded Base64 encoded public key
 */
data class X500Principal(

    @Schema(example = "O=PartyA,L=London,C=GB", required = true, description = "")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "MC8xCzAJBgNVBAYTAkdCMQ8wDQYDVQQHDAZMb25kb24xDzANBgNVBAoMBlBhcnR5QQ==", required = true, description = "Base64 encoded public key")
    @get:JsonProperty("encoded", required = true) val encoded: kotlin.String
) {

}

