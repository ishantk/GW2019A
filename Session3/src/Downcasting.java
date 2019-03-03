
public class Downcasting {

	public static void main(String[] args) {
		
		// Assignment Floating P0int Range Calculation to be Shared
		
		byte age = 10; // byte is 8 bits in size
		// 2 pow 8 -> 256 -> 0 to 255 -> -128 to 0 to 127
		
		age = 127;
		
		age = (byte)257; // Downcasting
		System.out.println("age is: "+age);
		
		long sunderPichaiSalary = 10000000000L;
		
		float pi = 3.14F;
		double d = 3.14;
		
		float pi1 = (float)3.14;
		
		char ch = (char)65;
		System.out.println("ch is: "+ch);

	}

}
