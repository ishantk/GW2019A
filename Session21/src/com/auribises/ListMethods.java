package com.auribises;

import java.util.ArrayList;

public class ListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Daisy");
		names.add("Fionna");
		names.add("George");
		names.add("Mike");
		
		names.set(4, "Leo");
		
		System.out.println(names);
		
		if(names.contains("Mike")){
			System.out.println("Mike is in names");
		}
		
		int index = names.indexOf("Fionna");
		System.out.println("index is: "+index);
		
		ArrayList<String> moreNames = new ArrayList<String>();
		moreNames.add("Sia");
		moreNames.add("Kim");
		moreNames.add("Ria");
		
		names.addAll(moreNames);
		System.out.println("names is: "+names);
		System.out.println("moreNames is: "+moreNames);
		
		names.clear(); // remove all elements
		System.out.println("names is: "+names);
		

	}

}
