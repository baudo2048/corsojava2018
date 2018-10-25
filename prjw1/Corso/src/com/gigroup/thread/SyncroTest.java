package com.gigroup.thread;

public class SyncroTest {
	public static void main(String[] args) {
		Tabella tabella = new Tabella();
		Thread1 t1 = new Thread1(tabella);
		Thread2 t2 = new Thread2(tabella);
		t1.start();
		t2.start();
	}
}
