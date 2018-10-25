package com.gigroup.jdbc;

public interface DAOConstants {
	String JDBC_URL = "jdbc:oracle:thin:@192.168.0.3:1521:ORCL";
	String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	String USERNAME = "massimo";
	String PASSWORD = "pass01";
	
	String QUERY = "Select nome, cognome from test";
	String CERCA_UTENTE = "select nome, cognome, cap, citta from test where lower(nome) like ? or lower(cognome) like ?";
	

}
