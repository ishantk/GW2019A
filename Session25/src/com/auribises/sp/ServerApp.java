package com.auribises.sp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

	public static void main(String[] args) {
	
		try {
			
			// Create Server 
			ServerSocket server = new ServerSocket(7001);
			System.out.println(">> Server Started on Port#7001 ...");
			// Read from Client
			Socket socket = server.accept();
			DataInputStream iStream = new DataInputStream(socket.getInputStream());
			String message = iStream.readUTF();
			System.out.println(">> Message Received is: "+message);
			socket.close(); //Close the connection
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
