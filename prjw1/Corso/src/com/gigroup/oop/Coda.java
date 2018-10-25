package com.gigroup.oop;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Coda {
	public static void main(String[] args) {
		Queue<Integer> coda = new PriorityQueue<Integer>(10);
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			coda.offer(new Integer(rand.nextInt(100)));
		}

		for (int i = 0; i < 10; i++) {
			Integer dato = coda.poll();
			System.out.println("Eliminato valore: " + dato);
		}

		System.out.println(coda);

		Queue<Cliente> codaComparator = new PriorityQueue<Cliente>(10, idComparator);
		aggiungi(codaComparator);
		elimina(codaComparator);
		
	}

	public static Comparator<Cliente> idComparator = new Comparator<Cliente>() {
		@Override
		public int compare(Cliente c1, Cliente c2) {
			return c1.getId() - c2.getId();
		}
	};

	private static void aggiungi(Queue<Cliente> codaComparator) {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int id = rand.nextInt(100);
			codaComparator.offer(new Cliente(id, "Test"));
		}
	}

	private static void elimina(Queue<Cliente> codaComparator) {
		while (true) {
			Cliente cliente = codaComparator.poll();
			if (cliente == null)
				break;
			System.out.println("Elaborazione cliente con id: " + cliente.getId());
		}

	}

}
