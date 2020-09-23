package com.multi.exceptions;

public class EmployeeAlreadyExistsException extends Exception{

	int empId;

	public EmployeeAlreadyExistsException(int empId) {
		super();
		this.empId = empId;
	}

	public void showMessage() {
		System.out.println("Employee with ID " + empId + " already exists");
	}
}
