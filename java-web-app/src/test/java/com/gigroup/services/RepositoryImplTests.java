package com.gigroup.services;

import com.gigroup.domain.User;

public class RepositoryImplTests {
	Repository2<User> users = new RepositoryImpl<User>();
	
	public void case1Test() {
		// verifico che il db sia vuoto
		if(users != null) {
			System.out.println("ok");
		} else {
			new Exception();
		}
	}
	
	public void case2Test() {
		users.insertOne(new User("mario","rossi"));
		if(users.getAll().size()==1) {
			System.out.println("ok");
		}
	}
	
	public static void main(String[] args) {
		RepositoryImplTests testSuite = new RepositoryImplTests();
		testSuite.case1Test();
		testSuite.case2Test();
	}
}
