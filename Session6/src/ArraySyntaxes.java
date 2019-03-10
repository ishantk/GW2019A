
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// Implicit Syntax
		int[] a1 = {10, 20, 30, 40, 50}; // -> int[] a1 = new int[]{10, 20, 30, 40, 50};
		int a2[] = {10, 20, 30, 40, 50}; // -> int a2[] = new int[]{10, 20, 30, 40, 50};
		
		// Explicit Syntax
		int[] a3 = new int[]{10, 20, 30, 40, 50};
		int a4[] = new int[]{10, 20, 30, 40, 50};
		
		// new is an operator which creates Array dynamically (Run-Time) in Heap Memory
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		System.out.println("a3 is: "+a3);
		System.out.println("a4 is: "+a4);
		
		// Create an Array with n elements having value as 0
		int[] a5 = new int[5];
		int a6[] = new int[10];
		
		System.out.println("a5 is: "+a5);
		System.out.println("a6 is: "+a6);
		
		// Update Data in Array
		a5[1] = 111;
		a6[3] = 333;
		
		for(int i=0;i<a5.length;i++){
			System.out.print(a5[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a6.length;i++){
			System.out.print(a6[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Size of a1 is: "+a1.length);
		System.out.println("Size of a2 is: "+a2.length);
		System.out.println("Size of a3 is: "+a3.length);
		System.out.println("Size of a4 is: "+a4.length);
		System.out.println("Size of a5 is: "+a5.length);
		System.out.println("Size of a6 is: "+a6.length);
		
		// Enhanced For Loop - ForEach Loop | Syntatical Easier Approach
		for(int elm : a6){
			System.out.print(elm+" ");
		}
		
		System.out.println();
	}

}
