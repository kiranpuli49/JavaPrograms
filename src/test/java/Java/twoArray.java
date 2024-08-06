package Java;

public class twoArray {

	public static void main(String[] args) {
		
		
		int a[][]= new int[3][2];
		int[]b[]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=100;
		a[1][1]=500;
		
		a[2][0]=600;
		a[2][1]=700;

		System.out.println(a[2][1]);
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int r=0;r<a.length;r++) {
			for(int c=0;c<a[r].length;c++) {
				System.out.print(a[r][c] +" ");
			}
			System.out.println();
		}
		
		
	}

}
