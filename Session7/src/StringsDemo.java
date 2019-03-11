
public class StringsDemo {

	// main is a method which will execute when we will run(execute) our java program
	// Anything written in main shall be executed in a sequence
	public static void main(String[] args) {
		
		// Single Value Container : ch
		// Content : A
		// Size    : 2 Bytes
		char ch = 'A';
		
		// Multi Value Container  : arr
		// Contents : HashCode
		// Size	    : How much data is thr in Container
		char[] arr = {'H','E','L','L','O'};
				   //  0   1   2   3   4

		// Update Data in Container:
		ch = 'Z';
		arr[0] = 'A';

		System.out.println("ch is: "+ch);		// Z
		System.out.println("arr is: "+arr);		// HashCode
		
		//System.out.println("arr[0] is: "+arr[0]);
		//System.out.println("arr[3] is: "+arr[3]);
		
		/*for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}*/
		
		// Enhanced For Loop
		for(char c : arr){
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		// Interned Strings
		String s1 = "Hello";
		String s2 = "Hello";
		
		// Object Strings
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		// s1, s2, s3 and s4 are Reference Variables
		
		// When We will print ref variables of String we are expecting HashCodes but we are able to see data
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
		
		/*System.out.println("s1.toString() is: "+s1.toString());
		System.out.println("s2.toString() is: "+s2.toString());
		System.out.println("s3.toString() is: "+s3.toString());
		System.out.println("s4.toString() is: "+s4.toString());*/
		
		if(s1 == s2){
			System.out.println("s1 == s2");
		}else{
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4){
			System.out.println("s3 == s4");
		}else{
			System.out.println("s3 != s4");
		}
		
		// When we compare Strings, References are compared !!
		
		// equals method compares data for Strings!!
		
		if(s1.equals(s2)){
			System.out.println("s1 is equal to s2");
		}else{
			System.out.println("s1 is not equal to s2");
		}
		
		if(s3.equals(s4)){
			System.out.println("s3 is equal to s4");
		}else{
			System.out.println("s3 is not equal to s4");
		}
	}

}
