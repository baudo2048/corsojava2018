package firstprogram.basictypes;

public class BasicIntegers {
	public static void main(String[] args) {
		
		// VARIABILI PRIMITIVE
		int a = 10;
		int b = 10;
		
		b=a;		
		a=15;		
		System.out.println(b);

		
		// VARIABILI OGGETTO
		Integer aa=null;// = new Integer(10);
		Integer bb = new Integer(10);
		
		aa=bb;
		bb=15;
		System.out.println(aa);
		
		
		// INBOXING, UNBOXING, AUTOBOXING
		
		// INBOXING
		int aaa = 100;
		Integer boxing = aaa;
		
		// UNBOXING
		Integer bbb = 1000;
		int unboxing = bbb.intValue();
		
		// AUTOBOXING
		// La conversione tra tipo di dato primitivo e
		// corrispondente classe wrapper (e viceversa) avviene
		// automaticamente.
		System.out.println("fine");
	}
}
