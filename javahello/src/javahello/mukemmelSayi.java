package javahello;

import java.util.Scanner;

public class mukemmelSayi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number ;
		System.out.println("Enter a number = ");
		number = scan.nextInt();
		
		int total = 0;
		
		for(int i=1; i<number ; i++) {
			if(number % i == 0) {
				total = total + i;
		    }
			
		}
		if(total == number) {
			System.out.println("This number is perfect number");
		}
		else {
			System.out.println("This number is not a perfect number");
		}
	
	
	   Scanner scan1 = new Scanner(System.in);
	   System.out.println("Enter a number = ");
	   
	   number = scan.nextInt();
	 
		
	  
	
	
	
	
	}

}
