package com.saxena.vaibhav.pictogram.user.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

	/**
	 * Generated Serial version UID.
	 */
	private static final long serialVersionUID = -2136733771752295725L;

	private String userId;

	private String encryptedPassword;

	private String firstName;

	private String lastName;

	private String password;

	private String email;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
