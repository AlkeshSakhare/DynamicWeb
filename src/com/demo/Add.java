package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Add extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no1 = Integer.parseInt(request.getParameter("noone").toString());
		int no2 = Integer.parseInt(request.getParameter("notwo").toString());
		int sum = no1 + no2;
		System.out.println(no1 + "+" + no2 + "=" + sum);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(sum);

		/*
		 * reuest dispatcher will not show actual servlet in url. In order to send
		 * request data we need to setAttribute in request object and same can be
		 * retrive from another servlet
		 */
		// request.setAttribute("sum", sum);
		// RequestDispatcher rd = request.getRequestDispatcher("rdDemo");
		// rd.forward(request, response);

		/*
		 * request redirect will show redirected servlet in url in order to same request
		 * data we need to use HttpSession or Cookie There are 3 ways of doing redirect
		 * 
		 * 
		 * 1.URL rewritting-- disadvantavce-- if we want to pass value to different
		 * servlet then not possible
		 * 
		 * 2.HttpSession (Interface)-- basically used for loginuser validation
		 * 
		 * 3.Cookie(class)-- can be use to store multiple cookie
		 */

		// URL rewritting data
		// response.sendRedirect("redirectDemo?sum=" + sum);

		// HttpSession
		HttpSession session = request.getSession();
		session.setAttribute("sum", sum);
		// response.sendRedirect("httpsessionDemo");

		// cookie
		Cookie cookie = new Cookie("sum", sum + "");
		response.addCookie(cookie);
		response.sendRedirect("cookieDemo");
		/*
		 * ServletContext----> if we want to share same initial value to all servlet
		 * then we should use servlet context
		 * 
		 * ServletConfig---->if we want to use differnt initial value for servlet then
		 * we should use servlet config
		 */

		ServletContext context = getServletContext();
		String valueOfServletContext = context.getInitParameter("servletInit");
		System.out.println("valueOfServletContext = " + valueOfServletContext);

		ServletConfig config = getServletConfig();
		String valueOfServletConfig = config.getInitParameter("servletInit");
		System.out.println("valueOfServletConfig = " + valueOfServletConfig);
	}
}
