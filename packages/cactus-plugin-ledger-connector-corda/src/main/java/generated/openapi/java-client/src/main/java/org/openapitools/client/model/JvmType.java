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
 * Represents a reference to a JVM type (such as a Java class)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:11.202432183+05:30[Asia/Kolkata]")
public class JvmType {
  public static final String SERIALIZED_NAME_FQ_CLASS_NAME = "fqClassName";
  @SerializedName(SERIALIZED_NAME_FQ_CLASS_NAME)
  private String fqClassName;

  public static final String SERIALIZED_NAME_CONSTRUCTOR_NAME = "constructorName";
  @SerializedName(SERIALIZED_NAME_CONSTRUCTOR_NAME)
  private String constructorName;

  public static final String SERIALIZED_NAME_INVOCATION_TARGET = "invocationTarget";
  @SerializedName(SERIALIZED_NAME_INVOCATION_TARGET)
  private JvmObject invocationTarget;

  public JvmType() {
  }

  public JvmType fqClassName(String fqClassName) {
    
    this.fqClassName = fqClassName;
    return this;
  }

   /**
   * Get fqClassName
   * @return fqClassName
  **/
  @javax.annotation.Nonnull
  public String getFqClassName() {
    return fqClassName;
  }


  public void setFqClassName(String fqClassName) {
    this.fqClassName = fqClassName;
  }


  public JvmType constructorName(String constructorName) {
    
    this.constructorName = constructorName;
    return this;
  }

   /**
   * This parameter is used to specify that the function used to construct this JvmType is not a constructor function but instead is a factory function. Setting this parameter will cause the plugin to look up methods of the class denoted by fqClassName instead of its constructors.
   * @return constructorName
  **/
  @javax.annotation.Nullable
  public String getConstructorName() {
    return constructorName;
  }


  public void setConstructorName(String constructorName) {
    this.constructorName = constructorName;
  }


  public JvmType invocationTarget(JvmObject invocationTarget) {
    
    this.invocationTarget = invocationTarget;
    return this;
  }

   /**
   * Get invocationTarget
   * @return invocationTarget
  **/
  @javax.annotation.Nullable
  public JvmObject getInvocationTarget() {
    return invocationTarget;
  }


  public void setInvocationTarget(JvmObject invocationTarget) {
    this.invocationTarget = invocationTarget;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JvmType jvmType = (JvmType) o;
    return Objects.equals(this.fqClassName, jvmType.fqClassName) &&
        Objects.equals(this.constructorName, jvmType.constructorName) &&
        Objects.equals(this.invocationTarget, jvmType.invocationTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fqClassName, constructorName, invocationTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JvmType {\n");
    sb.append("    fqClassName: ").append(toIndentedString(fqClassName)).append("\n");
    sb.append("    constructorName: ").append(toIndentedString(constructorName)).append("\n");
    sb.append("    invocationTarget: ").append(toIndentedString(invocationTarget)).append("\n");
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
    openapiFields.add("fqClassName");
    openapiFields.add("constructorName");
    openapiFields.add("invocationTarget");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fqClassName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JvmType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JvmType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JvmType is not found in the empty JSON string", JvmType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JvmType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JvmType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JvmType.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("fqClassName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fqClassName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fqClassName").toString()));
      }
      if ((jsonObj.get("constructorName") != null && !jsonObj.get("constructorName").isJsonNull()) && !jsonObj.get("constructorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `constructorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("constructorName").toString()));
      }
      // validate the optional field `invocationTarget`
      if (jsonObj.get("invocationTarget") != null && !jsonObj.get("invocationTarget").isJsonNull()) {
        JvmObject.validateJsonObject(jsonObj.getAsJsonObject("invocationTarget"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JvmType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JvmType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JvmType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JvmType.class));

       return (TypeAdapter<T>) new TypeAdapter<JvmType>() {
           @Override
           public void write(JsonWriter out, JvmType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JvmType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JvmType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JvmType
  * @throws IOException if the JSON string is invalid with respect to JvmType
  */
  public static JvmType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JvmType.class);
  }

 /**
  * Convert an instance of JvmType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
