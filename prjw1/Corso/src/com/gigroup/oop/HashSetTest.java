package com.gigroup.oop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
	private final String[] ELEMENTI = { "E3", "E1", "E3", "E2", "E5", "E6","E6","E4","E3","E5" };
	
	public HashSetTest() {
		List<String>lista = Arrays.asList(ELEMENTI);
 		Set<String> set = new LinkedHashSet<String>(lista);
 	
 		for(String e : set) 
 			System.out.printf("%s ",e);
	}

	public static void main(String[] args) {
		new HashSetTest();
	}
}
