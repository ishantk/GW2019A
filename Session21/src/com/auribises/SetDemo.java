package com.auribises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<String>();
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		set.add("John");
		set.add("Fionna");
		set.add("Daisy");
		set.add("Sia");
		set.add("Kim");
		set.add("Leo");
		set.add("Fionna");
		set.add("Sia");
		
		System.out.println("set is: "+set);
		// Hashing technique is used to store data rather than indexing
		// Due to hashing data is unordered
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(name);
		}
		
		if(set.contains("Fionna")){
			System.out.println(">> Fionna is in thge set");
		}
		
		System.out.println("set size is: "+set.size());
		
		set.remove("Fionna");
		
		System.out.println("set is: "+set);
		
		set.clear();
		
		System.out.println("set is: "+set);
		
	}

}
