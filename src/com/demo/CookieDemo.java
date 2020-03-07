package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieDemo")
public class CookieDemo extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double k = 0;
		Cookie cookie[] = req.getCookies();
		for (Cookie c : cookie) {
			if (c.getName().equals("sum")) {
				k = Double.parseDouble(c.getValue());
			}
		}
		PrintWriter out = res.getWriter();
		out.println("Square of sum equal to " + k * k);
	}
}
