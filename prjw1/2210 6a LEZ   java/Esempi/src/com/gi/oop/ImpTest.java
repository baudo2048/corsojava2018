package com.gi.oop;

public class ImpTest {
	public static void main(String[] args) {
		Imp[] impiegati = new Imp[2];
		
		impiegati[0] = new Imp("Max",2000);
		impiegati[1] = new Dirigente("Paolo",3000,"Ferrari");
		
		for(Imp i : impiegati) {
			System.out.println(i.getNome()+" "+i.getStipendio());
			if(i instanceof Dirigente) {
				System.out.println(((Dirigente) i).getAuto());
			}
		}	
	}
}
