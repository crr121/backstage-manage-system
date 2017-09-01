package com.cr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cr.entity.User;
import com.cr.util.JDBCUtil;

public class LoginDAO {
	
	PreparedStatement ps =null;
	ResultSet rs= null;
	Connection con= JDBCUtil.getConnection();
	
	/**
	 * 根据姓名和密码查询用户
	 * @param user 传入一个user对象参数
	 * @return 返回查询结果user
	 * @throws SQLException
	 */
	public User loginInfo(User user) throws SQLException{
		
		
		String sql = "select userId,departId,roleIds,userName,userPwd,userRealname,userEmail,userSex,userState,lastLogin from tb_user where userName = ? and userPwd = ?";
		 try {
				ps = con.prepareStatement(sql);
				ps.setString(1, user.getUserName());
				ps.setString(2, user.getUserPwd());
				 rs = ps.executeQuery();
				 if(rs.next()){
					user = new User(rs.getInt("userId"), rs.getInt("departId"),rs.getString("roleIds"), rs.getString("userName"), rs.getString("userPwd"), rs.getString("userRealname"),rs.getString("userEmail"), rs.getString("userSex"), rs.getInt("userState"),rs.getDate("lastLogin"));
				 }
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				rs.close();
				ps.close();
				con.close();
			}
		 return user;
	}
	
	
	/**
	 * 添加用户
	 * @param user 参数：user对象
	 * @throws SQLException
	 */
	public void  saveUser (User user) throws SQLException{
		String sql ="insert into tb_user(userId,userName,userPwd,userRealname,userEmail,userState,departId,roleIds) values(seq_user.nextval,?,?,?,?,?,?,?)";
		 try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPwd());
			ps.setString(3, user.getUserRealname());
			ps.setString(4, user.getUserEmail());
			ps.setInt(5, user.getUserState());
			ps.setInt(6, user.getDepartId());
			ps.setString(7, user.getRoleIds());
			
			 ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			ps.close();
			con.close();
		}
	}
	
	/**
	 * user模糊查询
	 * @param s 输入的名字
	 * @return 返回一个结果集users
	 * @throws SQLException
	 */
	public List<User> userSearch(String s) throws SQLException{
		List<User> users = new ArrayList<User>();
		User user = null;
		String sql = "select userId,departId,roleIds,userName,userPwd,userRealname,userEmail,userSex,userState,lastLogin from tb_user where userName like '%'||?||'%'";
		 try {
			ps = con.prepareStatement(sql);
			ps.setString(1, s);
			rs = ps.executeQuery();
			while(rs.next()){
				user = new User(rs.getInt("userId"), rs.getInt("departId"), rs.getString("roleIds"), rs.getString("userName"), rs.getString("userPwd"), rs.getString("userRealname"), rs.getString("userEmail"), rs.getString("userSex"), rs.getInt("userState"), rs.getDate("lastLogin"));
				users.add(user);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			rs.close();
			ps.close();
			con.close();
		}
		return users;
	}
}
