/*
 * Hyperledger Core API
 * Contains/describes the core API types for Cactus. Does not describe actual endpoints on its own as this is left to the implementing plugins who can import and re-use commonly needed type definitions from this specification. One example of said commonly used type definitions would be the types related to consortium management, cactus nodes, ledgers, etc..
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
 * Enumerates a list of consensus algorithm families that do not provide immediate finality
 */
@JsonAdapter(ConsensusAlgorithmFamiliesWithOutTxFinality.Adapter.class)
public enum ConsensusAlgorithmFamiliesWithOutTxFinality {
  
  WORK("org.hyperledger.cactus.consensusalgorithm.PROOF_OF_WORK");

  private String value;

  ConsensusAlgorithmFamiliesWithOutTxFinality(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConsensusAlgorithmFamiliesWithOutTxFinality fromValue(String value) {
    for (ConsensusAlgorithmFamiliesWithOutTxFinality b : ConsensusAlgorithmFamiliesWithOutTxFinality.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ConsensusAlgorithmFamiliesWithOutTxFinality> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConsensusAlgorithmFamiliesWithOutTxFinality enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConsensusAlgorithmFamiliesWithOutTxFinality read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConsensusAlgorithmFamiliesWithOutTxFinality.fromValue(value);
    }
  }
}
