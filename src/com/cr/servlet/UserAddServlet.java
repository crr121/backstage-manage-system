package com.cr.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cr.dao.LoginDAO;
import com.cr.entity.User;

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
		String userRealname = req.getParameter("realname");
		String userEmail = req.getParameter("email");
		int userState = Integer.parseInt(req.getParameter("status")) ;
		String[] roleGroup = req.getParameterValues("roleGroup[]");
		String[] departGroup = req.getParameterValues("departGroup[]");
		int departId=-1;
		for (int i = 0; i < departGroup.length; i++) {
//			System.out.println("部门id======="+departGroup[0]);
			//获取第一个部门
			departId = Integer.parseInt(departGroup[0]) ;
		}
		String roleIds = null ;
		String roleId ="";
		for (int i = 0; i < roleGroup.length; i++) {
			System.out.println("角色id========"+roleGroup[i]);
			roleId = roleId+","+roleGroup[i];
			int indexOf = roleId.indexOf(",")+1;
			 roleIds = roleId.substring(indexOf);
//			System.out.println("角色id========"+roleGroup[i]);
			System.out.println("所有角色====="+roleIds);
		}
		
		User user  =new User();
		user.setDepartId(departId);
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		user.setUserRealname(userRealname);
		user.setUserState(userState);
		user.setRoleIds(roleIds);
		user.setUserEmail(userEmail);
		
		
		LoginDAO ld  = new LoginDAO();
		try {
			ld.saveUser(user);
			resp.sendRedirect("User/index.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
