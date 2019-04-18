//class Point extends Object{
class Point {
	
	int x;
	int y;
	
	Point(){
		x = 10;
		y = 20;
		System.out.println(">> Point Object Constructed");
	}
	
	// Override
	public String toString(){
		return "Point is: "+x+":"+y+" - "+super.toString();
		// super is a ref var which points to Parent Object
	}
}

public class ObjectClass {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println(p1.getClass());
		System.out.println(p1.getClass().getName());
		System.out.println(p1.hashCode());
		

	}

}
