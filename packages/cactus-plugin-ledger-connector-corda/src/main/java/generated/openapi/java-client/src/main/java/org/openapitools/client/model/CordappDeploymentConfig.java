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
import org.openapitools.client.model.CordaNodeSshCredentials;
import org.openapitools.client.model.CordaRpcCredentials;

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
 * CordappDeploymentConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:11.202432183+05:30[Asia/Kolkata]")
public class CordappDeploymentConfig {
  public static final String SERIALIZED_NAME_SSH_CREDENTIALS = "sshCredentials";
  @SerializedName(SERIALIZED_NAME_SSH_CREDENTIALS)
  private CordaNodeSshCredentials sshCredentials;

  public static final String SERIALIZED_NAME_RPC_CREDENTIALS = "rpcCredentials";
  @SerializedName(SERIALIZED_NAME_RPC_CREDENTIALS)
  private CordaRpcCredentials rpcCredentials;

  public static final String SERIALIZED_NAME_CORDA_NODE_START_CMD = "cordaNodeStartCmd";
  @SerializedName(SERIALIZED_NAME_CORDA_NODE_START_CMD)
  private String cordaNodeStartCmd;

  public static final String SERIALIZED_NAME_CORDAPP_DIR = "cordappDir";
  @SerializedName(SERIALIZED_NAME_CORDAPP_DIR)
  private String cordappDir;

  public static final String SERIALIZED_NAME_CORDA_JAR_PATH = "cordaJarPath";
  @SerializedName(SERIALIZED_NAME_CORDA_JAR_PATH)
  private String cordaJarPath;

  public static final String SERIALIZED_NAME_NODE_BASE_DIR_PATH = "nodeBaseDirPath";
  @SerializedName(SERIALIZED_NAME_NODE_BASE_DIR_PATH)
  private String nodeBaseDirPath;

  public CordappDeploymentConfig() {
  }

  public CordappDeploymentConfig sshCredentials(CordaNodeSshCredentials sshCredentials) {
    
    this.sshCredentials = sshCredentials;
    return this;
  }

   /**
   * Get sshCredentials
   * @return sshCredentials
  **/
  @javax.annotation.Nonnull
  public CordaNodeSshCredentials getSshCredentials() {
    return sshCredentials;
  }


  public void setSshCredentials(CordaNodeSshCredentials sshCredentials) {
    this.sshCredentials = sshCredentials;
  }


  public CordappDeploymentConfig rpcCredentials(CordaRpcCredentials rpcCredentials) {
    
    this.rpcCredentials = rpcCredentials;
    return this;
  }

   /**
   * Get rpcCredentials
   * @return rpcCredentials
  **/
  @javax.annotation.Nonnull
  public CordaRpcCredentials getRpcCredentials() {
    return rpcCredentials;
  }


  public void setRpcCredentials(CordaRpcCredentials rpcCredentials) {
    this.rpcCredentials = rpcCredentials;
  }


  public CordappDeploymentConfig cordaNodeStartCmd(String cordaNodeStartCmd) {
    
    this.cordaNodeStartCmd = cordaNodeStartCmd;
    return this;
  }

   /**
   * The shell command to execute in order to start back up a Corda node after having placed new jars in the cordapp directory of said node.
   * @return cordaNodeStartCmd
  **/
  @javax.annotation.Nonnull
  public String getCordaNodeStartCmd() {
    return cordaNodeStartCmd;
  }


  public void setCordaNodeStartCmd(String cordaNodeStartCmd) {
    this.cordaNodeStartCmd = cordaNodeStartCmd;
  }


  public CordappDeploymentConfig cordappDir(String cordappDir) {
    
    this.cordappDir = cordappDir;
    return this;
  }

   /**
   * The absolute file system path where the Corda Node is expecting deployed Cordapp jar files to be placed.
   * @return cordappDir
  **/
  @javax.annotation.Nonnull
  public String getCordappDir() {
    return cordappDir;
  }


  public void setCordappDir(String cordappDir) {
    this.cordappDir = cordappDir;
  }


  public CordappDeploymentConfig cordaJarPath(String cordaJarPath) {
    
    this.cordaJarPath = cordaJarPath;
    return this;
  }

   /**
   * The absolute file system path where the corda.jar file of the node can be found. This is used to execute database schema migrations where applicable (H2 database in use in development environments).
   * @return cordaJarPath
  **/
  @javax.annotation.Nonnull
  public String getCordaJarPath() {
    return cordaJarPath;
  }


  public void setCordaJarPath(String cordaJarPath) {
    this.cordaJarPath = cordaJarPath;
  }


  public CordappDeploymentConfig nodeBaseDirPath(String nodeBaseDirPath) {
    
    this.nodeBaseDirPath = nodeBaseDirPath;
    return this;
  }

   /**
   * The absolute file system path where the base directory of the Corda node can be found. This is used to pass in to corda.jar when being invoked for certain tasks such as executing database schema migrations for a deployed contract.
   * @return nodeBaseDirPath
  **/
  @javax.annotation.Nonnull
  public String getNodeBaseDirPath() {
    return nodeBaseDirPath;
  }


  public void setNodeBaseDirPath(String nodeBaseDirPath) {
    this.nodeBaseDirPath = nodeBaseDirPath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CordappDeploymentConfig cordappDeploymentConfig = (CordappDeploymentConfig) o;
    return Objects.equals(this.sshCredentials, cordappDeploymentConfig.sshCredentials) &&
        Objects.equals(this.rpcCredentials, cordappDeploymentConfig.rpcCredentials) &&
        Objects.equals(this.cordaNodeStartCmd, cordappDeploymentConfig.cordaNodeStartCmd) &&
        Objects.equals(this.cordappDir, cordappDeploymentConfig.cordappDir) &&
        Objects.equals(this.cordaJarPath, cordappDeploymentConfig.cordaJarPath) &&
        Objects.equals(this.nodeBaseDirPath, cordappDeploymentConfig.nodeBaseDirPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sshCredentials, rpcCredentials, cordaNodeStartCmd, cordappDir, cordaJarPath, nodeBaseDirPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CordappDeploymentConfig {\n");
    sb.append("    sshCredentials: ").append(toIndentedString(sshCredentials)).append("\n");
    sb.append("    rpcCredentials: ").append(toIndentedString(rpcCredentials)).append("\n");
    sb.append("    cordaNodeStartCmd: ").append(toIndentedString(cordaNodeStartCmd)).append("\n");
    sb.append("    cordappDir: ").append(toIndentedString(cordappDir)).append("\n");
    sb.append("    cordaJarPath: ").append(toIndentedString(cordaJarPath)).append("\n");
    sb.append("    nodeBaseDirPath: ").append(toIndentedString(nodeBaseDirPath)).append("\n");
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
    openapiFields.add("sshCredentials");
    openapiFields.add("rpcCredentials");
    openapiFields.add("cordaNodeStartCmd");
    openapiFields.add("cordappDir");
    openapiFields.add("cordaJarPath");
    openapiFields.add("nodeBaseDirPath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("sshCredentials");
    openapiRequiredFields.add("rpcCredentials");
    openapiRequiredFields.add("cordaNodeStartCmd");
    openapiRequiredFields.add("cordappDir");
    openapiRequiredFields.add("cordaJarPath");
    openapiRequiredFields.add("nodeBaseDirPath");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CordappDeploymentConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CordappDeploymentConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CordappDeploymentConfig is not found in the empty JSON string", CordappDeploymentConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CordappDeploymentConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CordappDeploymentConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CordappDeploymentConfig.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `sshCredentials`
      CordaNodeSshCredentials.validateJsonObject(jsonObj.getAsJsonObject("sshCredentials"));
      // validate the required field `rpcCredentials`
      CordaRpcCredentials.validateJsonObject(jsonObj.getAsJsonObject("rpcCredentials"));
      if (!jsonObj.get("cordaNodeStartCmd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cordaNodeStartCmd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cordaNodeStartCmd").toString()));
      }
      if (!jsonObj.get("cordappDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cordappDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cordappDir").toString()));
      }
      if (!jsonObj.get("cordaJarPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cordaJarPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cordaJarPath").toString()));
      }
      if (!jsonObj.get("nodeBaseDirPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeBaseDirPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeBaseDirPath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CordappDeploymentConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CordappDeploymentConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CordappDeploymentConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CordappDeploymentConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<CordappDeploymentConfig>() {
           @Override
           public void write(JsonWriter out, CordappDeploymentConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CordappDeploymentConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CordappDeploymentConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CordappDeploymentConfig
  * @throws IOException if the JSON string is invalid with respect to CordappDeploymentConfig
  */
  public static CordappDeploymentConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CordappDeploymentConfig.class);
  }

 /**
  * Convert an instance of CordappDeploymentConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
