package com.gigroup.services;

import java.util.ArrayList;
import java.util.List;

import com.gigroup.domain.Detail;

public class DetailRepository implements Repository<Integer, Detail> {

	ArrayList<Detail> details = new ArrayList<Detail>();
	
	public Detail getOne(Integer k) {
		return this.details.get(k);
	}

	public void insertOne(Detail v) {
		this.details.add(v);
		
	}

	public List<Detail> getAll() {
		return this.details;
	}

}
