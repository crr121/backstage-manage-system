package com.cr.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.cr.dao.RoleDAO;
import com.cr.entity.Role;

public class RoleTest {
	
	RoleDAO rd = new RoleDAO();
	@Test
	public  void testSave() throws SQLException{
		Role role = new Role();
//		role.setRoleId(110);
//		role.setRoleId(roleId);
		role.setRoleName("班长");
		role.setRoleState(1);
		role.setRoleRight("用户管理");
		rd.saveRole(role);
	}
	
	
	@Test
	public void testSearch () throws SQLException{
		List<Role> roles = rd.searchRole("");
		for (Role role : roles) {
			System.out.println(role);
		}
		
	}

}
