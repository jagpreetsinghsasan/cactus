/*
 * Hyperledger Cactus Plugin - Ubiquity
 * Ubiquity wrapper for Hyperledger Cactus
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
import org.openapitools.client.model.GetTransactionsByAddressEndpoint;
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
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransactionByAddressV1Test() throws ApiException {
        GetTransactionsByAddressEndpoint getTransactionsByAddressEndpoint = null;
        api.getTransactionByAddressV1(getTransactionsByAddressEndpoint);
        // TODO: test validations
    }

}