// Textual Representation how my User Object will look like in memory
// Whatever we write in class is property of Object and not of class
class User{
	
	// Attributes: Property of Object
	String name;
	String phone;
	String email;
	int age;
	char gender;
	String address;
	
}

public class App {

	public static void main(String[] args) {
		
		int i = 10;
		
		// Object Construction Statement
		User uRef1 = new User();
		User uRef2 = new User();
		User uRef3 = uRef1; 	// Reference Copy
		
		System.out.println("i is: "+i);
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
		
		// uRef1 is not an Object. 
		// It is a Reference Variable which is referring to User Object in Heap
		
		// Write Data in Object
		uRef1.name = "John";
		uRef3.phone = "+91 99999 88888";
		uRef3.email = "john@example.com";
		uRef1.age = 20;
		uRef1.gender = 'M';
		uRef1.address = "Redwood Shores";
		
		uRef2.name = "Fionna";
		uRef2.phone = "+91 77777 88888";
		uRef2.email = "fionna@example.com";
		uRef2.age = 22;
		uRef2.gender = 'F';
		uRef2.address = "Country Homes";
		
		System.out.println();
		
		// Read Data from Object
		System.out.println(uRef1.name+" lives in "+uRef1.address);
		System.out.println(uRef3.name+" can be contacted at "+uRef1.phone+" or "+uRef1.email);
		
		System.out.println();
		
		System.out.println(uRef2.name+" lives in "+uRef2.address);
		System.out.println(uRef2.name+" can be contacted at "+uRef2.phone+" or "+uRef2.email);

	}

}
