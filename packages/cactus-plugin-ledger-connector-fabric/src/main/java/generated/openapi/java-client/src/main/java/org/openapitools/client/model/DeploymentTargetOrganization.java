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
 * DeploymentTargetOrganization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:35.195240170+05:30[Asia/Kolkata]")
public class DeploymentTargetOrganization {
  public static final String SERIALIZED_NAME_C_O_R_E_P_E_E_R_L_O_C_A_L_M_S_P_I_D = "CORE_PEER_LOCALMSPID";
  @SerializedName(SERIALIZED_NAME_C_O_R_E_P_E_E_R_L_O_C_A_L_M_S_P_I_D)
  private String CORE_PEER_LOCALMSPID;

  public static final String SERIALIZED_NAME_C_O_R_E_P_E_E_R_A_D_D_R_E_S_S = "CORE_PEER_ADDRESS";
  @SerializedName(SERIALIZED_NAME_C_O_R_E_P_E_E_R_A_D_D_R_E_S_S)
  private String CORE_PEER_ADDRESS;

  public static final String SERIALIZED_NAME_C_O_R_E_P_E_E_R_M_S_P_C_O_N_F_I_G_P_A_T_H = "CORE_PEER_MSPCONFIGPATH";
  @SerializedName(SERIALIZED_NAME_C_O_R_E_P_E_E_R_M_S_P_C_O_N_F_I_G_P_A_T_H)
  private String CORE_PEER_MSPCONFIGPATH;

  public static final String SERIALIZED_NAME_C_O_R_E_P_E_E_R_T_L_S_R_O_O_T_C_E_R_T_F_I_L_E = "CORE_PEER_TLS_ROOTCERT_FILE";
  @SerializedName(SERIALIZED_NAME_C_O_R_E_P_E_E_R_T_L_S_R_O_O_T_C_E_R_T_F_I_L_E)
  private String CORE_PEER_TLS_ROOTCERT_FILE;

  public static final String SERIALIZED_NAME_O_R_D_E_R_E_R_T_L_S_R_O_O_T_C_E_R_T_F_I_L_E = "ORDERER_TLS_ROOTCERT_FILE";
  @SerializedName(SERIALIZED_NAME_O_R_D_E_R_E_R_T_L_S_R_O_O_T_C_E_R_T_F_I_L_E)
  private String ORDERER_TLS_ROOTCERT_FILE;

  public DeploymentTargetOrganization() {
  }

  public DeploymentTargetOrganization CORE_PEER_LOCALMSPID(String CORE_PEER_LOCALMSPID) {
    
    this.CORE_PEER_LOCALMSPID = CORE_PEER_LOCALMSPID;
    return this;
  }

   /**
   * Mapped to environment variables of the Fabric CLI container.
   * @return CORE_PEER_LOCALMSPID
  **/
  @javax.annotation.Nonnull
  public String getCOREPEERLOCALMSPID() {
    return CORE_PEER_LOCALMSPID;
  }


  public void setCOREPEERLOCALMSPID(String CORE_PEER_LOCALMSPID) {
    this.CORE_PEER_LOCALMSPID = CORE_PEER_LOCALMSPID;
  }


  public DeploymentTargetOrganization CORE_PEER_ADDRESS(String CORE_PEER_ADDRESS) {
    
    this.CORE_PEER_ADDRESS = CORE_PEER_ADDRESS;
    return this;
  }

   /**
   * Mapped to environment variables of the Fabric CLI container.
   * @return CORE_PEER_ADDRESS
  **/
  @javax.annotation.Nonnull
  public String getCOREPEERADDRESS() {
    return CORE_PEER_ADDRESS;
  }


  public void setCOREPEERADDRESS(String CORE_PEER_ADDRESS) {
    this.CORE_PEER_ADDRESS = CORE_PEER_ADDRESS;
  }


  public DeploymentTargetOrganization CORE_PEER_MSPCONFIGPATH(String CORE_PEER_MSPCONFIGPATH) {
    
    this.CORE_PEER_MSPCONFIGPATH = CORE_PEER_MSPCONFIGPATH;
    return this;
  }

   /**
   * Mapped to environment variables of the Fabric CLI container.
   * @return CORE_PEER_MSPCONFIGPATH
  **/
  @javax.annotation.Nonnull
  public String getCOREPEERMSPCONFIGPATH() {
    return CORE_PEER_MSPCONFIGPATH;
  }


  public void setCOREPEERMSPCONFIGPATH(String CORE_PEER_MSPCONFIGPATH) {
    this.CORE_PEER_MSPCONFIGPATH = CORE_PEER_MSPCONFIGPATH;
  }


  public DeploymentTargetOrganization CORE_PEER_TLS_ROOTCERT_FILE(String CORE_PEER_TLS_ROOTCERT_FILE) {
    
    this.CORE_PEER_TLS_ROOTCERT_FILE = CORE_PEER_TLS_ROOTCERT_FILE;
    return this;
  }

   /**
   * Mapped to environment variables of the Fabric CLI container.
   * @return CORE_PEER_TLS_ROOTCERT_FILE
  **/
  @javax.annotation.Nonnull
  public String getCOREPEERTLSROOTCERTFILE() {
    return CORE_PEER_TLS_ROOTCERT_FILE;
  }


  public void setCOREPEERTLSROOTCERTFILE(String CORE_PEER_TLS_ROOTCERT_FILE) {
    this.CORE_PEER_TLS_ROOTCERT_FILE = CORE_PEER_TLS_ROOTCERT_FILE;
  }


  public DeploymentTargetOrganization ORDERER_TLS_ROOTCERT_FILE(String ORDERER_TLS_ROOTCERT_FILE) {
    
    this.ORDERER_TLS_ROOTCERT_FILE = ORDERER_TLS_ROOTCERT_FILE;
    return this;
  }

   /**
   * Mapped to environment variables of the Fabric CLI container.
   * @return ORDERER_TLS_ROOTCERT_FILE
  **/
  @javax.annotation.Nonnull
  public String getORDERERTLSROOTCERTFILE() {
    return ORDERER_TLS_ROOTCERT_FILE;
  }


  public void setORDERERTLSROOTCERTFILE(String ORDERER_TLS_ROOTCERT_FILE) {
    this.ORDERER_TLS_ROOTCERT_FILE = ORDERER_TLS_ROOTCERT_FILE;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentTargetOrganization deploymentTargetOrganization = (DeploymentTargetOrganization) o;
    return Objects.equals(this.CORE_PEER_LOCALMSPID, deploymentTargetOrganization.CORE_PEER_LOCALMSPID) &&
        Objects.equals(this.CORE_PEER_ADDRESS, deploymentTargetOrganization.CORE_PEER_ADDRESS) &&
        Objects.equals(this.CORE_PEER_MSPCONFIGPATH, deploymentTargetOrganization.CORE_PEER_MSPCONFIGPATH) &&
        Objects.equals(this.CORE_PEER_TLS_ROOTCERT_FILE, deploymentTargetOrganization.CORE_PEER_TLS_ROOTCERT_FILE) &&
        Objects.equals(this.ORDERER_TLS_ROOTCERT_FILE, deploymentTargetOrganization.ORDERER_TLS_ROOTCERT_FILE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CORE_PEER_LOCALMSPID, CORE_PEER_ADDRESS, CORE_PEER_MSPCONFIGPATH, CORE_PEER_TLS_ROOTCERT_FILE, ORDERER_TLS_ROOTCERT_FILE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentTargetOrganization {\n");
    sb.append("    CORE_PEER_LOCALMSPID: ").append(toIndentedString(CORE_PEER_LOCALMSPID)).append("\n");
    sb.append("    CORE_PEER_ADDRESS: ").append(toIndentedString(CORE_PEER_ADDRESS)).append("\n");
    sb.append("    CORE_PEER_MSPCONFIGPATH: ").append(toIndentedString(CORE_PEER_MSPCONFIGPATH)).append("\n");
    sb.append("    CORE_PEER_TLS_ROOTCERT_FILE: ").append(toIndentedString(CORE_PEER_TLS_ROOTCERT_FILE)).append("\n");
    sb.append("    ORDERER_TLS_ROOTCERT_FILE: ").append(toIndentedString(ORDERER_TLS_ROOTCERT_FILE)).append("\n");
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
    openapiFields.add("CORE_PEER_LOCALMSPID");
    openapiFields.add("CORE_PEER_ADDRESS");
    openapiFields.add("CORE_PEER_MSPCONFIGPATH");
    openapiFields.add("CORE_PEER_TLS_ROOTCERT_FILE");
    openapiFields.add("ORDERER_TLS_ROOTCERT_FILE");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CORE_PEER_LOCALMSPID");
    openapiRequiredFields.add("CORE_PEER_ADDRESS");
    openapiRequiredFields.add("CORE_PEER_MSPCONFIGPATH");
    openapiRequiredFields.add("CORE_PEER_TLS_ROOTCERT_FILE");
    openapiRequiredFields.add("ORDERER_TLS_ROOTCERT_FILE");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeploymentTargetOrganization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeploymentTargetOrganization.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeploymentTargetOrganization is not found in the empty JSON string", DeploymentTargetOrganization.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeploymentTargetOrganization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeploymentTargetOrganization` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeploymentTargetOrganization.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("CORE_PEER_LOCALMSPID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CORE_PEER_LOCALMSPID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CORE_PEER_LOCALMSPID").toString()));
      }
      if (!jsonObj.get("CORE_PEER_ADDRESS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CORE_PEER_ADDRESS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CORE_PEER_ADDRESS").toString()));
      }
      if (!jsonObj.get("CORE_PEER_MSPCONFIGPATH").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CORE_PEER_MSPCONFIGPATH` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CORE_PEER_MSPCONFIGPATH").toString()));
      }
      if (!jsonObj.get("CORE_PEER_TLS_ROOTCERT_FILE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CORE_PEER_TLS_ROOTCERT_FILE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CORE_PEER_TLS_ROOTCERT_FILE").toString()));
      }
      if (!jsonObj.get("ORDERER_TLS_ROOTCERT_FILE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ORDERER_TLS_ROOTCERT_FILE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ORDERER_TLS_ROOTCERT_FILE").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeploymentTargetOrganization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeploymentTargetOrganization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeploymentTargetOrganization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeploymentTargetOrganization.class));

       return (TypeAdapter<T>) new TypeAdapter<DeploymentTargetOrganization>() {
           @Override
           public void write(JsonWriter out, DeploymentTargetOrganization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeploymentTargetOrganization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeploymentTargetOrganization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeploymentTargetOrganization
  * @throws IOException if the JSON string is invalid with respect to DeploymentTargetOrganization
  */
  public static DeploymentTargetOrganization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeploymentTargetOrganization.class);
  }

 /**
  * Convert an instance of DeploymentTargetOrganization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
