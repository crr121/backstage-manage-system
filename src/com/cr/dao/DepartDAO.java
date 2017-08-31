package com.cr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	/**
	 * 根据部门名称查询
	 * @param s 输入的字符串
	 * @return 返回查询的结果集
	 * @throws SQLException 
	 */
	public List<Depart> searchDepart(String s) throws SQLException{
		List<Depart> departs = new ArrayList<Depart>();
		Depart depart = null;
		String sql = "select departId,departName,departState,isFatherNode,fatherNodeId,departBack from tb_depart where departName like '%'||?||'%'";
		 try {
			ps = con.prepareStatement(sql);
			ps.setString(1, s);
			 rs = ps.executeQuery();
			 while(rs.next()){
				 depart = new Depart(rs.getInt("departId"), rs.getString("departName"), rs.getInt("departState"), rs.getInt("isFatherNode"), rs.getInt("fatherNodeId"), rs.getString("departBack"));
				 departs.add(depart);
				 }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			rs.close();
			ps.close();
			con.close();
		}
		return departs;
	}
}
