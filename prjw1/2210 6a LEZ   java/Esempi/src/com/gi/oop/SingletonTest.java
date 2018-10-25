package com.gi.oop;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		s1.modifica();
		Singleton s2 = Singleton.getInstance();
		s2.modifica();
		System.out.println(s1.i);
	}
}
