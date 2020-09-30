package com.hsbc.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.hsbc.dao.EmployeeDao;
import com.hsbc.domain.Employee;

public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String empIdStr = request.getParameter("id");

		if (empIdStr == null) {
			processAllEmployees(response);
		} else {
			int empId = Integer.parseInt(empIdStr);
			processOneEmployee(response, empId);
		}

	}

	// Method to process request for one employee
	void processOneEmployee(HttpServletResponse res, int id) throws IOException {
		Employee emp = EmployeeDao.getEmployee(id);

		if (emp == null) {
			res.setStatus(404);
			return;
		}

		JSONObject obj = new JSONObject();

		obj.put("empid", emp.getId());
		obj.put("name", emp.getName());
		obj.put("salary", emp.getSalary());

		PrintWriter pw = res.getWriter();

		pw.println(obj.toJSONString());
		pw.close();

	}

	// Method to process request for all employees
	void processAllEmployees(HttpServletResponse res) throws IOException {
		JSONArray array = new JSONArray();

		List<Employee> list = EmployeeDao.getAll();

		for (Employee e : list) {
			JSONObject obj = new JSONObject();

			obj.put("empid", e.getId());
			obj.put("name", e.getName());
			obj.put("salary", e.getSalary());

			array.add(obj);
		}

		PrintWriter pw = res.getWriter();
		pw.println(array.toJSONString());
		pw.close();
	}

}
