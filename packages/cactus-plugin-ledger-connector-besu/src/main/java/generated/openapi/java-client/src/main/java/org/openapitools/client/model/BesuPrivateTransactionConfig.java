/*
 * Hyperledger Cactus Plugin - Connector Besu
 * Can perform basic tasks on a Besu ledger
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
 * BesuPrivateTransactionConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:27.847578276+05:30[Asia/Kolkata]")
public class BesuPrivateTransactionConfig {
  public static final String SERIALIZED_NAME_PRIVATE_FROM = "privateFrom";
  @SerializedName(SERIALIZED_NAME_PRIVATE_FROM)
  private String privateFrom;

  public static final String SERIALIZED_NAME_PRIVATE_FOR = "privateFor";
  @SerializedName(SERIALIZED_NAME_PRIVATE_FOR)
  private List<Object> privateFor = null;

  public BesuPrivateTransactionConfig() {
  }

  public BesuPrivateTransactionConfig privateFrom(String privateFrom) {
    
    this.privateFrom = privateFrom;
    return this;
  }

   /**
   * Get privateFrom
   * @return privateFrom
  **/
  @javax.annotation.Nonnull
  public String getPrivateFrom() {
    return privateFrom;
  }


  public void setPrivateFrom(String privateFrom) {
    this.privateFrom = privateFrom;
  }


  public BesuPrivateTransactionConfig privateFor(List<Object> privateFor) {
    
    this.privateFor = privateFor;
    return this;
  }

  public BesuPrivateTransactionConfig addPrivateForItem(Object privateForItem) {
    if (this.privateFor == null) {
      this.privateFor = null;
    }
    this.privateFor.add(privateForItem);
    return this;
  }

   /**
   * Get privateFor
   * @return privateFor
  **/
  @javax.annotation.Nonnull
  public List<Object> getPrivateFor() {
    return privateFor;
  }


  public void setPrivateFor(List<Object> privateFor) {
    this.privateFor = privateFor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BesuPrivateTransactionConfig besuPrivateTransactionConfig = (BesuPrivateTransactionConfig) o;
    return Objects.equals(this.privateFrom, besuPrivateTransactionConfig.privateFrom) &&
        Objects.equals(this.privateFor, besuPrivateTransactionConfig.privateFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateFrom, privateFor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BesuPrivateTransactionConfig {\n");
    sb.append("    privateFrom: ").append(toIndentedString(privateFrom)).append("\n");
    sb.append("    privateFor: ").append(toIndentedString(privateFor)).append("\n");
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
    openapiFields.add("privateFrom");
    openapiFields.add("privateFor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("privateFrom");
    openapiRequiredFields.add("privateFor");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BesuPrivateTransactionConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BesuPrivateTransactionConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BesuPrivateTransactionConfig is not found in the empty JSON string", BesuPrivateTransactionConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BesuPrivateTransactionConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BesuPrivateTransactionConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BesuPrivateTransactionConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("privateFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privateFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privateFrom").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("privateFor") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("privateFor").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `privateFor` to be an array in the JSON string but got `%s`", jsonObj.get("privateFor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BesuPrivateTransactionConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BesuPrivateTransactionConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BesuPrivateTransactionConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BesuPrivateTransactionConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<BesuPrivateTransactionConfig>() {
           @Override
           public void write(JsonWriter out, BesuPrivateTransactionConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BesuPrivateTransactionConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BesuPrivateTransactionConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BesuPrivateTransactionConfig
  * @throws IOException if the JSON string is invalid with respect to BesuPrivateTransactionConfig
  */
  public static BesuPrivateTransactionConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BesuPrivateTransactionConfig.class);
  }

 /**
  * Convert an instance of BesuPrivateTransactionConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
