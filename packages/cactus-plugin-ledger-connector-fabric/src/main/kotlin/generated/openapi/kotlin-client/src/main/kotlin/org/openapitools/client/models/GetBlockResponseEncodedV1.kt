/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * When skipDecode is true then encoded block Buffer is returned.
 *
 * @param encodedBlock 
 */


data class GetBlockResponseEncodedV1 (

    @Json(name = "encodedBlock")
    val encodedBlock: kotlin.String

)
