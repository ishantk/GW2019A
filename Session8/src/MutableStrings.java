
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		String str = new String("Hello");
		str.concat(" World");
		System.out.println("str is: "+str);

		// Mutable Strings
		// Thread-Safe
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		System.out.println("buffer is: "+buffer);
		
		// Not Thread-Safe
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		System.out.println("builder is: "+builder);
		
	}

}
