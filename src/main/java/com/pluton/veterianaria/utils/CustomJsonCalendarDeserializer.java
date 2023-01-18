package com.pluton.veterianaria.utils;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CustomJsonCalendarDeserializer extends JsonDeserializer<Calendar> {

	@Override
	public Calendar deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String date = p.getText();
		try {
			Calendar cal = Calendar.getInstance();
			cal.setTime(format.parse(date));
			return cal;
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
