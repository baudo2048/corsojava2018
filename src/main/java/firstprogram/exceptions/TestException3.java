package firstprogram.exceptions;

public class TestException3 {
	
	public void unMetodo()  {
		System.out.println("La prossima istruzione solleverà un'eccezione");
		throw new ArrayIndexOutOfBoundsException("Runt ex");
	}
	
	public static void main(String[] args) {
		Integer[] arr = new Integer[10];		
		int a = arr[19];		
		try {
			new TestException3().unMetodo();
		} catch (ArrayIndexOutOfBoundsException e2) {
			
		} catch (RuntimeException e) {
			System.out.println("Ciao ho gestito l'eccezione");
		} catch (Exception e1) {
			System.out.println("Altra eccezione");
		} finally {
			System.out.println("Questo lo faccio a prescindere dal tipo di eccezione gestita");
		}
	}
}

