package Java;

public class Reverse {

	public static void main(String[] args) {
		
		 /* String str1= "kiran"; char str2[]= str1.toCharArray(); int x= str2.length;
		 for(int i=x-1;i>=0;i--) { System.out.print(str2[i]); } }
		 
*/
			int x = 5;
			int m = x / 2;
			int flag = 0;
			if (x == 0 || x == 1) {
				System.out.println(+x + "not a prime");
			} else {
				for (int i = 2; i <= m; i++) {
					if (x % i == 0) {
						flag = 1;
						break;
					}
				}
			}
			if (flag == 1) {
				System.out.println("prime Number");
			}
	}
}
