package com.hsbc.dao;

import java.util.HashMap;
import java.util.Map;

import com.hsbc.domain.Employee;

public class EmployeeDao {
	
	static Map<Integer,Employee> data;
	
	static {
		data=new HashMap<Integer,Employee>();
		data.put(100,new Employee(100,"Suresh",7000));
		data.put(200,new Employee(200,"Anmol",10000));
		data.put(300,new Employee(300,"Sangeetha",12000));
		
	}
	
	public static Employee getEmployee(int id) {
		return data.get(id);
	}

}
