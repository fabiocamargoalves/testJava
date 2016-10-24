package br.com.meta.converter;
/*
import java.io.IOException;

import javax.persistence.AttributeConverter;



public class JpaConverterJson implements AttributeConverter<Object, String> {

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
			return objectMapper.readValue(dbData, Object.class);
		} catch (IOException ex) {
			return null;
		}
	}

}
*/