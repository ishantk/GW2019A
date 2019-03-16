
public class Methods {

	void show(){
		System.out.println("show is non static method");
	}
	
	static void bye(){
		System.out.println("bye is a static method");
	}
	
	public static void main(String[] args) {
		
		Methods m = new Methods();
		m.show();
				
		Methods.bye();

	}

}
