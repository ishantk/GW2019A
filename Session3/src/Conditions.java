
public class Conditions {

	public static void main(String[] args) {
		
		int shoeStock = 0;
		
		// Regular if/else
		if(shoeStock > 0){
			System.out.println(">> You can transact a Shoe");
		}else{
			System.out.println(">> Sorry we are out of stock");
		}
		
		// Problem : Nested if/else
		int seats = 10;
		int userChoice = 3;
		
		// Elevator Problem
		
		
		boolean isInternetConnected = true;
		boolean isGPSConnected = false;
		
		// Nested if/else
		if(isInternetConnected){
			System.out.println(">> You can browse Google Maps");
			if(isGPSConnected){
				System.out.println(">> You can use Google Maps for Navigation");
			}else{
				System.out.println(">> Please Connect to GPS and try Again !!");
			}
		}else{
			System.out.println(">> Please Connect to Internet and try Again !!");
		}
		
		int physics = 80;
		int chemistry = 70;
		int maths = 50;
		
		int result = (physics + chemistry + maths)/3;
		
		// Laddet if/else
		if(result >= 80){
			System.out.println(">> Grade A is awarded for "+result+" result");
		}else if(result >=70 && result <80){
			System.out.println(">> Grade B is awarded for "+result+" result");
		}else if(result >=60 && result <70){
			System.out.println(">> Grade C is awarded for "+result+" result");
		}else if(result >=50 && result <60){
			System.out.println(">> Grade D is awarded for "+result+" result");
		}else {
			System.out.println(">> Grade E is awarded for "+result+" result");
		}
		
		int microCab = 1;
		int miniCab = 2;
		int sedanCab = 3;
		int sharedCab = 4;
		int bike = 5;
		
		int choice = 1;
		
		if(choice == microCab){
			System.out.println(">> You have booked OLA Micro Cab");
		}else if(choice == miniCab){
			System.out.println(">> You have booked OLA Mini Cab");
		}else if(choice == sedanCab){
			System.out.println(">> You have booked OLA Sedan Cab");
		}else if(choice == sharedCab){
			System.out.println(">> You have booked OLA Shared Cab");
		}else if(choice == bike){
			System.out.println(">> You have booked OLA Bike");
		}else{
			System.out.println(">> Please select a cab type first");
		}
				

	}

}
