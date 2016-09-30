package com.ssz.pojo;

public class User {
	private String 		id;
	private String 		username;
	private int 		age;
	private String 		useraddress;
	
	public User(String id, String username, int age, String useraddress) {
		this.id = id;
		this.username = username;
		this.age = age;
		this.useraddress = useraddress;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	
}
