
public class ContainerRW {

	public static void main(String[] args) {
		
		// Creating a Container and writing data in container
		int num = 10;
		
		// Update Operation
		num = 20;
		
		// Read Operation
		System.out.println("num is: "+num);
		
		//int a;
		//System.out.println("a is: "+a); // Initialization Before Use Principle
		
		int x = 0;
		//x+=1;
		
		// Above all containers, are property of main, because we have created them in main!!
		// We cannot delete these containers. They will be deleted automatically !!
		// When main shall finish containers shall be deleted form memory !!
	}

}
