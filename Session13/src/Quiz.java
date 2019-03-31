class Bye{
	
	{
		System.out.println(">> This is Block of Bye");
	}
	
	static{
		System.out.println(">> This is static Block of Bye");
	}
	
	Bye(){
		System.out.println(">> Bye Object Constructed");
	}
}

public class Quiz {
	
	static{
		System.out.println(">> This is static Block of Quiz");
	}

	public static void main(String[] args) {
		
		System.out.println(">> main started");

		Bye bRef = new Bye();
		
		System.out.println(">> main finished");
	}

}
