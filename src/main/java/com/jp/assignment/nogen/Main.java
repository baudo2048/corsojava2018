package com.jp.assignment.nogen;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Sale> sales = new LinkedList<Sale>();
		
		sales.add(new Sale("apple", new BigDecimal(10)));
	}

}
