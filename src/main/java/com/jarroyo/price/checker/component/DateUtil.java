package com.jarroyo.price.checker.component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.stereotype.Component;

@Component("dateUtil")
public class DateUtil {

	private static final String PATTERN = "yyyy-MM-dd HH:mm:ss";

	public LocalDateTime converterStringToLocalDateTime(String applicationDate) throws DateTimeParseException {

		DateTimeFormatter formater = DateTimeFormatter.ofPattern(PATTERN);
		LocalDateTime dateTime = LocalDateTime.parse(applicationDate, formater);

		return dateTime;
	}
}
