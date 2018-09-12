package com.luoxuebing;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String passwd;
	List<User> users;
	public User() {
		this.users = new ArrayList<User>();
	}
	public User(String name, String passwd, List<User> users) {
		super();
		this.name = name;
		this.passwd = passwd;
		this.users = users;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", passwd=" + passwd + ", users=" + users + "]";
	}
	

}
