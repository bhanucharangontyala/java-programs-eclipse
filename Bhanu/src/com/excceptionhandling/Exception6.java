package com.excceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exception6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			// 1. loading the SQL driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded Successfully");

			// 2. establishing database connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "0000");
			System.out.println("Connection established successfully");

			// 3. create the statement object to communicate with DB
			stm = con.createStatement();
			System.out.println("Statement created successfully");

			// 4. create a resultSet to read the data
			rs = stm.executeQuery("select * from student");
			System.out.println("Result set created successfully");

			while (rs.next()) {
				System.out.println("*********************************");
				System.out.println("stud_id : " + rs.getInt(1));
				System.out.println("stud_name : " + rs.getString(2));
				System.out.println("gender : " + rs.getString(3));
				System.out.println("age : " + rs.getInt(4));
				System.out.println("mobile : " + rs.getLong(5));
				System.out.println("adhaar_no : " + rs.getLong(6));
				System.out.println("course_id : " + rs.getInt(7));
				System.out.println("marks : " + rs.getInt(8));
				System.out.println("*********************************");
			}
		} finally {
			// 5. close all connections
			rs.close();
			stm.close();
			con.close();
		}
	}

}
