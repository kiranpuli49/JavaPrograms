package Java;

public class Amstrong {

	public static void main(String[] args) {
		int c=153;
		int x=c;
		
		int b=String.valueOf(x).length();
		
	int sum=0;
		while(x!=0) {
			
			int rem=x%10;
			sum+=Math.pow(rem, b);
			x=x/10;
		}
		if(sum==c) {
			System.out.println("Amstrong Num :"+c);
		}
		else {
			System.out.println("Not Am"+c);
		}

	}

}
