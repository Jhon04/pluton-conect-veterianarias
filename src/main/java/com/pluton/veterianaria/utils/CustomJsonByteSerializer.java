package com.pluton.veterianaria.utils;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CustomJsonByteSerializer extends JsonSerializer<byte[]> {

	@Override
	public void serialize(byte[] value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		String base64 = UtilCommon.cifrarBase64(value);
		gen.writeString(base64);
	}
}
