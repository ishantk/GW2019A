class One{
	
}

public class MyProg {

	// Anything which we write in main method will be executed by main thread of Process
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// 1. Create a Storage Container and Writing the data in it
		byte age = 10;
		
		// 2. Update Data in Storage Container
		age = 30;
		
		// 3. Read Data from Storage Container
		System.out.println("Age is: "+age);
		
		// 4. Delete the Storage Container : it will be deleted automatically !!
		
		//char ch = 65;
		//char ch = '\u0A13';
		char ch = 'ਓ';
		System.out.println("ch is: "+ch);
		
	}

}

class Two{
	
	class Three{
		
	}
	
}
