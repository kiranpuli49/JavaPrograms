package Java;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int count=0;
		
		for(int i=1;i<x;i++) {
			
			if(x%i==0) {
			    count++;
			}
			
		}
		if(count>2) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
