package com.gigroup.thread;

public class EstensioneThread extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException exc) {
			System.out.println("Thead interrotto");
		}
	}
}