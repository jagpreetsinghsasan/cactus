/*
 * Hyperledger Cactus Plugin - Connector Fabric
 * Can perform basic tasks on a fabric ledger
 *
 * The version of the OpenAPI document: v2.0.0-alpha.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.DeployContractGoSourceV1501Response;
import org.openapitools.client.model.DeployContractGoSourceV1Request;
import org.openapitools.client.model.DeployContractGoSourceV1Response;
import org.openapitools.client.model.DeployContractV1Request;
import org.openapitools.client.model.DeployContractV1Response;
import org.openapitools.client.model.ErrorExceptionResponseV1;
import org.openapitools.client.model.GetBlockRequestV1;
import org.openapitools.client.model.GetBlockResponseV1;
import org.openapitools.client.model.GetTransactionReceiptResponse;
import org.openapitools.client.model.RunTransactionRequest;
import org.openapitools.client.model.RunTransactionResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Disabled
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Deploys a chaincode contract in the form of a go sources.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deployContractGoSourceV1Test() throws ApiException {
        DeployContractGoSourceV1Request deployContractGoSourceV1Request = null;
        DeployContractGoSourceV1Response response = api.deployContractGoSourceV1(deployContractGoSourceV1Request);
        // TODO: test validations
    }

    /**
     * Deploys a chaincode contract from a set of source files. Note: This endpoint only supports Fabric 2.x. The &#39;v1&#39; suffix in the method name refers to the Cactus API version, not the supported Fabric ledger version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deployContractV1Test() throws ApiException {
        DeployContractV1Request deployContractV1Request = null;
        DeployContractV1Response response = api.deployContractV1(deployContractV1Request);
        // TODO: test validations
    }

    /**
     * Get block from the channel using one of selectors from the input. Works only on Fabric 2.x.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBlockV1Test() throws ApiException {
        GetBlockRequestV1 getBlockRequestV1 = null;
        GetBlockResponseV1 response = api.getBlockV1(getBlockRequestV1);
        // TODO: test validations
    }

    /**
     * Get the Prometheus Metrics
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPrometheusMetricsV1Test() throws ApiException {
        String response = api.getPrometheusMetricsV1();
        // TODO: test validations
    }

    /**
     * get a transaction receipt by tx id on a Fabric ledger.
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransactionReceiptByTxIDV1Test() throws ApiException {
        RunTransactionRequest runTransactionRequest = null;
        GetTransactionReceiptResponse response = api.getTransactionReceiptByTxIDV1(runTransactionRequest);
        // TODO: test validations
    }

    /**
     * Runs a transaction on a Fabric ledger.
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void runTransactionV1Test() throws ApiException {
        RunTransactionRequest runTransactionRequest = null;
        RunTransactionResponse response = api.runTransactionV1(runTransactionRequest);
        // TODO: test validations
    }

}