package com.gigroup.thread;

public class Thread2 extends Thread {
	Tabella t;
	
	public Thread2(Tabella t) {
		this.t = t;
	}
	
	public void run() {
		t.stampa(100);
	}
}
