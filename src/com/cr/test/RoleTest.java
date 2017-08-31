package com.cr.test;

import java.sql.SQLException;

import org.junit.Test;

import com.cr.dao.RoleDAO;
import com.cr.entity.Role;

public class RoleTest {
	
	RoleDAO rd = new RoleDAO();
	@Test
	public  void testSave() throws SQLException{
		Role role = new Role();
		role.setRoleId(110);
		role.setRoleName("部门经理");
		role.setRoleState(1);
		role.setRoleRight("用户管理");
		rd.saveRole(role);
	}

}
