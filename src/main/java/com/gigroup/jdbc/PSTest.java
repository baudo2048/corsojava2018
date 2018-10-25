package com.gigroup.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PSTest implements DAOConstants{
	private static Connection conn;
	private static Scanner in;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Inserire il parametro di ricerca: ");
		String query = in.nextLine();
		
		try {
			conn = DBAccess.getConnection();
			if(query != null) {
				String searchVar = query.trim().toLowerCase();
				PreparedStatement ps = conn.prepareStatement(CERCA_UTENTE);
				ps.setString(1, "%"+searchVar+"%");
				ps.setString(2,"%"+searchVar+"%" );
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getString(1)+"\t"+
						rs.getString(2)+"\t"+rs.getString(3)+"\t"
						+rs.getString(4));
				}
			}	
		}catch (ClassNotFoundException exc) {
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
		
	