package JavaPractice;

import java.util.Scanner;

public class NextFivech2 {

	public static void main(String[] args) {
		System.out.println("enter the character :");
		Scanner sc = new Scanner(System.in);
		char x= sc.next().charAt(0);
		
//		for(int i=0;i<5;i++) {
//			x++;
//			System.out.println("char"+x);
//		}
		
		for(int z=0;z<5;z++) {
			x++;
			if(x > 'Z') {
				x='a';
			}
			else{
				x='A';
			}
			System.out.println(x);
		}
	}

}
