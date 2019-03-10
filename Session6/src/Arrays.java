
public class Arrays {

	public static void main(String[] args) {
		
		// Single Value Container
		int popLdh = 32345;
		int popJal = 52345;
		int popAsr = 46845;
		int popFzr = 22345;
		int popMog = 37345;
		
		int popPunjab = popLdh + popJal + popAsr + popFzr + popMog;
		System.out.println("Population of Punjab is: "+popPunjab);
		
		// Representation of Data will become tough when cities will grow in size
		// we have just 5 cities as of now, but when this count increases its tough for us
		
		// Multi Value Container : Array | Indexed (0 to n-1)
		int[] pop = {32345, 52345, 46845, 22345, 37345};
		
		System.out.println("popLdh is: "+popLdh);	// Value
		System.out.println("pop is: "+pop); 		// HashCode
		
		// popLdh is a variable containing value 		   : Primitive Type
		// pop is a Reference Variable containing HashCode : Reference Type
		
		// Read Operation on Array
		//System.out.println("pop[0] is: "+pop[0]);
		//System.out.println("pop[2] is: "+pop[2]);
		
		// Update Operation
		pop[1] = 76543;
		
		int popCount = 0;
		
		for(int i=0;i<5;i++){
			System.out.println("pop["+i+"] is: "+pop[i]);
			popCount = popCount + pop[i];
		}
		
		System.out.println("Population of Punjab is: "+popCount);
	}

}
