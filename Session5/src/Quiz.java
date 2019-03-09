/*
 
 	How many bricks you want? N = 7
 	John | Jack
 	
 	John : 1		1
 	Jack : 2		3
 	John : 2		5
 	Jack : 4		9  -> 2
 	
 	Q1 Who will plant the last brick ?
 	A1 Jack
 	Q2 How many bricks ?
 	A1 2
 
 */


public class Quiz {

	public static void main(String[] args) {
		
		int num=5;
		int i=1;
		int x=10;
		
		for(i=3;i<=5;i++){
			System.out.println("i is: "+i);		// 3 | 4 | 5
			x++;
		}
		
		System.out.println();
		
		System.out.println("num is: "+num);  // 5
		System.out.println("i is: "+i);		 //	6
		System.out.println("x is: "+x);		 //	13
		
		System.out.println();
		
		outer:
		for(i=1;i<=5;i++){
			
			System.out.println(">>For i: "+i);
			
			inner:
			for(int j=1;j<=3;j++){
				
				System.out.println(j+" ");
				
				if(i == 2){
					break outer;
				}
				
			}
			
		}
		
		// Explore continue with labels
		
		System.out.println("===John and Jack Problem==");
		
		int N=11;
		int john=1;
		int jack=0;
		int count = 0;
		
		for(john=1;john<=N;john++){
			
			count = count + john;
			
			if(count>=N){
				System.out.println("** John Planted "+(count-N)+" Brick(s) Lastly out of "+john+" Brick(s) !!");
				break;
			}else{
				System.out.println("** John Planted "+john+" Brick(s)");	
			}
			
			jack = john*2;
			count = count + jack;
			
			if(count>=N){
				System.out.println(">> Jack Planted "+(count-N)+" Brick(s) Lastly out of "+jack+" Brick(s) !!");
				System.out.println("== Total of "+N+" Bricks Wall Constructed ==");
				break;
			}else{
				System.out.println(">> Jack Planted "+jack+" Brick(s)");
			}
		}

	}

}
