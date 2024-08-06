package Java;

//import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {
		 String str1= "Kiran@kumar@sanjay";
		 
		String ar[]=str1.split("[^a-zA-Z0-9_-]");
		//String s=str1.replaceAll("[^a-zA-Z0-9_-]", "");
		
		System.out.println(ar[2]);
		
		// System.out.println(str1.substring(6));
		 

		 for(int i=str1.length()-1; i>=0; i--) {
			
			 
			 System.out.print(str1.charAt(i));
			 //System.out.println(str1.));
		 }

	}

}
