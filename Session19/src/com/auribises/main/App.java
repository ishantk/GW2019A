package com.auribises.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.auribises.model.Customer;

/*
 
JDBC | Java Database Connectivity
1. Load The Driver
	Driver is a code from DB Vendor
	.jar file (Java Archive - Collection of .class files)

API:	Class.forname();

2. Create the Connection with Database
	URL to the Database
	Username
	Password

API:  Connection and DriverManager	

3. Create SQL Statement
String

4. Execute SQL Statement
API:  Statement

5. Close the Connection with Database		

java.sql
 
 */

public class App {

	public static void main(String[] args) {
		System.out.println(">> App Started");
		
		// Object is created in Heap Area of RAM and is temporary
		// Whenever Program finishes data is lost in Object
		// We must save the data in case of requirement
		// 1. Java File IO APIs
		// 2. JDBC | Java Data Base Connectivity
		
		/*Customer cRef1 = new Customer();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">> Enter Customer Name: ");
		cRef1.name = scanner.nextLine();
		
		System.out.println(">> Enter Customer Phone: ");
		cRef1.phone = scanner.nextLine();
		
		System.out.println(">> Enter Customer Email: ");
		cRef1.email = scanner.nextLine();
	
		System.out.println(cRef1);*/
		
		
		try {
			// 1. Load The Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
			
			// 2. Create the Connection with Database
			String url = "jdbc:mysql://localhost/auridb";
			String user = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created");
			
			// 3. Write SQL Statement
			//String sql = "insert into Customer values(null, '"+cRef1.name+"', '"+cRef1.phone+"', '"+cRef1.email+"', "+cRef1.age+")";
			//String sql = "insert into Customer values(null, ?, ?, ?, ?)";
			//String sql = "delete from Customer where cid = ?";
			
			String sql = "select * from Customer";
			//String sql = "select * from Customer where name = ?";
			
			System.out.println(">> 3. SQL Statement: "+sql);
			
			
			// 4. Execute SQL Statement
			//Statement stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql); // Insert, Update and Delete
			
			PreparedStatement stmt = con.prepareStatement(sql);
//			stmt.setString(1, cRef1.name);
//			stmt.setString(2, cRef1.phone);
//			stmt.setString(3, cRef1.email);
//			stmt.setInt(4, cRef1.age);
			
			//stmt.setInt(1, 3);
			
			//int i = stmt.executeUpdate();
			
			/*if(i>0){
				System.out.println(">> 4. SQL Statement Executed");
			}else{
				System.out.println(">> 4. SQL Statement Failed");
			}*/
			
			ResultSet rs = stmt.executeQuery(); // Select Operation or Fetch Data from DataBase
			
			while(rs.next()){
				Customer c = new Customer();
				c.cid = rs.getInt(1);
				c.name = rs.getString(2);
				c.phone = rs.getString(3);
				c.email = rs.getString(4);
				c.age = rs.getInt(5);

				System.out.println(c); // c.toString()
			}
			
			
			// 5. Close the Connection
			con.close();
			System.out.println(">> 5. Connection Closed");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
				
		
		System.out.println(">> App Finished");
	}

}
