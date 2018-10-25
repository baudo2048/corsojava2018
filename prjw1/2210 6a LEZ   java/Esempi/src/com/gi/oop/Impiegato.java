package com.gi.oop;

public class Impiegato {
	private int id;
	private String nome;
	private double stipendio;
	private static int contatore;
	
	public Impiegato(int id, String nome, double stipendio) {
		this.id = id;
		this.nome = nome;
		this.stipendio = stipendio;
		contatore++;
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

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public static int getContatore() {
		return contatore;
	}

	@Override
	public String toString() {
		return "Impiegato [id=" + id + ", nome=" + nome + ", stipendio=" + stipendio + "]";
	}

}
