package com.gi.serializzazione;

import java.io.Serializable;

public class Impiegato implements Serializable{

	private static final long serialVersionUID = 7417354062650448683L;
	private int id;
	private String nome;
	private String cognome;
	private transient double stipendio;

	public Impiegato(int id, String nome, String cognome, double stipendio) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
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
}
