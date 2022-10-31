package javahello;

public class Methods {
	
	

	public static void main(String[] args) {
      String mesaj = "Bugün hava çok güzel";
      String yeniMesaj = mesaj.substring(0,2);
      System.out.println(yeniMesaj);
      int sayi = topla(17,6);
      int toplam = topla2(2,3,4,5,6,10);
	  System.out.println(sayi);
	  System.out.println(toplam);
	}

	public static void findNumber() {
		
		int[] numbers = new int[] {1,2,5,7,9,0};
		   int callNumber = 7;
		   
		   boolean isExist = false;
		   
		   for(int number : numbers) {
			   if(number==callNumber) {
				   isExist = true;
				   break;
			   }
			   
		   }
		   
		   if(isExist) {
		   message(callNumber);
		   }
		   
		   else {
			   System.out.println("This number is not in the range");
		   }
	}   
	public static void message(int callNumber) {
		System.out.println("Sayı mevcuttur : "+ callNumber);
	}
	
	public static void add() {
	  System.out.println("Eklendi");}
	
	public static void delete() {
		  System.out.println("Silindi");}
		
	public static void update() {
		  System.out.println("Güncellendi");}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int...sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam+=sayi;
		}
	    
		return toplam;
	}
		
	
	
	
	
	
}
