package com.auribises;

// T is a data type which can be any data type of your choice at run time
// T is a Reference Type
// T can be any name of your choice
//class Calculator<T>{
class Calculator<T, U>{
	
	T num1;
	U num2;
	
	Calculator(){
		num1 = null;
		num2 = null;
	}
	
	void setData(T num1, U num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Overload the Method : But this didint work for us.
	// As attributes are integers
	/*void setData(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}*/
	
	void showData(){
		System.out.println(">> num1 is: "+num1+" and num2 is: "+num2);
	}
}

public class Generics {

	public static void main(String[] args) {
		
		/*Calculator<Integer> cRef1 = new Calculator<Integer>();
		cRef1.setData(10, 20);
		cRef1.showData();
		
		Calculator<String> cRef2 = new Calculator<String>();
		cRef2.setData("John", "Jennie");
		cRef2.showData();*/
		
		Calculator<Integer, String> cRef1 = new Calculator<Integer, String>();
		cRef1.setData(10, "Hello");
		cRef1.showData();
		
	}

}
