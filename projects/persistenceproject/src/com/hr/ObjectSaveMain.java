package com.hr;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectSaveMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Department d = new Department(10, "Sales");

		Employee e = new Employee(100, "Kishore", 5000, d, new Date(96, 4, 25));

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/emp.dat"));

		oos.writeObject(e);
		oos.close();
		
		System.out.println("Employee object saved");

	}

}
