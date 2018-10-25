package com.gi.oop;

import java.util.Comparator;

public class OrarioComparator implements Comparator<Orario> {
	@Override
	public int compare(Orario o1, Orario o2) {
		int oreComp = o1.getOre() - o2.getOre();
		if(oreComp != 0)
			return oreComp;
		int minutiComp = o1.getMinuti() - o2.getMinuti();
		if(minutiComp != 0)
			return minutiComp;
		int secondiComp = o1.getSecondi() - o2.getSecondi();
			return secondiComp;
	}
}
