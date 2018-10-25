package com.gigroup.jdbc;

public interface DAOConstants {
	String JDBC_URL = "jdbc:mysql://localhost:3306/sakila"; //"jdbc:oracle:thin:@192.168.0.3:1521:ORCL";
	String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // "oracle.jdbc.driver.OracleDriver";
	String USERNAME = "root";
	String PASSWORD = "root";
	
	String QUERY = "Select first_name, last_name from actor";
	String CERCA_UTENTE = "select nome, cognome, cap, citta from test where lower(nome) like ? or lower(cognome) like ?";
	

}
