package com.cr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cr.entity.Depart;
import com.cr.util.JDBCUtil;

public class DepartDAO {
	PreparedStatement ps =null;
	ResultSet rs= null;
	Connection con= JDBCUtil.getConnection();
	
	/**
	 * 添加部门
	 * @param depart 需要添加的部门对象
	 * @throws SQLException 
	 */
	public void saveDepart(Depart depart) throws SQLException{
		
		String sql = "insert into tb_depart (departId,departName,departState) values(?,?,?)";
	     try {
			ps=con.prepareStatement(sql);
			ps.setInt(1, depart.getDepartId());
			ps.setString(2, depart.getDepartName());
			ps.setInt(3, depart.getDepartState());
			boolean flg = ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ps.close();
			con.close();
		}
		
	}
}
