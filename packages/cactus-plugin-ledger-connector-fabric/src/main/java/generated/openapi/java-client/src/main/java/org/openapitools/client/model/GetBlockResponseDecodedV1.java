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
 * When skipDecode is false (default) then decoded block object is returned.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:35.195240170+05:30[Asia/Kolkata]")
public class GetBlockResponseDecodedV1 {
  public static final String SERIALIZED_NAME_DECODED_BLOCK = "decodedBlock";
  @SerializedName(SERIALIZED_NAME_DECODED_BLOCK)
  private Object decodedBlock = null;

  public GetBlockResponseDecodedV1() {
  }

  public GetBlockResponseDecodedV1 decodedBlock(Object decodedBlock) {
    
    this.decodedBlock = decodedBlock;
    return this;
  }

   /**
   * Full hyperledger fabric block data.
   * @return decodedBlock
  **/
  @javax.annotation.Nullable
  public Object getDecodedBlock() {
    return decodedBlock;
  }


  public void setDecodedBlock(Object decodedBlock) {
    this.decodedBlock = decodedBlock;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBlockResponseDecodedV1 getBlockResponseDecodedV1 = (GetBlockResponseDecodedV1) o;
    return Objects.equals(this.decodedBlock, getBlockResponseDecodedV1.decodedBlock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(decodedBlock);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBlockResponseDecodedV1 {\n");
    sb.append("    decodedBlock: ").append(toIndentedString(decodedBlock)).append("\n");
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
    openapiFields.add("decodedBlock");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("decodedBlock");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetBlockResponseDecodedV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetBlockResponseDecodedV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBlockResponseDecodedV1 is not found in the empty JSON string", GetBlockResponseDecodedV1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetBlockResponseDecodedV1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBlockResponseDecodedV1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetBlockResponseDecodedV1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBlockResponseDecodedV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBlockResponseDecodedV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBlockResponseDecodedV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBlockResponseDecodedV1.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBlockResponseDecodedV1>() {
           @Override
           public void write(JsonWriter out, GetBlockResponseDecodedV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBlockResponseDecodedV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetBlockResponseDecodedV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetBlockResponseDecodedV1
  * @throws IOException if the JSON string is invalid with respect to GetBlockResponseDecodedV1
  */
  public static GetBlockResponseDecodedV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBlockResponseDecodedV1.class);
  }

 /**
  * Convert an instance of GetBlockResponseDecodedV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
