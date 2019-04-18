import java.io.IOException;

// User Defined Exception - UNCHECKED 
class MyBankingException extends RuntimeException{
	public MyBankingException(String message) {
		super(message); // pass the message to Parent's constructor
	}
}

//User Defined Exception - CHECKED 
class YourBankingException extends Exception{
	public YourBankingException(String message) {
		super(message);
	}
}

class BankAccount{
	
	int balance = 10000;
	int minBalance = 2000;
	int attempts = 0;
	
	void withdraw(int amount){
		
		balance = balance - amount;
		
		if(balance <=minBalance){
			balance = balance + amount;
			System.out.println(">> Balance is LOW: \u20b9"+balance);
			attempts++;
		}else{			
			System.out.println(">> Withdrawl Success !! New Balance is: \u20b9"+balance);
		}
		
		if(attempts == 3){
			// UNCHECKED EXCEPTION
			//ArithmeticException ae = new ArithmeticException("Illegal Attempts");
			//throw ae;
			
			MyBankingException mRef = new MyBankingException("Illegal Attempts");
			throw mRef;
		}
	}
	
	void withdrawAgain(int amount) throws YourBankingException{
		
		balance = balance - amount;
		
		if(balance <=minBalance){
			balance = balance + amount;
			System.out.println(">> Balance is LOW: \u20b9"+balance);
			attempts++;
		}else{			
			System.out.println(">> Withdrawl Success !! New Balance is: \u20b9"+balance);
		}
		
		if(attempts == 3){
			// CHECKED EXCEPTION
			//IOException io = new IOException("Illegal Attempts");
			//throw io;
			
			YourBankingException yRef = new YourBankingException("Illegal Attempts");
			throw yRef;
		}
	}
}


public class BankingApp {

	public static void main(String[] args) {
		
		System.out.println(">> Banking Started");
		
		BankAccount aRef = new BankAccount();
		/*for(int i=1;i<=1000;i++){
			aRef.withdraw(3000);
		}*/
		
		try{
			for(int i=1;i<=1000;i++){
				aRef.withdrawAgain(3000);
			}
		}catch(YourBankingException iRef){
			System.out.println(">> Some Exception !!"+iRef);
		}
		
		System.out.println(">> Banking Finished");
	}

}
