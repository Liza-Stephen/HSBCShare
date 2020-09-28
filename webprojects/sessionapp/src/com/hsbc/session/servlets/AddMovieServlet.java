package com.hsbc.session.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String movieName=request.getParameter("movie");
		
		PrintWriter pw = response.getWriter();
		
		ArrayList<String> movies=null;
		
		if(movieName.equals("")) {
			pw.println("No movie entered. Try Again");
		}
		else {
			HttpSession session = request.getSession();
			
			if(session.isNew()) {
				movies = new ArrayList<>();
				movies.add(movieName);
				session.setAttribute("movieList",movies);
			}
			else {
				movies=(ArrayList<String>)session.getAttribute("movieList");
				movies.add(movieName);
			}
			
			pw.println("Movie "+movieName+" added to your list");		
			
		}
		
		pw.println("<br><a href='index.html'>Back</a>");
		pw.close();
	
	}

}
