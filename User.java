package edu.ait.model;

public class User {

	private String name;
	private String address;
	private String password;
	
	public User(String n, String a, String p) {
		this.name = n;
		this.address = a;
		this.password = p;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String n) {
		this.name = n;		
	}
	
	public void setAddress(String a) {
		this.address = a;
	}
	
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
}
