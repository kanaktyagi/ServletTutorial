package com.kanak.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		PrintWriter out=res.getWriter();
		out.println(k);
		/*req.setAttribute("k", k);
		
		RequestDispatcher rd=req.getRequestDispatcher("square");
		rd.forward(req, res);*/
		}	
	
	}	

