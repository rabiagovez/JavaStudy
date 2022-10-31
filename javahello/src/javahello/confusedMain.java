package javahello;

public class confusedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   int number2 = 284;
	   int number1 = 220;
	   int total1 = 0;		
	   int total2 = 0;		
	
	   for(int i = 1; i < number1 ;i++) {
	       if (number1 % i == 0) {
			   total1 = total1 + i;
		   }
	   }

	    for(int j = 1;j<number2;j++) {
	       if (number2 % j == 0) {
			   total2 = total2 + j;
		   }
	    }

	   if(total1==number2 && total2 ==number1) {
	   
		   System.out.println("These numbers are friend numbers");
	   }

	   else {
	
		  System.out.println("These numbers are not friend numbers");
	    } 

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
	   System.out.println("This number is in the range");
	   }
	   
	   else {
		   System.out.println("This number is not in the range");
	   }
	   
   
	   String s1 = null;
	   String s2 = new String("hi");
	   String s3 = new String("hi");
	   String s4 = new String("bye");
	   if (s1 == null)
	       s1 = s2;
	   if (s1 == s2)
	      System.out.println("s1 and s2 refer to the same object");
	   if (s2 == s3)
	      System.out.println("s2 and s3 refer to the same object");
	   if (s3 == s4)
	      System.out.println("s3 and s4 refer to the same object");
	   if (s1.equals(s2) && s2.equals(s3))
	       System.out.println("s1, s2, s3 are equal");
	   
	   
	   double score = 90;
       if (score >= 92);{
           System.out.println("A");}
           
       if (score >= 82 && score <= 91);{
           System.out.println("B");}
         
       if (score >= 72 && score <= 81);{
           System.out.println("C");}
         
       if (score >= 62 && score <= 71);{
           System.out.println("D");}
       
       if (score < 62){
           System.out.println("E");}
     
	
	
	
	
	
	
	}
}
