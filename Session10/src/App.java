// Textual Description how an Object will look like in memory
class Product{
	// Attributes : Property of Object
	int pid;
	String name;
	private String brandName;
	int price;
	
	
	// Methods : Property of Object
	
	// Writer/Setter Method : To Write the Data into Object
	void writeDataForProduct(int p, String n, String b, int pr){
		pid = p;
		name = n;
		brandName = b;
		price = pr;
	}
	
	// Reader/Getter Method : To Read the Data from Object
	void readDataFromProduct(){
		System.out.println();
		System.out.println("================================");
		System.out.println(name+" is priced at \u20b9"+price);
		System.out.println("================================");
		System.out.println();
	}
}


public class App {

	public static void main(String[] args) {
		
		// Object Construction Statement
		Product pRef1 = new Product();
		Product pRef2 = new Product();
		// pRef1 and pRef2 are not Objects. They are Reference Variables which referes to the Object
		// They contain HashCode of Object.
		
		// Reference Copy
		Product pRef3 = pRef1; 
		
		System.out.println("pRef1 is: "+pRef1);
		System.out.println("pRef2 is: "+pRef2);
		System.out.println("pRef3 is: "+pRef3);
		
		
		// Write Data in Product Object:
		pRef1.pid = 1001;
		pRef3.name = "iPhoneX";
		//pRef1.brandName = "Apple";
		pRef3.price = 80000;
		
		pRef2.pid = 2001;
		pRef2.name = "Galaxy S10";
		//pRef2.brandName = "Samsung";
		pRef2.price = 70000;
		
		// Read Data from Object
		//System.out.println(pRef1.name+" is priced at \u20b9"+pRef3.price);
		//System.out.println(pRef2.name+" is priced at \u20b9"+pRef2.price);
		
		//System.out.println(pRef1.name+" is from "+pRef1.brandName);
		
		pRef1.readDataFromProduct();
		pRef2.readDataFromProduct();
		

		// Challenge : If we have to create n number of Objects
		// 			   Writing and Reading Data from Object is tough
		//			   We have a solution : Method
		
		Product pRef4 = new Product();
		pRef4.writeDataForProduct(3001, "RedMi Note5", "Mi", 15000);
		pRef4.readDataFromProduct();
	}

}
