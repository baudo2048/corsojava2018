package com.gigroup.oop;

public class EsempioGenerici {
	public static void main(String[] args) {
		Integer[] iArray = {1,2,3};
		Double[] dArray = {1.0,2.0,3.0};
		Character[] cArray = {'a','b','c'};
		
		stampa(iArray);
		stampa(dArray);
		stampa(cArray); 
		
		stampaGenerico(iArray);
		stampaGenerico(dArray);
		stampaGenerico(cArray);
	}

	private static <E> void stampaGenerico(E[] arrayGenerico) {
		for(E i : arrayGenerico)
			System.out.println("ArrayI: "+ i);
		System.out.println("<----------------------------------->");
	}
	
	

	private static void stampa(Integer[] dati) {
		for(Integer i : dati)
			System.out.println("ArrayI: "+ i);
	}

	private static void stampa(Double[] dati) {
		for(Double i : dati)
			System.out.println("ArrayD: "+ i);
	}
	
	private static void stampa(Character[] dati) {
		for(Character i : dati)
			System.out.println("ArrayC: "+ i);
	}
}
