package com.auribises;

class Student{
	int roll;
	String name;
	
	Student(){
		System.out.println(">> Student Object Constructed");
	}
	
	// When Object will be deleted form memory by Garbage Collector, finalize will be executed as destructor
	// CallBack : It wil be executed automatically
	protected void finalize() throws Throwable {
		System.out.println(">> Student Object Finalized");
	}
}

public class GCDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total Memory: "+rt.totalMemory());
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Max Memory: "+rt.maxMemory());
		
		s1 = null;
		s2 = null;
		
		System.out.println(">> Executing Garbage Collector");
		//rt.gc(); // Execute Garbage Collector
		System.gc();
		
		System.out.println("Total Memory: "+rt.totalMemory());
		System.out.println("Free Memory: "+rt.freeMemory());
		System.out.println("Max Memory: "+rt.maxMemory());

	}

}
