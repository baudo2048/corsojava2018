package firstprogram.esercizi.esercizio1;

public class Client implements Listener {
	private String msg = new String("Messaggio di default");
	private int cicliClock;
	
	public Client () {
		
	}
	
	public Client (String msg, int cicliClock) {
		this.msg = msg;
		this.cicliClock=cicliClock;
	}
	
	public void notifica(int delay){
		if(delay % cicliClock == 0) {
			System.out.println(this.msg);
		}
	}
	
	public void metodo() {
		
	}

}
