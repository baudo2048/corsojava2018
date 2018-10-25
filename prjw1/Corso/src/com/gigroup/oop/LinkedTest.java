package com.gigroup.oop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedTest {
	private final String[] ELEMENTI = { "E1", "E2", "E3", "E4", "E5", "E6" };
	private final String[] ELEMENTI2 = { "E3", "E5" };
	
	public LinkedTest() {
		LinkedList<String> lista1 = new LinkedList<String>();
		LinkedList<String> lista2 = new LinkedList<String>();
		
		for (String elemento : ELEMENTI)
			lista1.add(elemento);
		for (String elemento : ELEMENTI2)
			lista2.add(elemento);
		
		lista1.offerFirst("PrimoElementoLista1");
		System.out.println("Primo elemento: "+lista1.peekFirst());
		lista1.offerLast("UltimoElementoLista1");
		System.out.println("Ultimo elemento: "+lista1.peekLast());
		
		lista1.addAll(lista2);
		lista2 = null; 
		
		stampaLista(lista1);
		convertiMinuscolo(lista1);
		stampaLista(lista1);
		System.out.println("Elim elemento 2 al 5");
		modificaLista(lista1,2,5);
		stampaLista(lista1);
		stampaReverse(lista1);
		
		
	}
	
	private void modificaLista(LinkedList<String> lista1, int start, int end) {
		lista1.subList(start, end).clear();
	}

	private void stampaLista(LinkedList<String> lista1) {
		for(String e : lista1)
			System.out.printf("%s", e);
	}
	
	private void convertiMinuscolo(LinkedList<String> lista1) {
		ListIterator<String> iterator = lista1.listIterator();
		while(iterator.hasNext()) {
			String elemento = iterator.next();
			iterator.set(elemento.toLowerCase());
		}		
	}
	
	private void stampaReverse(LinkedList<String> lista1) {
		
		ListIterator<String> iterator = lista1.listIterator(lista1.size());
		while(iterator.hasPrevious()) {
			System.out.printf("%s", iterator.previous());
			
		}
		Iterator<String> dIterator = lista1.descendingIterator();
		while(dIterator.hasNext()) {
			System.out.printf("%s", dIterator.next());
			
		}
	}
	public static void main(String[] args) {
		new LinkedTest();
	}
	
}
