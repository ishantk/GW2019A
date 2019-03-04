
public class Switch {

	public static void main(String[] args) {
		
		int userChoice = 3;
		
		switch (userChoice) {
			case 1:
				System.out.println("OLA Micro Cab Booked!!");
				break;
				
			case 2:
				System.out.println("OLA Mini Cab Booked!!");
				break;
				
			case 3:
				System.out.println("OLA Sedan Cab Booked!!");
				break;
				
			case 4:
				System.out.println("OLA Shared Cab Booked!!");
				break;
				
			case 5:
				System.out.println("OLA Bike Booked!!");
				break;
	
			default:
				System.out.println("Please Enter a Valid Choice");
				break;
		}
		
		System.out.println();
		
		//int userSeatChoice = 7;
		/*
		switch (userSeatChoice) {
			case 1:
				System.out.println(">> You Selected "+userSeatChoice);
				System.out.println(">> You can either book "+(userSeatChoice+1)+" seat or "+(userSeatChoice+9)+" seat alongwith "+userSeatChoice+" seat");
				break;
				
			case 2:
				System.out.println(">> You Selected "+userSeatChoice);
				System.out.println(">> You can either book "+(userSeatChoice+1)+" seat or "+(userSeatChoice-1)+" seat alongwith "+userSeatChoice+" seat");
				break;
				
			case 3:
				System.out.println(">> You Selected "+userSeatChoice);
				System.out.println(">> You can either book "+(userSeatChoice+1)+" seat or "+(userSeatChoice-1)+" seat alongwith "+userSeatChoice+" seat");
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
				
			case 6:
				
				break;
				
			case 7:
				
				break;
				
			case 8:
				
				break;
				
			case 9:
				
				break;
				
			case 10:
				System.out.println(">> You Selected "+userSeatChoice);
				System.out.println(">> You can either book "+(userSeatChoice-9)+" seat or "+(userSeatChoice-1)+" seat alongwith "+userSeatChoice+" seat");
				break;	
	
			default:
				break;
		}*/
		
		
		int start = 1;
		int end = 10;
		
		int userSeatChoice = 10;
		int howManySeats = 1;
		
		int seat1 = userSeatChoice - 1;
		int seat2 = userSeatChoice + 1;
		
		System.out.println(">> You Selected "+userSeatChoice);
		
		if(seat1 < start){
			System.out.println(">> You can either book "+(userSeatChoice+howManySeats)+" seat or "+end+" seat alongwith "+userSeatChoice+" seat");
		}else if(seat2 > end){
			System.out.println(">> You can either book "+start+" seat or "+(userSeatChoice-howManySeats)+" seat alongwith "+userSeatChoice+" seat");
		}else{
			System.out.println(">> You can either book "+(userSeatChoice+howManySeats)+" seat or "+(userSeatChoice-howManySeats)+" seat alongwith "+userSeatChoice+" seat");
		}	

	}

}
