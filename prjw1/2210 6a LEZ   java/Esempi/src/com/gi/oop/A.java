package com.gi.oop;

public class A implements Cloneable{
	int i;
		
	@Override
	protected Object clone(){
		try {
			A a = (A)super.clone();
			return a;
		} catch(CloneNotSupportedException exc) {
			return null;
		}
	}
}
