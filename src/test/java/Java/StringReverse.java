package Java;

public class StringReverse {

	public static void main(String[] args) {
		
		
		String str1= "Kiran Kumar";
		String str2="";
		char a[]=str1.toCharArray();
		for(int i=str1.length()-1;i>=0;i--) {
			str2+=a[i];
//			
		}
		System.out.println(str2);
		
		

		
//		StringBuilder s = new StringBuilder(str1);
//		s.append(str1);
//		s.reverse();
//		System.out.println(s);
		
//		StringBuffer s1 = new StringBuffer(str1);
//		s1.append(str1);
//		s1.reverse();
//		System.out.println(s1);
		
		
	}

}
