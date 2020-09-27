package com.multi.dao;

import com.multi.exceptions.EmployeeAlreadyExistsException;

public class EmpDaoFactory {

	public static EmployeeDao getEmployeeDao(String type) {
		
		if(type.equals("map"))
			return new EmployeeMapDao();
		if(type.equals("array"))
			return new EmployeeArrayDao();
		
		if(type.equals("jdbc"))
			return new EmployeeJdbcDao();
		
		return null;
	}

}
