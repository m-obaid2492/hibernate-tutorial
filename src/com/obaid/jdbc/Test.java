package com.obaid.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class Test {

	public static void main(String[] args) {
	
		
		String jdbcUrl="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user="hbstudent";
		String pass="hbstudent";
		
		try {
			System.out.println("JDBC"+jdbcUrl);
			Connection connection=
					DriverManager.getConnection(jdbcUrl,user,pass);
			System.out.println("worked");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
