package com.luoxuebing;

import java.util.Iterator;
import java.util.List;

public class ListUsers {

	public ListUsers() {
		super();
	}
	
	public void showUsers(List<User> users) {
		Iterator<User> iterator = users.iterator();
		User user1;
		while(iterator.hasNext()) {
			user1 = iterator.next();
			System.out.println("username: "+user1.getName()+"\tpasswd: "+user1.getPasswd());
		}
	}
	
	public void deleteUser(List<User> users, String username) {
		if(users.contains(username)) {
			
		}
	}

}
