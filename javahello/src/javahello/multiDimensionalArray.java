package javahello;


import java.util.Scanner;

public class multiDimensionalArray {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
	
		
	    sehirler[0][0] ="İstanbul";
	    sehirler[0][1] ="Bursa";
	    sehirler[0][2] ="Bilecik";
	    sehirler[1][0] ="Ankara";
	    sehirler[1][1] ="Konya";
	    sehirler[1][2] ="Kayseri";
	    sehirler[2][0] ="Diyarbakır";
	    sehirler[2][1] ="Gaziantep";
	    sehirler[2][2] ="Şanlıurfa";
	    
		for(int i=0; i<=2; i++) {
			System.out.println("-------------------");
		   for(int j=0; j<=2; j++) {
          System.out.println(sehirler[i][j]);
			
		   	}

		String mesaj = "Bugün hava çok güzel.";
		
		System.out.println("4. eleman = "+ mesaj.charAt(3));
		System.out.println( mesaj.concat(" Yaşasın!"));
		
		char[] karakterler = new char[6];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a")); 
		
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(5));
		
		for(String kelime : mesaj.split(" ")) {
		System.out.println(kelime);	
		}
		
		System.out.println(mesaj.toLowerCase()); 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int number = scan.nextInt();
	
		
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for(int i=2 ; i<number; i++) {
			if (number % i == 0) {
					
			    isPrime = false;
			}    
		}
		
		if(isPrime) {
			System.out.println("The number is prime.");
			return;
		}
		else {
			
		System.out.println("The number is not prime.");
		return;
		}
		
		
		
	}

}
