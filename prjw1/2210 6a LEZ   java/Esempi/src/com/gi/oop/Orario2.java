package com.gi.oop;

import java.text.DecimalFormat;

public class Orario2 implements Comparable<Orario2> {
	private int ore;
	private int minuti;
	private int secondi;
	
	public Orario2(int ore, int minuti, int secondi) {
		this.ore = ore;
		this.minuti = minuti;
		this.secondi = secondi;
	}
	public int getOre() {
		return ore;
	}
	public void setOre(int ore) {
		this.ore = ore;
	}
	public int getMinuti() {
		return minuti;
	}
	public void setMinuti(int minuti) {
		this.minuti = minuti;
	}
	public int getSecondi() {
		return secondi;
	}
	public void setSecondi(int secondi) {
		this.secondi = secondi;
	}
	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("00");
		return formato.format(ore)+":"+formato.format(minuti)+":"+formato.format(secondi);
	}
	@Override
	public int compareTo(Orario2 other) {
		int oreComp = this.ore - other.ore;
		if(oreComp != 0)
			return oreComp;
		int minutiComp = this.minuti - other.minuti;
		if(minutiComp != 0)
			return minutiComp;
		int secondiComp = this.secondi - other.secondi;
			return secondiComp;
	}

}
