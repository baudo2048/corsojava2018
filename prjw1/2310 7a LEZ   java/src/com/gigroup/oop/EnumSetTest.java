package com.gigroup.oop;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetTest {
	
	private enum Trimestre { GEN, FEB, MAR};
	
	public static void main(String[] args) {
		Set<Trimestre> set1 = EnumSet.of(Trimestre.GEN,Trimestre.MAR);
		elaboraTipo(set1);
		
		Set<Trimestre> set2 = EnumSet.allOf(Trimestre.class);
		elaboraTipo(set2);
		
		Set<Trimestre> set3 = EnumSet.noneOf(Trimestre.class);
		elaboraTipo(set3);
		set3.add(Trimestre.MAR);
		elaboraTipo(set3);
	}

	private static void elaboraTipo(Set<Trimestre> set) {
		for(Trimestre e : set)
			System.out.println(e+"\t");
		
	}
}
