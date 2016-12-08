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
 * Servlet implementation class DeleteCookies
 */
@WebServlet("/DeleteCookies")
public class DeleteCookies extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		Cookie myCookies[] = request.getCookies();
		
		if (myCookies == null)
		{
			out.println("There is no valid cookie.");
		}
		else
		{
			for (int i=0;i<myCookies.length;i++)
			{
				myCookies[i].setMaxAge(0); //invalid the cookie
			}
			out.println("All cookies have been deleted");
		}
	}

}
