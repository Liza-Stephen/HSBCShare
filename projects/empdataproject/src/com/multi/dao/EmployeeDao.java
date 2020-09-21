package com.multi.dao;

import com.multi.domain.Employee;
import com.multi.exceptions.EmployeeNotFoundException;

public interface EmployeeDao {
	void create(Employee e);

	Employee getEmployee(int id);

	Employee[] getAllEmployees();

	void update(Employee e) throws EmployeeNotFoundException;

	void delete(int id) throws EmployeeNotFoundException;
	

}
