package Java;

public class Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {3,4,5,6};
		
		for(int i=0;i<a.length;i++) {
			for(int z=0;z<b.length;z++) {
				if(a[i]==b[z]) {
					System.out.println(b[z]);
				}
			}
		}

	}

}
