
class Maths{
	
	// Overloading : Using same method name with different inputs
	/*
	 	Rule1: Method Name Should be Same
	 	Rule2: Inputs to Method must be different
	 		   2.1 Number of Inputs
	 		   2.2 Type of Inputs
	 		   2.3 Sequence of Inputs
	 	Rule3: Return type of Method has no role to play
	 */
	
	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println("Sum is: "+num3);
	}
	
	/* Rule3 : Error
	int addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		return num3;
	}
	*/
	void addNumbers(int num1, int num2, int num3){
		int num4 = num1 + num2 + num3;
		System.out.println("Sum is: "+num3);
	}
	
	/*
	Rule1: Error
	void addNumbers(int n1, int n2){
		int n3 = n1 + n2;
		System.out.println("Sum is: "+n3);
	}*/
	
	void addNumbers(double num1, double num2){
		double num3 = num1 + num2;
		System.out.println("Sum is: "+num3);
	}
	
	void addNumbers(float num1, float num2){
		float num3 = num1 + num2;
		System.out.println("Sum is: "+num3);
	}
	
	void addNumbers(int num1, double num2){
		double num3 = num1 + num2;
		System.out.println("Sum is: "+num3);
	}
	
	void addNumbers(double num1, int num2){
		double num3 = num1 + num2;
		System.out.println("Sum is: "+num3);
	}
	
	
}



// Compile Time Polymorphism
public class CTP {

	public static void main(String[] args) {
		
		Maths mRef = new Maths();
		mRef.addNumbers(10, 20);
		mRef.addNumbers(10, 20, 30);
		mRef.addNumbers(2.22, 3.33);
		mRef.addNumbers(2.22f, 3.33f);
		mRef.addNumbers(1.1, 2);
		mRef.addNumbers(2, 3.3);
		
		// Binding : Done by Compiler. Linking of Method Execution call with its definition

	}

}
