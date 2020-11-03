package com.hcl.springregistration.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.hcl.springregistration.model.User;


@Service
public class UserService {
	static Connection conn = null;
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/OLX_Resale", "root", "root");
		} catch (Exception e) {
			System.out.println("Error occured during connection creation " + e.getMessage());
		}
	}

	public boolean register(User user) {
		try {
			PreparedStatement pst = conn
					.prepareStatement("insert into user(Id,Email,Address,Password,RoleId) values(?,?,?,?,?)");
			pst.setString(1, user.getAadharNumber());
			pst.setString(2, user.getPassword());
			pst.setInt(3, user.getRoleId());

			pst.executeUpdate();

			return true;
		} catch (SQLException e) {
			System.out.println("Error occured during insert user record" + e.getMessage());
		}

		return false;
	}
}