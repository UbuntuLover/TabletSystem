package com.hlm.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class Factory {
	public static String driver = "com.mysql.jdbc.Driver";
	public static String user = "root";
	public static String url = "jdbc:mysql://localhost:3306/tablet";
	public static String password = "xuetao";
	
	public static Connection getConn() throws Exception{
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection ;
		
	}

}
