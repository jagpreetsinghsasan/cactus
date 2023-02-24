package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* 
* Values: PRIMITIVE,REFERENCE
*/
enum class JvmTypeKind(val value: kotlin.String) {

    @JsonProperty("PRIMITIVE") PRIMITIVE("PRIMITIVE"),
    @JsonProperty("REFERENCE") REFERENCE("REFERENCE")
}

