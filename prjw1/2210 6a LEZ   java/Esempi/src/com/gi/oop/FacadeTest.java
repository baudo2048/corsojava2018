package com.gi.oop;

public class FacadeTest {
	public static void main(String[] args) {
		ClasseFacade facciata = ClasseFacade.getInstance();
		System.out.println(facciata.getInfoBC1());
		System.out.println(facciata.getInfoBC2());
		System.out.println(facciata.getInfoBC3());
	}
}
