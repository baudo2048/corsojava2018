package com.gigroup.services;

import java.util.List;

public interface Repository<K, V> {
	public V getOne(K k);
	public void insertOne(V v);
	public List<V> getAll();
}
