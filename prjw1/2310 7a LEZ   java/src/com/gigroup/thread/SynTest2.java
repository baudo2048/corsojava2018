package com.gigroup.thread;

public class SynTest2 {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		new Thread() {
			public void run() {
				c.ritiroDenaro(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposito(10000);
			}
		}.start();
	}
}
