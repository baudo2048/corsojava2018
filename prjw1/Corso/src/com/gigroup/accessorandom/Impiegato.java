package com.gigroup.accessorandom;

import java.io.RandomAccessFile;
import java.io.IOException;

public class Impiegato{
	private int id;
	private String nome;
	private String cognome;
	private double stipendio;
	
	public Impiegato(int id, String nome, String cognome, double stipendio) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
	} 

	public Impiegato() {
		this(0, "", "", 0.0);
	} 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public void leggi(RandomAccessFile file) throws IOException {
		setId(file.readInt());
		setNome(leggiNominativo(file));
		setCognome(leggiNominativo(file));
		setStipendio(file.readDouble());
	} 

	public void scrivi(RandomAccessFile file) throws IOException {
		file.writeInt(getId());
		scriviNominativo(file, getNome());
		scriviNominativo(file, getCognome());
		file.writeDouble(getStipendio());
	}

	private String leggiNominativo(RandomAccessFile file) throws IOException {
		char nominativo[] = new char[20];
		char temp;
		for (int i = 0; i < nominativo.length; i++) {
			temp = file.readChar();
			nominativo[i] = temp;
		}


		return new String(nominativo).replace('\0', ' ');
	}
	
	private void scriviNominativo(RandomAccessFile file, String nominativo) throws IOException {
		StringBuffer buffer = null;

		if (nominativo != null)
			buffer = new StringBuffer(nominativo);
		else
			buffer = new StringBuffer(20);
		buffer.setLength(20);
		file.writeChars(buffer.toString());
	} 
}
