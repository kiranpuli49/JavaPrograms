package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class sort1 {

	public static void main(String[] args) {
		int a[]= {6,1,2,4,2,1,3,5};
//		List l= new ArrayList(Arrays.asList(1,2,4,2,1,3,5));
//		HashSet s = new HashSet(l);
//		System.out.println(s);
        String x="anv ";
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - i - 1; j++) {

				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int z = 0; z < a.length; z++) {
			System.out.print(a[z]+" ");
		}
		System.out.println("Length  :"+a.length);
		System.out.println(x.trim().length());
		System.out.println(x.substring(0, x.length()-1).length());
	}

}
