package com.gi.oop;

public class ClasseFacade {
	private static ClasseFacade istanza;
	
	private ClasseFacade() {
		
	}
	
	public static ClasseFacade getInstance() {
		if(istanza == null)
			istanza = new ClasseFacade();
		return istanza;
	}
	
	public String getInfoBC1() {
		BC1 bc1 = new BC1();
		return bc1.getInfo1();
	}
	
	public String getInfoBC2() {
		BC2 bc2 = new BC2();
		return bc2.getInfo2();
	}
	
	public String getInfoBC3() {
		BC3 bc3 = new BC3();
		return bc3.getInfo3();
	}
	
}
