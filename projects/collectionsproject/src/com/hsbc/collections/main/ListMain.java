package com.hsbc.collections.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ListMain {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(400, "Ramana", 5000));
		list.add(new Employee(200, "Suneel", 8000));
		list.add(new Employee(500, "Ramana1", 15000));
		
		ArrayList<Employee> list2 = new ArrayList<>();
		
		list2.add(null);
		list2.add(null);
		list2.add(null);

		Collections.copy(list2,list);
		
		Collections.sort(list, new SalComparator());

		for (Employee x : list) {
			System.out.println(x);
		}
		System.out.println("++++++++++++++++++++++++++++++++");
		
		for (Employee x : list2) {
			System.out.println(x);
		}

	}

}
