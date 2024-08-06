package JavaPractice;

public class NeonNumber {

	public static void main(String[] args) {
		int n=9;		
		int x=n*n;
		
       int sum=0;
		while(x>0) {
			int m=x%10;
			sum=sum+m;
			x=x/10;
		}
		if(sum==n) {
			System.out.println(n+" : Neon Number");
		}
		else {
			System.out.println(n+"  not a Neon Number");
		}
	}

}
