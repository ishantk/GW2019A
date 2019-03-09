
public class Loops {

	// main is a method
	// main represents main thread
	// whatever we write in main, will be executed in a sequence
	public static void main(String[] args) {
		
		// Use Case : We wish to print table of a number
		/*
		int num = 5;
		int i = 1;
		
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++; // 2
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		
		System.out.println();
		
		// Use Case : Print a document 5 times
		int count = 1;
		String docName = "Java_eBook.pdf";
		
		System.out.println(docName+" printed for "+count+" time(s)");
		count++;
		System.out.println(docName+" printed for "+count+" time(s)");
		count++;
		System.out.println(docName+" printed for "+count+" time(s)");
		count++;
		System.out.println(docName+" printed for "+count+" time(s)");
		count++;
		System.out.println(docName+" printed for "+count+" time(s)");
		*/
		
		int num = 5;
		int i = 1;
		
		while(i<=10){ // Entry Check
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		System.out.println(">> i is: "+i); 
		System.out.println("*********");
		
		int count = 1;
		String docName = "Java_eBook.pdf";
		
		do{
			System.out.println(docName+" printed for "+count+" time(s)");
			count++;
		}while(count<=5); // Exit Check
		
		System.out.println("*********");
		
		for(int n=7,j=1;j<=10;j++){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
		
		System.out.println("*********");
		for(num=10, i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		
		System.out.println("*********");
		for(;i<=20;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
		
	}

}
