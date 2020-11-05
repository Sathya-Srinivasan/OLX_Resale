package com.hcl.olxresale.model;

import javax.validation.constraints.NotEmpty;

/**
 * @author Sathya S
 *
 */
public class Login {
	@NotEmpty
	private String email;
	@NotEmpty
	private String password;

	/**
	 * 
	 */
	public Login() {
		super();
	}

	/**
	 * @param email
	 * @param password
	 */
	public Login(@NotEmpty String email, @NotEmpty String password) {
		super();
		this.email = email;
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
