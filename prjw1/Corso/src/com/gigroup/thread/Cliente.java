package com.gigroup.thread;

public class Cliente {
	int bilancio = 10000;
	
	synchronized void ritiroDenaro(int cifra) {
		System.out.println("Inizio ritiro denaro....");
		
		if(bilancio < cifra) {
			System.out.println("Bilancio non sufficiente, in attesa di deposito...");
			try {
				wait();
			} catch(Exception exc) {
			}
		}
		bilancio -= cifra;
		System.out.println("Ritiro completato. Bilancio attuale: "+bilancio);
	}
		
	synchronized void deposito(int cifra) {
		System.out.println("Inizio deposito...");
		bilancio += cifra;
		System.out.println("Deposito completato. Bilancio attuale: "+bilancio);
		notify();
	}
}
