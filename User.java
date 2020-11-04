package com.hcl.olxresale.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
@Entity
@Table (name="olxResale")
public class User {
	@NotEmpty
	@Pattern(regexp="^[a-zA-Z0-9]{3}@[a-zA-Z0-9]{3}.com",message="You have entered invalid Email Id")  
	private String emailId;
	@NotEmpty
	private String password;
	private String Address;
	//@NotEmpty
	//@Pattern(regexp="^[0-9]{10}",message="you have entered invalid phone number")
	private int phoneNumber;
	private int roleId;

	public User() {
		super();
	}

	public User(String emailId, String password,String Address,int phoneNumber,  int roleId) {
		super();
		this.emailId=emailId;
		this.password = password;
		this.Address = Address;
		this.phoneNumber=phoneNumber;
		this.roleId = roleId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

}
