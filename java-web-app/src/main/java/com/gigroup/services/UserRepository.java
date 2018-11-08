package com.gigroup.services;

import java.util.ArrayList;
import java.util.List;

import com.gigroup.domain.User;

public class UserRepository implements Repository<Integer, User> {
	
	ArrayList<User> users = new ArrayList<User>();

	public User getOne(Integer k) {
		return this.users.get(k);
	}

	public void insertOne(User v) {
		this.users.add(v);
		
	}

	public List<User> getAll() {
		return this.users;
	}
}
