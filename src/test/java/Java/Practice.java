package Java;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		//10 seats
		//5 seat men 5 seat women
		//sit alternate
		char a[]= new char[5];

		for (int i = 1; i <= a.length; i++) {	
		System.out.println("Seat Unreserved  " +i);
		}
	
	
		System.out.println("enter the seat number");
        Scanner sc = new Scanner(System.in);
        
		int seat = sc.nextInt();
		System.out.println("enter the Gender M or W");
		char Gen = sc.next().charAt(0);
		a[3]='M';
		for (int i = 1; i <= a.length; i++) {
			if (seat == i ) {
				if((a[i+1]==Gen && a[i-1]==Gen) || (a[i+1]==0&& a[i-1]==0)) {
				               a[i] = Gen;	
		

				System.out.println("Reserved Seat for:"+i +" is " +Gen);
			}}
			else {
				if(a[i]=='M' || a[i]=='W') {
				System.out.println("Seat reserved already  " +i);
			                                }
				else{
					System.out.println("UnReserved");
					
				}
				}
			

		}
		
		/*
		System.out.println("enter the seat number");
       
        
		int seat2 = sc.nextInt();
		System.out.println("enter the Gender M or W");
		char Gen2 = sc.next().charAt(0);
		for (int i = 1; i <= a.length; i++) {
			if(seat2==i && seat2==0) {
				a[i]=Gen2;
				
			}
			else{
				System.out.println("unreserved seats");
			}
		}
		
		
		
		
		
		System.out.println("Available Seats");
		
		for(int x=0;x<a.length;x++) {
			if(a[x]==seat) {
				
			}
		}*/

	}

}
