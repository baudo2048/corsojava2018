package com.gigroup.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EsempioArrayList {
	private final String[] ELEMENTI = { "E1", "E2", "E3", "E4", "E5", "E6" };
	private final String[] ELEMENTI2 = { "E3", "E5" };

	public EsempioArrayList() {
		ArrayList<String> lista = new ArrayList<String>();
		List<String> lista2 = Arrays.asList(ELEMENTI2);

		for (String elemento : ELEMENTI)
			lista.add(elemento);

		stampaLista(lista);
		modifica(lista, lista2);
		stampaLista(lista);
	}

	private void stampaLista(ArrayList<String> lista) {
		for (int i = 0; i < lista.size(); i++)
			System.out.printf("%s\t", lista.get(i));
	}

	private void modifica(ArrayList<String> lista, List<String> lista2) {
		Iterator<String> iterator = lista.iterator();

		while (iterator.hasNext()) {
			if (lista2.contains(iterator.next())) {
				iterator.remove();
			}
		}
	}
	public static void main(String[] args) {
		new EsempioArrayList();
	}
	
	
}
