
public class BreakContinue {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			
			System.out.println(">> i is: "+i);
			
			if(i==5){
				break; // Terminate the Loop
			}
		}
		
		System.out.println();
		
		for(int i=1;i<=10;i++){
			
			if(i<=5){
				continue;
			}
			
			System.out.println(">> i is: "+i);
		}

	}

}
