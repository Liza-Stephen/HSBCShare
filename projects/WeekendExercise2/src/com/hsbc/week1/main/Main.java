package com.hsbc.week1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hsbc.week1.Customer;
import com.hsbc.week1.exceptions.CustomerException;
import com.hsbc.week1.helper.DataHelper;

public class Main {

	public static void main(String args[]) throws IOException {

		try {
			// Create DataHelper object
			DataHelper helper = new DataHelper("d:/customer.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.println("Enter Customer Id");

				int custId = 0;
				String custIdStr = br.readLine();

				// This is try block within try block
				try {
					custId = Integer.parseInt(custIdStr);

				} catch (NumberFormatException ne) {
					System.out.println("invalid format for customer id. try again");
					continue;
				}

				// No more search request
				if (custId == 0)
					break;

				Customer customer = helper.getCustomer(custId);

				if (customer == null)
					System.out.println("Customer with the given number does not exist");
				else
					System.out.println(
							"Customer whose name is " + customer.getName() + " lives in " + customer.getCity());

			}
			System.out.println("Thank You. Bye!");
		} catch (CustomerException e) {

			System.out.println(e.getMessage());
		}

	}
}
