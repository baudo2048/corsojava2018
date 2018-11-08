package com.gigroup.services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gigroup.domain.User;

public class RepositoryImplTests2 {
	Repository2<User> repo;
	
	@Before
	public void setUp() throws Exception {
		repo = new RepositoryImpl<User>();
	}

	@Test
	public void repoExistTest() {
		assertNotNull(this.repo);
	}
	
	@Test
	public void insertOneTest() {
		
		this.repo.insertOne(new User("mario","cognome"));
		
		assertEquals(this.repo.getAll().size(), 1);
		assertEquals(this.repo.getOne(0).getNome(), "mario");
	}
	
	@Test
	public void getAllTest() {
		
	}

}
