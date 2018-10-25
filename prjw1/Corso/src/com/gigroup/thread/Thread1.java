package com.gigroup.thread;

public class Thread1 extends Thread {
	Tabella t;
	
	public Thread1(Tabella t) {
		this.t = t;
	}
	
	public void run() {
		t.stampa(10);
	}
}
