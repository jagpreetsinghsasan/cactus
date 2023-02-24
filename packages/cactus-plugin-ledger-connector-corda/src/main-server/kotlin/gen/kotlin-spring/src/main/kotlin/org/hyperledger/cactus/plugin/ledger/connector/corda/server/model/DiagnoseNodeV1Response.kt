package org.hyperledger.cactus.plugin.ledger.connector.corda.server.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.hyperledger.cactus.plugin.ledger.connector.corda.server.model.NodeDiagnosticInfo
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param nodeDiagnosticInfo 
 */
data class DiagnoseNodeV1Response(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("nodeDiagnosticInfo", required = true) val nodeDiagnosticInfo: NodeDiagnosticInfo
) {

}

