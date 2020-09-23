package com.multi.dao;

import java.util.List;

import com.multi.domain.Employee;
import com.multi.exceptions.EmployeeAlreadyExistsException;
import com.multi.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {
	void create(Employee e) throws EmployeeAlreadyExistsException;

	Employee getEmployee(int id);

	List<Employee> getAllEmployees();

	void update(Employee e) throws EmployeeNotFoundException;

	void delete(int id) throws EmployeeNotFoundException;

}
