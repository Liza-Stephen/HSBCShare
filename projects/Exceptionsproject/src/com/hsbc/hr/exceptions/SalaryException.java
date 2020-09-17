package com.hsbc.hr.exceptions;

public class SalaryException extends Exception{
	
	public final int MINIMUM_SALARY=20000;
	
	
	public SalaryException(String message) {
		super(message);
	}

	public void showReason() {
		System.out.println("Salary less than 20000 not allowed");
	}
}
