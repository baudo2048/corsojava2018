package com.gigroup.services;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl<V> implements Repository2<V> {
	private ArrayList<V> dati;

	public RepositoryImpl(){
		this.dati = new ArrayList<V>();
	}
	
	public V getOne(int i) {
		return (this.dati.get(i));
	}

	public void insertOne(V v) {
		this.dati.add(v);
		
	}

	public List<V> getAll() {
		return this.dati;
	}
	


}
