class CA{
	CA(){
		System.out.println(">> CA Object Constructed");
	}
}

class CB extends CA{ // IS-A Relation | CB IS-A CA
	CB(){
		System.out.println(">> CB Object Constructed");
	}
}


public class Inheritance {

	// Rule#1 : Before Child Object is Constructed Parent Object is Constructed
	//			JVM
	public static void main(String[] args) {
		
		// CA cRef = new CA();
		
		CB cRef = new CB();

	}

}
