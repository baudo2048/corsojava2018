package com.gigroup.thread;

public class RunnableTest implements Runnable {
	public static void main(String[] args) {
		new RunnableTest();
		
	}
	
	public RunnableTest() {
		Thread tCorrente = Thread.currentThread();
		tCorrente.setName("Thread principale");
		Thread tCreato = new Thread(this,"Child Thread");
		System.out.println("Thread corrente: "+tCorrente);
		System.out.println("Thread creato: "+tCreato);
		tCreato.start();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException exc) {
			System.out.println("Thead interrotto");
		}	
	}
	
	@Override
	public void run() {
		try {
			for(int i = 10; i>0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
				
		}catch(InterruptedException exc) {
			System.out.println("Thead interrotto");
		}	
		
	}
}
	
	
