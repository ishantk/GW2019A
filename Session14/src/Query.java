/* 
 * Ternary Operator
 * compareTo
 * logic to iterate in right diagonal
 *   0  1   2
 *  |--------
 * 0| 1  0  0 
 * 1| 0  0  1
 * 2| 1  0  1
 * 
 * int[][] arr = {///};
 * 
 * Left Diagonal : 0,0  1,1  2,2
 * Right Diagonal  0,2  1,1  2,0
 * 
 * for(int i=0;i<3;i++){
 * 		arr[i][i]
 * }
 * 
 * int j = 2;
 * for(int i=0;i<3;i++){
 * 		arr[i][j]
 * 		j--;
 * }
 * 
 * Enhanced For Loop
 * 
 * CTP
 */

public class Query {
	


	public static void main(String[] args) {
		
		int n1 = 100;
		int n2 = 20;
		
		int n3 = (n1 > n2) ? n1 : n2;   // ? :
		System.out.println("Larger Number is: "+n3);
		
		String s1 = "Hello";	//  1 2 3 3 4
		String s2 = "Hello";	//  1 2 3 3 4
								//  0+0+0+0+0 = 0
		if(s1.compareTo(s2) == 0){
			
		}
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int elm : arr){
			System.out.println(elm);
		}
		
		int[] a1 = new int[5]; 		// Java
		//int *ptr = new int[5]; 	// C++
	}

}
