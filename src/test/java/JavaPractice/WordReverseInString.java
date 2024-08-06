package JavaPractice;

import java.util.Scanner;

public class WordReverseInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence :");
		String s1=sc.nextLine();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			String s=s2[i];
			for(int z=s.length()-1;z>=0;z--) {
				System.out.print(s.charAt(z));
			}
			System.out.print(" ");
			
		}
	}

}
