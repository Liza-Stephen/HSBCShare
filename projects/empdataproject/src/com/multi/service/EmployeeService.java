package com.multi.service;

import com.multi.dao.EmployeeArrayDao;
import com.multi.dao.EmployeeDao;
import com.multi.domain.Employee;
import com.multi.exceptions.EmployeeNotFoundException;

public class EmployeeService {

	EmployeeDao dao = new EmployeeArrayDao();

	public Employee getOneEmployee(int id) {

		return dao.getEmployee(id);
	}

	public Employee[] getAllEmployees() {
		return dao.getAllEmployees();
	}

	public void update(Employee e) throws EmployeeNotFoundException {
		dao.update(e);
	}

	public void delete(int id) throws EmployeeNotFoundException {
		dao.delete(id);
	}

}
