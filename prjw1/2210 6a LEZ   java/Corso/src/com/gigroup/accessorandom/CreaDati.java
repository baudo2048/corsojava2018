package com.gigroup.accessorandom;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CreaDati implements ImpiegatoInterface {
	private static RandomAccessFile output;
	
	public static void main(String[] args) {
		apriFile();
		aggiungiRecord();
		chiudiFile();
	}

	private static void aggiungiRecord() {
		Impiegato record = new Impiegato();
		int id = 0;
		String nome;
		String cognome;
		double stipendio;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire id, nome, cognome, stipendio");
		
		while(in.hasNext()) {
			try {
				id = in.nextInt();
				nome = in.next();
				cognome = in.next();
				stipendio = in.nextDouble();
				if(id > 0 && id <= DIMENSIONE_DATI) {
					record.setId(id);
					record.setNome(nome);
					record.setCognome(cognome);
					record.setStipendio(stipendio);
					output.seek((id-1)*DIMENSIONE_RECORD);
					record.scrivi(output);
				} else 
					System.out.println("l\'id deve essere compreso tra 1 e 1000");	
			} catch (IOException ioException) {
				System.out.println("Errore nella scrittura del file");
				ioException.printStackTrace();
			} 
		}
		in.close();
	}

	private static void chiudiFile() {
		try { 
			if(output != null)
				output.close();
		}catch (IOException ioException) {
			System.out.println("Errore nella chiusura del file");
			ioException.printStackTrace();
		} 
	}

	private static void apriFile() {
		try {
			output = new RandomAccessFile(FILE_PATH,"rw");	
		} catch (IOException ioException) {
			System.out.println("Errore nel processare il file");
			ioException.printStackTrace();
		} 
	}
	
	
	
	
	
	
	
	
	
}
