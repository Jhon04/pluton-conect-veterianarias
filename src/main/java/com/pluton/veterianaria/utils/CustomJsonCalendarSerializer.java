package com.pluton.veterianaria.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CustomJsonCalendarSerializer extends JsonSerializer<Calendar> {

	@Override
	public void serialize(Calendar value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException, JsonProcessingException {
		// ANGULAR
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		// FLEX
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String formattedDate = formatter.format(value.getTime());
		gen.writeString(formattedDate);
	}
}
