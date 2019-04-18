
public class Exceptions {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		int[] arr = {10, 20, 30, 40, 50};
		int a=10,b=0,c=0;
		
		try{
			c = a/b;
			System.out.println(">> arr[7] is: "+arr[7]);
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			//System.out.println(">> Some Error Occurred");
			System.out.println(">> Some Error Occurred "+aRef);
		}catch(ArithmeticException kuchbhi){
			//System.out.println(">> Some Error Occurred");
			System.out.println(">> Some Error Occurred "+kuchbhi);
		}*/
		catch(Exception e){
			//System.out.println("Some Excetion: "+e);
			e.printStackTrace();
		}
		finally{
			System.out.println("This is important");
		}
		System.out.println(">> c is: "+c);
		
		// Run Time Error or Exception : App shall crash
		
		System.out.println(">> App Finished");

	}

}
