package com.auribises.main;

import java.util.Scanner;

import com.auribises.model.Customer;

public class App {

	public static void main(String[] args) {
		System.out.println(">> App Started");
		
		// Object is created in Heap Area of RAM and is temporary
		// Whenever Program finishes data is lost in Object
		// We must save the data in case of requirement
		// 1. Java File IO APIs
		// 2. JDBC | Java Data Base Connectivity
		
		Customer cRef1 = new Customer();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter Customer Name: ");
		cRef1.name = scanner.nextLine();
		
		System.out.println(">> Enter Customer Phone: ");
		cRef1.phone = scanner.nextLine();
		
		System.out.println(">> Enter Customer Email: ");
		cRef1.email = scanner.nextLine();
	
		System.out.println(cRef1);
				
		
		System.out.println(">> App Finished");
	}

}
