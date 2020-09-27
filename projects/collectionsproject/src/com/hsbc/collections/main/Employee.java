package com.hsbc.collections.main;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String name;
	private float salary;

	public Employee(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
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
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;

		Employee other = (Employee) obj;
		
		if (this.empId == other.empId)
			return true;
		return false;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.empId < o.empId)
			return -1;
		if(this.empId > o.empId)
			return 1;
		return 0;
	}

}
