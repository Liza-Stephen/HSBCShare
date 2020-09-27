package com.hsbc.collections.main;

import java.util.HashSet;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		
		TreeSet<Employee>  ts1  = new TreeSet<>();
		
		TreeSet<Employee> ts2 = new TreeSet<>(new SalComparator());
		
		TreeSet<Employee> ts3=new TreeSet<Employee>(new NameComparator());
		
		ts2.add(new Employee(400,"Ramana",5000));
		ts2.add(new Employee(200,"Suneel",8000));
		ts2.add(new Employee(500,"Ramana1",15000));
		
		for(Employee e: ts2)
			System.out.println(e);

	}

	
}
