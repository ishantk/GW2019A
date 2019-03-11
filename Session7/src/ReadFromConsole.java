import java.util.Scanner;


public class ReadFromConsole {
	
	
	static String getGrade(int javaMarks, int pythonMarks){
		int totalMarks = javaMarks + pythonMarks;
		if(totalMarks>=160){
			return "Grade A for "+totalMarks;
		}else{
			return "Grade B for "+totalMarks;
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Object Construction Statement
		
		System.out.println("Enter Marks in Java:");
		int javaMarks = scanner.nextInt();
		
		System.out.println("Enter Marks in Python:");
		int pythonMarks = scanner.nextInt();

		System.out.println("You scored: "+ReadFromConsole.getGrade(javaMarks, pythonMarks));
		
		
	}
	
	/*
	 	Create a Method called getPromoDiscount.
	 	Method shall take a total of amount as input and return discounted prices as ack
	 	
	 	for amount > 1000 discount of 20Perc
	 	for amount < 1000 discount of 15Perc
	 	for amount < 500  discount of 10Perc
	 	
	 	Use Scanner for above Method
	 	
	 */

}
