package com.hsbc.week1.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.hsbc.week1.Customer;
import com.hsbc.week1.exceptions.CustomerException;

// Helper class for storing and retrieving Customer data

public class DataHelper {

	// Size is fixed with assumption that file has 6 lines only
	private Customer customers[] = new Customer[6];

	/* Constructor takes file name, opens the file, read data from
	 * the file, create customer objects and store them in the array
	 */
	public DataHelper(String filePath) throws CustomerException {

		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			for (int i = 0; i < customers.length; i++) {
				String line = br.readLine(); // throws IOException

				// field separator assumed as : character
				String fields[] = line.split(":");

				// Supposed to check for NumberFormatException. Assumed correct data
				int custId = Integer.parseInt(fields[0]);
				String name = fields[1];
				String city = fields[2];
				customers[i] = new Customer(custId, name, city);

			}

		} catch (FileNotFoundException fe) {
			throw new CustomerException("File with name " + filePath + " is missing");
		} catch (IOException e) {
			throw new CustomerException("IO Error while reading the file");
		}
	}

	/* Method to search for Customer object in the array
	 * If found, returns reference of the object
	 * If not found, returns null
	 */
	public Customer getCustomer(int custId) {
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getCustomerId() == custId)
				return customers[i];
		}
		return null;
	}

}
