package com.multi.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.multi.domain.Employee;
import com.multi.exceptions.EmployeeAlreadyExistsException;
import com.multi.exceptions.EmployeeNotFoundException;

class EmployeeJdbcDao implements EmployeeDao {

	@Override
	public void create(Employee e) throws EmployeeAlreadyExistsException {
		Connection con = DBUtility.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("insert into  emp values(?,?,?)");
			pst.setInt(1, e.getEmpId());
			pst.setString(2, e.getName());
			pst.setFloat(3, e.getSalary());

			pst.executeUpdate();

		} catch (SQLException ex) {
			
			throw new EmployeeAlreadyExistsException(e.getEmpId());
		}

	}

	@Override
	public Employee getEmployee(int id) {
		Connection con = DBUtility.getConnection();
		try {
			String st = "select * from emp where empid=" + id;
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(st);

			if (rs.next()) {
				int eid = rs.getInt(1);
				String nm = rs.getString(2);
				float sal = rs.getFloat(3);
				Employee e = new Employee(eid, nm, sal);
				return e;
			}

		} catch (SQLException se) {
			return null;
		}
		return null;

	}

	@Override
	public List<Employee> getAllEmployees() {
		Connection con = DBUtility.getConnection();
		ArrayList<Employee> list = new ArrayList<>();
		try {
			String st = "select * from emp";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(st);

			while (rs.next()) {
				int eid = rs.getInt(1);
				String nm = rs.getString(2);
				float sal = rs.getFloat(3);
				Employee e = new Employee(eid, nm, sal);

				list.add(e);

			}
			return list;

		} catch (SQLException se) {
			return list;
		}
	}

	@Override
	public void update(Employee e) throws EmployeeNotFoundException {
		Connection con = DBUtility.getConnection();

		try {
			String st = "update emp set name=?,salary=? where empid=?";
			PreparedStatement pst = con.prepareStatement(st);

			pst.setString(1, e.getName());
			pst.setFloat(2, e.getSalary());
			pst.setInt(3, e.getEmpId());

			int c = pst.executeUpdate();
			if (c == 0)
				throw new EmployeeNotFoundException(e.getEmpId());

		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		Connection con = DBUtility.getConnection();

		try {
			String st = "delete from emp where empid=?";
			PreparedStatement pst = con.prepareCall(st);

			pst.setInt(1, id);

			int c = pst.executeUpdate();
			if (c == 0)
				throw new EmployeeNotFoundException(id);

		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

}
