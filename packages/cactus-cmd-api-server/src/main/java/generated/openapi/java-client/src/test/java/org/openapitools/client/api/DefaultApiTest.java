/*
 * Hyperledger Cactus API
 * Interact with a Cactus deployment through HTTP.
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
import org.openapitools.client.model.HealthCheckResponse;
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
     * Can be used to verify liveness of an API server instance
     *
     * Returns the current timestamp of the API server as proof of health/liveness
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHealthCheckV1Test() throws ApiException {
        HealthCheckResponse response = api.getHealthCheckV1();
        // TODO: test validations
    }

    /**
     * Returns the openapi.json document of specific plugin.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOpenApiSpecV1Test() throws ApiException {
        String response = api.getOpenApiSpecV1();
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

}