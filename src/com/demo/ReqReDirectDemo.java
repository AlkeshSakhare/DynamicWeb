package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqReDirectDemo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		double i = Double.parseDouble(request.getParameter("sum"));
		double no = i * i;
		PrintWriter out = response.getWriter();
		out.println("Square of sum is " + no);
	}
}
