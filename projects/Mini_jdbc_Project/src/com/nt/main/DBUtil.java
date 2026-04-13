package com.nt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private final static String url="jdbc:mysql://localhost:3306/jdbc_mini_db";
	private final static String user_name="root";
	private final static String password="root";
	public static Connection getConnsection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user_name,password);
		return con;
	}


}
