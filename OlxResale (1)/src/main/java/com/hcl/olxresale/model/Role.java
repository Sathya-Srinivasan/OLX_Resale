package com.hcl.olxresale.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Sathya S
 *
 */
@Entity
@Table(name = "role")
public class Role {
	private int roleId;
	private String name;

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", name=" + name + "]";
	}

	/**
	 * 
	 */
	public Role() {
		super();

	}

	public Role(int roleId, String name) {
		super();
		this.roleId = roleId;
		this.name = name;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
