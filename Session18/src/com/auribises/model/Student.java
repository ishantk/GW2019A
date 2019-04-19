package com.auribises.model;

public class Student {

	int rollNum;
	String name;
	int age;
	String email;
	String address;
	
	public Student(){
		
	}
	
	public Student(int rollNum, String name, int age, String email, String address) {
		this.rollNum = rollNum;
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	public String toString(){
		return rollNum+","+name+","+age+","+email+","+address+"\n";
	}
	
}
