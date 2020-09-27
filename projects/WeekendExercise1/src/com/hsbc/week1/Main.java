package com.hsbc.week1;

import java.util.Scanner;

/* Program to accept Employee Data in one line with fields separated by
 * comma, split the line for fields, Create Employee array with data.
 * At the end display all the employee objects
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How Many Employees?");

		int employeeCount = sc.nextInt();
		sc.nextLine(); // consume extra new line in keyboard buffer

		Employee employees[] = new Employee[employeeCount];
		
        // It is assumed in the loop that the data entered is correct
		// Errors in field count and number format are not checked
		
		for (int i = 0; i < employeeCount; i++) {
			System.out.println("Enter Employee Data (Comma as delimiter)");
			String line = sc.nextLine();
			String fields[] = line.split(",");

			int empId = Integer.parseInt(fields[0]);
			String name = fields[1];
			float salary = Float.parseFloat(fields[2]);
			employees[i] = new Employee(empId, name, salary);

		}
		
		// Displaying Employee data in the array
		for (int i = 0; i < employeeCount; i++) {
			System.out.println(employees[i]);
		}

	}

}
