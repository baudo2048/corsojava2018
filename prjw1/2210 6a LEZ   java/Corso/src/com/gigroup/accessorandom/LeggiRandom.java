package com.gigroup.accessorandom;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LeggiRandom implements ImpiegatoInterface{
	private static RandomAccessFile input;
	
	public static void main(String[] args) {
		apriFile();
		leggiRecord();
		chiudiFile();
	}

	private static void leggiRecord() {
		Impiegato record = new Impiegato();
		try {
			while(true) {
				do {
					record.leggi(input);
				}while(record.getId() == 0);
				System.out.println(record.getId()+"\t"+
						record.getNome() + "\t"+ 
						record.getCognome() +"\t"+
						record.getStipendio()
						);
			}
		}catch(EOFException exc) {
			System.out.println("Termine dalla struttura");
			//exc.printStackTrace();
		} 
	
		catch(IOException exc) {
			System.out.println("Errore nell\'elaborazione dei dati");
			//exc.printStackTrace();
		}
		
	}

	private static void chiudiFile() {
		try { 
			if(input != null)
				input.close();
		}catch (IOException ioException) {
			System.out.println("Errore nella chiusura del file");
			ioException.printStackTrace();
		} 
	}

	private static void apriFile() {
		try {
			input = new RandomAccessFile(FILE_PATH,"r");	
		} catch (IOException ioException) {
			System.out.println("Errore nel processare il file");
			ioException.printStackTrace();
		} 
	}
	
}
