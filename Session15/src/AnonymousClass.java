interface Inf{
	void hello();
}

class PQ implements Inf {
	public void hello(){
		System.out.println(">> This is hello in PQ");
	}
}

class QR implements Inf {
	public void hello(){
		System.out.println(">> This is hello in QR");
	}
}

public class AnonymousClass {

	public static void main(String[] args) {
	
		//Inf iRef = new PQ();
		//iRef.hello();
		
		Inf iRef1 = new QR();
		iRef1.hello();
		
		// Anonymous Class : Which has no name
		// its object will be created. Ref of Object shall be allocated to iRef
		Inf iRef = new Inf() {
			
			public void hello() {
				System.out.println(">> This is hello in PQ");
			}
		};

		iRef.hello();
		
		
		
	}

}
