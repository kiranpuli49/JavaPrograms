package Java;

public class arraysAccess {

	public static void main(String[] args) {
		int [] a= new int[4];
		a[0]=000;
		a[1]=100;
		a[2]=200;
		a[3]=300;
		int [] b= {100,200,300,400};
		System.out.println(b[3]);

		
		System.out.println(b.length);
		
		for(int x=0;x<b.length;x++) {
			System.out.println(b[x]);
		}
		
		for (int i : a) {
			System.out.println(i);
	}
	}
}
