package com.gi.oop;

public class Dirigente extends Imp {
	private String auto;
	public Dirigente(String nome, double stipendio, String auto) {
		super(nome, stipendio);
		this.auto = auto;
	}
	public String getAuto() {
		return auto;
	}
	public void setAuto(String auto) {
		this.auto = auto;
	}
	

	
}
