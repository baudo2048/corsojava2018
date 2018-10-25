package com.gigroup.oop;

public class GenericTest2 {
	public static void main(String[] args) {
		System.out.println(max(2,3,8));
		System.out.println(max(2.0,3.0,8.0));
		System.out.println(max("Elemento1","Elemento2","Elemento3"));
	}
	
	public static <T extends Comparable<T>> T max(T x, T y, T z) {
		T max = x; 
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		return max;
	}	
}
