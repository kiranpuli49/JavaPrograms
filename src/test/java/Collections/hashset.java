package Collections;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		HashSet<Integer> hs1= new HashSet<Integer>();
		HashSet hs= new HashSet();
		Set s = new HashSet();
		s.add("100");
		s.add("Kiran");
		s.add("100");
		System.out.println(s);
		
		s.add("");
		System.out.println(s);
		s.add("");
		System.out.println(s);
		System.out.println("size 1: "+s.size());
		s.remove("");
		
		System.out.println("size 2 : "+s.size());
		
		
		

	}

}
