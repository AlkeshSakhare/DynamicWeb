package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FilterDemo1
 */
@WebServlet("/FilterDemo1")
public class FilterDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int i = Integer.parseInt(request.getParameter("uid"));
		String name = request.getParameter("uname");
		PrintWriter out = response.getWriter();
		out.print("Welcome " + name + "(" + i + ")");
	}

}
