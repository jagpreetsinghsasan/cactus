/*
 * Hyperledger Cactus Plugin - Connector Xdai
 * Can perform basic tasks on a Xdai ledger
 *
 * The version of the OpenAPI document: v2.0.0-alpha.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.DeployContractJsonObjectV1Request;
import org.openapitools.client.model.DeployContractV1Request;
import org.openapitools.client.model.DeployContractV1Response;
import org.openapitools.client.model.InvokeContractJsonObjectV1Request;
import org.openapitools.client.model.InvokeContractV1Request;
import org.openapitools.client.model.InvokeContractV1Response;
import org.openapitools.client.model.RunTransactionV1Request;
import org.openapitools.client.model.RunTransactionV1Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DefaultApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for deployContractJsonObjectV1
     * @param deployContractJsonObjectV1Request  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deployContractJsonObjectV1Call(DeployContractJsonObjectV1Request deployContractJsonObjectV1Request, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deployContractJsonObjectV1Request;

        // create path and map variables
        String localVarPath = "/api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/deploy-contract-solidity-bytecode-json-object";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deployContractJsonObjectV1ValidateBeforeCall(DeployContractJsonObjectV1Request deployContractJsonObjectV1Request, final ApiCallback _callback) throws ApiException {
        return deployContractJsonObjectV1Call(deployContractJsonObjectV1Request, _callback);

    }

    /**
     * Deploys the bytecode of a Solidity contract.
     * 
     * @param deployContractJsonObjectV1Request  (optional)
     * @return DeployContractV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DeployContractV1Response deployContractJsonObjectV1(DeployContractJsonObjectV1Request deployContractJsonObjectV1Request) throws ApiException {
        ApiResponse<DeployContractV1Response> localVarResp = deployContractJsonObjectV1WithHttpInfo(deployContractJsonObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Deploys the bytecode of a Solidity contract.
     * 
     * @param deployContractJsonObjectV1Request  (optional)
     * @return ApiResponse&lt;DeployContractV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeployContractV1Response> deployContractJsonObjectV1WithHttpInfo(DeployContractJsonObjectV1Request deployContractJsonObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = deployContractJsonObjectV1ValidateBeforeCall(deployContractJsonObjectV1Request, null);
        Type localVarReturnType = new TypeToken<DeployContractV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deploys the bytecode of a Solidity contract. (asynchronously)
     * 
     * @param deployContractJsonObjectV1Request  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deployContractJsonObjectV1Async(DeployContractJsonObjectV1Request deployContractJsonObjectV1Request, final ApiCallback<DeployContractV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = deployContractJsonObjectV1ValidateBeforeCall(deployContractJsonObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<DeployContractV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deployContractV1
     * @param deployContractV1Request  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deployContractV1Call(DeployContractV1Request deployContractV1Request, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = deployContractV1Request;

        // create path and map variables
        String localVarPath = "/api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/deploy-contract-solidity-bytecode";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deployContractV1ValidateBeforeCall(DeployContractV1Request deployContractV1Request, final ApiCallback _callback) throws ApiException {
        return deployContractV1Call(deployContractV1Request, _callback);

    }

    /**
     * Deploys the bytecode of a Solidity contract.
     * 
     * @param deployContractV1Request  (optional)
     * @return DeployContractV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DeployContractV1Response deployContractV1(DeployContractV1Request deployContractV1Request) throws ApiException {
        ApiResponse<DeployContractV1Response> localVarResp = deployContractV1WithHttpInfo(deployContractV1Request);
        return localVarResp.getData();
    }

    /**
     * Deploys the bytecode of a Solidity contract.
     * 
     * @param deployContractV1Request  (optional)
     * @return ApiResponse&lt;DeployContractV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeployContractV1Response> deployContractV1WithHttpInfo(DeployContractV1Request deployContractV1Request) throws ApiException {
        okhttp3.Call localVarCall = deployContractV1ValidateBeforeCall(deployContractV1Request, null);
        Type localVarReturnType = new TypeToken<DeployContractV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deploys the bytecode of a Solidity contract. (asynchronously)
     * 
     * @param deployContractV1Request  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deployContractV1Async(DeployContractV1Request deployContractV1Request, final ApiCallback<DeployContractV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = deployContractV1ValidateBeforeCall(deployContractV1Request, _callback);
        Type localVarReturnType = new TypeToken<DeployContractV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPrometheusMetricsV1
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrometheusMetricsV1Call(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/get-prometheus-exporter-metrics";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPrometheusMetricsV1ValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getPrometheusMetricsV1Call(_callback);

    }

    /**
     * Get the Prometheus Metrics
     * 
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public String getPrometheusMetricsV1() throws ApiException {
        ApiResponse<String> localVarResp = getPrometheusMetricsV1WithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get the Prometheus Metrics
     * 
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getPrometheusMetricsV1WithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getPrometheusMetricsV1ValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the Prometheus Metrics (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPrometheusMetricsV1Async(final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPrometheusMetricsV1ValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for invokeContractJsonObject
     * @param invokeContractJsonObjectV1Request  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invokeContractJsonObjectCall(InvokeContractJsonObjectV1Request invokeContractJsonObjectV1Request, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = invokeContractJsonObjectV1Request;

        // create path and map variables
        String localVarPath = "/api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/invoke-contract-json-object";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call invokeContractJsonObjectValidateBeforeCall(InvokeContractJsonObjectV1Request invokeContractJsonObjectV1Request, final ApiCallback _callback) throws ApiException {
        return invokeContractJsonObjectCall(invokeContractJsonObjectV1Request, _callback);

    }

    /**
     * Invokes a contract on a besu ledger
     * 
     * @param invokeContractJsonObjectV1Request  (optional)
     * @return InvokeContractV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public InvokeContractV1Response invokeContractJsonObject(InvokeContractJsonObjectV1Request invokeContractJsonObjectV1Request) throws ApiException {
        ApiResponse<InvokeContractV1Response> localVarResp = invokeContractJsonObjectWithHttpInfo(invokeContractJsonObjectV1Request);
        return localVarResp.getData();
    }

    /**
     * Invokes a contract on a besu ledger
     * 
     * @param invokeContractJsonObjectV1Request  (optional)
     * @return ApiResponse&lt;InvokeContractV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvokeContractV1Response> invokeContractJsonObjectWithHttpInfo(InvokeContractJsonObjectV1Request invokeContractJsonObjectV1Request) throws ApiException {
        okhttp3.Call localVarCall = invokeContractJsonObjectValidateBeforeCall(invokeContractJsonObjectV1Request, null);
        Type localVarReturnType = new TypeToken<InvokeContractV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Invokes a contract on a besu ledger (asynchronously)
     * 
     * @param invokeContractJsonObjectV1Request  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invokeContractJsonObjectAsync(InvokeContractJsonObjectV1Request invokeContractJsonObjectV1Request, final ApiCallback<InvokeContractV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = invokeContractJsonObjectValidateBeforeCall(invokeContractJsonObjectV1Request, _callback);
        Type localVarReturnType = new TypeToken<InvokeContractV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for invokeContractV1
     * @param invokeContractV1Request  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invokeContractV1Call(InvokeContractV1Request invokeContractV1Request, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = invokeContractV1Request;

        // create path and map variables
        String localVarPath = "/api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/invoke-contract";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call invokeContractV1ValidateBeforeCall(InvokeContractV1Request invokeContractV1Request, final ApiCallback _callback) throws ApiException {
        return invokeContractV1Call(invokeContractV1Request, _callback);

    }

    /**
     * Invokes a contract on a xdai ledger
     * 
     * @param invokeContractV1Request  (optional)
     * @return InvokeContractV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public InvokeContractV1Response invokeContractV1(InvokeContractV1Request invokeContractV1Request) throws ApiException {
        ApiResponse<InvokeContractV1Response> localVarResp = invokeContractV1WithHttpInfo(invokeContractV1Request);
        return localVarResp.getData();
    }

    /**
     * Invokes a contract on a xdai ledger
     * 
     * @param invokeContractV1Request  (optional)
     * @return ApiResponse&lt;InvokeContractV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvokeContractV1Response> invokeContractV1WithHttpInfo(InvokeContractV1Request invokeContractV1Request) throws ApiException {
        okhttp3.Call localVarCall = invokeContractV1ValidateBeforeCall(invokeContractV1Request, null);
        Type localVarReturnType = new TypeToken<InvokeContractV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Invokes a contract on a xdai ledger (asynchronously)
     * 
     * @param invokeContractV1Request  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call invokeContractV1Async(InvokeContractV1Request invokeContractV1Request, final ApiCallback<InvokeContractV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = invokeContractV1ValidateBeforeCall(invokeContractV1Request, _callback);
        Type localVarReturnType = new TypeToken<InvokeContractV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for runTransactionV1
     * @param runTransactionV1Request  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runTransactionV1Call(RunTransactionV1Request runTransactionV1Request, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = runTransactionV1Request;

        // create path and map variables
        String localVarPath = "/api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-xdai/run-transaction";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call runTransactionV1ValidateBeforeCall(RunTransactionV1Request runTransactionV1Request, final ApiCallback _callback) throws ApiException {
        return runTransactionV1Call(runTransactionV1Request, _callback);

    }

    /**
     * Executes a transaction on a xdai ledger
     * 
     * @param runTransactionV1Request  (optional)
     * @return RunTransactionV1Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public RunTransactionV1Response runTransactionV1(RunTransactionV1Request runTransactionV1Request) throws ApiException {
        ApiResponse<RunTransactionV1Response> localVarResp = runTransactionV1WithHttpInfo(runTransactionV1Request);
        return localVarResp.getData();
    }

    /**
     * Executes a transaction on a xdai ledger
     * 
     * @param runTransactionV1Request  (optional)
     * @return ApiResponse&lt;RunTransactionV1Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<RunTransactionV1Response> runTransactionV1WithHttpInfo(RunTransactionV1Request runTransactionV1Request) throws ApiException {
        okhttp3.Call localVarCall = runTransactionV1ValidateBeforeCall(runTransactionV1Request, null);
        Type localVarReturnType = new TypeToken<RunTransactionV1Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Executes a transaction on a xdai ledger (asynchronously)
     * 
     * @param runTransactionV1Request  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runTransactionV1Async(RunTransactionV1Request runTransactionV1Request, final ApiCallback<RunTransactionV1Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = runTransactionV1ValidateBeforeCall(runTransactionV1Request, _callback);
        Type localVarReturnType = new TypeToken<RunTransactionV1Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}