
class Parent{
	
	Parent(){
		System.out.println(">> Parent Object Constructed");
	}
	
	public void purchaseBike(){
		System.out.println(">> Lets purchase Bajaj Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println(">> Lets buy Maruti");
	}
}

class Child extends Parent{
	
	Child(){
		System.out.println(">> Child Object Constructed");
	}
	
	// Overriding : Customization -> Object to Object
	public void purchaseBike(){
		System.out.println(">> Lets purchase Royal Enfield");
	}
	
	// Hiding : Customization	  -> Class to Class
	static void purchaseCar(){
		System.out.println(">> Lets buy Honda");
	}
}

public class Overriding {

	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.purchaseBike();

		Child.purchaseCar();
	}

	// Rules to Overriding:
	// 1. Method Name and Signature must be same in Parent and Child
	// 2. Access Modifier to override parent's method must be same or higher of child's method
	// private > default > protected > public
}
