package com.auribises;

class Point{
	
	int x;
	int y;
	
	Point(){
		x = 10;
		y = 20;
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void showPoint(){
		System.out.println(">> Point is: "+x+" : "+y);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(11, 19);
		Point p3 = new Point(101, 109);
		
		p1.showPoint();
		p2.showPoint(); 
		p3.showPoint();
		
		// this is a reference variable which we use in methods/constructors
		// this will contain HashCode i.e. Reference to the Current Object in Action
	}

}
