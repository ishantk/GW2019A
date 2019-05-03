package com.auribises;

public class StringAndNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		String s1 = String.valueOf(a);
		System.out.println("s1 is: "+s1);
		System.out.println(s1.charAt(0));
		
		boolean flag = true;
		String s2 = String.valueOf(flag);
		System.out.println("s2 is: "+s2+" and length is: "+s2.length());
		System.out.println(s2.charAt(2));
		
		String s3 = "100";
		int x = 10;
		int i = Integer.parseInt(s3);
		System.out.println(s3 + (x+i));
		
		String s4 = "2.2";
		double d = Double.parseDouble(s4);
		System.out.println(Double.parseDouble(s4) + d);
		
	}

}
