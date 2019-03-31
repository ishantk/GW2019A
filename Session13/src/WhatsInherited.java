class QA{
	
	// Attributes: Property of Object
	private int a;
	int b;
	protected int c;
	public int d;
	
	QA(){
		System.out.println(">> QA Object Constructed");
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
}

class QB extends QA{
	QB(){
		System.out.println(">> QB Object Constructed");
	}
}

// Rule#2 : other than private everything is Inherited as such 
public class WhatsInherited {

	public static void main(String[] args) {
		
		QB qRef = new QB();
		//System.out.println("a is: "+qRef.a);
		System.out.println("b is: "+qRef.b);
		System.out.println("c is: "+qRef.c);
		System.out.println("d is: "+qRef.d);

	}

}
