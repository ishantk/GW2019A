
public class NestedLoops {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			
			//System.out.println(">> i is: "+i);
			//System.out.println(i);
			
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}
	
	/*
	 	HW:
	 
	 	1
	 	2 3
	 	4 5 6
	 	7 8 9 10
	 	11 12 13 14 15
	 	
	 	1
	 	1 1
	 	2 2 2
	 	3 3 3 3
	 	4 4 4 4 4
	 	
	 	5
	 	4 3
	 	3 2 1
	 	1 0 -1 -2
	 	-3 -4 -5 -6 -7
	 	
	 */

}
