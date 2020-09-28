package com.hsbc.session.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GetMoviesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);

		PrintWriter pw = response.getWriter();
		if (session == null) {
			pw.println("No movies in your list. You have not added any");
		} else {
			ArrayList<String> list = (ArrayList<String>) session.getAttribute("movieList");

			pw.println("<h3>List of Movies you have</h3>");

			pw.println("<UL>");
			for (String movie : list) {
				pw.println("<li>" + movie + "</li>");
			}
			pw.println("</UL>");
		}
		pw.println("<br><a href='index.html'>Back</a>");
		pw.close();
	}

}
