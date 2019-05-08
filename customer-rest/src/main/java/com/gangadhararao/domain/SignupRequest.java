package com.gangadhararao.domain;

import javax.validation.constraints.NotNull;

public class SignupRequest {
	
	private String email;
	private String password;
	private String fullName;
	
	public SignupRequest(String email, String password, String fullName) {
		this.email = email;
		this.password = password;
		this.fullName = fullName;
	}

	@NotNull(message = "email is required.")
	public String getEmail() {
		return email;
	}

	@NotNull(message = "password is required.")
	public String getPassword() {
		return password;
	}

	@NotNull(message = "full name is required.")
	public String getFullName() {
		return fullName;
	}	
}
