package com.pluton.veterianaria.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CustomJsonByteDeserializer extends JsonDeserializer<byte[]> {

	@Override
	public byte[] deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		try {		
			return UtilCommon.descifrarBase64(p.getText());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
