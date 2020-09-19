package com.hr;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

	private int empId;
	private String name;
	private float salary;
	private Department department;

	Date dob;

	public Employee(int empId, String name, float salary, Department department, Date dob) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.dob = dob;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {

		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmpId: " + empId + ", Name:" + name + ", Salary: " + salary + ", " + department + ", DOB: "
				+ dob;
	}

}
