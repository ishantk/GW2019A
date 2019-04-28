package com.auribises.model;


/*
	Create a Table
 	create table Customer(
 		cid int primary key auto_increment,
 		name varchar(256),
 		phone varchar(256),
 		email varchar(256),
 		age int
 	)
 	
 	Insert a Row in Table
 	insert into Customer values(null, 'John', '+91 99999 88888', 'john@example.com', 22)
 	
 	Update a Row in Table
 	update Customer set name = 'John Watson', phone ='+91 98765 98765', age = 33 where cid = 1
 	
 	Retrieve Data from Table
 	select * from Customer
 	select name, age from Customer
 	select * from Customer where cid = 3
 	select * from Customer where age > 25
 	
 	Delete Data from Table
 	delete from Customer where cid = 2
 	
 	
 */

// Textual Representation of an Object
public class Customer {

	// Attributes
	public int cid;
	public String name;
	public String phone;
	public String email;
	public int age;
	
	// Constructor
	public Customer() {
		cid = 0;
		name = "NA";
		phone = "NA";
		email = "NA";
		age = 20;
	}

	public Customer(int cid, String name, String phone, String email, int age) {
		this.cid = cid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", age=" + age
				+ "]";
	}
}
