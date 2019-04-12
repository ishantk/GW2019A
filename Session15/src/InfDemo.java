interface Inf1{
						// static -> property of interface
	int i = 10; 		// public static final int i = 10;
	
	int show();			// public abstract void show();
	void fun();			// public abstract void fun();
}

interface Inf2{
	void fun();
	void bye();
}

// Multiple Inheritance
interface Inf3 extends Inf1, Inf2{
	
}

// Interfaces are not inherited. They are only implemented !!
// Interfaces are protocols or Rule Books which object will implement !!
class CA implements Inf3{ // Inf1, Inf2{

	public int show() {
		System.out.println("This is show of CA");
		return 0;
	}
	
	public void fun() {
		System.out.println("This is show of CA");
	}
	
	public void bye() {
		System.out.println("This is bye of CA");
	}
	
	void hello(){
		System.out.println("This is hello of CA");
	}
	
}


public class InfDemo {

	public static void main(String[] args) {
		
		// Ref Var of Interface can point to the object which implements it
		/*Inf1 iRef1 = new CA(); // iRef1 Contains hashCode of CA object
		iRef1.show();
		iRef1.fun();
		//iRef1.hello(); //error
		
		System.out.println(">> iRef1 is: "+iRef1);
		
		CA cRef = (CA)iRef1; // Downcasting
		cRef.hello();
		
		System.out.println(">> cRef is: "+cRef);
		
		System.out.println(">> Inf1 i is: "+Inf1.i);
		System.out.println(">> CA i is: "+CA.i);
		
		Inf2 iRef2 = cRef;	// Casting : Polymoprhic Statement
		iRef2.fun();
		iRef2.bye();
		//iRef2.hello(); 	// error
		//iRef2.show();    	// error
		 */
		
		Inf3 iRef3 = new CA();
		iRef3.show();
		iRef3.fun();
		iRef3.bye();
		System.out.println("i is: "+Inf3.i);
		//iRef3.hello();
		
		
	}

}
