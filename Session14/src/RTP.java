/*class Cab{
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(String source, String destinition){
		System.out.println(">> Cab Booked from "+source+" to "+destinition);
	}
}*/

// Improvement in RTP Model
/*abstract class Cab{
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// abstract method is created in abstract class
	// abstract method has no definition
	// abstract method is a rule or protocol by Parent
	abstract void bookCab(String source, String destinition);
}*/

//Improvement in RTP Model to the finest level
interface Cab{
	
	// Error : Neither we nor RTE(JVM) can create objects of interface
	/*Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// abstract method is created in abstract class or interface
	// abstract method has no definition
	// abstract method is a rule or protocol by Third Person
	void bookCab(String source, String destinition); // public abstract void bookCab(String source, String destinition);
}


class MicroCab implements Cab{//extends Cab{
	
	MicroCab(){
		System.out.println(">> MicroCab Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> MicroCab Booked from "+source+" to "+destinition);
	}
	
}

class MiniCab implements Cab{//extends Cab{
	
	MiniCab(){
		System.out.println(">> MiniCab Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> MiniCab Booked from "+source+" to "+destinition);
	}
	
}

class SedanCab implements Cab{//extends Cab{
	
	SedanCab(){
		System.out.println(">> SedanCab Object Constructed");
	}
	
	public void bookCab(String source, String destinition){
		System.out.println(">> SedanCab Booked from "+source+" to "+destinition);
	}
	
}


public class RTP {

	public static void main(String[] args) {

		/*
		Cab cRef;
		cRef = new Cab();
		cRef.bookCab("Auribises", "MBD Mall");
		*/
		
		/*
		MiniCab mRef = new MiniCab();
		mRef.bookCab("Auribises", "MBD Mall");
		*/
		
		Cab cRef;
		
		cRef = new MiniCab(); // Polymorphic Statement
		// Ref Var of Parent is Pointing to Object of Child
		// Ref Var of interface is Pointing to Object of which implements it
		cRef.bookCab("Auribises", "MBD Mall");
		
		System.out.println();
		
		cRef = new MicroCab();
		cRef.bookCab("Auribises", "MBD Mall");

		System.out.println();
		
		cRef = new SedanCab();
		cRef.bookCab("Auribises", "MBD Mall");
		
		// Object Construction of Cab Object is Meaningless
		System.out.println();
		//cRef = new Cab(); // Making Cab class as abstract we have limited its Object Construction
		//cRef.bookCab("Auribises", "MBD Mall");

	}

}
