// Assignment : Implement Caesar Cipher Encryption and Decryption Both
public class Operators {

	public static void main(String[] args) {
		
		int a = 60;
		int b = 60;
		
		// Arithmetic Operators
		// +, -, *, /, %
		
		int c = a % b;
		System.out.println("c is: "+c);
		
		// Conditional/Relational Operators | Compare Quantities and shall generate either true or false
		// >, <, >=, <=, ==, !=
		System.out.println("is a less than b? "+ (a != b) );
		
		// Increment and Decrement Operators
		a++;	// a = a + 1
		++a;	// a = a + 1
		a--;	// a = a - 1
		--a;	// a = a - 1
		
		System.out.println("a is: "+a);
		
		System.out.println("******");
		
		int d = ++a;
		System.out.println("d is: "+d); // 61  
		System.out.println("a is: "+a); // 61  
		
		// Assignment Operators
		// =, +=, -=, *=, /=
		int x = 10;
		x += 10; // x = x + 10;
		x++;
		x+=1;
		x%=3;
		System.out.println("x is: "+x);
		
		// Logical Operators
		// &&, ||, !
		int p = 100;
		int q = 20;
		int r = 30;
		
		//System.out.println("Is r greatest? "+(r>p && r>q));
		System.out.println("Is r greatest? "+!(r>p || r>q));
		
		// Bitwise Operators
		int num1 = 9;				// 0 0 0 0 1 0 0 1
		int num2 = 11;  			// 0 0 0 0 1 0 1 1
		int num3 = num1 & num2;		// 0 0 0 0 1 0 0 1
		int num4 = num1 | num2;		// 0 0 0 0 1 0 1 1
		int num5 = num1 ^ num2;		// 0 0 0 0 0 0 1 0
		System.out.println("num3 is: "+num3);
		System.out.println("num4 is: "+num4);
		System.out.println("num5 is: "+num5);
		
		// Shift Operators
		int num6 = num1 >> 2;		// 0 0 0 0 1 0 0 1 (Left to Right Shift)
								    // 0 0 0 0 0 0 1 0
		System.out.println("num6 is: "+num6);
		
		int num7 = num2 >> 2;
		System.out.println("num7 is: "+num7); // 2
		int num8 = num2 << 2;				  // 0 0 0 0 1 0 1 1 (Right to Left Shift)
		System.out.println("num8 is: "+num8); // 0 0 1 0 1 1 0 0
		int num9 = num8 >> 2;
		System.out.println("num9 is: "+num9); // 11
		
		int n1 = -13;					  // 1 0 1 1 -> 0 1 0 0 -> +1 -> 0 1 0 1	
		int n2 = n1 >> 2;				  // 0 1 0 1 >> 2 -> _ _ 0 1 -> 1 1 0 1
		System.out.println("n2 is: "+n2); // 1 1 0 1 -> 0 0 1 0 + 1 -> 0 0 1 1 -> -3
		
		int n3 = 12 >> 2;
		System.out.println("n3 is: "+n3);
		int n4 = 12 << 2;
		System.out.println("n4 is: "+n4);
		
		// Misc Operators !!
		// . ?:

	}

}
