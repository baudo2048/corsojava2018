package com.gigroup.thread;

public class EsempioT {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		thread.setName("Main Thread");
		thread.setPriority(10);
		System.out.println("Thread in esecuzione: "+thread);
		
		try {
			for(int n = 5; n>0; n--) {
				System.out.println(" "+n);
				Thread.sleep(2000);
			}
		}catch(InterruptedException exc) {
			System.out.println("Thead interrotto");
		}
	}
}
