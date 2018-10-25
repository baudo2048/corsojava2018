package com.gi.accessorandom;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CreaRandomFile implements ImpiegatoInterface {
	public static void main(String[] args) {
		creaFile();
	}

	private static void creaFile() {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(FILE_PATH,"rw");	
			Impiegato recordVuoto = new Impiegato();
			
			for(int i = 0; i<DIMENSIONE_DATI; i++) 
				recordVuoto.scrivi(file);
			
			System.out.println("Creato file ad accesso diretto");
		} catch (IOException exc) {
			System.out.println("Impossibile creare il file");
		}
		finally {
			try {
				if(file != null)
					file.close();
			}catch (IOException exc) {
				System.out.println("Errore nella chiusura del file");
			}	
		}
	}
}
