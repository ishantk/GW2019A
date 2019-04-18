package com.auribises;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		try {
			
			//File file = new File("/users/ishantkumar/Downloads/techstack.txt");
			File file = new File("/users/ishantkumar/Downloads/","HOP");
			
			if(file.exists()){
				if(file.isFile()){
					System.out.println(file.getName()+" file exists");
				}else{
					System.out.println(file.getName()+" directory exists");	
					
					String[] files = file.list();
					for(String name : files){
					
						if(name.endsWith(".html")){
							System.out.println(">> "+name);
						}
						
						/*
						if(name.equals("test.html")){
							File f1 = new File("/users/ishantkumar/Downloads/HOP","test.html");
							File f2 = new File("/users/ishantkumar/Downloads/HOP","wow.html");
							f1.renameTo(f2);
							System.out.println(">> File Renamed");
						}
						*/
						
					}
					
					File f = new File("/users/ishantkumar/Downloads/HOP","wow.html");
					if(f.exists()){
						f.delete();
						System.out.println(">> "+f.getName()+" deleted !!");
					}else{
						f.createNewFile();
					}
					
				}
			}else{
				System.out.println(file.getName()+" does not exists");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Error: "+e);
		}
		
	}

}

//https://docs.oracle.com/javase/7/docs/api/java/io/File.html
