package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java .sql.SQLException;

public class DbUtil {

	
	public static Connection getConnection()
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");// reflection
		System.out.println("------driver loaded----");

		String url = "jdbc:mysql://localhost:3306/test";
		// get cn from DriverManager : class
		
			Connection con = DriverManager.getConnection(url, "root", "root");
		return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
