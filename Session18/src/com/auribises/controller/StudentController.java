package com.auribises.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

import com.auribises.model.Student;

public class StudentController {
	
	public void saveStudent(Student sRef){
		
		try {
			
			File file = new File("/users/ishantkumar/Downloads/students.csv");
			FileWriter writer = new FileWriter(file, true);
			
			String data = sRef.toString();
			
			writer.write(data);
			
			writer.close();
			
			System.out.println(">> Student Object Saved in File");
			
		} catch (Exception e) {
			System.out.println("Some Exception:"+e);
		}
		
	}
	
	public void readStudents(){
		
		try {
			
			File file = new File("/users/ishantkumar/Downloads/students.csv");
			
			// Reads data as bytes
			/*
			FileInputStream inputStream = new FileInputStream(file);
			
			int ch = 0;
			
			while((ch = inputStream.read()) != -1){
				System.out.print((char)ch);
			}
			
			inputStream.close();*/
			
			// Reads data as text
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = "";
			
			while((line = buffer.readLine()) != null){
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
			
			// Read file and convert it into Student Objects.
			
		} catch (Exception e) {
			System.out.println("Some Exception:"+e);
		}
		
	}

}
