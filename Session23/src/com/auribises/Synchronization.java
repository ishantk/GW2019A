package com.auribises;

class Printer{
	
	//synchronized void printDocument(String docName, int copies){
	void printDocument(String docName, int copies){
		for(int i=1;i<=copies;i++){
			System.out.println(">> Printing "+docName+" Copy#"+i);
		}
	}
	
	void refillInks(){
		System.out.println(">> Refilling Inks");
	}
}

class Desktop extends Thread{
	
	Printer printer; // Has-A relation
	
	Desktop(Printer printer){
		this.printer = printer;
	}
	
	public void run() {
		synchronized (printer) {
			
			try {
				printer.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			printer.printDocument("##Python.pdf##", 10);
			printer.refillInks();
		}	
	}
}

class Laptop extends Thread{
	
	Printer printer; // Has-A relation
	
	Laptop(Printer printer){
		this.printer = printer;
	}
	
	public void run() {
		synchronized (printer) {
			printer.printDocument("^^Go.pdf^^", 10);
			
			printer.notifyAll();
		}
	}
}

public class Synchronization {

	public static void main(String[] args) {
		System.out.println(">> App Started");
		
		// We have only 1 Printer Object
		Printer printer = new Printer();
		//printer.printDocument("**Java.pdf**", 10);
		
		Desktop dRef = new Desktop(printer);
		Desktop dRef1 = new Desktop(printer);
		Laptop lRef = new Laptop(printer);
		
		dRef.start();
		dRef1.start();
		lRef.start();
		
		System.out.println(">> App Finished");

	}

}
