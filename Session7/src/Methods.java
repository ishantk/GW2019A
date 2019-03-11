
public class Methods {
	
	// method : Non Static Method -> Executed with Objects
	
	// Write a Method : addNumbers
	void addNumbers(int a1, int a2){
		int sum = a1 + a2;
		
		System.out.println("=========================");
		System.out.println("sum of "+a1+" and "+a2+" is: "+sum);
		if(sum>15){
			System.out.println(">> Grade A");
		}else{
			System.out.println(">> Grade B");
		}
		System.out.println("=========================");
		System.out.println();
	}
	
	// method : Static Method -> Executed with Classes
	static void addNumbers1(int a1, int a2){
		int sum = a1 + a2;
		
		System.out.println("=========================");
		System.out.println("sum of "+a1+" and "+a2+" is: "+sum);
		if(sum>15){
			System.out.println(">> Grade A");
		}else{
			System.out.println(">> Grade B");
		}
		System.out.println("=========================");
		System.out.println();
	}
	
	int multiplyNumbers(int x, int y){
		int result = x*y;
		return result; // Last Statement
	}
	
	int fun(int x){
		int y = x+1;
		return y;
	}
	

	public static void main(String[] args) {
		
		// Use Case : Summing up marks of 2 subjects for a student
		/*int a1 = 10;
		int a2 = 3;
		
		int sum = a1+a2;
		
		System.out.println("sum of "+a1+" and "+a2+" is: "+sum);
		
		if(sum>15){
			System.out.println(">> Grade A");
		}else{
			System.out.println(">> Grade B");
		}
		
		a1 = 11;
		a2 = 12;
		sum = a1+a2;
		System.out.println("sum of "+a1+" and "+a2+" is: "+sum);
		
		if(sum>15){
			System.out.println(">> Grade A");
		}else{
			System.out.println(">> Grade B");
		}*/
		
		// Challenge : For 10 such calculations we have to re-write the same code again and again
		
		//1. Create Object of class Methods
		Methods mRef = new Methods(); // Object Construction Statement
		mRef.addNumbers(10, 3); // Execution of Method
		mRef.addNumbers(11, 12);
		mRef.addNumbers(15, 17);
		mRef.addNumbers(1, 1);
		mRef.addNumbers(5, 5);
		
		Methods.addNumbers1(11, 13);
		Methods.addNumbers1(22, 11);
		
		int r = mRef.multiplyNumbers(10, 20);
		System.out.println("r is: "+r);
		System.out.println(mRef.multiplyNumbers(11, 12));
		
		System.out.println(mRef.fun(10));
		
	}

}
