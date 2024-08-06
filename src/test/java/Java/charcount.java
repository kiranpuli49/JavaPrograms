package Java;

import java.util.ArrayList;
import java.util.List;

public class charcount {

	public static void main(String[] args) {
		List s1= new ArrayList<E>(s1);
		String s1="Kiraank";
		String s2=s1.toUpperCase();
		char[]str=s1.toCharArray();
		
		for(int i=0;i<str.length;i++) {
			int count=0;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]== str[j]) {
			      
					count++;
				}
			}
			System.out.println(str[i]+""+count);
		}

	}

}
