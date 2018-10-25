package com.gi.oop;

public class CloneTest {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		System.out.println(a1.i);
		A a2 = a1;
		a2.i = 15;
		A a3 = (A)a1.clone();
		System.out.println(a3.i);
		a3.i = 30;
		System.out.println(a3.i);
		
		
	}
}
