package com.cr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cr.entity.User;
import com.cr.util.JDBCUtil;

public class LoginDAO {
	public User loginInfo(User user) throws SQLException{
		
		PreparedStatement ps =null;
		ResultSet rs= null;
		Connection con= JDBCUtil.getConnection();
		String sql = "select userId,userName,userPwd,userRealname,userSex,userState,lastLogin from tb_user where userName = ? and userPwd = ?";
		 try {
				ps = con.prepareStatement(sql);
				ps.setString(1, user.getUserName());
				ps.setString(2, user.getUserPwd());
				 rs = ps.executeQuery();
				 if(rs.next()){
					user = new User(rs.getInt("userId"), rs.getString("userName"), rs.getString("userPwd"), rs.getString("userRealname"), rs.getString("userSex"), rs.getInt("userState"),rs.getDate("lastLogin"));
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
}
