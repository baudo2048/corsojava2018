package firstprogram.esercizi.esercizio4;

import java.util.ArrayList;
import java.util.Comparator;

public class Esercizio4 {
	
	public static void main(String[] args) {
		ArrayList<Integer[]> arr = new ArrayList<Integer[]>();
		
		arr.add(new Integer[] {1,1,1});
		arr.add(new Integer[] {3,1,3});
		arr.add(new Integer[] {2,0,1});
		arr.add(new Integer[] {1,1,1});
		
		arr.sort(new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if(o1[0]<o2[0] && o1[1]<o2[1] && o1[2]<o2[2]) {
					return -1;
				} else if (o1[0]>o2[0] && o1[1]>o2[1] && o1[2]>o2[2]) {
					return 1;
				}
				
				return 0;
			}
			
		});
		
		System.out.println("FINE");
	}

}
