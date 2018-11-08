package com.gigroup.domain;

public class Patient {
	private String nome;
	private String sickness;
	
	public Patient(String nome, String sickness) {
		super();
		this.nome = nome;
		this.sickness = sickness;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSickness() {
		return sickness;
	}

	public void setSickness(String sickness) {
		this.sickness = sickness;
	}

	Patient(){
		
	}
}
