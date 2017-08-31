package com.cr.test;

import java.sql.SQLException;

import org.junit.Test;

import com.cr.dao.DepartDAO;
import com.cr.entity.Depart;

public class DepartTest {

	DepartDAO dd = new DepartDAO();
	@Test
	public void testSaveDepart() throws SQLException{
		Depart depart = new Depart();
		depart.setDepartId(2);
		depart.setDepartName("学术部");
		depart.setDepartState(1);
		dd.saveDepart(depart);
	}
	
	//删除部门
	@Test
	public void testDelDepart() throws SQLException{
		boolean flg = dd.delDepart(2444);
		System.out.println(flg);
	}
}
