package com.auribises.main;

import com.auribises.controller.StudentController;
import com.auribises.model.Student;

public class App {

	public static void main(String[] args) {
		
		// API : Application Programming Interfaces
		// Use Sacnner API to get the data on Console from User
		
		// Model has data
		//Student s1 = new Student(1, "John", 20, "john@example.com", "Redwood Shores");
		//Student s2 = new Student(2, "Fionna", 22, "fionna@example.com", "Pristine Magnum");
		
		//System.out.println(s1);
		//System.out.println(s2);
		
		// Persistance
		
		// Controller Has the Logic to Save Data
		StudentController controller = new StudentController();
		//controller.saveStudent(s1);
		//controller.saveStudent(s2);
		controller.readStudents();

	}

}
