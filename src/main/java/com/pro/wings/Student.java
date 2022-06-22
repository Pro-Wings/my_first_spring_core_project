package com.pro.wings;

public class Student {
	
	int id;
	String name;
	String address;
	
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, String address) {

		System.out.println("all arg constructor invoked");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		System.out.println("setter called for id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter called for name");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("setter called for address");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
