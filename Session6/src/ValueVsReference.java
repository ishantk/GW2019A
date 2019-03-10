
public class ValueVsReference {

	public static void main(String[] args) {
		
		int x = 10;
		int y = x;	// VALUE COPY
		
		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		
		++x;
		
		System.out.println("x now is: "+x);
		System.out.println("y now is: "+y);
		
		int[] a1 = {10, 20, 30, 40 ,50};
		int[] a2 = {10, 20, 30, 40 ,50};
		int[] a3 = a1;	// REFERENCE COPY
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		System.out.println("a3 is: "+a3);
		
		a1[1] = 111;
		a1[3] = 333;
		a1[4] = 444;
		
		for(int elm : a3){
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		for(int elm : a1){
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		for(int elm : a2){
			System.out.print(elm+"  ");
		}

	}

}
