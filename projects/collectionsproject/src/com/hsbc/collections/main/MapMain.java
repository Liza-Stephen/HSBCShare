package com.hsbc.collections.main;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {

		Map<Integer, Employee> m = new HashMap<>();

		m.put(100, new Employee(100,"Ramana",6000));
		m.put(200, new Employee(200,"Abcd",8000));
		
		m.put(100,new Employee(111,"XXXXXXXXX",7777));
 	

		Employee e1=m.get(100);

		if (e1 == null)
			System.out.println("Employee not found");
		else
			System.out.println(e1);
	}

}
