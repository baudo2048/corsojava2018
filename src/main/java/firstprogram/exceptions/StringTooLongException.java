package firstprogram.exceptions;

public class StringTooLongException extends Exception {
	private int stato;
	
//	public String getMessage() {
//		System.out.println("Sollevata eccezione checked");
//		return null;
//	}
	
	public StringTooLongException(int stato) {
		this.stato=stato;
	}
	
	public StringTooLongException(Object object) {
		// TODO Auto-generated constructor stub
	}

	public void unMetodo() {
		System.out.println("un metodo di StringTooLongException");
	}

	public int getStato() {
		return stato;
	}

	public void setStato(int a) {
		this.stato = a;
	}
}
