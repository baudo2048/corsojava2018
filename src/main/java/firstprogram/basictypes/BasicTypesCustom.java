package firstprogram.basictypes;

public class BasicTypesCustom {

	public static void main(String[] args) {
		User u1 = new User("Giuseppe", "Baudo");
		User u2 = new User(new String("Mario"), "Rossi");
		User u3 = new User(new String("Mario"), "Rossi");

		// toString
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		
		// UGUAGLIANZA
		if(u2.getNome() == u3.getNome()) {
			System.out.println("wow");
		} else {
			System.out.println("why");
		}
		
		// SCAMBIO DI VARIABILI
		u1=u3;
		
		u1.setNome("Francesco");
		
		System.out.println("Scambio variabili:");
		System.out.println(u3.getNome());
	}

}
