package firstprogram.esercizio2;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		//String s = "((ii))";
		int counter=0;
		
		System.out.print("Inserisci una stringa: ");
		
		Scanner tastiera = new Scanner(System.in);
		String s = tastiera.nextLine();
		tastiera.close();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				counter++;
			} else if (s.charAt(i)==')') {
				counter--;
			}
		}
		
		if (counter==0) {
			System.out.println("vero");
		} else {
			System.out.println("falso");
		}

	}

}
