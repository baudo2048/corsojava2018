package com.gigroup.thread;

public class Tabella {
	synchronized void stampa(int n) {
		for(int i = 1; i<=5; i++) {
			System.out.println(n*i);
		}
		
		try {
			Thread.sleep(500);
		} catch(InterruptedException exc) {
			System.out.println("Thead interrotto");
		}	
	}
}
