package com.auribises;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileIODemo {

	// API : Application Programming Interfaces
	
	void writeInFile(){
		
		try {
			
			/*
			// Binary Stream
			File file = new File("/users/ishantkumar/Downloads/","mystudents.csv");
			//FileOutputStream stream = new FileOutputStream(file); // data will be overwritten
			FileOutputStream stream = new FileOutputStream(file, true); // true : append mode
			
			String data1 = "301, Jack, 30\n";
			String data2 = "401, Sia, 50\n";
			
			stream.write(data1.getBytes());
			stream.write(data2.getBytes());
			
			stream.close(); // to release memory resources
			*/
			
			// Textual/Charcater Stream
			File file = new File("/users/ishantkumar/Downloads/","yourstudents.csv");
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true);
			
			String data1 = "101, Jack, 30\n";
			String data2 = "201, Sia, 50\n";
			
			writer.write(data1);
			writer.write(data2);
			
			writer.close();
			
			System.out.println(">> File Written");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
	}
	
	public static void main(String[] args) {
		
		FileIODemo fRef = new FileIODemo();
		fRef.writeInFile();
		
		
		
	}

}

// HW: Write a Java Program which will create files like below: 
/*
 	File Name: MyApp.cpp
 	Contents:
 	#include<iostream>
 	int main(){
 	
 		return 0;
 	}
 	
 	File Name: MyApp.java
 	Contents:
 	public class MyApp{
 		public static void main(String[] args){
 		
 		}
 	}
*/  
  
