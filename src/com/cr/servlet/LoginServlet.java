package com.cr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cr.dao.LoginDAO;
import com.cr.dao.RoleDAO;
import com.cr.entity.User;


public class LoginServlet extends HttpServlet {

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
		String userName = req.getParameter("userName");
		String userPwd = req.getParameter("userPwd");
		
		User user = new User();
		user.setUserName(userName);
		user.setUserPwd(userPwd);
		
		
		PrintWriter out = resp.getWriter();
		//调用后端方法，获取账户名和密码
		
		LoginDAO ld = new LoginDAO();
		User loginInfo = null;
		try {
			loginInfo = ld.loginInfo(user);
			HttpSession session = req.getSession();
			if(loginInfo!=null){
				session.setAttribute(com.cr.util.SystemUtil.SYSUSER, loginInfo);
				System.out.println("登陆信息========"+loginInfo);
				
				int roleIds = Integer.parseInt("loginInfo.getRoleIds()");
				System.out.println("角色信息=========="+roleIds);
				
				//根据roleid查询对应的rightid
				RoleDAO rd = new RoleDAO();
				String[] rights = rd.searchRoleRight(roleIds);
				
				
				resp.sendRedirect(req.getContextPath()+"/index.jsp");
			}else{
				out.print("您的密码或账户名输入有误！！！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
