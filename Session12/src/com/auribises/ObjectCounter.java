package com.auribises;

class Point{
	
	static int count=0;
	
	Point(){
		count++;
	}
	
	static void showPointObjectCount(){
		System.out.println("Point Objects Count : "+count);
	}
	
}

public class ObjectCounter {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = p1;
		Point p4 = new Point();
		Point p5 = p2;
		
		Point.showPointObjectCount(); // Point Objects Count : 3

	}

}
