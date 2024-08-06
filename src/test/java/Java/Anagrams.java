package Java;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.Arrays;

public class Anagrams {
	 static void isAnagram(String a, String b) {

	       a=a.toLowerCase();
	       b=b.toLowerCase();
	       
	      if(a.length()==b.length()) {
	    	  char[] str1= a.toCharArray();
	    	  char[] str2= b.toCharArray();
	    	  Arrays.sort(str1);
	    	  Arrays.sort(str2);
	    	  if(str1==str2) {
	    		  System.out.println("Anagram");
	    	  }
	    	  else{
	    		  System.out.println("Not Anagram");
	    	  }
	      }
	      else{
    		  System.out.println("Not Anagram");
    	  }
	      

	    }
	public static void main(String[] args) {
		isAnagram("mom","Mom");
		
	}

}
