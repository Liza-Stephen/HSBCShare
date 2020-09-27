package com.hsbc.jdbc.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.multi.domain.Employee;

public class JdbcMain {

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:derby:e:/derbydb/trgdb");

			System.out.println("Connection successfully created");
			Statement stmt = con.createStatement();
			String s1 = "insert into emp values(800,'Kumar',10000,'1998-12-10')";
			String s2 = "update emp set salary=9999 where empid=100";
			String s3 = "delete from emp where empid=200";

			ResultSet rs = stmt.executeQuery("select * from emp");
			System.out.println("===============Original Data===========");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getFloat(3));
			}

			stmt.executeUpdate(s1);
			stmt.executeUpdate(s2);
			stmt.executeUpdate(s3);
			
			
			System.out.println("==============After Updates=================");
			rs = stmt.executeQuery("select * from emp");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "   " + rs.getFloat(3));
			}

			con.close();


		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

}