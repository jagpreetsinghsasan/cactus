/*
 * Hyperledger Cactus Plugin - Odap Hermes
 * Implementation for Odap and Hermes
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
import org.openapitools.client.model.AssetProfile;
import org.openapitools.client.model.ClientV1RequestClientGatewayConfiguration;
import org.openapitools.client.model.PayloadProfile;

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
 * ClientV1Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:57.051152560+05:30[Asia/Kolkata]")
public class ClientV1Request {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_LOGGING_PROFILE = "loggingProfile";
  @SerializedName(SERIALIZED_NAME_LOGGING_PROFILE)
  private String loggingProfile;

  public static final String SERIALIZED_NAME_ACCESS_CONTROL_PROFILE = "accessControlProfile";
  @SerializedName(SERIALIZED_NAME_ACCESS_CONTROL_PROFILE)
  private String accessControlProfile;

  public static final String SERIALIZED_NAME_ASSET_CONTROL_PROFILE = "assetControlProfile";
  @SerializedName(SERIALIZED_NAME_ASSET_CONTROL_PROFILE)
  private String assetControlProfile;

  public static final String SERIALIZED_NAME_APPLICATION_PROFILE = "applicationProfile";
  @SerializedName(SERIALIZED_NAME_APPLICATION_PROFILE)
  private String applicationProfile;

  public static final String SERIALIZED_NAME_ASSET_PROFILE = "assetProfile";
  @SerializedName(SERIALIZED_NAME_ASSET_PROFILE)
  private AssetProfile assetProfile;

  public static final String SERIALIZED_NAME_PAYLOAD_PROFILE = "payloadProfile";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_PROFILE)
  private PayloadProfile payloadProfile;

  public static final String SERIALIZED_NAME_SOURCE_GATEWAY_DLT_SYSTEM = "sourceGatewayDltSystem";
  @SerializedName(SERIALIZED_NAME_SOURCE_GATEWAY_DLT_SYSTEM)
  private String sourceGatewayDltSystem;

  public static final String SERIALIZED_NAME_RECIPIENT_GATEWAY_DLT_SYSTEM = "recipientGatewayDltSystem";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_GATEWAY_DLT_SYSTEM)
  private String recipientGatewayDltSystem;

  public static final String SERIALIZED_NAME_RECIPIENT_GATEWAY_PUBKEY = "recipientGatewayPubkey";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_GATEWAY_PUBKEY)
  private String recipientGatewayPubkey;

  public static final String SERIALIZED_NAME_ORIGINATOR_PUBKEY = "originatorPubkey";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_PUBKEY)
  private String originatorPubkey;

  public static final String SERIALIZED_NAME_BENEFICIARY_PUBKEY = "beneficiaryPubkey";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_PUBKEY)
  private String beneficiaryPubkey;

  public static final String SERIALIZED_NAME_CLIENT_IDENTITY_PUBKEY = "clientIdentityPubkey";
  @SerializedName(SERIALIZED_NAME_CLIENT_IDENTITY_PUBKEY)
  private String clientIdentityPubkey;

  public static final String SERIALIZED_NAME_SERVER_IDENTITY_PUBKEY = "serverIdentityPubkey";
  @SerializedName(SERIALIZED_NAME_SERVER_IDENTITY_PUBKEY)
  private String serverIdentityPubkey;

  public static final String SERIALIZED_NAME_CLIENT_DLT_SYSTEM = "clientDltSystem";
  @SerializedName(SERIALIZED_NAME_CLIENT_DLT_SYSTEM)
  private String clientDltSystem;

  public static final String SERIALIZED_NAME_SERVER_DLT_SYSTEM = "serverDltSystem";
  @SerializedName(SERIALIZED_NAME_SERVER_DLT_SYSTEM)
  private String serverDltSystem;

  public static final String SERIALIZED_NAME_CLIENT_GATEWAY_CONFIGURATION = "clientGatewayConfiguration";
  @SerializedName(SERIALIZED_NAME_CLIENT_GATEWAY_CONFIGURATION)
  private ClientV1RequestClientGatewayConfiguration clientGatewayConfiguration;

  public static final String SERIALIZED_NAME_SERVER_GATEWAY_CONFIGURATION = "serverGatewayConfiguration";
  @SerializedName(SERIALIZED_NAME_SERVER_GATEWAY_CONFIGURATION)
  private ClientV1RequestClientGatewayConfiguration serverGatewayConfiguration;

  public static final String SERIALIZED_NAME_MAX_RETRIES = "maxRetries";
  @SerializedName(SERIALIZED_NAME_MAX_RETRIES)
  private BigDecimal maxRetries;

  public static final String SERIALIZED_NAME_MAX_TIMEOUT = "maxTimeout";
  @SerializedName(SERIALIZED_NAME_MAX_TIMEOUT)
  private BigDecimal maxTimeout;

  public static final String SERIALIZED_NAME_SOURCE_LEDGER_ASSET_I_D = "sourceLedgerAssetID";
  @SerializedName(SERIALIZED_NAME_SOURCE_LEDGER_ASSET_I_D)
  private String sourceLedgerAssetID;

  public static final String SERIALIZED_NAME_RECIPIENT_LEDGER_ASSET_I_D = "recipientLedgerAssetID";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_LEDGER_ASSET_I_D)
  private String recipientLedgerAssetID;

  public ClientV1Request() {
  }

  public ClientV1Request version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ClientV1Request loggingProfile(String loggingProfile) {
    
    this.loggingProfile = loggingProfile;
    return this;
  }

   /**
   * Get loggingProfile
   * @return loggingProfile
  **/
  @javax.annotation.Nonnull
  public String getLoggingProfile() {
    return loggingProfile;
  }


  public void setLoggingProfile(String loggingProfile) {
    this.loggingProfile = loggingProfile;
  }


  public ClientV1Request accessControlProfile(String accessControlProfile) {
    
    this.accessControlProfile = accessControlProfile;
    return this;
  }

   /**
   * Get accessControlProfile
   * @return accessControlProfile
  **/
  @javax.annotation.Nonnull
  public String getAccessControlProfile() {
    return accessControlProfile;
  }


  public void setAccessControlProfile(String accessControlProfile) {
    this.accessControlProfile = accessControlProfile;
  }


  public ClientV1Request assetControlProfile(String assetControlProfile) {
    
    this.assetControlProfile = assetControlProfile;
    return this;
  }

   /**
   * Get assetControlProfile
   * @return assetControlProfile
  **/
  @javax.annotation.Nonnull
  public String getAssetControlProfile() {
    return assetControlProfile;
  }


  public void setAssetControlProfile(String assetControlProfile) {
    this.assetControlProfile = assetControlProfile;
  }


  public ClientV1Request applicationProfile(String applicationProfile) {
    
    this.applicationProfile = applicationProfile;
    return this;
  }

   /**
   * Get applicationProfile
   * @return applicationProfile
  **/
  @javax.annotation.Nonnull
  public String getApplicationProfile() {
    return applicationProfile;
  }


  public void setApplicationProfile(String applicationProfile) {
    this.applicationProfile = applicationProfile;
  }


  public ClientV1Request assetProfile(AssetProfile assetProfile) {
    
    this.assetProfile = assetProfile;
    return this;
  }

   /**
   * Get assetProfile
   * @return assetProfile
  **/
  @javax.annotation.Nonnull
  public AssetProfile getAssetProfile() {
    return assetProfile;
  }


  public void setAssetProfile(AssetProfile assetProfile) {
    this.assetProfile = assetProfile;
  }


  public ClientV1Request payloadProfile(PayloadProfile payloadProfile) {
    
    this.payloadProfile = payloadProfile;
    return this;
  }

   /**
   * Get payloadProfile
   * @return payloadProfile
  **/
  @javax.annotation.Nonnull
  public PayloadProfile getPayloadProfile() {
    return payloadProfile;
  }


  public void setPayloadProfile(PayloadProfile payloadProfile) {
    this.payloadProfile = payloadProfile;
  }


  public ClientV1Request sourceGatewayDltSystem(String sourceGatewayDltSystem) {
    
    this.sourceGatewayDltSystem = sourceGatewayDltSystem;
    return this;
  }

   /**
   * Get sourceGatewayDltSystem
   * @return sourceGatewayDltSystem
  **/
  @javax.annotation.Nonnull
  public String getSourceGatewayDltSystem() {
    return sourceGatewayDltSystem;
  }


  public void setSourceGatewayDltSystem(String sourceGatewayDltSystem) {
    this.sourceGatewayDltSystem = sourceGatewayDltSystem;
  }


  public ClientV1Request recipientGatewayDltSystem(String recipientGatewayDltSystem) {
    
    this.recipientGatewayDltSystem = recipientGatewayDltSystem;
    return this;
  }

   /**
   * Get recipientGatewayDltSystem
   * @return recipientGatewayDltSystem
  **/
  @javax.annotation.Nonnull
  public String getRecipientGatewayDltSystem() {
    return recipientGatewayDltSystem;
  }


  public void setRecipientGatewayDltSystem(String recipientGatewayDltSystem) {
    this.recipientGatewayDltSystem = recipientGatewayDltSystem;
  }


  public ClientV1Request recipientGatewayPubkey(String recipientGatewayPubkey) {
    
    this.recipientGatewayPubkey = recipientGatewayPubkey;
    return this;
  }

   /**
   * Get recipientGatewayPubkey
   * @return recipientGatewayPubkey
  **/
  @javax.annotation.Nonnull
  public String getRecipientGatewayPubkey() {
    return recipientGatewayPubkey;
  }


  public void setRecipientGatewayPubkey(String recipientGatewayPubkey) {
    this.recipientGatewayPubkey = recipientGatewayPubkey;
  }


  public ClientV1Request originatorPubkey(String originatorPubkey) {
    
    this.originatorPubkey = originatorPubkey;
    return this;
  }

   /**
   * Get originatorPubkey
   * @return originatorPubkey
  **/
  @javax.annotation.Nonnull
  public String getOriginatorPubkey() {
    return originatorPubkey;
  }


  public void setOriginatorPubkey(String originatorPubkey) {
    this.originatorPubkey = originatorPubkey;
  }


  public ClientV1Request beneficiaryPubkey(String beneficiaryPubkey) {
    
    this.beneficiaryPubkey = beneficiaryPubkey;
    return this;
  }

   /**
   * Get beneficiaryPubkey
   * @return beneficiaryPubkey
  **/
  @javax.annotation.Nonnull
  public String getBeneficiaryPubkey() {
    return beneficiaryPubkey;
  }


  public void setBeneficiaryPubkey(String beneficiaryPubkey) {
    this.beneficiaryPubkey = beneficiaryPubkey;
  }


  public ClientV1Request clientIdentityPubkey(String clientIdentityPubkey) {
    
    this.clientIdentityPubkey = clientIdentityPubkey;
    return this;
  }

   /**
   * Get clientIdentityPubkey
   * @return clientIdentityPubkey
  **/
  @javax.annotation.Nonnull
  public String getClientIdentityPubkey() {
    return clientIdentityPubkey;
  }


  public void setClientIdentityPubkey(String clientIdentityPubkey) {
    this.clientIdentityPubkey = clientIdentityPubkey;
  }


  public ClientV1Request serverIdentityPubkey(String serverIdentityPubkey) {
    
    this.serverIdentityPubkey = serverIdentityPubkey;
    return this;
  }

   /**
   * Get serverIdentityPubkey
   * @return serverIdentityPubkey
  **/
  @javax.annotation.Nonnull
  public String getServerIdentityPubkey() {
    return serverIdentityPubkey;
  }


  public void setServerIdentityPubkey(String serverIdentityPubkey) {
    this.serverIdentityPubkey = serverIdentityPubkey;
  }


  public ClientV1Request clientDltSystem(String clientDltSystem) {
    
    this.clientDltSystem = clientDltSystem;
    return this;
  }

   /**
   * Get clientDltSystem
   * @return clientDltSystem
  **/
  @javax.annotation.Nonnull
  public String getClientDltSystem() {
    return clientDltSystem;
  }


  public void setClientDltSystem(String clientDltSystem) {
    this.clientDltSystem = clientDltSystem;
  }


  public ClientV1Request serverDltSystem(String serverDltSystem) {
    
    this.serverDltSystem = serverDltSystem;
    return this;
  }

   /**
   * Get serverDltSystem
   * @return serverDltSystem
  **/
  @javax.annotation.Nonnull
  public String getServerDltSystem() {
    return serverDltSystem;
  }


  public void setServerDltSystem(String serverDltSystem) {
    this.serverDltSystem = serverDltSystem;
  }


  public ClientV1Request clientGatewayConfiguration(ClientV1RequestClientGatewayConfiguration clientGatewayConfiguration) {
    
    this.clientGatewayConfiguration = clientGatewayConfiguration;
    return this;
  }

   /**
   * Get clientGatewayConfiguration
   * @return clientGatewayConfiguration
  **/
  @javax.annotation.Nonnull
  public ClientV1RequestClientGatewayConfiguration getClientGatewayConfiguration() {
    return clientGatewayConfiguration;
  }


  public void setClientGatewayConfiguration(ClientV1RequestClientGatewayConfiguration clientGatewayConfiguration) {
    this.clientGatewayConfiguration = clientGatewayConfiguration;
  }


  public ClientV1Request serverGatewayConfiguration(ClientV1RequestClientGatewayConfiguration serverGatewayConfiguration) {
    
    this.serverGatewayConfiguration = serverGatewayConfiguration;
    return this;
  }

   /**
   * Get serverGatewayConfiguration
   * @return serverGatewayConfiguration
  **/
  @javax.annotation.Nonnull
  public ClientV1RequestClientGatewayConfiguration getServerGatewayConfiguration() {
    return serverGatewayConfiguration;
  }


  public void setServerGatewayConfiguration(ClientV1RequestClientGatewayConfiguration serverGatewayConfiguration) {
    this.serverGatewayConfiguration = serverGatewayConfiguration;
  }


  public ClientV1Request maxRetries(BigDecimal maxRetries) {
    
    this.maxRetries = maxRetries;
    return this;
  }

   /**
   * Get maxRetries
   * @return maxRetries
  **/
  @javax.annotation.Nonnull
  public BigDecimal getMaxRetries() {
    return maxRetries;
  }


  public void setMaxRetries(BigDecimal maxRetries) {
    this.maxRetries = maxRetries;
  }


  public ClientV1Request maxTimeout(BigDecimal maxTimeout) {
    
    this.maxTimeout = maxTimeout;
    return this;
  }

   /**
   * Get maxTimeout
   * @return maxTimeout
  **/
  @javax.annotation.Nonnull
  public BigDecimal getMaxTimeout() {
    return maxTimeout;
  }


  public void setMaxTimeout(BigDecimal maxTimeout) {
    this.maxTimeout = maxTimeout;
  }


  public ClientV1Request sourceLedgerAssetID(String sourceLedgerAssetID) {
    
    this.sourceLedgerAssetID = sourceLedgerAssetID;
    return this;
  }

   /**
   * Get sourceLedgerAssetID
   * @return sourceLedgerAssetID
  **/
  @javax.annotation.Nonnull
  public String getSourceLedgerAssetID() {
    return sourceLedgerAssetID;
  }


  public void setSourceLedgerAssetID(String sourceLedgerAssetID) {
    this.sourceLedgerAssetID = sourceLedgerAssetID;
  }


  public ClientV1Request recipientLedgerAssetID(String recipientLedgerAssetID) {
    
    this.recipientLedgerAssetID = recipientLedgerAssetID;
    return this;
  }

   /**
   * Get recipientLedgerAssetID
   * @return recipientLedgerAssetID
  **/
  @javax.annotation.Nonnull
  public String getRecipientLedgerAssetID() {
    return recipientLedgerAssetID;
  }


  public void setRecipientLedgerAssetID(String recipientLedgerAssetID) {
    this.recipientLedgerAssetID = recipientLedgerAssetID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientV1Request clientV1Request = (ClientV1Request) o;
    return Objects.equals(this.version, clientV1Request.version) &&
        Objects.equals(this.loggingProfile, clientV1Request.loggingProfile) &&
        Objects.equals(this.accessControlProfile, clientV1Request.accessControlProfile) &&
        Objects.equals(this.assetControlProfile, clientV1Request.assetControlProfile) &&
        Objects.equals(this.applicationProfile, clientV1Request.applicationProfile) &&
        Objects.equals(this.assetProfile, clientV1Request.assetProfile) &&
        Objects.equals(this.payloadProfile, clientV1Request.payloadProfile) &&
        Objects.equals(this.sourceGatewayDltSystem, clientV1Request.sourceGatewayDltSystem) &&
        Objects.equals(this.recipientGatewayDltSystem, clientV1Request.recipientGatewayDltSystem) &&
        Objects.equals(this.recipientGatewayPubkey, clientV1Request.recipientGatewayPubkey) &&
        Objects.equals(this.originatorPubkey, clientV1Request.originatorPubkey) &&
        Objects.equals(this.beneficiaryPubkey, clientV1Request.beneficiaryPubkey) &&
        Objects.equals(this.clientIdentityPubkey, clientV1Request.clientIdentityPubkey) &&
        Objects.equals(this.serverIdentityPubkey, clientV1Request.serverIdentityPubkey) &&
        Objects.equals(this.clientDltSystem, clientV1Request.clientDltSystem) &&
        Objects.equals(this.serverDltSystem, clientV1Request.serverDltSystem) &&
        Objects.equals(this.clientGatewayConfiguration, clientV1Request.clientGatewayConfiguration) &&
        Objects.equals(this.serverGatewayConfiguration, clientV1Request.serverGatewayConfiguration) &&
        Objects.equals(this.maxRetries, clientV1Request.maxRetries) &&
        Objects.equals(this.maxTimeout, clientV1Request.maxTimeout) &&
        Objects.equals(this.sourceLedgerAssetID, clientV1Request.sourceLedgerAssetID) &&
        Objects.equals(this.recipientLedgerAssetID, clientV1Request.recipientLedgerAssetID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, loggingProfile, accessControlProfile, assetControlProfile, applicationProfile, assetProfile, payloadProfile, sourceGatewayDltSystem, recipientGatewayDltSystem, recipientGatewayPubkey, originatorPubkey, beneficiaryPubkey, clientIdentityPubkey, serverIdentityPubkey, clientDltSystem, serverDltSystem, clientGatewayConfiguration, serverGatewayConfiguration, maxRetries, maxTimeout, sourceLedgerAssetID, recipientLedgerAssetID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientV1Request {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    loggingProfile: ").append(toIndentedString(loggingProfile)).append("\n");
    sb.append("    accessControlProfile: ").append(toIndentedString(accessControlProfile)).append("\n");
    sb.append("    assetControlProfile: ").append(toIndentedString(assetControlProfile)).append("\n");
    sb.append("    applicationProfile: ").append(toIndentedString(applicationProfile)).append("\n");
    sb.append("    assetProfile: ").append(toIndentedString(assetProfile)).append("\n");
    sb.append("    payloadProfile: ").append(toIndentedString(payloadProfile)).append("\n");
    sb.append("    sourceGatewayDltSystem: ").append(toIndentedString(sourceGatewayDltSystem)).append("\n");
    sb.append("    recipientGatewayDltSystem: ").append(toIndentedString(recipientGatewayDltSystem)).append("\n");
    sb.append("    recipientGatewayPubkey: ").append(toIndentedString(recipientGatewayPubkey)).append("\n");
    sb.append("    originatorPubkey: ").append(toIndentedString(originatorPubkey)).append("\n");
    sb.append("    beneficiaryPubkey: ").append(toIndentedString(beneficiaryPubkey)).append("\n");
    sb.append("    clientIdentityPubkey: ").append(toIndentedString(clientIdentityPubkey)).append("\n");
    sb.append("    serverIdentityPubkey: ").append(toIndentedString(serverIdentityPubkey)).append("\n");
    sb.append("    clientDltSystem: ").append(toIndentedString(clientDltSystem)).append("\n");
    sb.append("    serverDltSystem: ").append(toIndentedString(serverDltSystem)).append("\n");
    sb.append("    clientGatewayConfiguration: ").append(toIndentedString(clientGatewayConfiguration)).append("\n");
    sb.append("    serverGatewayConfiguration: ").append(toIndentedString(serverGatewayConfiguration)).append("\n");
    sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
    sb.append("    maxTimeout: ").append(toIndentedString(maxTimeout)).append("\n");
    sb.append("    sourceLedgerAssetID: ").append(toIndentedString(sourceLedgerAssetID)).append("\n");
    sb.append("    recipientLedgerAssetID: ").append(toIndentedString(recipientLedgerAssetID)).append("\n");
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
    openapiFields.add("version");
    openapiFields.add("loggingProfile");
    openapiFields.add("accessControlProfile");
    openapiFields.add("assetControlProfile");
    openapiFields.add("applicationProfile");
    openapiFields.add("assetProfile");
    openapiFields.add("payloadProfile");
    openapiFields.add("sourceGatewayDltSystem");
    openapiFields.add("recipientGatewayDltSystem");
    openapiFields.add("recipientGatewayPubkey");
    openapiFields.add("originatorPubkey");
    openapiFields.add("beneficiaryPubkey");
    openapiFields.add("clientIdentityPubkey");
    openapiFields.add("serverIdentityPubkey");
    openapiFields.add("clientDltSystem");
    openapiFields.add("serverDltSystem");
    openapiFields.add("clientGatewayConfiguration");
    openapiFields.add("serverGatewayConfiguration");
    openapiFields.add("maxRetries");
    openapiFields.add("maxTimeout");
    openapiFields.add("sourceLedgerAssetID");
    openapiFields.add("recipientLedgerAssetID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("loggingProfile");
    openapiRequiredFields.add("accessControlProfile");
    openapiRequiredFields.add("assetControlProfile");
    openapiRequiredFields.add("applicationProfile");
    openapiRequiredFields.add("assetProfile");
    openapiRequiredFields.add("payloadProfile");
    openapiRequiredFields.add("sourceGatewayDltSystem");
    openapiRequiredFields.add("recipientGatewayDltSystem");
    openapiRequiredFields.add("recipientGatewayPubkey");
    openapiRequiredFields.add("originatorPubkey");
    openapiRequiredFields.add("beneficiaryPubkey");
    openapiRequiredFields.add("clientIdentityPubkey");
    openapiRequiredFields.add("serverIdentityPubkey");
    openapiRequiredFields.add("clientDltSystem");
    openapiRequiredFields.add("serverDltSystem");
    openapiRequiredFields.add("clientGatewayConfiguration");
    openapiRequiredFields.add("serverGatewayConfiguration");
    openapiRequiredFields.add("maxRetries");
    openapiRequiredFields.add("maxTimeout");
    openapiRequiredFields.add("sourceLedgerAssetID");
    openapiRequiredFields.add("recipientLedgerAssetID");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClientV1Request
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClientV1Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClientV1Request is not found in the empty JSON string", ClientV1Request.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ClientV1Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClientV1Request` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ClientV1Request.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if (!jsonObj.get("loggingProfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `loggingProfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("loggingProfile").toString()));
      }
      if (!jsonObj.get("accessControlProfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessControlProfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessControlProfile").toString()));
      }
      if (!jsonObj.get("assetControlProfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetControlProfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetControlProfile").toString()));
      }
      if (!jsonObj.get("applicationProfile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `applicationProfile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("applicationProfile").toString()));
      }
      // validate the required field `assetProfile`
      AssetProfile.validateJsonObject(jsonObj.getAsJsonObject("assetProfile"));
      // validate the required field `payloadProfile`
      PayloadProfile.validateJsonObject(jsonObj.getAsJsonObject("payloadProfile"));
      if (!jsonObj.get("sourceGatewayDltSystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceGatewayDltSystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceGatewayDltSystem").toString()));
      }
      if (!jsonObj.get("recipientGatewayDltSystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientGatewayDltSystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientGatewayDltSystem").toString()));
      }
      if (!jsonObj.get("recipientGatewayPubkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientGatewayPubkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientGatewayPubkey").toString()));
      }
      if (!jsonObj.get("originatorPubkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originatorPubkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originatorPubkey").toString()));
      }
      if (!jsonObj.get("beneficiaryPubkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiaryPubkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiaryPubkey").toString()));
      }
      if (!jsonObj.get("clientIdentityPubkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientIdentityPubkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientIdentityPubkey").toString()));
      }
      if (!jsonObj.get("serverIdentityPubkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIdentityPubkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIdentityPubkey").toString()));
      }
      if (!jsonObj.get("clientDltSystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientDltSystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientDltSystem").toString()));
      }
      if (!jsonObj.get("serverDltSystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverDltSystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverDltSystem").toString()));
      }
      // validate the required field `clientGatewayConfiguration`
      ClientV1RequestClientGatewayConfiguration.validateJsonObject(jsonObj.getAsJsonObject("clientGatewayConfiguration"));
      // validate the required field `serverGatewayConfiguration`
      ClientV1RequestClientGatewayConfiguration.validateJsonObject(jsonObj.getAsJsonObject("serverGatewayConfiguration"));
      if (!jsonObj.get("sourceLedgerAssetID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceLedgerAssetID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceLedgerAssetID").toString()));
      }
      if (!jsonObj.get("recipientLedgerAssetID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipientLedgerAssetID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipientLedgerAssetID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClientV1Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClientV1Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClientV1Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClientV1Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClientV1Request>() {
           @Override
           public void write(JsonWriter out, ClientV1Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClientV1Request read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClientV1Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClientV1Request
  * @throws IOException if the JSON string is invalid with respect to ClientV1Request
  */
  public static ClientV1Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClientV1Request.class);
  }

 /**
  * Convert an instance of ClientV1Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
