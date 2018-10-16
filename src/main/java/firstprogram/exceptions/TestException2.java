package firstprogram.exceptions;

public class TestException2 {
	
	public void unMetodo() throws Exception {
		System.out.println("potrei sollevare un'eccezione");
		
		// Le classi Box
		String val = Character.toString((char)System.in.read());		
		if (val.compareTo("1")==0) {
			System.out.println("Tutto ok " + val);
		} else {
			throw new Exception("hai inserito un numero maggiore o uguale a 10 " + val);
		}
	}
	
	public static void main(String[] args) {
		TestException1 tex1 = new TestException1();
		
		try {
			tex1.unMetodo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
