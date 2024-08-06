package Java;

import java.util.List;

public class StringPractice {
	public static void main(String[] args) {
		
		
//		String x="ABCD1234abcd";
//		String Cap="";
//		String small="";
//		String Num ="";
//		
//		for(char c :x.toCharArray()) {
//			if (Character.isAlphabetic(c)) {
//				int n = c;
//				if (n >= 65 && n < 91) {
//					Cap = Cap + c;
//				} else {
//					small = small + c;
//				}
//			}
//			else {
//				Num=Num+c;
//			}
//		}
//		
//		System.out.println(Cap);
//		System.out.println(small);
//		System.out.println(Num);
		
		
		String x="fffDDEEf";
		
		
		
		for(int i=0;i<x.length();i++) {
			char c=x.charAt(i);
			int count=0;
			
			for (int z = i; z < x.length(); z++) {
				if(x.charAt(i)==x.charAt(z)) {
					count++;
				}
				else {
					break;
				}

			}
			System.out.println(count);
		}
		
		
	}
}
