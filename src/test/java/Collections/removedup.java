package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class removedup {

	public static void main(String[] args) {
		int a[]= {1,2,4,2,5,4,3};
		String s="Kiran Kumar Kiran";
		String p[] = s.split(" ");
//		List l = new ArrayList();
//		for(int i=0;i<p.length;i++) {
//			l.add(p[i]);
//			System.out.println(l);
//		}
//			
//			Set y = new HashSet(l);
//			System.out.println(y);
			
	 List l2= new ArrayList<Integer>(Arrays.asList(1,2,4,2,5,4,3));
	 List l3= new ArrayList<Integer>();
	 
	
	 for(int i=0;i<l2.size();i++) {
		 if((!l3.contains(l2.get(i)))) {
			 l3.add(l2.get(i));
		 }
	 }
	 Collections.sort(l3);
	 System.out.println(l3);
	 
	}

}
