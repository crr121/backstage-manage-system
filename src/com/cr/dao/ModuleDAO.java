package com.cr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cr.entity.Module;
import com.cr.util.JDBCUtil;





public class ModuleDAO {
	PreparedStatement ps =null;
	ResultSet rs= null;
	Connection con= JDBCUtil.getConnection();
	
	/**
	 * 查询模块所有信息
	 * @return 返回查询的结果集
	 * @throws SQLException
	 */
	public List<Module> searchAll() throws SQLException{
		List<Module> modules = new ArrayList<Module>();
		Module module = null;
		String sql = "select moduleId,moduleName,moduleHref,moduleInfo,moduleState from tb_module ";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				module =  new Module(rs.getInt("moduleId"), rs.getString("moduleName"), rs.getString("moduleHref"), rs.getString("moduleInfo"), rs.getInt("moduleState"));
				modules.add(module);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			rs.close();
			ps.close();
			con.close();
		}
		return modules;
	}
	
	
	
	
	
	
	
	
	
	
	
/*	public  void saveModule (Module module){
		
		String sql = "insert into tb_module values(?,?,?,?,)";
		moduleId,moduleName,moduleHref,moduleInfo,moduleState
		ps = con.prepareStatement(sql);
		
		
	}*/
}
