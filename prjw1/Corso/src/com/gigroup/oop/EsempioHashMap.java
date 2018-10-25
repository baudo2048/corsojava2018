package com.gigroup.oop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EsempioHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> mappa = new HashMap<Integer,String>();
		
		mappa.put(1, "Max");
		mappa.put(2, "Paola");
		mappa.put(3, "Anna");
		
		Set<Integer> set = mappa.keySet();
		HashSet<Integer> chiavi = new HashSet<Integer>(set);
		for(Integer chiave : chiavi)
			System.out.println(chiave+"\t"+mappa.get(chiave));		
	}
}
