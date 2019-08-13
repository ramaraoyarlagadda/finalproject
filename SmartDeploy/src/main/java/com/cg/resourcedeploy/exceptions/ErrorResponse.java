package com.cg.resourcedeploy.exceptions;

public class ErrorResponse {

	private String errorMessage;

	private String callerURL;
	
	public ErrorResponse(String errorMessage, String callerURL) {
		super();
		this.errorMessage = errorMessage;
		this.callerURL = callerURL;
	}

	
	public String getCallerURL() {
		return callerURL;
	}

	public void setCallerURL(String callerURL) {
		this.callerURL = callerURL;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
