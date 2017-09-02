package com.cr.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.cr.dao.ModuleDAO;
import com.cr.entity.Module;

public class ModuleTeat {
	
	@Test
	public void testSearchAll(){
		ModuleDAO md = new ModuleDAO();
		try {
			List<Module> modules = md.searchAll();
			for (Module module : modules) {
				System.out.println(module);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
