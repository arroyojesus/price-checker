package com.jarroyo.price.checker.component;

public enum HeaderResponse {
    
	STATUS_OK("OK", "200", "Data obtained");

	private String status;
	private String code;
    private String message;

    private HeaderResponse(String status, String code, String message) {
    	this.setStatus(status);
        this.setCode(code);
        this.setMessage(message);
    }
    
    public String getStatus() {
    	return status;
    }
    
    public void setStatus(String status) {
    	this.status = status;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return this.getMessage();
    }
}
