package JavaPractice;

import java.util.Iterator;

public class SubString {

	public static void main(String[] args) {
		String s="Kiran Puli";
		System.out.println("orginal String :" +s.length());
		
		String x[]=s.split(" ");
		String rev="";
		for (int i = 0; i < x.length; i++) 
		{
			rev=rev+x[i];
			
				rev=rev+" ";
			
			 
		}
		//String A=rev.substring(0, rev.length()-1);
		System.out.println((rev.substring(0, rev.length()-1).length()));

	}

}
