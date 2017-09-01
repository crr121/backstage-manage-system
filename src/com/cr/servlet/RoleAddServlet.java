package com.cr.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cr.dao.RoleDAO;
import com.cr.entity.Role;

public class RoleAddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	     this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		         System.out.println("--------------");
		
				//解决乱码
				req.setCharacterEncoding("utf-8");
				resp.setCharacterEncoding("utf-8");
				
				String roleName = req.getParameter("title");
				int roleState = Integer.parseInt(req.getParameter("status")) ;
//				String roleRight = req.getParameter("groups");
				String[] groups = req.getParameterValues("group[]");
				String right = "";
				for (int i = 0; i < groups.length; i++) {
					System.out.println(groups[i]);
					right=right+","+groups[i];
				}
				
				Role role = new Role();
//				role.setRoleId(roleId);
				role.setRoleName(roleName);
				role.setRoleState(roleState);
				role.setRoleRight(right);
				
				RoleDAO rd = new RoleDAO();
				
				try {
					rd.saveRole(role);
					resp.sendRedirect("Role/index.jsp");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}
	
}
