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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.FabricContractInvocationType;
import org.openapitools.client.model.FabricSigningCredential;
import org.openapitools.client.model.GatewayOptions;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RunTransactionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:35.195240170+05:30[Asia/Kolkata]")
public class RunTransactionRequest {
  public static final String SERIALIZED_NAME_ENDORSING_PEERS = "endorsingPeers";
  @SerializedName(SERIALIZED_NAME_ENDORSING_PEERS)
  private List<String> endorsingPeers;

  public static final String SERIALIZED_NAME_TRANSIENT_DATA = "transientData";
  @SerializedName(SERIALIZED_NAME_TRANSIENT_DATA)
  private Object transientData;

  public static final String SERIALIZED_NAME_GATEWAY_OPTIONS = "gatewayOptions";
  @SerializedName(SERIALIZED_NAME_GATEWAY_OPTIONS)
  private GatewayOptions gatewayOptions;

  public static final String SERIALIZED_NAME_SIGNING_CREDENTIAL = "signingCredential";
  @SerializedName(SERIALIZED_NAME_SIGNING_CREDENTIAL)
  private FabricSigningCredential signingCredential;

  public static final String SERIALIZED_NAME_CHANNEL_NAME = "channelName";
  @SerializedName(SERIALIZED_NAME_CHANNEL_NAME)
  private String channelName;

  public static final String SERIALIZED_NAME_CONTRACT_NAME = "contractName";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NAME)
  private String contractName;

  public static final String SERIALIZED_NAME_INVOCATION_TYPE = "invocationType";
  @SerializedName(SERIALIZED_NAME_INVOCATION_TYPE)
  private FabricContractInvocationType invocationType;

  public static final String SERIALIZED_NAME_METHOD_NAME = "methodName";
  @SerializedName(SERIALIZED_NAME_METHOD_NAME)
  private String methodName;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<String> params = null;

  public static final String SERIALIZED_NAME_ENDORSING_PARTIES = "endorsingParties";
  @SerializedName(SERIALIZED_NAME_ENDORSING_PARTIES)
  private List<String> endorsingParties = null;

  public static final String SERIALIZED_NAME_RESPONSE_TYPE = "responseType";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TYPE)
  private String responseType;

  public RunTransactionRequest() {
  }

  public RunTransactionRequest endorsingPeers(List<String> endorsingPeers) {
    
    this.endorsingPeers = endorsingPeers;
    return this;
  }

  public RunTransactionRequest addEndorsingPeersItem(String endorsingPeersItem) {
    if (this.endorsingPeers == null) {
      this.endorsingPeers = new ArrayList<>();
    }
    this.endorsingPeers.add(endorsingPeersItem);
    return this;
  }

   /**
   * An array of MSP IDs to set as the list of endorsing peers for the transaction.
   * @return endorsingPeers
  **/
  @javax.annotation.Nullable
  public List<String> getEndorsingPeers() {
    return endorsingPeers;
  }


  public void setEndorsingPeers(List<String> endorsingPeers) {
    this.endorsingPeers = endorsingPeers;
  }


  public RunTransactionRequest transientData(Object transientData) {
    
    this.transientData = transientData;
    return this;
  }

   /**
   * Get transientData
   * @return transientData
  **/
  @javax.annotation.Nullable
  public Object getTransientData() {
    return transientData;
  }


  public void setTransientData(Object transientData) {
    this.transientData = transientData;
  }


  public RunTransactionRequest gatewayOptions(GatewayOptions gatewayOptions) {
    
    this.gatewayOptions = gatewayOptions;
    return this;
  }

   /**
   * Get gatewayOptions
   * @return gatewayOptions
  **/
  @javax.annotation.Nullable
  public GatewayOptions getGatewayOptions() {
    return gatewayOptions;
  }


  public void setGatewayOptions(GatewayOptions gatewayOptions) {
    this.gatewayOptions = gatewayOptions;
  }


  public RunTransactionRequest signingCredential(FabricSigningCredential signingCredential) {
    
    this.signingCredential = signingCredential;
    return this;
  }

   /**
   * Get signingCredential
   * @return signingCredential
  **/
  @javax.annotation.Nonnull
  public FabricSigningCredential getSigningCredential() {
    return signingCredential;
  }


  public void setSigningCredential(FabricSigningCredential signingCredential) {
    this.signingCredential = signingCredential;
  }


  public RunTransactionRequest channelName(String channelName) {
    
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @javax.annotation.Nonnull
  public String getChannelName() {
    return channelName;
  }


  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  public RunTransactionRequest contractName(String contractName) {
    
    this.contractName = contractName;
    return this;
  }

   /**
   * Get contractName
   * @return contractName
  **/
  @javax.annotation.Nonnull
  public String getContractName() {
    return contractName;
  }


  public void setContractName(String contractName) {
    this.contractName = contractName;
  }


  public RunTransactionRequest invocationType(FabricContractInvocationType invocationType) {
    
    this.invocationType = invocationType;
    return this;
  }

   /**
   * Get invocationType
   * @return invocationType
  **/
  @javax.annotation.Nonnull
  public FabricContractInvocationType getInvocationType() {
    return invocationType;
  }


  public void setInvocationType(FabricContractInvocationType invocationType) {
    this.invocationType = invocationType;
  }


  public RunTransactionRequest methodName(String methodName) {
    
    this.methodName = methodName;
    return this;
  }

   /**
   * Get methodName
   * @return methodName
  **/
  @javax.annotation.Nonnull
  public String getMethodName() {
    return methodName;
  }


  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }


  public RunTransactionRequest params(List<String> params) {
    
    this.params = params;
    return this;
  }

  public RunTransactionRequest addParamsItem(String paramsItem) {
    if (this.params == null) {
      this.params = null;
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nonnull
  public List<String> getParams() {
    return params;
  }


  public void setParams(List<String> params) {
    this.params = params;
  }


  public RunTransactionRequest endorsingParties(List<String> endorsingParties) {
    
    this.endorsingParties = endorsingParties;
    return this;
  }

  public RunTransactionRequest addEndorsingPartiesItem(String endorsingPartiesItem) {
    if (this.endorsingParties == null) {
      this.endorsingParties = null;
    }
    this.endorsingParties.add(endorsingPartiesItem);
    return this;
  }

   /**
   * Get endorsingParties
   * @return endorsingParties
  **/
  @javax.annotation.Nullable
  public List<String> getEndorsingParties() {
    return endorsingParties;
  }


  public void setEndorsingParties(List<String> endorsingParties) {
    this.endorsingParties = endorsingParties;
  }


  public RunTransactionRequest responseType(String responseType) {
    
    this.responseType = responseType;
    return this;
  }

   /**
   * Get responseType
   * @return responseType
  **/
  @javax.annotation.Nullable
  public String getResponseType() {
    return responseType;
  }


  public void setResponseType(String responseType) {
    this.responseType = responseType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunTransactionRequest runTransactionRequest = (RunTransactionRequest) o;
    return Objects.equals(this.endorsingPeers, runTransactionRequest.endorsingPeers) &&
        Objects.equals(this.transientData, runTransactionRequest.transientData) &&
        Objects.equals(this.gatewayOptions, runTransactionRequest.gatewayOptions) &&
        Objects.equals(this.signingCredential, runTransactionRequest.signingCredential) &&
        Objects.equals(this.channelName, runTransactionRequest.channelName) &&
        Objects.equals(this.contractName, runTransactionRequest.contractName) &&
        Objects.equals(this.invocationType, runTransactionRequest.invocationType) &&
        Objects.equals(this.methodName, runTransactionRequest.methodName) &&
        Objects.equals(this.params, runTransactionRequest.params) &&
        Objects.equals(this.endorsingParties, runTransactionRequest.endorsingParties) &&
        Objects.equals(this.responseType, runTransactionRequest.responseType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(endorsingPeers, transientData, gatewayOptions, signingCredential, channelName, contractName, invocationType, methodName, params, endorsingParties, responseType);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunTransactionRequest {\n");
    sb.append("    endorsingPeers: ").append(toIndentedString(endorsingPeers)).append("\n");
    sb.append("    transientData: ").append(toIndentedString(transientData)).append("\n");
    sb.append("    gatewayOptions: ").append(toIndentedString(gatewayOptions)).append("\n");
    sb.append("    signingCredential: ").append(toIndentedString(signingCredential)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    contractName: ").append(toIndentedString(contractName)).append("\n");
    sb.append("    invocationType: ").append(toIndentedString(invocationType)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    endorsingParties: ").append(toIndentedString(endorsingParties)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("endorsingPeers");
    openapiFields.add("transientData");
    openapiFields.add("gatewayOptions");
    openapiFields.add("signingCredential");
    openapiFields.add("channelName");
    openapiFields.add("contractName");
    openapiFields.add("invocationType");
    openapiFields.add("methodName");
    openapiFields.add("params");
    openapiFields.add("endorsingParties");
    openapiFields.add("responseType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("signingCredential");
    openapiRequiredFields.add("channelName");
    openapiRequiredFields.add("contractName");
    openapiRequiredFields.add("invocationType");
    openapiRequiredFields.add("methodName");
    openapiRequiredFields.add("params");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RunTransactionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RunTransactionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunTransactionRequest is not found in the empty JSON string", RunTransactionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RunTransactionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunTransactionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunTransactionRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("endorsingPeers") != null && !jsonObj.get("endorsingPeers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `endorsingPeers` to be an array in the JSON string but got `%s`", jsonObj.get("endorsingPeers").toString()));
      }
      // validate the optional field `gatewayOptions`
      if (jsonObj.get("gatewayOptions") != null && !jsonObj.get("gatewayOptions").isJsonNull()) {
        GatewayOptions.validateJsonObject(jsonObj.getAsJsonObject("gatewayOptions"));
      }
      // validate the required field `signingCredential`
      FabricSigningCredential.validateJsonObject(jsonObj.getAsJsonObject("signingCredential"));
      if (!jsonObj.get("channelName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channelName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channelName").toString()));
      }
      if (!jsonObj.get("contractName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractName").toString()));
      }
      if (!jsonObj.get("methodName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `methodName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("methodName").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("params") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("params").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `params` to be an array in the JSON string but got `%s`", jsonObj.get("params").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("endorsingParties") != null && !jsonObj.get("endorsingParties").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `endorsingParties` to be an array in the JSON string but got `%s`", jsonObj.get("endorsingParties").toString()));
      }
      if ((jsonObj.get("responseType") != null && !jsonObj.get("responseType").isJsonNull()) && !jsonObj.get("responseType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responseType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responseType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunTransactionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunTransactionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunTransactionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunTransactionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RunTransactionRequest>() {
           @Override
           public void write(JsonWriter out, RunTransactionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunTransactionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunTransactionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunTransactionRequest
  * @throws IOException if the JSON string is invalid with respect to RunTransactionRequest
  */
  public static RunTransactionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunTransactionRequest.class);
  }

 /**
  * Convert an instance of RunTransactionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
