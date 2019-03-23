class Point{
	
	// Attributes: Property of Object
	private int x;
	private int y;
	
	// Methods: Property of Object
	
	// Default Constructor
	// Name is same as that of class name
	// It has no Return Type
	Point(){
		x = 11;
		y = 13;
	}
	
	// Parameterized Constructor
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Writer
	void setPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// Setters
	void setX(int x){
		this.x = x;
	}
	
	void setY(int y){
		this.y = y;
	}
	
	// Reader
	void showPoint(){
		System.out.println(">> Point is: "+x+" : "+y);
	}
	
	// Getters
	int getX(){
		return x;
	}
	
	int getY(){
		return y;
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.setPoint(10, 20);
		p2.setX(100);
		p2.setY(200);
		
		p1.showPoint();
		System.out.println(">> Point is: "+p2.getX()+" : "+p2.getY());
		
		Point p3 = new Point(); //Point(); -> Execution of Default Constructor
		p3.showPoint();
		
		Point p4 = new Point(111, 333);
		p4.showPoint();
		

	}

}
