package firstprogram.esercizi.esercizio1;

import java.util.ArrayList;

public class Counter implements Runnable {
	private int delay=0;
	private int currentClock=0;
	private int stopClock=100;
	
	ArrayList<Listener> listeners = new ArrayList<Listener>();	
	public void addListener(Listener l) {
		this.listeners.add(l);
	}
	
	Counter (int delay){
		this.delay=delay;
	}
	
	Counter (int delay, int startClock, int stopClock){
		this.delay=delay;
		this.currentClock=startClock;
		this.stopClock=stopClock;
	}

	public void run() {
		int i=0;
		while(i<this.stopClock) {		
			try {
				this.currentClock=i+1;
				System.out.println(i+1);
				notificaAll();
				i++;
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}		
	}
	
	private void notificaAll() {
		System.out.println("Evento clock");
		for (Listener l : this.listeners) {			
			l.notifica(this.currentClock);			
		}
	}
}
