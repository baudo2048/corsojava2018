package com.gi.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparatorTest {
	public static void main(String[] args) {
		Orario[] orari = new Orario[4];
		orari[0] = new Orario(5,10,30);
		orari[1] = new Orario(3,10,30);
		orari[2] = new Orario(5,5,30);
		orari[3] = new Orario(5,10,20);
		
		Arrays.sort(orari, new OrarioComparator());
		
		for(Orario o : orari)
			System.out.println(o.toString());
		System.out.println("<------------------------>");
		ArrayList<Orario> orariList = new ArrayList<Orario>();
		orariList.add(new Orario(5,10,30));
		orariList.add(new Orario(3,10,30));
		orariList.add(new Orario(5,5,30));
		orariList.add(new Orario(5,10,20));
		
		Collections.sort(orariList, new OrarioComparator());
		for(Orario o : orariList)
			System.out.println(o.toString());
		System.out.println("<------------------------>");
		ArrayList<Orario2> orariList2 = new ArrayList<Orario2>();
		orariList2.add(new Orario2(5,10,30));
		orariList2.add(new Orario2(3,10,30));
		orariList2.add(new Orario2(5,5,30));
		orariList2.add(new Orario2(5,10,20));
		Collections.sort(orariList2);
		for(Orario2 o : orariList2)
			System.out.println(o.toString());
	}
}
