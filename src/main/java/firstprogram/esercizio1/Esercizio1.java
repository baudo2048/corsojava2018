package firstprogram.esercizio1;

public class Esercizio1 {

	public static void main(String[] args) {
		Counter c = new Counter(1000);
		
		Listener l1 = new Client("msg1", 1);
		Listener l2 = new Client("msg2", 5);
		
		
		c.addListener(l1);
		c.addListener(l2);
		
		Thread counter = new Thread(c);		
		counter.start();
	}

}
