package com.cr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cr.entity.Depart;
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
		String sql = "insert into tb_role (roleId,roleName,roleState,roleRight) values(seq_role.nextval,?,?,?)";
		try {
			 ps = con.prepareStatement(sql);
			 
//			 ps.setInt(1, role.getRoleId());
			 ps.setString(1, role.getRoleName());
			 ps.setInt(2, role.getRoleState());
			 ps.setString(3, role.getRoleRight());
			 
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			ps.close();
			con.close();
		}
	}	
		/**
		 * 根据角色名称查询
		 * @param s 输入的字符串
		 * @return 返回查询的结果集
		 * @throws SQLException 
		 */
	
		public List<Role> searchRole(String s) throws SQLException{
			List<Role> roles = new ArrayList<Role>();
			Role role = null;
			String sql = "select roleId,roleName,roleState,roleRight from tb_role where roleName like '%'||?||'%'";
			 try {
				ps = con.prepareStatement(sql);
				ps.setString(1, s);
				 rs = ps.executeQuery();
				 while(rs.next()){
					 role = new Role(rs.getInt("roleId"), rs.getString("roleName"), rs.getInt("roleState"), rs.getString("roleRight"));
					 
					 roles.add(role);
					 }
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				rs.close();
				ps.close();
				con.close();
			}
			return roles;
		}
		
		
		/**
		 * 根据roleid查询对应的权限id
		 * @param roleId 角色id
		 * @throws SQLException
		 */
		public String[] searchRoleRight (int roleId) throws SQLException{
			String sql = "select roleRight from tb_role where roleId = ?";
			try {
				String roleRight;
				ps = con.prepareStatement(sql);
				ps.setInt(1, roleId);
				rs = ps.executeQuery();
				while(rs.next()){
					 roleRight = rs.getString("roleright");
					 int indexOf = roleRight.indexOf(",")+1;
					 String roleRights = roleRight.substring(indexOf);
					 
					 int[] rightIds = null;
					 String[] rights = roleRights.split(",");
					/* for (int i = 0; i < splits.length; i++) {
						 System.out.println(splits[i]);
					}*/
					 return rights;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				rs.close();
				ps.close();
				con.close();
			}
			return null;
			
		}
		
}
