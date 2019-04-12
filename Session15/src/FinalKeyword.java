// We cannot inherit a final class
final class Parent{
	
	// We cannot override a final method
	final void show(){
		System.out.println(">> This is show of Parent");
	}
}

class Child{// err-> extends Parent{
	/*void show(){
		System.out.println(">> This is show of Child");
	}*/
}


public class FinalKeyword {

	public static void main(String[] args) {
		int i = 10;
		i = 100; // update operation
		
		// Which cannot be modified
		final int j = 10;
		//j = 100; // update operation not allowed
		
		// Blank Final Variable
		final int k;
		k = 10;
		//k = 100; // error
		
	}

}
