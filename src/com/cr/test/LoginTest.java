package com.cr.test;

import java.sql.SQLException;

import org.junit.Test;

import com.cr.dao.LoginDAO;
import com.cr.entity.User;

public class LoginTest {
	LoginDAO ld = new LoginDAO();
	@Test
	public void testLogin() throws SQLException{
		User user = new User();
		user.setUserName("admin");
		user.setUserPwd("admin");
		User loginInfo = ld.loginInfo(user);
		System.out.println(loginInfo);
	}
}
