package javaioproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.hr.Employee;

public class IOMain {

	public static void main(String[] args) throws IOException {
		
		if(args.length!=2) {
			System.out.println("Invalid");
			System.exit(0);
			
		}
		
		int num1 =Integer.parseInt(args[0]);
		int num2 =Integer.parseInt(args[1]);
		
		System.out.println("Result: "+(num1+num2));
	}

}
