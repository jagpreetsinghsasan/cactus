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
import org.openapitools.client.model.IrohaBaseConfig;
import org.openapitools.client.model.RunTransactionRequestV1;
import org.openapitools.client.model.RunTransactionRequestV1Params;
import org.openapitools.client.model.RunTransactionSignedRequestV1;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-27T17:03:27.945505986+05:30[Asia/Kolkata]")
public class RunTransactionRequestV1Body extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RunTransactionRequestV1Body.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RunTransactionRequestV1Body.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RunTransactionRequestV1Body' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RunTransactionRequestV1> adapterRunTransactionRequestV1 = gson.getDelegateAdapter(this, TypeToken.get(RunTransactionRequestV1.class));
            final TypeAdapter<RunTransactionSignedRequestV1> adapterRunTransactionSignedRequestV1 = gson.getDelegateAdapter(this, TypeToken.get(RunTransactionSignedRequestV1.class));

            return (TypeAdapter<T>) new TypeAdapter<RunTransactionRequestV1Body>() {
                @Override
                public void write(JsonWriter out, RunTransactionRequestV1Body value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RunTransactionRequestV1`
                    if (value.getActualInstance() instanceof RunTransactionRequestV1) {
                        JsonObject obj = adapterRunTransactionRequestV1.toJsonTree((RunTransactionRequestV1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `RunTransactionSignedRequestV1`
                    if (value.getActualInstance() instanceof RunTransactionSignedRequestV1) {
                        JsonObject obj = adapterRunTransactionSignedRequestV1.toJsonTree((RunTransactionSignedRequestV1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RunTransactionRequestV1, RunTransactionSignedRequestV1");
                }

                @Override
                public RunTransactionRequestV1Body read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RunTransactionRequestV1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunTransactionRequestV1.validateJsonObject(jsonObject);
                        actualAdapter = adapterRunTransactionRequestV1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunTransactionRequestV1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunTransactionRequestV1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunTransactionRequestV1'", e);
                    }

                    // deserialize RunTransactionSignedRequestV1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunTransactionSignedRequestV1.validateJsonObject(jsonObject);
                        actualAdapter = adapterRunTransactionSignedRequestV1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunTransactionSignedRequestV1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunTransactionSignedRequestV1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunTransactionSignedRequestV1'", e);
                    }

                    if (match == 1) {
                        RunTransactionRequestV1Body ret = new RunTransactionRequestV1Body();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RunTransactionRequestV1Body: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public RunTransactionRequestV1Body() {
        super("oneOf", Boolean.FALSE);
    }

    public RunTransactionRequestV1Body(RunTransactionRequestV1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RunTransactionRequestV1Body(RunTransactionSignedRequestV1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RunTransactionRequestV1", new GenericType<RunTransactionRequestV1>() {
        });
        schemas.put("RunTransactionSignedRequestV1", new GenericType<RunTransactionSignedRequestV1>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return RunTransactionRequestV1Body.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RunTransactionRequestV1, RunTransactionSignedRequestV1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RunTransactionRequestV1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunTransactionSignedRequestV1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RunTransactionRequestV1, RunTransactionSignedRequestV1");
    }

    /**
     * Get the actual instance, which can be the following:
     * RunTransactionRequestV1, RunTransactionSignedRequestV1
     *
     * @return The actual instance (RunTransactionRequestV1, RunTransactionSignedRequestV1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunTransactionRequestV1`. If the actual instance is not `RunTransactionRequestV1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunTransactionRequestV1`
     * @throws ClassCastException if the instance is not `RunTransactionRequestV1`
     */
    public RunTransactionRequestV1 getRunTransactionRequestV1() throws ClassCastException {
        return (RunTransactionRequestV1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunTransactionSignedRequestV1`. If the actual instance is not `RunTransactionSignedRequestV1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunTransactionSignedRequestV1`
     * @throws ClassCastException if the instance is not `RunTransactionSignedRequestV1`
     */
    public RunTransactionSignedRequestV1 getRunTransactionSignedRequestV1() throws ClassCastException {
        return (RunTransactionSignedRequestV1)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RunTransactionRequestV1Body
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with RunTransactionRequestV1
    try {
      RunTransactionRequestV1.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunTransactionRequestV1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RunTransactionSignedRequestV1
    try {
      RunTransactionSignedRequestV1.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunTransactionSignedRequestV1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RunTransactionRequestV1Body with oneOf schemas: RunTransactionRequestV1, RunTransactionSignedRequestV1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of RunTransactionRequestV1Body given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunTransactionRequestV1Body
  * @throws IOException if the JSON string is invalid with respect to RunTransactionRequestV1Body
  */
  public static RunTransactionRequestV1Body fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunTransactionRequestV1Body.class);
  }

 /**
  * Convert an instance of RunTransactionRequestV1Body to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
