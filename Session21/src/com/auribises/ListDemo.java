package com.auribises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		// Not Thread-Safe
		//ArrayList<String> list = new ArrayList<String>();
		List<String> list = new ArrayList<String>(); // Polymorphic Statement
		list.add("John");		// 0
		list.add("Jennie");
		list.add("John");
		list.add("Jack");
		list.add("Jim");
		list.add("Joe");		// n-1
		
		System.out.println("list is: "+list);
		
		// Thread-Safe i.e. Synchronized
		//list = new Vector<String>();
		Vector<String> vector = new Vector<String>();
		vector.add("John");		// 0
		vector.add("Jennie");
		vector.add("John");
		vector.add("Jack");
		vector.add("Jim");
		vector.add("Joe");		// n-1
		
		System.out.println("vector is: "+vector);
		
		// 1. Read All using for loop
		for(int i=0;i<list.size();i++){
			String name = list.get(i);
			System.out.println(name);
		}
		
		System.out.println();
		// 2. Read All using enhanced for loop
		for(String name : list){
			System.out.println(name);
		}
		
		System.out.println();
		// 3. Read All using Iterator API
		Iterator<String> itr = list.iterator();
		System.out.println(itr.next());
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		
		System.out.println();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		// 4. Read All using ListIterator API
		System.out.println();	
		ListIterator<String> listItr = list.listIterator();
		
		while(listItr.hasNext()){
			System.out.println(listItr.next());
		}
		
		System.out.println("----");
		
		while(listItr.hasPrevious()){
			System.out.println(listItr.previous());
		}
		
		System.out.println();
		ArrayList list1 = new ArrayList(); // Polymorphic Statement
		list1.add("John");		// 0
		list1.add(100);
		list1.add(2.2);
		list1.add("Jack");
		list1.add('A');
		list1.add("Joe");
		
		for(Object data : list1){
			System.out.println(data);
		}
		
	}

}
