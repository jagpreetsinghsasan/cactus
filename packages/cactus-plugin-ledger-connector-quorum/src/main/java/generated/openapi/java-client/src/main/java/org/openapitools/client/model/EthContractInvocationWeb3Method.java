/*
 * Hyperledger Cactus Plugin - Connector Quorum
 * Can perform basic tasks on a Quorum ledger
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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EthContractInvocationWeb3Method
 */
@JsonAdapter(EthContractInvocationWeb3Method.Adapter.class)
public enum EthContractInvocationWeb3Method {
  
  SEND("send"),
  
  CALL("call"),
  
  ENCODEABI("encodeABI"),
  
  ESTIMATEGAS("estimateGas");

  private String value;

  EthContractInvocationWeb3Method(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EthContractInvocationWeb3Method fromValue(String value) {
    for (EthContractInvocationWeb3Method b : EthContractInvocationWeb3Method.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EthContractInvocationWeb3Method> {
    @Override
    public void write(final JsonWriter jsonWriter, final EthContractInvocationWeb3Method enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EthContractInvocationWeb3Method read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EthContractInvocationWeb3Method.fromValue(value);
    }
  }
}
