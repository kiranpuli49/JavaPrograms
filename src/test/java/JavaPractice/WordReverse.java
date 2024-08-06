package JavaPractice;

import java.util.Arrays;

public class WordReverse {

	public static void main(String[] args) {
		
		String x = "I evoL avaJ gnimmargorP";
		System.out.println(x.length());

		String b[] = x.split(" ");

		for (int i = 0; i < b.length; i++) {

			char c[] = b[i].toCharArray();
			for (int z = c.length - 1; z >= 0; z--) {
				System.out.print(c[z]);
			}
			//System.out.print(" ");
			
		}
		System.out.println(Arrays.deepToString(b));

		
	}

}
