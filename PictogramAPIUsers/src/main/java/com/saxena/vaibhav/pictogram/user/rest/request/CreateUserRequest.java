package com.saxena.vaibhav.pictogram.user.rest.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequest {

	@NotNull(message = "First Name cannot be empty.")
	@Size(min = 2, max = 20, message = "First Name should be between 2 and 20 characters.")
	private String firstName;
	
	@NotNull(message = "Last Name cannot be empty.")
	@Size(min = 2, max = 20, message = "Last Name should be between 2 and 20 characters.")
	private String lastName;
	
	@NotNull(message = "Password cannot be empty.")
	@Size(min = 8, max = 16, message = "Password should be between 8 and 16 characters.")
	private String password;
	
	@NotNull(message = "Email cannot be empty.")
	@Email(message = "Invalid email format.")
	private String email;

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
