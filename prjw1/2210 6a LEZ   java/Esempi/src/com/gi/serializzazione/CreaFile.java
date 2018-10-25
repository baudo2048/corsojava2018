package com.gi.serializzazione;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CreaFile {
	private static ObjectOutputStream output;

	public static void main(String[] args) {
		apriFile();
		aggiungiRecord();
		chiudiFile();
	}

	private static void aggiungiRecord() {
		Impiegato record;
		int id = 0;
		String nome;
		String cognome;
		double stipendio;

		Scanner in = new Scanner(System.in);
		System.out.println("Inserire id, nome, cognome, stipendio");
		while (in.hasNext()) {
			try {
				id = in.nextInt();
				nome = in.next();
				cognome = in.next();
				stipendio = in.nextDouble();
				if (id > 0) {
					record = new Impiegato(id, nome, cognome, stipendio);
					output.writeObject(record);
				} else {
					System.out.println("Id impiegato non valido");
				}
			} catch (IOException exc) {
				System.out.println("Impossibile scrivere sul file");
			}
		}
		in.close();
	}

	private static void chiudiFile() {
		try {
			output.close();
		} catch (IOException exc) {
			System.out.println("Tentativo chiusura fallito");

		}

	}

	private static void apriFile() {
		try {
			output = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Documents\\impiegato.ser"));

		} catch (IOException exc) {
			System.out.println("Impossibile scrivere sul file");

		}
	}

}
