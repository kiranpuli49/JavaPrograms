package JavaPractice;

import java.util.Scanner;

import com.google.common.io.Files;

public class PivotInteger {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner( System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int sum=0;
			int sum2=0;
			
			for(int z=i;z<=n;z++) {
				sum2=sum2+z;
			}
			if(sum==sum2) {
				System.out.println("pivot Integer  :"+i);
			}
			
			Files.copy(null, null);
		}
		
	}

}
