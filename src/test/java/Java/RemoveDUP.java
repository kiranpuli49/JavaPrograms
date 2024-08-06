package Java;

import java.util.HashSet;
import java.util.Set;

public class RemoveDUP {

	public static void main(String[] args) {
		int a[]= {11,2,1,6,6,1,2,3,3,4,4,4,5,5};
		
		Set s= new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		System.out.println(s);
		
		

	}

}
