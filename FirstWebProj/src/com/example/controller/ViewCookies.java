package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewCookies
 */
@WebServlet("/ViewCookies")
public class ViewCookies extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Cookie c[] = request.getCookies(); //Get an array of Cookies associated with this domain
		PrintWriter out = response.getWriter();
		
		if (c == null)
		{
			out.println("There is no valid cookie.");
		}
		else
		{	
			for (int i=0;i<c.length;i++)
			{
				out.println(c[i].getName()+" " +c[i].getValue() + " Max age: "+ c[i].getMaxAge());
			}
		}
	}
}
