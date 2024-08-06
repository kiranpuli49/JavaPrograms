package ExceptionHandling;

import java.util.Scanner;

public class ArthExcHandle {

	public static void main(String[] args) {
		
		System.out.println("Program is  started..");

				System.out.println("Program is  in progress..");

				
				Scanner sc=new Scanner(System.in);

				System.out.println("Enter a number:");

				int num=sc.nextInt();
     try {
				System.out.println(100/num);  
     }
    /* catch(ArithmeticException x) {
    	 System.out.println("invalid input");
     }
     catch(Exception x) {
    	 x.printStackTrace();
     }*/
     finally {
		
	
		       System.out.println("Program is  completed..");
				System.out.println("Program is  exited..");		

	}
	}
	
}
