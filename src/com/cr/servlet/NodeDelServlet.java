package com.cr.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cr.dao.DepartDAO;

public class NodeDelServlet extends HttpServlet {

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
		//获取需要删除的id
		int departId = Integer.parseInt(req.getParameter("departId"));
		DepartDAO dd = new DepartDAO();
		try {
			boolean flg = dd.delDepart(departId);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
