
public class MultiDimArray {

	public static void main(String[] args) {
		
		// 1-D ARRAY
		int[] a1 = {10, 20, 30, 40, 50};
		
		// 2-D ARRAY -> Array of Arrays
		int[][] a2 = {
						{10, 20, 30},			//0
						{10, 20, 30, 40},		//1
						{10, 20},				//2
						{10, 20, 30, 40, 50},	//3
						{10}					//4
					 };
		/*
		System.out.println("a1 is: "+a1+" and length is: "+a1.length);
		System.out.println("a2 is: "+a2+" and length is: "+a2.length);
		
		System.out.println("a2[0] is: "+a2[0]+" and length is: "+a2[0].length);
		System.out.println(a2[0][0]);
		*/
		
		for(int i=0;i<a2.length;i++){
			System.out.println("a2["+i+"] is: "+a2[i]+" and length is: "+a2[i].length);
		}
		
		System.out.println();
		
		for(int i=0;i<a2.length;i++){			// i:0 1 2 3 4
			for(int j=0;j<a2[i].length;j++){	// j:3 4 2 5 1
				System.out.print(a2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][][] a3 = {
						{
							{10, 20, 30},			//0
							{10, 20, 30, 40},		//1
							{10, 20},				//2		// 0
							{10, 20, 30, 40, 50},	//3
							{10}					//4
						},
						{
							{10, 20, 30},			//0
							{10, 20, 30, 40},		//1
							{10, 20},				//2		//1
							{10, 20, 30, 40, 50},	//3
							{10}					//4
						}
					};
		
		System.out.println();
		
		for(int i=0;i<a3.length;i++){			// i:0 1 2 3 4
			for(int j=0;j<a3[i].length;j++){	// j:3 4 2 5 1
				for(int k=0;k<a3[i][j].length;k++){
					System.out.print(a3[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 3, 1-D Arrays with each Array having 5 elements
		int[][] arr1 = new int[3][5];
		
		// 3, 1-D Arrays, with each Array yet to be defined for a size
		int[][] arr2 = new int[3][];
		arr2[0] = new int[5];
		arr2[1] = new int[50];
		arr2[2] = new int[25];

		arr2[0][1] = 111;
		arr2[1][0] = 222;
		arr2[2][2] = 333;
		
		// But all the elements will be 0
		for(int i=0;i<arr2.length;i++){			// i:0 1 2 3 4
			for(int j=0;j<arr2[i].length;j++){	// j:3 4 2 5 1
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		// N-Queen Problem
		// Assignment : Create a chess-board of 4 by 4
		//				All the elements on chess-board are 0's
		//			    int[][] chessBoard = new int[4][4];
		// 				Place 4 queens in each 1-D Array at any random position by substituting the data as 1
		/*
		 				0	1	0	0
		 				0	0	0	1
		 				0	0	1	0
		 				1	0	0	0
		 */
		
		
	}

}
