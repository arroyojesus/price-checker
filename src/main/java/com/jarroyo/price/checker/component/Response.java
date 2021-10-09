package com.jarroyo.price.checker.component;

public class Response {
	
	private String status;

	private String code;

	private String message;

	private Object data;

	public Response() {
	}

	public Response(HeaderResponse codeError, Object data) {
		this.status = codeError.getStatus();
		this.code = codeError.getCode();
		this.message = codeError.getMessage();
		this.data = data;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String codigo) {
		this.code = codigo;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
