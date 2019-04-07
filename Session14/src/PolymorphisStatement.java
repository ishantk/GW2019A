class CA{
	/*void show(){
		System.out.println("This is show of CA");
	}*/
}

class CB extends CA{
	void show(){
		System.out.println("This is show of CB");
	}
}

public class PolymorphisStatement {

	public static void main(String[] args) {
		
		CA cRef = new CB();
		//cRef.show(); // error in case Parent has no method show
		// Rule: Child must override show of Parent 

	}

}
