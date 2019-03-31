class ZA{
	
	int a; 			// Property of Object
	static int b; 	// Property of Class
	
	ZA(){
		a = 10;
		b = 20;
		System.out.println(">> ZA Object Constructed");
	}
	
	// Property of Object
	void showObjectData(){
		System.out.println("a is: "+a);
	}
	
	// Property of Class
	static void showClassData(){
		System.out.println("b is: "+b);
	}
}

class ZB extends ZA{
	ZB(){
		System.out.println(">> ZB Object Constructed");
	}
}

//Rule#3 : Object to Object and Class to Class
public class InheritanceTypes {

	public static void main(String[] args) {

		ZB zRef = new ZB();
		
		ZB.showClassData();
		
		
		zRef.showObjectData();
		zRef.showClassData();
		
	}

}

/*
  Types of Inheritance
	1. Object to Object
	2. Class to Class


	1. Single Level
	A
	|
	B

	class A{

	}

	class B extends A{

	}

	2. Multi Level
	A
	|
	B
	|
	C

	class A{

	}

	class B extends A{
	
	}

	class C extends B{
	
	}

	3. Heirarchy
	A
	|
  B   C

    class A{

    }	

    class B extends A{

    }

    class C extends A{

    }

    4. Multiple 
    A     B
       |
       C

       4.1 Multiple Inheritance is not supported in Java
       4.2 But it is supported with interfaces

    5. Hybrid
    A
    |
    B
    |
    C
    |
  D    E
  	|
  	F

  		virtual
  			Virtual Table		| VTBL
  			Virtual Pointer		| VPTR

*/
