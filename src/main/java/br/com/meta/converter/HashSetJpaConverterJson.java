package br.com.meta.converter;

/*
import java.io.IOException;
import java.util.LinkedHashSet;

import javax.persistence.AttributeConverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class HashSetJpaConverterJson implements AttributeConverter<Object, String> {

	private final static ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public String convertToDatabaseColumn(Object meta) {
		try {
			return objectMapper.writeValueAsString(meta);
		} catch (JsonProcessingException ex) {
			return null;
		}
	}

	@Override
	public Object convertToEntityAttribute(String dbData) {
		if(dbData == null){
			return null;
		}
		try {
			return objectMapper.readValue(dbData, LinkedHashSet.class);
		} catch (IOException ex) {
			return null;
		}
	}

}
*/
