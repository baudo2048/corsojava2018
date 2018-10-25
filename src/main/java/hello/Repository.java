package hello;

import java.util.LinkedList;

import com.jp.assignment.nogen.Sale;

public class Repository {
	private LinkedList<Sale> sales = new LinkedList<Sale>();
	
	public void insert(Sale sale) {
		this.sales.add(sale);
	}
	
	public void log1() {
		
	}
	
	public void log2() {
		
	}
}
