package com.hcl.olxresale.service;

import org.springframework.stereotype.Service;

import com.hcl.olxresale.model.Login;
import com.hcl.olxresale.model.User;
import com.hcl.olxresale.repository.UserDaoImpl;

/**
 * @author Sathya
 *
 */
@Service
public class UserServiceImpl implements UserService {
	UserDaoImpl userDao = new UserDaoImpl();

	@Override
	public boolean register(User usr) {
		// UserDAOImpl userDAO = new UserDAOImpl();
		return userDao.register(usr);
		// TODO Auto-generated method stub
	}

	@Override
	public boolean login(Login login) {
		// TODO Auto-generated method stub

		return userDao.login(login);
	}

}
