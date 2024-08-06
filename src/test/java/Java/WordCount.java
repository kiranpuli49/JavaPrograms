package Java;

public class WordCount {

	public static void main(String[] args) {
		String x= "kiran kumar puli king";
		int count=1;
		//char[] a = x.toCharArray();
	   // System.out.println(x.length());
		//String s[]=x.split("");
		for(int i=0;i<=x.length()-1;i++) {
			
			if((x.charAt(i)== ' ')) {
				count++;
				
			}
			
		}System.out.println(count);
	}
	

		               }