package com.hcl.olxresale.service;

import com.hcl.olxresale.model.Login;
import com.hcl.olxresale.model.User;

/**
 * @author Sathya
 *
 */
public interface UserService {
	boolean register(User usr);

	boolean login(Login login);
}