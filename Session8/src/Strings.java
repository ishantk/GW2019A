/*
 	Assignment:
 	> Get a names as input from User (Scanner Class nextLine method)
 	> Convert it to native Language (Hindi or Punjabi)
 	> John
 	
 */
public class Strings {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = new String("HeLLo");
		
		if(str1 == str2){
			System.out.println("Strings are Equal");
		}else{
			System.out.println("Strings are not Equal");
		}
		
		//if(str1.equals(str2)){
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("Strings are Equal");
		}else{
			System.out.println("Strings are not Equal");
		}
		
		//if(str1.compareTo(str2) == 0){
		if(str1.compareToIgnoreCase(str2) == 0){
			System.out.println("Strings are Equal");
		}else{
			System.out.println("Strings are not Equal");
		}
		
		// Strings are IMMUTABLE. They cannot be changed !!
		// If we try to change a String we will get a new String in return.
		String names = "John, Jennie, Jim, Jack, Jennie, Joe";
		String str3 = names.toUpperCase();
		//names.toLowerCase();
		System.out.println("names is: "+names);
		System.out.println("str3 is: "+str3);
		
		int length = names.length();
		System.out.println("Length of names is: "+length);
		//char ch = names.charAt(0);
		char ch = names.charAt(length-1);
		System.out.println("ch is: "+ch);
		
		char[] chArr = names.toCharArray();
		chArr[0] = 'K';
		for(char c : chArr){
			System.out.print(c+" ");
		}
		System.out.println();
		
		if(names.contains("Jennie")){
			System.out.println("Jennie is in the names");
		}
		//String names = "John, Jennie, Jim, Jack, Joe";
		String str4 = names.substring(3);
		//String str5 = names.substring(5,11); // start from 5 less than 11
		String str5 = names.substring(length-3, length); 
		System.out.println("str4 is: "+str4);
		System.out.println("str5 is: "+str5);
		
		String[] strArr = names.split(",");
		for(String s : strArr){
			System.out.println(s.trim());
		}
		
		//int idx = names.indexOf("J");
		//int idx = names.lastIndexOf("J");
		int idx = names.indexOf("Jennie");
		System.out.println("idx is: "+idx);
		
		String newNames = names.replace('J', 'K');
		System.out.println("names is: "+names);
		System.out.println("newNames is: "+newNames);
		
		char[] chArr1 = {'K','I','A'};
		String str6 = new String(chArr1);
		System.out.println("str6 is: "+str6);
		
	}

}
