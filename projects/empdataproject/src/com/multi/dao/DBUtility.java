package com.multi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	
	static Connection con;
	
	static {
		try {
			con=DriverManager.getConnection("jdbc:derby:e:/derbydb/trgdb");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return con;
	}

}
