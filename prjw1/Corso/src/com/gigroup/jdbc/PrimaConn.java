package com.gigroup.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class PrimaConn implements DAOConstants {
	private static Connection conn;
	
	public static void main(String[] args) {
		try {
			conn = DBAccess.getConnection();
			DBAccess.getDati();
		
		} catch(ClassNotFoundException exc) {
			System.out.println("Driver non trovato");
			exc.printStackTrace();
		} catch(SQLException exc) {
			System.out.println("Eccezione SQL");
			System.out.println(exc.getMessage());
			System.out.println(exc.getErrorCode());
			exc.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(SQLException exc) {
				System.out.println("Eccezione SQL");
				System.out.println(exc.getMessage());
				System.out.println(exc.getErrorCode());
				exc.printStackTrace();
			}
		}
	}
}
