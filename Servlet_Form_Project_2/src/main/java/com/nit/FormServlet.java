package com.nit;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submit")
public class FormServlet extends HttpServlet{


	@Override
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String loc=req.getParameter("loc");
		String mobile=req.getParameter("mobile");
		System.out.println("******USER DETAILS ARE********");
		System.out.println("Name is:"+name);
		System.out.println("email is:"+email);
		System.out.println("password is:"+password);
		System.out.println("Location is:"+loc);
		System.out.println("mobile is:"+mobile);
		System.out.println("Thank you...");

		PrintWriter out=res.getWriter();
		out.println("REGISTRATION SUCCESSFULLY....");
		out.println("Welcome "+name);
		out.println("Name is:"+name);
		out.println("email is:"+email);
		out.println("password is:"+password);
	    out.println("Location is:"+loc);
	    out.println("mobil is:"+mobile);
	   

	}

}
