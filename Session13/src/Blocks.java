public class Blocks {

	Blocks(){
		System.out.println(">> Blocks Object Constructed");
	}
	
	// Block : Executed Before Constructor is executed
	// Initializer Block
	{
		System.out.println(">> This is a Block");
	}
	
	// Static Block : Executed when class is loaded
	// Static Initializer Block
	static{
		System.out.println(">> This is a static Block");
	}
	
	public static void main(String[] args) {
		
		System.out.println(">> main Started");
		
		Blocks bRef1 = new Blocks();
		Blocks bRef2 = new Blocks();

		System.out.println(">> main finished");
	}

}
