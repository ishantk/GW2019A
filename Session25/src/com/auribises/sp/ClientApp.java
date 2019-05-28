package com.auribises.sp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientApp {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost", 7001);
			String message = "All The Best";
			DataOutputStream oStream = new DataOutputStream(socket.getOutputStream());
			oStream.writeUTF(message);
			oStream.flush();
			oStream.close();
			System.out.println(">> Message Sent");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
