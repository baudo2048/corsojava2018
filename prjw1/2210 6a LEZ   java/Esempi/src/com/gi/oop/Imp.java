package com.gi.oop;

public class Imp {
	private String nome;
	private double stipendio;
	public Imp(String nome, double stipendio) {
		super();
		this.nome = nome;
		this.stipendio = stipendio;
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
}
