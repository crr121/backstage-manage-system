package com.cr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cr.entity.Role;
import com.cr.util.JDBCUtil;

public class RoleDAO {
	PreparedStatement ps =null;
	ResultSet rs= null;
	Connection con= JDBCUtil.getConnection();
	
	/**
	 * 添加角色
	 * @param role 传递一个role对象参数
	 * @throws SQLException 
	 */
	public void saveRole(Role role) throws SQLException{
		String sql = "insert into tb_role (roleId,roleName,roleState,roleRight) values(?,?,?,?)";
		try {
			 ps = con.prepareStatement(sql);
			 
			 ps.setInt(1, role.getRoleId());
			 ps.setString(2, role.getRoleName());
			 ps.setInt(3, role.getRoleState());
			 ps.setString(4, role.getRoleRight());
			 
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			ps.close();
			con.close();
		}
	}
}
