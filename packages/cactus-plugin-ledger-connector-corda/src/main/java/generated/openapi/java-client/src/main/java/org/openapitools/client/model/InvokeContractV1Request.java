/*
 * Hyperledger Cactus Plugin - Connector Corda
 * Can perform basic tasks on a Corda ledger
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
import org.openapitools.client.model.FlowInvocationType;
import org.openapitools.client.model.JvmObject;

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
 * InvokeContractV1Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:11.202432183+05:30[Asia/Kolkata]")
public class InvokeContractV1Request {
  public static final String SERIALIZED_NAME_FLOW_FULL_CLASS_NAME = "flowFullClassName";
  @SerializedName(SERIALIZED_NAME_FLOW_FULL_CLASS_NAME)
  private String flowFullClassName;

  public static final String SERIALIZED_NAME_FLOW_INVOCATION_TYPE = "flowInvocationType";
  @SerializedName(SERIALIZED_NAME_FLOW_INVOCATION_TYPE)
  private FlowInvocationType flowInvocationType;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<JvmObject> params = null;

  public static final String SERIALIZED_NAME_TIMEOUT_MS = "timeoutMs";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_MS)
  private Integer timeoutMs = 60000;

  public InvokeContractV1Request() {
  }

  public InvokeContractV1Request flowFullClassName(String flowFullClassName) {
    
    this.flowFullClassName = flowFullClassName;
    return this;
  }

   /**
   * The fully qualified name of the Corda flow to invoke
   * @return flowFullClassName
  **/
  @javax.annotation.Nonnull
  public String getFlowFullClassName() {
    return flowFullClassName;
  }


  public void setFlowFullClassName(String flowFullClassName) {
    this.flowFullClassName = flowFullClassName;
  }


  public InvokeContractV1Request flowInvocationType(FlowInvocationType flowInvocationType) {
    
    this.flowInvocationType = flowInvocationType;
    return this;
  }

   /**
   * Get flowInvocationType
   * @return flowInvocationType
  **/
  @javax.annotation.Nonnull
  public FlowInvocationType getFlowInvocationType() {
    return flowInvocationType;
  }


  public void setFlowInvocationType(FlowInvocationType flowInvocationType) {
    this.flowInvocationType = flowInvocationType;
  }


  public InvokeContractV1Request params(List<JvmObject> params) {
    
    this.params = params;
    return this;
  }

  public InvokeContractV1Request addParamsItem(JvmObject paramsItem) {
    if (this.params == null) {
      this.params = null;
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * The list of arguments to pass in to the contract method being invoked.
   * @return params
  **/
  @javax.annotation.Nonnull
  public List<JvmObject> getParams() {
    return params;
  }


  public void setParams(List<JvmObject> params) {
    this.params = params;
  }


  public InvokeContractV1Request timeoutMs(Integer timeoutMs) {
    
    this.timeoutMs = timeoutMs;
    return this;
  }

   /**
   * The amount of milliseconds to wait for a transaction receipt beforegiving up and crashing.
   * minimum: 0
   * @return timeoutMs
  **/
  @javax.annotation.Nullable
  public Integer getTimeoutMs() {
    return timeoutMs;
  }


  public void setTimeoutMs(Integer timeoutMs) {
    this.timeoutMs = timeoutMs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvokeContractV1Request invokeContractV1Request = (InvokeContractV1Request) o;
    return Objects.equals(this.flowFullClassName, invokeContractV1Request.flowFullClassName) &&
        Objects.equals(this.flowInvocationType, invokeContractV1Request.flowInvocationType) &&
        Objects.equals(this.params, invokeContractV1Request.params) &&
        Objects.equals(this.timeoutMs, invokeContractV1Request.timeoutMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowFullClassName, flowInvocationType, params, timeoutMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvokeContractV1Request {\n");
    sb.append("    flowFullClassName: ").append(toIndentedString(flowFullClassName)).append("\n");
    sb.append("    flowInvocationType: ").append(toIndentedString(flowInvocationType)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    timeoutMs: ").append(toIndentedString(timeoutMs)).append("\n");
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
    openapiFields.add("flowFullClassName");
    openapiFields.add("flowInvocationType");
    openapiFields.add("params");
    openapiFields.add("timeoutMs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("flowFullClassName");
    openapiRequiredFields.add("flowInvocationType");
    openapiRequiredFields.add("params");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InvokeContractV1Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InvokeContractV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvokeContractV1Request is not found in the empty JSON string", InvokeContractV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InvokeContractV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvokeContractV1Request` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvokeContractV1Request.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("flowFullClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flowFullClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flowFullClassName").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("params").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `params` to be an array in the JSON string but got `%s`", jsonObj.get("params").toString()));
      }

      JsonArray jsonArrayparams = jsonObj.getAsJsonArray("params");
      // validate the required field `params` (array)
      for (int i = 0; i < jsonArrayparams.size(); i++) {
        JvmObject.validateJsonObject(jsonArrayparams.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvokeContractV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvokeContractV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvokeContractV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvokeContractV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<InvokeContractV1Request>() {
           @Override
           public void write(JsonWriter out, InvokeContractV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvokeContractV1Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvokeContractV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvokeContractV1Request
  * @throws IOException if the JSON string is invalid with respect to InvokeContractV1Request
  */
  public static InvokeContractV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvokeContractV1Request.class);
  }

 /**
  * Convert an instance of InvokeContractV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
