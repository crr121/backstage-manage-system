package com.cr.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cr.util.SystemUtil;

public class LoginFilter implements Filter{
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpSession session = request.getSession();
		HttpServletResponse response = (HttpServletResponse) resp;
		//需要到session中获取user，
				Object obj = session.getAttribute(SystemUtil.SYSUSER);
				if(obj!=null){
					//如果不为null,则放行
					chain.doFilter(request, response);
					return ;
				}
				//如果为null,则重定向到login.jsp
				response.sendRedirect("Public/login.jsp");
			}
		

	@Override
	public void destroy() {
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
}
