package com.hsbc.hr.main;

import com.hsbc.hr.Employee;
import com.hsbc.hr.exceptions.SalaryException;

public class EmployeeMain {

	public static void main(String args[]) {
		Employee e1 = null;
		try {
			e1 = new Employee(200, "Ramana", 8000);
			e1.showDetails();

			e1.setSalary(2000);
			e1.showDetails();

		} catch (SalaryException se) {
			System.out.println(se.getMessage());
			System.out.println(se.MINIMUM_SALARY);
			
			se.printStackTrace();
		}

	}
}
