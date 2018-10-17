package firstprogram.ricorsione;

public class TestRicorsione {

	public static void main(String[] args) {
		TestRicorsione tr = new TestRicorsione();
		
		int res = tr.fact(5);
		
		System.out.println(res);
	}

	private int fact(int i) {
		if (i==0) {
			return 1;
		}
		
		return fact(i-1)*i;
		
	}

}
