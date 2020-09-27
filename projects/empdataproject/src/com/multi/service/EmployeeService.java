package com.multi.service;

import java.util.List;

import com.multi.dao.EmpDaoFactory;

import com.multi.dao.EmployeeDao;
import com.multi.domain.Employee;
import com.multi.exceptions.CopySalaryException;
import com.multi.exceptions.EmployeeNotFoundException;

public class EmployeeService {

	EmployeeDao dao = EmpDaoFactory.getEmployeeDao("jdbc");

	
	public Employee getOneEmployee(int id) {

		return dao.getEmployee(id);

	}

	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	public void update(Employee e) throws EmployeeNotFoundException {
		dao.update(e);
	}

	public void delete(int id) throws EmployeeNotFoundException {
		dao.delete(id);
	}

	public void copySalary(int id1, int id2) throws CopySalaryException {

		Employee e1 = dao.getEmployee(id1);
		if (e1 == null)
			throw new CopySalaryException("Employee with id " + id1 + " not found. Copy Aborted");

		Employee e2 = dao.getEmployee(id2);

		if (e2 == null)
			throw new CopySalaryException("Employee with id " + id2 + " not found. Copy Aborted");

		e1.setSalary(e2.getSalary());

		try {
			dao.update(e1);
		} catch (EmployeeNotFoundException e) {
			throw new CopySalaryException("Copy failed while updating data with id " + id1);
		}

	}

}
