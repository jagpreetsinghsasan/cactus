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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.IrohaInstruction;

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
 * Single Iroha V2 instruction to be executed request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:31.706650294+05:30[Asia/Kolkata]")
public class IrohaInstructionRequestV1 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private IrohaInstruction name = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<Object> params = new ArrayList<>();

  public IrohaInstructionRequestV1() {
  }

  public IrohaInstructionRequestV1 name(IrohaInstruction name) {
    
    this.name = name;
    return this;
  }

   /**
   * Iroha V2 instruction name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public IrohaInstruction getName() {
    return name;
  }


  public void setName(IrohaInstruction name) {
    this.name = name;
  }


  public IrohaInstructionRequestV1 params(List<Object> params) {
    
    this.params = params;
    return this;
  }

  public IrohaInstructionRequestV1 addParamsItem(Object paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * The list of arguments to pass with specified instruction.
   * @return params
  **/
  @javax.annotation.Nonnull
  public List<Object> getParams() {
    return params;
  }


  public void setParams(List<Object> params) {
    this.params = params;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IrohaInstructionRequestV1 irohaInstructionRequestV1 = (IrohaInstructionRequestV1) o;
    return Objects.equals(this.name, irohaInstructionRequestV1.name) &&
        Objects.equals(this.params, irohaInstructionRequestV1.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IrohaInstructionRequestV1 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("params");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("params");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IrohaInstructionRequestV1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IrohaInstructionRequestV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IrohaInstructionRequestV1 is not found in the empty JSON string", IrohaInstructionRequestV1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IrohaInstructionRequestV1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IrohaInstructionRequestV1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IrohaInstructionRequestV1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("params") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("params").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `params` to be an array in the JSON string but got `%s`", jsonObj.get("params").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IrohaInstructionRequestV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IrohaInstructionRequestV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IrohaInstructionRequestV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IrohaInstructionRequestV1.class));

       return (TypeAdapter<T>) new TypeAdapter<IrohaInstructionRequestV1>() {
           @Override
           public void write(JsonWriter out, IrohaInstructionRequestV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IrohaInstructionRequestV1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IrohaInstructionRequestV1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IrohaInstructionRequestV1
  * @throws IOException if the JSON string is invalid with respect to IrohaInstructionRequestV1
  */
  public static IrohaInstructionRequestV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IrohaInstructionRequestV1.class);
  }

 /**
  * Convert an instance of IrohaInstructionRequestV1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
