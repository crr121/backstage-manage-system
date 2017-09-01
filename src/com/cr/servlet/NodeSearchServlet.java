package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cr.dao.DepartDAO;
import com.cr.entity.Depart;
import com.google.gson.Gson;

public class NodeSearchServlet extends HttpServlet {

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
				
				//获取页面传递的参数
				String s = req.getParameter("rolename");
				
				//调用nodesearch
			DepartDAO dd = 	new DepartDAO();
			try {
				List<Depart> departs = dd.searchDepart(s);
				for (Depart depart : departs) {
					System.out.println(depart);
				}
				//组装成JSON数据
				String departInfo = new Gson().toJson(departs);
				
				
				resp.setContentType("text/json");
				PrintWriter out = resp.getWriter();
				out.print(departInfo);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
