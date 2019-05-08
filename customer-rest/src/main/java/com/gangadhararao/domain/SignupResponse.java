package com.gangadhararao.domain;

public class SignupResponse {
	
	private int errorCode;
	private String errorMessage;
	
	public SignupResponse(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
