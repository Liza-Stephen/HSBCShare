package com.hsbc.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.dao.EmployeeDao;
import com.hsbc.domain.Employee;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = null;
		String eidStr = request.getParameter("empid");

		if (eidStr.equals("")) {
			List<Employee> list = EmployeeDao.getAllEmployees();
			request.setAttribute("emps", list);
			rd = request.getRequestDispatcher("showAll.jsp");

		} else {
			int empid = Integer.parseInt(eidStr);
			Employee emp = EmployeeDao.getEmployee(empid);

			if (emp == null) {
				request.setAttribute("message", "Employee  Not Found");

			} else {
				request.setAttribute("empData", emp);
			}
			rd = request.getRequestDispatcher("employee.jsp");
		}

		rd.forward(request, response);

	}

}
