package com.gi.oop;

public class AutoTest {
	public static void main(String[] args) {
		Motore motore = new Motore(1500,"Benzina");
		Ruota ruota = new Ruota("Pirelli", "PZero");
		
		Auto auto = new Auto(motore, ruota);
		
		assert auto != null; 
		
		System.out.println(auto.toString());
		
		
	}
}
