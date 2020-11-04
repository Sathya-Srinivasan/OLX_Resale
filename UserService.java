package com.hcl.olxresale.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.hcl.olxresale.model.User;


@Service
public class UserService {
	static Connection conn = null;
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelreservation", "root", "root");
		} catch (Exception e) {
			System.out.println("Error occured during connection creation " + e.getMessage());
		}
	}

	public boolean register(User user) {
		try {
			PreparedStatement pst = conn
					.prepareStatement("insert into user(EMAILID, PASSWORD,PHONENUMBER,ROLEID) values(?,?,?,?)");
			pst.setString(1, user.getEmailId());
			pst.setString(2, user.getPassword());
			pst.setInt(3, user.getPhoneNumber());
			pst.setInt(4, user.getRoleId());

			pst.executeUpdate();

			return true;
		} catch (SQLException e) {
			System.out.println("Error occured during insert user record" + e.getMessage());
		}

		return false;
	}
}
