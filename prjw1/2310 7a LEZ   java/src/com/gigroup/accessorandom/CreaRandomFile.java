package com.gigroup.accessorandom;

import java.io.IOException;
import java.io.RandomAccessFile;

public class CreaRandomFile implements ImpiegatoInterface {

	public static void main(String args[]) {
		creaFile();
	}

	public static void creaFile() {
		RandomAccessFile file = null;

		try { 
			file = new RandomAccessFile(FILE_PATH, "rw");

			Impiegato recordVuoto = new Impiegato();

			for (int i = 0; i < DIMENSIONE_DATI; i++)
				recordVuoto.scrivi(file);		
			System.out.println("Creato file impiegati.dat");
		} 
		catch (IOException ioException) {
			System.out.println("Errore nel processare il file");
		} 
		finally {
			try {
				if (file != null)
					file.close();
			} 
			catch (IOException ioException) {
				System.out.println("Errore nella chiusura del file");
			} 
		}
	} 
}
