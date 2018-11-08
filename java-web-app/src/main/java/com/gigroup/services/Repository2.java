package com.gigroup.services;

import java.util.List;

public interface Repository2<T> {
	public T getOne(int i);
	public void insertOne(T v);
	public List<T> getAll();
}
