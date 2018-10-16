package firstprogram.exceptions;

/** 
 * 1) Le eccezioni sono di due tipi: Checked e Unchecked
 * @author Admin
 *
 */
public class TestException1 {
	
	public void unMetodo() throws Exception {
		System.out.println("potrei sollevare un'eccezione");
		int val = System.in.read();
		
		if (val<10) {
			System.out.println("Tutto ok");
		} else {
			throw new Exception("hai inserito un numero maggiore o uguale a 10");
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
