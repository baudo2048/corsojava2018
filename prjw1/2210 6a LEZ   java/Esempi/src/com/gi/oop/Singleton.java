package com.gi.oop;

public class Singleton {
	int i = 10;
	
	private static Singleton istanza;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if(istanza == null) {
			istanza = new Singleton();
		}
		return istanza;
	}
	public void modifica() {
		i++;
	}
	
}
