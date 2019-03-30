package com.auribises;

/*
class Shoe{
	
	// Attributes : Property of Object
	int id;
	int price;
	String name;
	String brand;
	int shoeSize;
	
	Shoe(){
		System.out.println(">> Shoe Object Constructed");
	}
	
	void setDataForShoe(int id, int price, String name, String brand,int shoeSize){
		this.id = id;
		this.price = price;
		this.name = name;
		this.brand = brand;
		this.shoeSize = shoeSize;
	}
	
	void showDataForShoe(){
		System.out.println("==="+id+" | "+name+"===");
		System.out.println("Price: "+price);
		System.out.println("Brand: "+brand);
		System.out.println("Size: "+shoeSize);
		System.out.println("====================");
	}
}

class Mobile{
	int id;
	int price;
	String name;
	String brand;
	String os;
	int memory;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	void setDataForMobile(int id, int price, String name, String brand,  String os, int memory){
		this.id = id;
		this.price = price;
		this.name = name;
		this.brand = brand;
		this.os = os;
		this.memory = memory;
	}
	
	void showDataForMobile(){
		System.out.println("==="+id+" | "+name+"===");
		System.out.println("Price: "+price);
		System.out.println("Brand: "+brand);
		System.out.println("OS: "+os);
		System.out.println("Memory: "+memory);
		System.out.println("====================");
	}
}
*/

class Product{
	
	int id;
	int price;
	String name;
	String brand;
	
	Product(){
		System.out.println(">> Product Object Constructed");
	}
	
	void setDataForProduct(int id, int price, String name, String brand){
		this.id = id;
		this.price = price;
		this.name = name;
		this.brand = brand;
	}
	
	void showDataForProduct(){
		System.out.println("==="+id+" | "+name+"===");
		System.out.println("Price: "+price);
		System.out.println("Brand: "+brand);
		System.out.println("====================");
	}
	
}

class Shoe extends Product{
	int shoeSize;
	
	Shoe(){
		System.out.println(">> Shoe Object Constructed");
	}
	
	void setDataForShoe(int id, int price, String name, String brand,int shoeSize){
		setDataForProduct(id, price, name, brand);
		this.shoeSize = shoeSize;
	}
	
	void showDataForShoe(){
		showDataForProduct();
		System.out.println("Size: "+shoeSize);
	}
}

class Mobile extends Product{
	String os;
	int memory;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	void setDataForMobile(int id, int price, String name, String brand,  String os, int memory){
		setDataForProduct(id, price, name, brand);
		this.os = os;
		this.memory = memory;
	}
	
	void showDataForMobile(){
		showDataForProduct();
		System.out.println("OS: "+os);
		System.out.println("Memory: "+memory);
	}
}


public class Inheritance {

	public static void main(String[] args) {
		
		Shoe s1 = new Shoe();
		s1.setDataForShoe(101, 8000, "Alpha Bounce", "Adidas", 8);
		s1.showDataForShoe();
		
		Mobile m1 = new Mobile();
		m1.setDataForMobile(201, 80000, "iPhoneX", "Apple", "iOS", 4);
		m1.showDataForMobile();
	}

}
