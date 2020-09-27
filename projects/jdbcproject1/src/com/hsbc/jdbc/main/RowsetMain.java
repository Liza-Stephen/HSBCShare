package com.hsbc.jdbc.main;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowsetMain {

	public static void main(String[] args) throws SQLException {

		RowSetFactory factory = RowSetProvider.newFactory();

		JdbcRowSet rowset = factory.createJdbcRowSet();

		rowset.setUrl("jdbc:derby:e:/derbydb/trgdb");

		rowset.setCommand("SELECT * FROM emp");
		rowset.execute();
		while (rowset.next()) {
			System.out.println(rowset.getString(2));
		}

	}

}
