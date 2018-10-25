package com.gi.oop;

public class Motore {
	private int cilindrata;
	private String descrizione;
	public Motore(int cilindrata, String descrizione) {
		this.cilindrata = cilindrata;
		this.descrizione = descrizione;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}

