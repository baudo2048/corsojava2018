package com.gi.oop;

public class ClienteSpeciale extends Cliente {
	private double bonus;
	
	public ClienteSpeciale(String nome, String cognome) {
		super(nome, cognome);
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}	
}
