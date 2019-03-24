package com.auribises.one;

/*
 	Access Modifiers
 	1. private
 	2. default
 	3. protected
 	4. public
 */

// default class : OK
/*class One{
	
}*/

/*
private class Two{ 		// error -> class cannot be private
	
}

protected class Three{ 	// error -> class cannot be protected
	
}
*/

/*class Four{ : OK
	
}*/

/*public class Five{	// error -> only 1 public class can be created as source file name is same as that of public class name
	
}*/

// public class
public class App {

	public static void main(String[] args) {

		One oRef = new One();
		Two tRef = new Two();
		
		//oRef.pvtShow(); // error
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		//tRef.pvtShow(); // error
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();
		
		// Conclusion : private is not accessible outside the Class/Object Structure
		
	}
	
	

}
