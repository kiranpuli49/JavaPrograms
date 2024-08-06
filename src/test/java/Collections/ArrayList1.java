package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		

		ArrayList a = new ArrayList();
		ArrayList<Integer> a1 =new ArrayList<Integer>();
		ArrayList<String> a2 =new ArrayList<String>();
		List a3 = new ArrayList();
		a.add("45");
		a.add("Kiran");
		a.add(45);
		//a.add("");
		System.out.println(a);
		//remove
		a.remove(1);
		System.out.println("after remove:"+a);
		a.add(1,"java");
		System.out.println("after add at Position :"+a);
		//get the value by index
		System.out.println("getting the Value:"+a.get(1));
		
		for(int i=0;i<a.size();i++) {
			System.out.println("start  :"+a.get(i));
		}
		
		
	}

}
