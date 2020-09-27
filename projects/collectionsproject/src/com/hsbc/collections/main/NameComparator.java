package com.hsbc.collections.main;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		int x=e1.getName().compareTo(e2.getName());
		
		return x;
	}

}
