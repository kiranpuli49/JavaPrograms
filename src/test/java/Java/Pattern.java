package Java;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	 for(int m=1;m<=x;m++) {
		 for(int j=1;j<=x-m;j++) {
			 System.out.print(" ");
		 }
		 for(int j=x-m;j<x;j++) {
			 System.out.print("X");
		 }
					 
		 System.out.println();
	 }

	}

}
