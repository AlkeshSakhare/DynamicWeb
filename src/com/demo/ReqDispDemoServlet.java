package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqDispDemoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int sq = (int) (request.getAttribute("sum"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		sq = sq * sq;
		out.println("Square of sum is " + sq);

	}
}
