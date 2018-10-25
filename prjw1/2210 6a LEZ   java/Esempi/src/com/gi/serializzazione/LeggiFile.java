package com.gi.serializzazione;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeggiFile {
	private static ObjectInputStream input;
	public static void main(String[] args) {
		apriFile();
		leggiRecord();
		chiudiFile();
	}
	private static void leggiRecord() {
		Impiegato record; 
		try {
			while(true) {
				record = (Impiegato)input.readObject();
				System.out.println(record.getId()+"\t"+record.getNome()+"\t"
						+record.getCognome()+"\t"+record.getStipendio()+"\n");
			}
		} catch(ClassNotFoundException | IOException exc) {
			
		}
	}
	
	private static void chiudiFile() {
		try {
			input.close();
		} catch (IOException exc) {
			System.out.println("Tentativo chiusura fallito");

		}

	}

	private static void apriFile() {
		try {
			input = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Documents\\impiegato.ser"));

		} catch (IOException exc) {
			System.out.println("Impossibile scrivere sul file");

		}
	}
	
}
