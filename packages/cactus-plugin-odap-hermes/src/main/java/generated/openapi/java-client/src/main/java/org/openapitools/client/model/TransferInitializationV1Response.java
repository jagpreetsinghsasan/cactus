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
 * TransferInitializationV1Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:57.051152560+05:30[Asia/Kolkata]")
public class TransferInitializationV1Response {
  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "messageType";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private String messageType;

  public static final String SERIALIZED_NAME_SESSION_I_D = "sessionID";
  @SerializedName(SERIALIZED_NAME_SESSION_I_D)
  private String sessionID;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "sequenceNumber";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private BigDecimal sequenceNumber;

  /**
   * Gets or Sets odapPhase
   */
  @JsonAdapter(OdapPhaseEnum.Adapter.class)
  public enum OdapPhaseEnum {
    TRANSFERINITIALIZATION("TransferInitialization"),
    
    LOCKEVIDENCEVERIFICATION("LockEvidenceVerification"),
    
    COMMITMENTESTABLISHMENT("CommitmentEstablishment");

    private String value;

    OdapPhaseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OdapPhaseEnum fromValue(String value) {
      for (OdapPhaseEnum b : OdapPhaseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OdapPhaseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OdapPhaseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OdapPhaseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OdapPhaseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ODAP_PHASE = "odapPhase";
  @SerializedName(SERIALIZED_NAME_ODAP_PHASE)
  private OdapPhaseEnum odapPhase;

  public static final String SERIALIZED_NAME_INITIAL_REQUEST_MESSAGE_HASH = "initialRequestMessageHash";
  @SerializedName(SERIALIZED_NAME_INITIAL_REQUEST_MESSAGE_HASH)
  private String initialRequestMessageHash;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_TIME_STAMP = "timeStamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private String timeStamp;

  public static final String SERIALIZED_NAME_PROCESSED_TIME_STAMP = "processedTimeStamp";
  @SerializedName(SERIALIZED_NAME_PROCESSED_TIME_STAMP)
  private String processedTimeStamp;

  public static final String SERIALIZED_NAME_SERVER_IDENTITY_PUBKEY = "serverIdentityPubkey";
  @SerializedName(SERIALIZED_NAME_SERVER_IDENTITY_PUBKEY)
  private String serverIdentityPubkey;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;

  public static final String SERIALIZED_NAME_BACKUP_GATEWAYS_ALLOWED = "backupGatewaysAllowed";
  @SerializedName(SERIALIZED_NAME_BACKUP_GATEWAYS_ALLOWED)
  private List<String> backupGatewaysAllowed = new ArrayList<>();

  public TransferInitializationV1Response() {
  }

  public TransferInitializationV1Response messageType(String messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nonnull
  public String getMessageType() {
    return messageType;
  }


  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public TransferInitializationV1Response sessionID(String sessionID) {
    
    this.sessionID = sessionID;
    return this;
  }

   /**
   * Get sessionID
   * @return sessionID
  **/
  @javax.annotation.Nonnull
  public String getSessionID() {
    return sessionID;
  }


  public void setSessionID(String sessionID) {
    this.sessionID = sessionID;
  }


  public TransferInitializationV1Response sequenceNumber(BigDecimal sequenceNumber) {
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Get sequenceNumber
   * @return sequenceNumber
  **/
  @javax.annotation.Nonnull
  public BigDecimal getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(BigDecimal sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public TransferInitializationV1Response odapPhase(OdapPhaseEnum odapPhase) {
    
    this.odapPhase = odapPhase;
    return this;
  }

   /**
   * Get odapPhase
   * @return odapPhase
  **/
  @javax.annotation.Nullable
  public OdapPhaseEnum getOdapPhase() {
    return odapPhase;
  }


  public void setOdapPhase(OdapPhaseEnum odapPhase) {
    this.odapPhase = odapPhase;
  }


  public TransferInitializationV1Response initialRequestMessageHash(String initialRequestMessageHash) {
    
    this.initialRequestMessageHash = initialRequestMessageHash;
    return this;
  }

   /**
   * Get initialRequestMessageHash
   * @return initialRequestMessageHash
  **/
  @javax.annotation.Nonnull
  public String getInitialRequestMessageHash() {
    return initialRequestMessageHash;
  }


  public void setInitialRequestMessageHash(String initialRequestMessageHash) {
    this.initialRequestMessageHash = initialRequestMessageHash;
  }


  public TransferInitializationV1Response destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public TransferInitializationV1Response timeStamp(String timeStamp) {
    
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @javax.annotation.Nonnull
  public String getTimeStamp() {
    return timeStamp;
  }


  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }


  public TransferInitializationV1Response processedTimeStamp(String processedTimeStamp) {
    
    this.processedTimeStamp = processedTimeStamp;
    return this;
  }

   /**
   * Get processedTimeStamp
   * @return processedTimeStamp
  **/
  @javax.annotation.Nonnull
  public String getProcessedTimeStamp() {
    return processedTimeStamp;
  }


  public void setProcessedTimeStamp(String processedTimeStamp) {
    this.processedTimeStamp = processedTimeStamp;
  }


  public TransferInitializationV1Response serverIdentityPubkey(String serverIdentityPubkey) {
    
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


  public TransferInitializationV1Response signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @javax.annotation.Nonnull
  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public TransferInitializationV1Response backupGatewaysAllowed(List<String> backupGatewaysAllowed) {
    
    this.backupGatewaysAllowed = backupGatewaysAllowed;
    return this;
  }

  public TransferInitializationV1Response addBackupGatewaysAllowedItem(String backupGatewaysAllowedItem) {
    if (this.backupGatewaysAllowed == null) {
      this.backupGatewaysAllowed = new ArrayList<>();
    }
    this.backupGatewaysAllowed.add(backupGatewaysAllowedItem);
    return this;
  }

   /**
   * Get backupGatewaysAllowed
   * @return backupGatewaysAllowed
  **/
  @javax.annotation.Nonnull
  public List<String> getBackupGatewaysAllowed() {
    return backupGatewaysAllowed;
  }


  public void setBackupGatewaysAllowed(List<String> backupGatewaysAllowed) {
    this.backupGatewaysAllowed = backupGatewaysAllowed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferInitializationV1Response transferInitializationV1Response = (TransferInitializationV1Response) o;
    return Objects.equals(this.messageType, transferInitializationV1Response.messageType) &&
        Objects.equals(this.sessionID, transferInitializationV1Response.sessionID) &&
        Objects.equals(this.sequenceNumber, transferInitializationV1Response.sequenceNumber) &&
        Objects.equals(this.odapPhase, transferInitializationV1Response.odapPhase) &&
        Objects.equals(this.initialRequestMessageHash, transferInitializationV1Response.initialRequestMessageHash) &&
        Objects.equals(this.destination, transferInitializationV1Response.destination) &&
        Objects.equals(this.timeStamp, transferInitializationV1Response.timeStamp) &&
        Objects.equals(this.processedTimeStamp, transferInitializationV1Response.processedTimeStamp) &&
        Objects.equals(this.serverIdentityPubkey, transferInitializationV1Response.serverIdentityPubkey) &&
        Objects.equals(this.signature, transferInitializationV1Response.signature) &&
        Objects.equals(this.backupGatewaysAllowed, transferInitializationV1Response.backupGatewaysAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageType, sessionID, sequenceNumber, odapPhase, initialRequestMessageHash, destination, timeStamp, processedTimeStamp, serverIdentityPubkey, signature, backupGatewaysAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferInitializationV1Response {\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    sessionID: ").append(toIndentedString(sessionID)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    odapPhase: ").append(toIndentedString(odapPhase)).append("\n");
    sb.append("    initialRequestMessageHash: ").append(toIndentedString(initialRequestMessageHash)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    processedTimeStamp: ").append(toIndentedString(processedTimeStamp)).append("\n");
    sb.append("    serverIdentityPubkey: ").append(toIndentedString(serverIdentityPubkey)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    backupGatewaysAllowed: ").append(toIndentedString(backupGatewaysAllowed)).append("\n");
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
    openapiFields.add("messageType");
    openapiFields.add("sessionID");
    openapiFields.add("sequenceNumber");
    openapiFields.add("odapPhase");
    openapiFields.add("initialRequestMessageHash");
    openapiFields.add("destination");
    openapiFields.add("timeStamp");
    openapiFields.add("processedTimeStamp");
    openapiFields.add("serverIdentityPubkey");
    openapiFields.add("signature");
    openapiFields.add("backupGatewaysAllowed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("messageType");
    openapiRequiredFields.add("sessionID");
    openapiRequiredFields.add("sequenceNumber");
    openapiRequiredFields.add("initialRequestMessageHash");
    openapiRequiredFields.add("timeStamp");
    openapiRequiredFields.add("processedTimeStamp");
    openapiRequiredFields.add("serverIdentityPubkey");
    openapiRequiredFields.add("signature");
    openapiRequiredFields.add("backupGatewaysAllowed");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransferInitializationV1Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TransferInitializationV1Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferInitializationV1Response is not found in the empty JSON string", TransferInitializationV1Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransferInitializationV1Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferInitializationV1Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TransferInitializationV1Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("messageType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageType").toString()));
      }
      if (!jsonObj.get("sessionID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sessionID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sessionID").toString()));
      }
      if ((jsonObj.get("odapPhase") != null && !jsonObj.get("odapPhase").isJsonNull()) && !jsonObj.get("odapPhase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `odapPhase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("odapPhase").toString()));
      }
      if (!jsonObj.get("initialRequestMessageHash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initialRequestMessageHash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initialRequestMessageHash").toString()));
      }
      if ((jsonObj.get("destination") != null && !jsonObj.get("destination").isJsonNull()) && !jsonObj.get("destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destination").toString()));
      }
      if (!jsonObj.get("timeStamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeStamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeStamp").toString()));
      }
      if (!jsonObj.get("processedTimeStamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `processedTimeStamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("processedTimeStamp").toString()));
      }
      if (!jsonObj.get("serverIdentityPubkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIdentityPubkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIdentityPubkey").toString()));
      }
      if (!jsonObj.get("signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signature").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("backupGatewaysAllowed") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("backupGatewaysAllowed").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `backupGatewaysAllowed` to be an array in the JSON string but got `%s`", jsonObj.get("backupGatewaysAllowed").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferInitializationV1Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferInitializationV1Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferInitializationV1Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferInitializationV1Response.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferInitializationV1Response>() {
           @Override
           public void write(JsonWriter out, TransferInitializationV1Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferInitializationV1Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransferInitializationV1Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransferInitializationV1Response
  * @throws IOException if the JSON string is invalid with respect to TransferInitializationV1Response
  */
  public static TransferInitializationV1Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferInitializationV1Response.class);
  }

 /**
  * Convert an instance of TransferInitializationV1Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
