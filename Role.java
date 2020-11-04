package com.hcl.olxresale.model;

public class Role {
	int customer;
	int seller;
	public Role() {
		super();
	}
	public Role(int customer, int seller) {
		super();
		this.customer = customer;
		this.seller = seller;
		
	}
	public int getcustomer() {
		return customer;
	}
	public void setUserId(int userId) {
		this.customer = customer;
	}
	public int getseller() {
		return seller;
	}
	public void setseller(int seller) {
		this.seller = seller;
	}
	//public String getAdmin() {
//		return Admin;
//	}
//	public void setAdmin(String admin) {
//		Admin = admin;
//	}
}