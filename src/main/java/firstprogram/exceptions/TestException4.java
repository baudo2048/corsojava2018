package firstprogram.exceptions;

public class TestException4 {
	
	public void unMetodo(String p) throws Exception  {
		if(p==null) {
			throw new Exception();
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		
		new TestException4().unMetodo(null);
		
	}
}
