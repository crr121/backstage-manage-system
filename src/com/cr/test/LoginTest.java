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
		
		user.setUserName("123");
		user.setUserPwd("2123");
		user.setUserRealname("王五");
		user.setUserEmail("1234354@qq.com");
		user.setUserState(1);
		user.setDepartId(33333);
		user.setRoleId(110);
		
		ld.saveUser(user);
		
//		System.out.println(user);
		
		
	}
}
