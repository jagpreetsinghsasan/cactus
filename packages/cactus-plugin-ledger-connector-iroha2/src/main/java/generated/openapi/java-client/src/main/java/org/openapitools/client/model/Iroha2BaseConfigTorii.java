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
 * Iroha V2 peer connection information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:31.706650294+05:30[Asia/Kolkata]")
public class Iroha2BaseConfigTorii {
  public static final String SERIALIZED_NAME_API_U_R_L = "apiURL";
  @SerializedName(SERIALIZED_NAME_API_U_R_L)
  private String apiURL;

  public static final String SERIALIZED_NAME_TELEMETRY_U_R_L = "telemetryURL";
  @SerializedName(SERIALIZED_NAME_TELEMETRY_U_R_L)
  private String telemetryURL;

  public Iroha2BaseConfigTorii() {
  }

  public Iroha2BaseConfigTorii apiURL(String apiURL) {
    
    this.apiURL = apiURL;
    return this;
  }

   /**
   * Get apiURL
   * @return apiURL
  **/
  @javax.annotation.Nullable
  public String getApiURL() {
    return apiURL;
  }


  public void setApiURL(String apiURL) {
    this.apiURL = apiURL;
  }


  public Iroha2BaseConfigTorii telemetryURL(String telemetryURL) {
    
    this.telemetryURL = telemetryURL;
    return this;
  }

   /**
   * Get telemetryURL
   * @return telemetryURL
  **/
  @javax.annotation.Nullable
  public String getTelemetryURL() {
    return telemetryURL;
  }


  public void setTelemetryURL(String telemetryURL) {
    this.telemetryURL = telemetryURL;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Iroha2BaseConfigTorii iroha2BaseConfigTorii = (Iroha2BaseConfigTorii) o;
    return Objects.equals(this.apiURL, iroha2BaseConfigTorii.apiURL) &&
        Objects.equals(this.telemetryURL, iroha2BaseConfigTorii.telemetryURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiURL, telemetryURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Iroha2BaseConfigTorii {\n");
    sb.append("    apiURL: ").append(toIndentedString(apiURL)).append("\n");
    sb.append("    telemetryURL: ").append(toIndentedString(telemetryURL)).append("\n");
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
    openapiFields.add("apiURL");
    openapiFields.add("telemetryURL");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Iroha2BaseConfigTorii
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Iroha2BaseConfigTorii.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Iroha2BaseConfigTorii is not found in the empty JSON string", Iroha2BaseConfigTorii.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Iroha2BaseConfigTorii.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Iroha2BaseConfigTorii` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("apiURL") != null && !jsonObj.get("apiURL").isJsonNull()) && !jsonObj.get("apiURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apiURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apiURL").toString()));
      }
      if ((jsonObj.get("telemetryURL") != null && !jsonObj.get("telemetryURL").isJsonNull()) && !jsonObj.get("telemetryURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telemetryURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telemetryURL").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Iroha2BaseConfigTorii.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Iroha2BaseConfigTorii' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Iroha2BaseConfigTorii> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Iroha2BaseConfigTorii.class));

       return (TypeAdapter<T>) new TypeAdapter<Iroha2BaseConfigTorii>() {
           @Override
           public void write(JsonWriter out, Iroha2BaseConfigTorii value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Iroha2BaseConfigTorii read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Iroha2BaseConfigTorii given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Iroha2BaseConfigTorii
  * @throws IOException if the JSON string is invalid with respect to Iroha2BaseConfigTorii
  */
  public static Iroha2BaseConfigTorii fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Iroha2BaseConfigTorii.class);
  }

 /**
  * Convert an instance of Iroha2BaseConfigTorii to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
