package Java;

import java.util.LinkedHashSet;

public class RemovedupNum {

	public static void main(String[] args) {
		int a[] = {5,2,6,8,6,7,5,2,8};
		String c="Kiran kumar kiran jklkla ksansams kiran";
		
		LinkedHashSet<Integer> set
        = new LinkedHashSet<Integer>();
//		LinkedHashSet<String> set1
//        = new LinkedHashSet<String>();
		
//
    // adding elements to LinkedHashSet
    for (int i = 0; i < a.length; i++)
        set.add(a[i]);

    // Print the elements of LinkedHashSet
    System.out.print(set);
		
		
		String d[]=c.split(" ");
		 for (int i = 0; i < d.length; i++) {
	        set.add(d[i].toLowerCase());
	}
		 System.out.println(set1.toString());
		 }
	}
