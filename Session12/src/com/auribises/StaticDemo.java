package com.auribises;

class Counter{
	
	// Attribute
	int count;				// Property of Object
	static int scount;		// Property of Class
	
	// Default Constructor
	Counter(){
		count = 1;
		scount = 1;
	}
	void incrementCount(){
		count++;
		scount++;
	}
	void showCount(){
		System.out.println("count is: "+count+"  and scount is: "+scount);
	}
	
	// Property of Class
	static void showSCount(){
		//System.out.println("count is: "+count+"  and scount is: "+scount);
		System.out.println("scount is: "+scount);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Counter c1 = new Counter(); // 1   1
		Counter c2 = new Counter(); // 1   1
		Counter c3 = c1; // Reference Copy
		
		c1.incrementCount(); // 2  2
		c2.incrementCount(); // 2  3
		c3.incrementCount(); // 3  4
		
		c1.incrementCount(); // 4  5
		c3.incrementCount(); // 5  6
		 
		c2.incrementCount(); // 3  7
		
		Counter c4 = new Counter();
		
		Counter.scount = 111;
		c1.scount = 222;  // Object and Reference to Object can access Property of Class
		
		//Counter.count = 222; // error | Class cannot access the property of Object
		
		c1.showCount();	// count is: 5 and scount is: 1
		c2.showCount(); // count is: 3 and scount is: 1
		c3.showCount(); // count is: 5 and scount is: 1
		c4.showCount(); // count is: 1 and scount is: 1
		
		c1.showSCount();
	}

}
