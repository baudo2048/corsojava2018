package com.gi.oop;

public class ImpiegatoTest {
	public static void main(String[] args) {
		Impiegato[] impiegati = new Impiegato[2];
		impiegati[0] = new Impiegato(45, "Max", 1200);
		impiegati[1] = new Impiegato(35, "Laura", 1500);
		
		for(Impiegato i: impiegati)
			System.out.println(i.toString());
			
		System.out.println("Conteggio: "+Impiegato.getContatore());
	}
}
