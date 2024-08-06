package ExceptionHandling;

import java.util.Scanner;

public class ArrayExcHand {

	public static void main(String[] args) {
		
		
		int a[]=new int[5]; //0...4

				Scanner sc=new Scanner(System.in);

				System.out.println("Enter a number:");

				int num=sc.nextInt();

				System.out.println("Enter position(0-4):");

				int pos=sc.nextInt();
				try {
				a[pos]=num;   //ArrayIndexOutOfBoundsException

				System.out.println(a[pos]);
				}
				catch(Exception x) {
					x.printStackTrace();
				}
		        System.out.println("Program is  completed..");

				System.out.println("Program is  exited..");		

	}

}
