package com.jarroyo.price.checker.exception;

import java.time.LocalDateTime;
import java.util.List;



public class ErrorResponse {
	
	private Integer status;
	private String message;
	private LocalDateTime timestamp;
	private List<String> errors;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}


	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	ErrorResponse(String message){
		this.message = message;
	}

	public ErrorResponse(Integer status, String message, LocalDateTime timestamp, List<String> errors) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.errors = errors;
	}

	public ErrorResponse() {
		super();
	}
	
	
}
