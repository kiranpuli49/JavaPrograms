package JavaPractice;

import java.util.Scanner;

public class NextFiveCh {

	public static void main(String[] args) {
		System.out.println("enter the character :");
		Scanner sc = new Scanner(System.in);
		char x= sc.next().charAt(0);
		
		for(int i=0;i<5;i++) {
			x++;
			if(x >'z') {
				x='A';
			}
			else if(x >'Z' && x <'a') {
				x='a';
				
			}
			System.out.println("char :"+x);
		}

	}

}
