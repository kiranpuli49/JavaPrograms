package Java;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		System.out.println("enter the range number");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int a[] = new int[x];
		int b=1;
		for(int i=1; i<=x;i++)
		{
			
			if(i%2==0) {
				
				a[b]=i;
				b++;
			//	System.out.print(i+",");
				
			}
			
		}
		System.out.println(b);
	
		for(int c=1;c<=b-1;c++) {
			if(c==b-1) {
				      System.out.println(a[c]+".");
			      }
			else {
			System.out.print(a[c]+",");
		}
		
	}
	}
}
