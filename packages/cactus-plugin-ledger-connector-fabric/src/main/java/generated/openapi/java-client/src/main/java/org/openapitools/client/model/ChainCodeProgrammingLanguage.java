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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Enumerates the supported source code programming languages of Hyperledger Fabric
 */
@JsonAdapter(ChainCodeProgrammingLanguage.Adapter.class)
public enum ChainCodeProgrammingLanguage {
  
  GOLANG("golang"),
  
  JAVASCRIPT("javascript"),
  
  TYPESCRIPT("typescript"),
  
  JAVA("java");

  private String value;

  ChainCodeProgrammingLanguage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChainCodeProgrammingLanguage fromValue(String value) {
    for (ChainCodeProgrammingLanguage b : ChainCodeProgrammingLanguage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ChainCodeProgrammingLanguage> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChainCodeProgrammingLanguage enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChainCodeProgrammingLanguage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChainCodeProgrammingLanguage.fromValue(value);
    }
  }
}
