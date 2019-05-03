package com.auribises;

import java.util.ArrayList;

class Employee{
	int eid;
	String name;
	int salary;
	
	public String toString(){
		return eid+","+name+","+salary;
	}
}

public class Collections {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		System.out.println("arr[0] is: "+arr[0]);
		System.out.println("arr lenght is: "+arr.length);
		arr[0] = 111;
		//arr[6] = 100; // Error at Runtime
		
		// 1. Limitation : Size is Fixed
		// 2. 			   Homogeneous
		

		// Data Structure called List in Java
		// We can add or remove data anytime
		// data can be any type
		// size is not fixed, it can grow and shrink dynamically
		// Limitation : Data can be duplicated
		// Hetro
		ArrayList list1 = new ArrayList();
		// Add Data in List
		list1.add("John"); // 0
		list1.add(10);
		list1.add(2.2);
		list1.add(10.34f);
		list1.add(1000);
		list1.add("Jennie");
		list1.add('A');
		list1.add("John"); // n-1
		
		// Read ArrayList:
		System.out.println("list1 is: "+list1);
		System.out.println("list1 size is: "+list1.size());
		
		// Get Data from List
		System.out.println("list1 data at index 3 is: "+list1.get(3));
		
		// Remove Data From List
		list1.remove(3);
		
		System.out.println("list1 is: "+list1);
		
		// Update Data in List
		list1.set(3, "Kia");
		
		System.out.println("list1 is: "+list1);
		System.out.println("list1 size  is: "+list1.size());
		System.out.println("list1 data at index 3 is: "+list1.get(3));
		
		
		// Homogeneous
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("John");
		list2.add("Joe");
		//list2.add(10); // error
		
		Employee e1 = new Employee();
		e1.eid = 101;
		e1.name = "John";
		e1.salary = 20000;
		
		Employee e2 = new Employee();
		e2.eid = 201;
		e2.name = "Jennie";
		e2.salary = 30000;
		
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		list3.add(e1);
		list3.add(e2);
		//list3.add("Sia"); // error
		//list3.add(10);	  // error
		
		System.out.println("===list1===");
		// Looping in ArrayList
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		System.out.println("===list2===");
		// Looping in ArrayList
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		System.out.println();
		
		System.out.println("===list3===");
		// Looping in ArrayList
		for(int i=0;i<list3.size();i++){
			//System.out.println(list3.get(i));
			Employee emp = list3.get(i);
			System.out.println(emp);
		}
		
		System.out.println();
		
		// HW: Create an ArrayList of Employee Objects as written above
		//     Calculate Max, Min and Average Salary
		//     Show the Employee Details of Max and Min Salary
	}

}
