/*
 * Hyperledger Cactus Plugin - Connector Iroha
 * Can perform basic tasks on a Iroha ledger
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * IrohaBaseConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:27.945505986+05:30[Asia/Kolkata]")
public class IrohaBaseConfig {
  public static final String SERIALIZED_NAME_IROHA_HOST = "irohaHost";
  @SerializedName(SERIALIZED_NAME_IROHA_HOST)
  private String irohaHost;

  public static final String SERIALIZED_NAME_IROHA_PORT = "irohaPort";
  @SerializedName(SERIALIZED_NAME_IROHA_PORT)
  private BigDecimal irohaPort;

  public static final String SERIALIZED_NAME_CREATOR_ACCOUNT_ID = "creatorAccountId";
  @SerializedName(SERIALIZED_NAME_CREATOR_ACCOUNT_ID)
  private String creatorAccountId;

  public static final String SERIALIZED_NAME_PRIV_KEY = "privKey";
  @SerializedName(SERIALIZED_NAME_PRIV_KEY)
  private List<Object> privKey = null;

  public static final String SERIALIZED_NAME_QUORUM = "quorum";
  @SerializedName(SERIALIZED_NAME_QUORUM)
  private BigDecimal quorum;

  public static final String SERIALIZED_NAME_TIMEOUT_LIMIT = "timeoutLimit";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_LIMIT)
  private BigDecimal timeoutLimit;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private Boolean tls;

  public static final String SERIALIZED_NAME_MONITOR_MODE = "monitorMode";
  @SerializedName(SERIALIZED_NAME_MONITOR_MODE)
  private Boolean monitorMode;

  public IrohaBaseConfig() {
  }

  public IrohaBaseConfig irohaHost(String irohaHost) {
    
    this.irohaHost = irohaHost;
    return this;
  }

   /**
   * Get irohaHost
   * @return irohaHost
  **/
  @javax.annotation.Nullable
  public String getIrohaHost() {
    return irohaHost;
  }


  public void setIrohaHost(String irohaHost) {
    this.irohaHost = irohaHost;
  }


  public IrohaBaseConfig irohaPort(BigDecimal irohaPort) {
    
    this.irohaPort = irohaPort;
    return this;
  }

   /**
   * Get irohaPort
   * @return irohaPort
  **/
  @javax.annotation.Nullable
  public BigDecimal getIrohaPort() {
    return irohaPort;
  }


  public void setIrohaPort(BigDecimal irohaPort) {
    this.irohaPort = irohaPort;
  }


  public IrohaBaseConfig creatorAccountId(String creatorAccountId) {
    
    this.creatorAccountId = creatorAccountId;
    return this;
  }

   /**
   * Get creatorAccountId
   * @return creatorAccountId
  **/
  @javax.annotation.Nullable
  public String getCreatorAccountId() {
    return creatorAccountId;
  }


  public void setCreatorAccountId(String creatorAccountId) {
    this.creatorAccountId = creatorAccountId;
  }


  public IrohaBaseConfig privKey(List<Object> privKey) {
    
    this.privKey = privKey;
    return this;
  }

  public IrohaBaseConfig addPrivKeyItem(Object privKeyItem) {
    if (this.privKey == null) {
      this.privKey = null;
    }
    this.privKey.add(privKeyItem);
    return this;
  }

   /**
   * Get privKey
   * @return privKey
  **/
  @javax.annotation.Nullable
  public List<Object> getPrivKey() {
    return privKey;
  }


  public void setPrivKey(List<Object> privKey) {
    this.privKey = privKey;
  }


  public IrohaBaseConfig quorum(BigDecimal quorum) {
    
    this.quorum = quorum;
    return this;
  }

   /**
   * Get quorum
   * @return quorum
  **/
  @javax.annotation.Nullable
  public BigDecimal getQuorum() {
    return quorum;
  }


  public void setQuorum(BigDecimal quorum) {
    this.quorum = quorum;
  }


  public IrohaBaseConfig timeoutLimit(BigDecimal timeoutLimit) {
    
    this.timeoutLimit = timeoutLimit;
    return this;
  }

   /**
   * Get timeoutLimit
   * @return timeoutLimit
  **/
  @javax.annotation.Nullable
  public BigDecimal getTimeoutLimit() {
    return timeoutLimit;
  }


  public void setTimeoutLimit(BigDecimal timeoutLimit) {
    this.timeoutLimit = timeoutLimit;
  }


  public IrohaBaseConfig tls(Boolean tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Can only be set to false for an insecure grpc connection.
   * @return tls
  **/
  @javax.annotation.Nullable
  public Boolean getTls() {
    return tls;
  }


  public void setTls(Boolean tls) {
    this.tls = tls;
  }


  public IrohaBaseConfig monitorMode(Boolean monitorMode) {
    
    this.monitorMode = monitorMode;
    return this;
  }

   /**
   * Flag used for monitoring. It changes default beahviour of transaction wrapper so it return error to caller instead of throwing RuntimeError straight away.
   * @return monitorMode
  **/
  @javax.annotation.Nullable
  public Boolean getMonitorMode() {
    return monitorMode;
  }


  public void setMonitorMode(Boolean monitorMode) {
    this.monitorMode = monitorMode;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the IrohaBaseConfig instance itself
   */
  public IrohaBaseConfig putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IrohaBaseConfig irohaBaseConfig = (IrohaBaseConfig) o;
    return Objects.equals(this.irohaHost, irohaBaseConfig.irohaHost) &&
        Objects.equals(this.irohaPort, irohaBaseConfig.irohaPort) &&
        Objects.equals(this.creatorAccountId, irohaBaseConfig.creatorAccountId) &&
        Objects.equals(this.privKey, irohaBaseConfig.privKey) &&
        Objects.equals(this.quorum, irohaBaseConfig.quorum) &&
        Objects.equals(this.timeoutLimit, irohaBaseConfig.timeoutLimit) &&
        Objects.equals(this.tls, irohaBaseConfig.tls) &&
        Objects.equals(this.monitorMode, irohaBaseConfig.monitorMode)&&
        Objects.equals(this.additionalProperties, irohaBaseConfig.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(irohaHost, irohaPort, creatorAccountId, privKey, quorum, timeoutLimit, tls, monitorMode, additionalProperties);
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
    sb.append("class IrohaBaseConfig {\n");
    sb.append("    irohaHost: ").append(toIndentedString(irohaHost)).append("\n");
    sb.append("    irohaPort: ").append(toIndentedString(irohaPort)).append("\n");
    sb.append("    creatorAccountId: ").append(toIndentedString(creatorAccountId)).append("\n");
    sb.append("    privKey: ").append(toIndentedString(privKey)).append("\n");
    sb.append("    quorum: ").append(toIndentedString(quorum)).append("\n");
    sb.append("    timeoutLimit: ").append(toIndentedString(timeoutLimit)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    monitorMode: ").append(toIndentedString(monitorMode)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("irohaHost");
    openapiFields.add("irohaPort");
    openapiFields.add("creatorAccountId");
    openapiFields.add("privKey");
    openapiFields.add("quorum");
    openapiFields.add("timeoutLimit");
    openapiFields.add("tls");
    openapiFields.add("monitorMode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IrohaBaseConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IrohaBaseConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IrohaBaseConfig is not found in the empty JSON string", IrohaBaseConfig.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("irohaHost") != null && !jsonObj.get("irohaHost").isJsonNull()) && !jsonObj.get("irohaHost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `irohaHost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("irohaHost").toString()));
      }
      if ((jsonObj.get("creatorAccountId") != null && !jsonObj.get("creatorAccountId").isJsonNull()) && !jsonObj.get("creatorAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creatorAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creatorAccountId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("privKey") != null && !jsonObj.get("privKey").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `privKey` to be an array in the JSON string but got `%s`", jsonObj.get("privKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IrohaBaseConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IrohaBaseConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IrohaBaseConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IrohaBaseConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<IrohaBaseConfig>() {
           @Override
           public void write(JsonWriter out, IrohaBaseConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public IrohaBaseConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IrohaBaseConfig instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IrohaBaseConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IrohaBaseConfig
  * @throws IOException if the JSON string is invalid with respect to IrohaBaseConfig
  */
  public static IrohaBaseConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IrohaBaseConfig.class);
  }

 /**
  * Convert an instance of IrohaBaseConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
