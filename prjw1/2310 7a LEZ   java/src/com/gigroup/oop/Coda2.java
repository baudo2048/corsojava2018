package com.gigroup.oop;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Coda2 {
	public static void main(String[] args) {
		Queue<String> coda = new PriorityQueue<String>();
		coda.offer("B");
		coda.offer("A");
		coda.offer("W");
		coda.offer("Y");
		coda.offer("G");
		coda.offer("R");
		coda.offer("T");
		System.out.printf("%s",coda);
	
		
		
	}
}
