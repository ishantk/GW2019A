package com.auribises;

/*
class MyTask{
	void exeuteTask(){
		for(int i=1;i<=10;i++){
			System.out.println(">> Printing ** JohnsProfile.pdf #"+i);
		}
	}
}
*/

class MyTask extends Thread{ // MyTask IS-A Thread
	// run is method in Thread class which we need to override
	public void run(){
		System.out.println(">> State 4 "+getState());
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(">> Printing ** JohnsProfile.pdf #"+i);
			
		}
	}
}

class CA{
	
}

class YourTask extends CA implements Runnable{ // YourTask IS Implementing Runnable
	// run is method in Thread class which we need to override
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing ## Python.pdf #"+i);
		}
	}
}

public class App {

	public static void main(String[] args) {
		
		// Task1
		System.out.println(">> App Started");

		// Task 1.5
		MyTask mRef = new MyTask();
		//mRef.exeuteTask();
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread yRef = new Thread(r); // Direct Thread Object and pass Runnable Ref in it
		
		System.out.println(">> State 1 "+mRef.getState());
		
		mRef.setName("John");
		yRef.setName("Jennie");
		Thread.currentThread().setName("MyMain");
		
		mRef.setPriority(Thread.MAX_PRIORITY); // 10
		yRef.setPriority(Thread.NORM_PRIORITY); // 5
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 1
		
		mRef.start(); // start is method of Thread class which will internally execute run method
		System.out.println(">> State 2 "+mRef.getState());
		/*
		try {
			mRef.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		*/
		yRef.start();
		
		
		// Task2
		for(int i=1;i<=10;i++){
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing || LearningJava.pdf #"+i);
		}
		
		System.out.println(">> mRef Name is: "+mRef.getName()+" and Priority is: "+mRef.getPriority());
		System.out.println(">> yRef Name is: "+yRef.getName()+" and Priority is: "+yRef.getPriority());
		System.out.println(">> main Name is: "+Thread.currentThread().getName()+" and Priority is: "+Thread.currentThread().getPriority());
		
		// Task3
		System.out.println(">> App Finished");
		System.out.println(">> State 3 "+mRef.getState());
		
	}

}
