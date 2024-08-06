package Java;

public class Swap2Strings1 {

	public static void main(String[] args) {
		String str1 ="Kiran";
		int x=str1.length();
		String str2 ="Balaji";
		int x2=str2.length();
		int x3=x+x2;
		String str3=str1+str2;
		System.out.println(str3);
		 str2=str3.substring(0,x);
		System.out.println(str2);
		str1=str3.substring(x,x3);
		System.out.println(str1);
	}

}
