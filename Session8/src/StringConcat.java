
public class StringConcat {

	public static void main(String[] args) {
		
		String salutation = "Mr.";
		String name = "John";
		
		//String greet = "Hello "+ salutation + name;
		String greet = "Hello ".concat(salutation).concat(name);
		System.out.println("greet is: "+greet);

	}

}
