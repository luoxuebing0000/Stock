package com.luoxuebing;

public class Admin {
	private String name;
	private String passwd;
	public Admin() {
		this.name = "luoxuebing";
		this.passwd = "123456";
	}
	public Admin(String name, String passwd) {
		super();
		this.name = name;
		this.passwd = passwd;
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
	
	@Override
	public String toString() {
		return "Admin [name=" + name + ", passwd=" + passwd + "]";
	}
}
