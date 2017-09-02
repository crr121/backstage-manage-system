package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cr.dao.ModuleDAO;
import com.cr.entity.Module;
import com.google.gson.Gson;

public class ModuleSearchServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

			this.doPost(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//解决乱码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		//调用dao
		ModuleDAO md = new ModuleDAO();
		try {
			List<Module> modules = md.searchAll();
			System.out.println("查询的模块信息========");
			for (Module module : modules) {
				System.out.println(module);
			}
			
			//组装成JSON数据
			String moduleInfo = new Gson().toJson(modules);
			
			resp.setContentType("text/json");
			PrintWriter out = resp.getWriter();
			out.print(moduleInfo);
			resp.sendRedirect("Role/add.jsp");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	
	}
}
