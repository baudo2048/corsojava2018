package com.gi.oop;

public class Auto {
	private Motore motore; 
	private Ruota ruota;
	
	public Auto(Motore motore, Ruota ruota) {
		this.motore = motore;
		this.ruota = ruota;
	}

	public Motore getMotore() {
		return motore;
	}
	
	
	public void setMotore(Motore motore) {
		this.motore = motore;
	}
	public Ruota getRuota() {
		return ruota;
	}
	public void setRuota(Ruota ruota) {
		this.ruota = ruota;
	}

	@Override
	public String toString() {
		return "Auto [motore=" + motore + ", ruota=" + ruota + "]";
	}

	
	
	
	
	
}
