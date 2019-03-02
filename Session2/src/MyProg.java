
// Application is known by the name of MyProg, Because MyProg contains main method
public class MyProg {

	// Whatever statements in java we write in main
	// shall be executed
	// execution shall happen sequentially
	public static void main(String[] args) {
		
		// Print Statement : To Show something to User
		System.out.println(">> Hello World");
		
		// Container Creation Statement : To Create a container with data in memory
		int a = 10;
		int b = 20;
		int c = a+b;
		
		// Array : Multi Value Container
		int[] ages = {12, 33, 67, 45, 37};
		
		System.out.println("Sum of "+a+" and "+b+" is: "+c);
		System.out.println("ages is: "+ages); // HashCode as an output | 7852e922
		System.out.println("ages[0] is: "+ages[4]);
		
		// a, b and c are called single value containers : Primitive Types : They hold value
		// ages is a multi value container : Reference Types : They hold HashCodes
		
		System.out.println(">> Bye World");
		
	}

}

class One{
	
}
