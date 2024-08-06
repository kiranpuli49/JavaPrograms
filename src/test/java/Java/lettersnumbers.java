package Java;

public class lettersnumbers {

	public static void main(String[] args) {
String str1 = "kiran@ bb12 k3";
		
		char str2[] = str1.toCharArray();
//		System.out.println(str2);
		boolean space= true;
		int charcount=0;
		int Numcount=0;
		int spacesp=0;
		int x=0;int n=0;int m=0;
		//String str3;
	    char[] str3= new char[str2.length];  
	    int [] str4 = new int[100];
	    char[] str5= new char[100];
		for(int i=0; i< str2.length;i++) {
			
			if(Character.isLetter(str2[i])) {
			
				charcount++;
				
				str3[x] =str2[i];
				
			
			}
			
			else if(Character.isDigit(str2[i])){
				Numcount++;
				str4[m]=str2[i];
				m++;
			}
			else {
				spacesp++;
				str5[n]=str2[i];
				n++;
				
			}
			
		}
		
		//System.out.println(str3);
    		   System.out.println(str3.toString() +"characters in String  :"+charcount);
    		   System.out.println("Numbers in String   :"+Numcount);
    		   System.out.println("SPaces & Sp char in String  :"+spacesp);
	}

}
