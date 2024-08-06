package Collections;

import java.util.LinkedHashSet;

public class Set1 {

	public static void main(String[] args) {
		int a[] = { 6, 9, 2, 2, 3, 3, 3, 4, 5, 5, 1 };
		int b[] = new int[a.length];
		int m = 0;
		LinkedHashSet<Integer> LH = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {

			LH.add(a[i]);

		}

		System.out.println(LH);
	}
		 }
			
		 
		 

