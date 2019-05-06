package com.auribises;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map  = new HashMap<Integer, String>();
		//      KEY		 VALUE
		HashMap<Integer, String> map  = new HashMap<Integer, String>();
		
		map.put(434, "Sia");
		map.put(101, "John");
		map.put(767, "Daisy");
		map.put(789, "Harry");
		map.put(121, "John");
		
		map.put(null, "Kim");
		map.put(123, null);
		
		map.put(434, "Fionna"); // Update operation
		
		System.out.println(">> map is: "+map); // We will get unordered output
		
		
		System.out.println("size of map is: "+map.size());
		map.remove(121);
		System.out.println(">> map is: "+map);
		
		String name = map.get(434);
		System.out.println(">> name is: "+name);
		
		if(map.containsKey(123)){
			System.out.println("123 key exists in map");
		}
		if(map.containsValue("Kim")){
			System.out.println("Kim is in the map");
		}
		
		Set<Integer> keys = map.keySet();
		System.out.println(">> keys in the map: "+keys);
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println("Key: "+key+"\tValue: "+value);
		}

		// THREAD-SAFE or Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(434, "Sia");
		table.put(101, "John");
		table.put(767, "Daisy");
		table.put(789, "Harry");
		table.put(121, "John");
		//table.put(null, "Jim"); no null key allowed
		//table.put(454, null);	  no null value allowed
		
		System.out.println(">> table is: "+table);
		
	}

}

// Assignment : 
// Create an ArrayList<Employee> and sort it on the basis of their attributes as entered by user
// Employee : eid, name, salary, experience, designation
// API : Explore Comparator API to perform the above job











