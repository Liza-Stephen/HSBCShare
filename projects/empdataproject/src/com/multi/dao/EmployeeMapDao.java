package com.multi.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.multi.domain.Employee;
import com.multi.exceptions.EmployeeAlreadyExistsException;
import com.multi.exceptions.EmployeeNotFoundException;

class EmployeeMapDao implements EmployeeDao {

	Map<Integer, Employee> empData = new HashMap<Integer, Employee>();

	public EmployeeMapDao() {
		empData.put(100, new Employee(100, "Suresh", 26000));
		empData.put(200, new Employee(200, "Aloknath", 18000));
		empData.put(300, new Employee(300, "Banerjee", 12000));
		empData.put(400, new Employee(400, "John", 9000));
		empData.put(500, new Employee(500, "Deepa", 6000));

	}

	@Override
	public void create(Employee e) throws EmployeeAlreadyExistsException {
		Employee x = empData.get(e.getEmpId());

		if (x != null)
			throw new EmployeeAlreadyExistsException(e.getEmpId());
		empData.put(e.getEmpId(), e);
	}

	@Override
	public Employee getEmployee(int id) {

		return empData.get(id);
	}

	@Override
	public List<Employee> getAllEmployees() {

		Collection c = empData.values();

		List<Employee> list = new ArrayList<Employee>();
		list.addAll(c);

		return list;
	}

	@Override
	public void update(Employee e) throws EmployeeNotFoundException {
		Employee e1 = empData.get(e.getEmpId());
		if (e1 == null) {
			throw new EmployeeNotFoundException(e.getEmpId());
		}

		e1.setName(e.getName());
		e1.setSalary(e.getSalary());
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {

		if (!(empData.containsKey(id))) {
			throw new EmployeeNotFoundException(id);
		}

		empData.remove(id);
	}

}
