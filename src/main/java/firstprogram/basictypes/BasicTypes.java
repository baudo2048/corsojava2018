package firstprogram.basictypes;

import firstprogram.interfaces.Client;

public class BasicTypes {

	public static void main(String[] args) {
		String s1 = "ciao";
		
		String s2 = "ciao";
		String s3 = new String("ciao");
		
		int a = 10;
		int b = new Integer(10);
		
		Integer i = new Integer(10);
		
		if (a==b) {
			System.out.println("wow" + s2 + " " + s3);
		} else {
			System.out.println("why");
		}
		
		if (s1.compareTo(s2)==0) {
			System.out.println("wow");
		} else {
			System.out.println("why");
		}
		
		
	}

}
