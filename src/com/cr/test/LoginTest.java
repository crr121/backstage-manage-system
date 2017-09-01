package com.cr.test;

import java.sql.SQLException;
import java.util.List;

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
		user.setRoleIds("110");
		
		ld.saveUser(user);
		
//		System.out.println(user);
		
		
	}
	
	@Test
	public void testSearch() throws SQLException{
		List<User> users = ld.userSearch("");
		for (User user : users) {
			System.out.println(user);
		}
		
	}
}
