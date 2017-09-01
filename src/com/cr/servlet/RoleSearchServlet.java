package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cr.dao.RoleDAO;
import com.cr.entity.Role;
import com.google.gson.Gson;

public class RoleSearchServlet extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		   alert("hello");
		//解决乱码
			req.setCharacterEncoding("utf-8");
			resp.setCharacterEncoding("utf-8");
			
			//获取页面传递的参数
			String s = req.getParameter("rolename");
			
			//调用rolesearch
			RoleDAO rd = new RoleDAO();
			try {
				List<Role> roles = rd.searchRole(s);
				
				for (Role role : roles) {
					System.out.println(role);
				}
				//组装成JSON数据
				String roleInfo = new Gson().toJson(roles);
				
				resp.setContentType("text/json");
				PrintWriter out = resp.getWriter();
				out.print(roleInfo);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
	private void alert(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
