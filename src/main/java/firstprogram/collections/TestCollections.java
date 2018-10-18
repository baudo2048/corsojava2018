package firstprogram.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollections {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		c.add("stringa 1");
		c.add("stringa 2");
		
		Iterator<String> i = c.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
