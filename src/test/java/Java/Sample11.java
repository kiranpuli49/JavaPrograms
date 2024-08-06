package Java;

public class Sample11 {

	public static void main(String[] args) {
		String x="test";
		String s=x.toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {

			char k = s.charAt(i);
			int count = 0;
//			if(s.indexOf(k)==i) { 
				
				for(int z = i+1; z < s.length(); z++) {
				
//				if (k == s.charAt(z)) {
//					count++;
//				}
					if(s.charAt(i)==s.charAt(z)) {
						count++;
						
					}
				
//			}

			System.out.println(s.charAt(i)+":"+count);
			}
		}

	}

}
