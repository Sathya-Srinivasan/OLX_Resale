package com.hcl.olxresale.repository;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.hcl.olxresale.model.Login;
import com.hcl.olxresale.model.User;
import com.hcl.olxresale.util.HibernateUtil;

/**
 * @author Sathya S
 *
 */
public class UserDaoImpl implements UserDao {
	@Override
	public boolean register(User usr) {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			session.beginTransaction(); // not required for select
			User user = new User();
			user.setId(usr.getId());
			user.setEmail(usr.getEmail());
			user.setName(usr.getName());
			user.setMobileNumber(usr.getMobileNumber());
			user.setAddress(usr.getAddress());
			user.setPassword(usr.getPassword());
			user.setConfirmPassword(usr.getConfirmPassword());
			user.setRoleId(usr.getRoleId());
			// your code operation code goes here (insert/update/delete/select)
			session.save(user);
			session.getTransaction().commit();// not required for select
			// HibernateUtil.shutdown();// if exception occurs (remove this line)
			return true;
		} catch (Exception e) {
			System.out.println("Error occured during insertion " + e.getMessage());
			return false;
		}
	}

	@Override
	public boolean login(Login login) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();

			session.beginTransaction(); // not required for select
			// your code operation code goes here (insert/update/delete/select)
			String selQuery = ("select count(distinct (email)) from userdetails u where u.email ='" + login.getEmail()
					+ "' and u.password='" + login.getPassword() + "'");
			Query query = session.createSQLQuery(selQuery);
			session.getTransaction().commit();// not required for select
			int temp = (int) query.getResultList().get(0);
			if (temp != 0) {
				return true;
			} else {
				return false;
			}
			// HibernateUtil.shutdown(); // if exception occurs (remove this line)

		} catch (Exception e) {
			System.out.println("Error occured during fetching the data " + e.getMessage());
			return false;
		}
	}

	/*
	 * 
	 * static Connection conn = null; { try {
	 * Class.forName("com.mysql.jdbc.Driver"); conn =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/OLX_Resale", "root",
	 * "root"); } catch (Exception e) {
	 * System.out.println("Error occured during connection creation " +
	 * e.getMessage()); } }
	 * 
	 * public boolean register(User user) { try { PreparedStatement pst =
	 * conn.prepareStatement(
	 * "insert into user(Id,Name,Email,Address,MobileNumber,Password,ConfirmPassword,roleid) values(?,?,?,?,?,?,?,?)"
	 * ); pst.setInt(1, user.getId()); pst.setString(2, user.getName());
	 * pst.setString(3, user.getEmail()); pst.setString(4, user.getAddress());
	 * pst.setInt(5, user.getMobileNumber()); pst.setString(6, user.getPassword());
	 * pst.setString(7, user.getConfirmPassword()); pst.setInt(8, user.getRoleId());
	 * 
	 * pst.executeUpdate(); return true; } catch (SQLException e) {
	 * System.out.println("Error occured during insert user record" +
	 * e.getMessage()); } return false;
	 * 
	 * }
	 */
}
