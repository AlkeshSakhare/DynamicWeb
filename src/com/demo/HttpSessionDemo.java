package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionDemo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		int k = (int) session.getAttribute("sum");
		PrintWriter out = res.getWriter();
		out.println("Square of sum equal to " + k * k);
	}
}
