package com.gigroup.accessorandom;

import java.util.Enumeration;

public class MapTest {
	public static void main(String[] args) {
		HashTableTest carrello = new HashTableTest();
		carrello.aggiungiArticolo("1", "Apple", "iPhone", 800);
		carrello.aggiungiArticolo("2", "Apple", "Mac Pro", 3000);
		carrello.aggiungiArticolo("3", "Samsung", "S9", 850);
		carrello.aggiungiArticolo("4", "HP", "Envy", 1300);
		carrello.aggiungiArticolo("5", "Sony", "Vaio", 1200);
		carrello.aggiungiArticolo("2", "Apple", "Mac Pro", 3000);
		carrello.aggiungiArticolo("2", "Apple", "Mac Pro", 3000);
		
		System.out.println("Totale: "+carrello.totaleComplessivo());
		
		System.out.println("Totale parziale Mac Pro: "+carrello.totaleParziale("2"));
		
		carrello.rimuoviArticolo("5");
		
		Enumeration<String[]> enumerazione = carrello.getDati();
		String dati[];
		while(enumerazione.hasMoreElements()) {
			dati = enumerazione.nextElement();
			System.out.println(dati[0]+"\t"+dati[1]);
		}
	}
}
