/*
 * Hyperledger Cactus Plugin - Connector Iroha V2
 * Can perform basic tasks on a Iroha V2 ledger
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
import org.openapitools.client.model.BlockTypeV1;
import org.openapitools.client.model.Iroha2BaseConfig;

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
 * Options passed when subscribing to block monitoring.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:31.706650294+05:30[Asia/Kolkata]")
public class WatchBlocksOptionsV1 {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private BlockTypeV1 type;

  public static final String SERIALIZED_NAME_START_BLOCK = "startBlock";
  @SerializedName(SERIALIZED_NAME_START_BLOCK)
  private String startBlock;

  public static final String SERIALIZED_NAME_BASE_CONFIG = "baseConfig";
  @SerializedName(SERIALIZED_NAME_BASE_CONFIG)
  private Iroha2BaseConfig baseConfig;

  public WatchBlocksOptionsV1() {
  }

  public WatchBlocksOptionsV1 type(BlockTypeV1 type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public BlockTypeV1 getType() {
    return type;
  }


  public void setType(BlockTypeV1 type) {
    this.type = type;
  }


  public WatchBlocksOptionsV1 startBlock(String startBlock) {
    
    this.startBlock = startBlock;
    return this;
  }

   /**
   * Number of block to start monitoring from.
   * @return startBlock
  **/
  @javax.annotation.Nullable
  public String getStartBlock() {
    return startBlock;
  }


  public void setStartBlock(String startBlock) {
    this.startBlock = startBlock;
  }


  public WatchBlocksOptionsV1 baseConfig(Iroha2BaseConfig baseConfig) {
    
    this.baseConfig = baseConfig;
    return this;
  }

   /**
   * Get baseConfig
   * @return baseConfig
  **/
  @javax.annotation.Nullable
  public Iroha2BaseConfig getBaseConfig() {
    return baseConfig;
  }


  public void setBaseConfig(Iroha2BaseConfig baseConfig) {
    this.baseConfig = baseConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchBlocksOptionsV1 watchBlocksOptionsV1 = (WatchBlocksOptionsV1) o;
    return Objects.equals(this.type, watchBlocksOptionsV1.type) &&
        Objects.equals(this.startBlock, watchBlocksOptionsV1.startBlock) &&
        Objects.equals(this.baseConfig, watchBlocksOptionsV1.baseConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startBlock, baseConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchBlocksOptionsV1 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startBlock: ").append(toIndentedString(startBlock)).append("\n");
    sb.append("    baseConfig: ").append(toIndentedString(baseConfig)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("startBlock");
    openapiFields.add("baseConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WatchBlocksOptionsV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WatchBlocksOptionsV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WatchBlocksOptionsV1 is not found in the empty JSON string", WatchBlocksOptionsV1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WatchBlocksOptionsV1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WatchBlocksOptionsV1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("startBlock") != null && !jsonObj.get("startBlock").isJsonNull()) && !jsonObj.get("startBlock").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startBlock` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startBlock").toString()));
      }
      // validate the optional field `baseConfig`
      if (jsonObj.get("baseConfig") != null && !jsonObj.get("baseConfig").isJsonNull()) {
        Iroha2BaseConfig.validateJsonObject(jsonObj.getAsJsonObject("baseConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WatchBlocksOptionsV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WatchBlocksOptionsV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WatchBlocksOptionsV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WatchBlocksOptionsV1.class));

       return (TypeAdapter<T>) new TypeAdapter<WatchBlocksOptionsV1>() {
           @Override
           public void write(JsonWriter out, WatchBlocksOptionsV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WatchBlocksOptionsV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WatchBlocksOptionsV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WatchBlocksOptionsV1
  * @throws IOException if the JSON string is invalid with respect to WatchBlocksOptionsV1
  */
  public static WatchBlocksOptionsV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WatchBlocksOptionsV1.class);
  }

 /**
  * Convert an instance of WatchBlocksOptionsV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
