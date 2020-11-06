package com.hcl.olxresale.repository;

import com.hcl.olxresale.model.Login;
import com.hcl.olxresale.model.User;

/**
 * @author Sathya
 *
 */
public interface UserDao {
	boolean register(User usr);

	boolean login(Login login);

}
