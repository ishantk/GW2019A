
public class WrapperClasses {

	public static void main(String[] args) {

		// Primitive Type : SVC
		int i = 10;
		
		// We can convert Primitive type into Objects i.e. Reference Types
		Integer iRef = new Integer(10);	// BOXING
		
		// Getting data back from Object into Primitive
		int k = iRef.intValue();		// UN-BOXING
		
		System.out.println(">> k is: "+k);
		
		char ch = 'A';
		
		Character chRef = new Character(ch); // BOXING
		char c = chRef.charValue();			 // UN-BOXING
		
		double d = 2.2;
		Double dRef = new Double(d);
		double e = dRef.doubleValue();
		
		int x = 10;
		Integer xRef = x; 	// AUTO-BOXING | Integer xRef = x; -> Integer xRef = new Integer(x);
		
		int y = xRef;		// AUTO-UNBOXING | int y = xRef; -> int y = xRef.intValue();
		
	}

}
