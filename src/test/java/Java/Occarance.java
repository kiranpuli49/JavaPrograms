package Java;

public class Occarance {

	public static void main(String[] args) {
		String S1="Kiran kumar Kohli  khhhkK";
		int count =0;
//		char S2[]= S1.toCharArray();
		
		for(int i=0;i< S1.length();i++) {
			
			if(S1.charAt(i)=='k' || S1.charAt(i)=='K') {
				count++;
			}
		
		}
		System.out.println(count);
	}

}
