package Java;

public class ReverseString2 {

	public static void main(String[] args) {
		String str1="Kiran Kumar";
		
//		String rev="";
//		for(int i=str1.length()-1;i>=0;i--) {
//			rev=rev+str1.charAt(i);
//		}
//System.out.println(rev);
//	
	
	StringBuilder b = new StringBuilder(str1);
	b.reverse();
	System.out.println(b);

	}

}
