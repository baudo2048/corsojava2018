package com.gigroup.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess implements DAOConstants {
	private static Connection conn;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(JDBC_DRIVER);
		conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
		conn.setAutoCommit(false);
		return conn;	
	}
	
	public static void closeConnection() throws SQLException{
		if(conn != null)
			conn.close();
	}
	
	public static void getDati() throws SQLException{
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(QUERY);
		ResultSetMetaData meta = rs.getMetaData();
		int colonne = meta.getColumnCount();

		for (int i = 1; i <= meta.getColumnCount(); i++)
			System.out.printf("%-20s\t", meta.getColumnName(i));
		System.out.println();

		while (rs.next()) {
			for (int i = 1; i <= meta.getColumnCount(); i++)
				System.out.printf("%-20s\t", rs.getObject(i));
			System.out.println();
		}

	}
}









