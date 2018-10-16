package firstprogram.interfaces;

class Counter implements Runnable {
	
	// VARIABILI DI ISTANZA
	private int currentValue;
	
	// COSTRUTTORE
	public Counter() { currentValue = 0; }
	
	// METODI PUBBLICI - API
	public int getValue() { return currentValue; }
	
	public void run() { // (1) Thread entry point
		try {
			while (currentValue < 5) {
				System.out.println(
						Thread.currentThread().getName() // (2) Print thread name.
						+ ": " + (currentValue++)
						);
				Thread.sleep(250); // (3) Current thread sleeps.
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " interrupted.");
		}
		System.out.println("Exit from thread: " + Thread.currentThread().getName());
	}
	
	
}
