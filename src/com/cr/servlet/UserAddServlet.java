package com.cr.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAddServlet extends HttpServlet {
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
		System.out.println("====================");
		String userName = req.getParameter("username");
		String userPwd = req.getParameter("password");
		String userRealName = req.getParameter("realname");
		String userEmail = req.getParameter("email");
		String userState = req.getParameter("status");
		String[] roleGroup = req.getParameterValues("roleGroup[]");
		String[] departGroup = req.getParameterValues("departGroup[]");

		for (int i = 0; i < departGroup.length; i++) {
			System.out.println("部门id"+departGroup[i]);
		}
		for (int i = 0; i < roleGroup.length; i++) {
			System.out.println("角色id"+roleGroup[i]);
		}


	}
}
