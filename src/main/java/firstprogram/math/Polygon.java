package firstprogram.math;

public class Polygon extends Object {
	
	String nome;
	int n;
	
	/**
	 * costruttore di default
	 */
	public Polygon() {
		this.n = 3;
	}
	
	public Polygon(int n) {
		this.n=n;
	}
		
	public Polygon(String nome, int n) {
		super();
		this.nome = nome;
		this.n = n;
	}

	public void getPerimetro() {
		System.out.println("Sono il metodo dell'oggetto poligono");
	}
	
	public String unMetodo() {
		return "Il mio nome è Polygon";
	}
	
	public int unMetodo(int a) {
		return 0;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void metodoComune() {
		System.out.println("Metodo comune definito in Polygon");
	}
}
