package com.hcl.olxresale.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

/**
 * @author Sathya S
 *
 */
@Entity
@Table(name = "user")
public class User {

	private int Id;
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z0-9]{3}@[a-zA-Z0-9]{3}.com", message = "You have entered invalid Email Id")
	private String email;
	private String name;
	@NotEmpty
	@Pattern(regexp = "^[0-9]{10}", message = "you have entered invalid phone number")
	private int mobileNumber;
	private String address;
	@NotEmpty
	private String password;
	private String confirmPassword;
	@Range(min = 1)
	private int roleId;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public User(int id, String email, String name, int mobileNumber, String address, String password,
			String confirmPassword, int roleId) {
		super();
		Id = id;
		this.email = email;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.roleId = roleId;
	}

	public User() {
		super();
	}
}