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
import org.openapitools.client.model.ChainCodeLifeCycleCommandResponses;

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
 * DeployContractV1Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:35.195240170+05:30[Asia/Kolkata]")
public class DeployContractV1Response {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_PACKAGE_IDS = "packageIds";
  @SerializedName(SERIALIZED_NAME_PACKAGE_IDS)
  private List<String> packageIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_LIFECYCLE = "lifecycle";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE)
  private ChainCodeLifeCycleCommandResponses lifecycle;

  public DeployContractV1Response() {
  }

  public DeployContractV1Response success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nonnull
  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public DeployContractV1Response packageIds(List<String> packageIds) {
    
    this.packageIds = packageIds;
    return this;
  }

  public DeployContractV1Response addPackageIdsItem(String packageIdsItem) {
    if (this.packageIds == null) {
      this.packageIds = new ArrayList<>();
    }
    this.packageIds.add(packageIdsItem);
    return this;
  }

   /**
   * Get packageIds
   * @return packageIds
  **/
  @javax.annotation.Nonnull
  public List<String> getPackageIds() {
    return packageIds;
  }


  public void setPackageIds(List<String> packageIds) {
    this.packageIds = packageIds;
  }


  public DeployContractV1Response lifecycle(ChainCodeLifeCycleCommandResponses lifecycle) {
    
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Get lifecycle
   * @return lifecycle
  **/
  @javax.annotation.Nonnull
  public ChainCodeLifeCycleCommandResponses getLifecycle() {
    return lifecycle;
  }


  public void setLifecycle(ChainCodeLifeCycleCommandResponses lifecycle) {
    this.lifecycle = lifecycle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeployContractV1Response deployContractV1Response = (DeployContractV1Response) o;
    return Objects.equals(this.success, deployContractV1Response.success) &&
        Objects.equals(this.packageIds, deployContractV1Response.packageIds) &&
        Objects.equals(this.lifecycle, deployContractV1Response.lifecycle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, packageIds, lifecycle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeployContractV1Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    packageIds: ").append(toIndentedString(packageIds)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("packageIds");
    openapiFields.add("lifecycle");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("success");
    openapiRequiredFields.add("packageIds");
    openapiRequiredFields.add("lifecycle");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeployContractV1Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeployContractV1Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeployContractV1Response is not found in the empty JSON string", DeployContractV1Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeployContractV1Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeployContractV1Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeployContractV1Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("packageIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("packageIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `packageIds` to be an array in the JSON string but got `%s`", jsonObj.get("packageIds").toString()));
      }
      // validate the required field `lifecycle`
      ChainCodeLifeCycleCommandResponses.validateJsonObject(jsonObj.getAsJsonObject("lifecycle"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeployContractV1Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeployContractV1Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeployContractV1Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeployContractV1Response.class));

       return (TypeAdapter<T>) new TypeAdapter<DeployContractV1Response>() {
           @Override
           public void write(JsonWriter out, DeployContractV1Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeployContractV1Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeployContractV1Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeployContractV1Response
  * @throws IOException if the JSON string is invalid with respect to DeployContractV1Response
  */
  public static DeployContractV1Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeployContractV1Response.class);
  }

 /**
  * Convert an instance of DeployContractV1Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
