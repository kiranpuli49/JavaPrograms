package Java;

import java.util.Scanner;

public class FirstcharinString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str1= sc.nextLine();
		String[]arr=str1.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				int x =arr[i].length();
			System.out.print(arr[i].toUpperCase().charAt(0));
			System.out.print(arr[i].toLowerCase().substring(1,x));
			}
			else {
				System.out.print(arr[i].toLowerCase().charAt(0));
			}
		}
		
		
		

	}

}
