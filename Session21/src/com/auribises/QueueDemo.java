package com.auribises;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		//System.out.println("Queue size is: "+queue.size());
		
		// (Head)10 9 8 7 6 5 4 3 2 1(Tail)
		
		// PQ will sort the data
		// (Head)1 2 3 4 5 6 7 8 9 10(Tail)
		
		/*
		// peek is getting head of Queue
		System.out.println(">> Head of Queue is: "+queue.peek()); // 1
		// poll is removing Head of Queue
		queue.poll();
		System.out.println(">> Head od Queue is: "+queue.peek()); // 2
		
		System.out.println(">> Size is: "+queue.size());
		*/
		
		for(int i=1;i<=queue.size();i++){
			System.out.println(">> "+queue.peek());
			queue.poll();
		}
		
		// JDBC:
		// 1. Fetch data from Table and create an Object and add it in ArrayList / Set / Queue
		
		// Files:
		// 1. Read a .java file and list out all the objects in that source file
		// 2. Also list classes of those objects with count of objects in ArrayList
		
		// RTP:
		// 1. Create RTP Program from Zomato/Swiggy
		
		// Inheritance:
		// 1. Use RTP program of Zomato/Swiggy
		// 2. Create a Cart
		// 3. Add Dishes in Cart
		// 4. Show the total amount of pricing to the user
		
		// Exception handling
		// 1. Create a UserDefined Checked Exception and throw it from a method
		// 2. Method shall have a logic if user has ordered product quantity greater than 99
	}
	

}
