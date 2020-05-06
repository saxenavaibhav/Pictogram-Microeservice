package com.saxena.vaibhav.pictogram.user.service.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TUSER")
public class UserEntity implements Serializable {

	/**
	 * Generated Serial version UID.
	 */
	private static final long serialVersionUID = -377769640007945948L;

	@Id
	@GeneratedValue
	@Column(name="UIDPK")
	private Long uidpk;
	
	@Column(name="USER_ID", nullable = false, unique=true)
	private String userId;

	@Column(name="ENCRYPTED_PASSWORD", nullable = false)
	private String encryptedPassword;

	@Column(name="FIRST_NAME", nullable = false, length=50)
	private String firstName;

	@Column(name="LAST_NAME", nullable = false, length=50)
	private String lastName;

	@Column(name="EMAIL", nullable = false, length=120, unique=true)
	private String email;

	public Long getUidpk() {
		return uidpk;
	}

	public void setUidpk(Long uidpk) {
		this.uidpk = uidpk;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
