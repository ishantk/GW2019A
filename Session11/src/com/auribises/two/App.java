package com.auribises.two;

import com.auribises.one.One;
//import com.auribises.one.Two; -> default cannot be accessed outside the package

public class App {

	public static void main(String[] args) {

		One oRef = new One();
		//oRef.pvtShow();
		//oRef.defShow();
		//oRef.protShow();
		oRef.pubShow();
		
	}

}

// Conclusion : default/protected : only within the package and not outside the package
//				public : within the package or outside the package
/*
  	1.
  	Binary Array 1-D:
  	int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 1};
  	start collecting odd and even indexes
  	convert binary arrays into decimal values
  	add 2 decimal values -> Result (binary version)
  	
  	Loops/ifelse/methods
  	
  	2.
  	Binary Array - 2D:
  	int[][] arr = {
  				{1, 0, 0, 1, 1, 1},
  				{0, 1, 0, 1, 1, 0},
  				{1, 0, 0, 0, 1, 0},
  				{1, 0, 1, 1, 0, 1},
  				{1, 1, 0, 1, 1, 0},
  				{1, 0, 0, 0, 1, 1}
  	};
  	
  	start collecting diagonal indexes
  	convert binary arrays into decimal values
  	add 2 decimal values -> Result (binary version)
  	
  	3.
  	Binary Gap
  	int[] arr = {1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1};
  	Largest Gap
  	
  	HW:
  		GeekForGeeks
  		Sorting and Searching Algos 
  	
 */
