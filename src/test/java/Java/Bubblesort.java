package Java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bubblesort {

	public static void main(String[] args) {
		int a[]= {1,4,3,5,2,2,3,5,4};
		int temp;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;

				}
			}
			
			
		}
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z] +" ");
		}
		
//		Set s = new HashSet<Integer>();
//		for(int i=0;i<a.length;i++)
//			s.add(a[i]);
//		System.out.println(s);
		
	}

}
