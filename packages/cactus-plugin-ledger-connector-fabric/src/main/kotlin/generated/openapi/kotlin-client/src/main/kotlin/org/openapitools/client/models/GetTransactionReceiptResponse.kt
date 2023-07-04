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

import org.openapitools.client.models.TransactReceiptBlockMetaData
import org.openapitools.client.models.TransactReceiptTransactionCreator
import org.openapitools.client.models.TransactReceiptTransactionEndorsement

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param blockNumber 
 * @param channelID 
 * @param transactionCreator 
 * @param transactionEndorsement 
 * @param blockMetaData 
 * @param chainCodeName 
 * @param chainCodeVersion 
 * @param responseStatus 
 * @param rwsetKey 
 * @param rwsetWriteData 
 */


data class GetTransactionReceiptResponse (

    @Json(name = "blockNumber")
    val blockNumber: kotlin.String? = null,

    @Json(name = "channelID")
    val channelID: kotlin.String? = null,

    @Json(name = "transactionCreator")
    val transactionCreator: TransactReceiptTransactionCreator? = null,

    @Json(name = "transactionEndorsement")
    val transactionEndorsement: kotlin.collections.List<TransactReceiptTransactionEndorsement>? = null,

    @Json(name = "blockMetaData")
    val blockMetaData: TransactReceiptBlockMetaData? = null,

    @Json(name = "chainCodeName")
    val chainCodeName: kotlin.String? = null,

    @Json(name = "chainCodeVersion")
    val chainCodeVersion: kotlin.String? = null,

    @Json(name = "responseStatus")
    val responseStatus: kotlin.String? = null,

    @Json(name = "rwsetKey")
    val rwsetKey: kotlin.String? = null,

    @Json(name = "rwsetWriteData")
    val rwsetWriteData: kotlin.String? = null

)
