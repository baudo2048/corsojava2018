package firstprogram.scanner;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci la base = ");
		int a = scan.nextInt();
		
		System.out.println("Inserisci l'esponente = ");
		int b = scan.nextInt();
		
		int result = (int) Math.pow(a, b);
		
		System.out.println(a + " elevato a " + b + " = " + result);
	}

}
