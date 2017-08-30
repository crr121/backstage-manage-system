package com.cr.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cr.dao.DepartDAO;
import com.cr.entity.Depart;

public class NodeAddServlet extends HttpServlet {

	
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
		int grouptitle = Integer.parseInt(req.getParameter("grouptitle")) ;
		String moduletitle = req.getParameter("moduletitle");
		int status =Integer.parseInt( req.getParameter("status"));
		
		Depart depart = new Depart();
		depart.setDepartId(grouptitle);
		depart.setDepartName(moduletitle);
		depart.setDepartState(status);
		//调用departdao
		 DepartDAO dd = new DepartDAO();
		 resp.sendRedirect("Node/index.jsp");
		 try {
			dd.saveDepart(depart);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
