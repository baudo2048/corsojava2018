package com.gigroup.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	private static Connection conn;
	public static void main(String[] args) {
		try {
			conn = DBAccess.getConnection();
			Statement stmt = conn.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("Select nome, cognome, citta, cap, eta from "
					+ "test where cognome = 'bianchi'");
			rs.first();
			rs.updateString(3, "Pavia");
			rs.updateString(4, "30222");
			rs.updateRow();
			conn.commit();
			DBAccess.getDati();
			
		} catch (ClassNotFoundException exc) {
			System.out.println("Driver non trovato");
			exc.printStackTrace();
		} catch (SQLException exc) {
			System.out.println("Eccezione SQL");
			System.out.println(exc.getMessage());
			System.out.println(exc.getErrorCode());
			exc.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException exc) {
				System.out.println("Eccezione SQL");
				System.out.println(exc.getMessage());
				System.out.println(exc.getErrorCode());
				exc.printStackTrace();
			}
		}
	}
}
			
			
			