package JavaPractice;

public class CompareArrays {

	public static void main(String[] args) {
		int A[]= {1,2,3,5,6};
		int B[]= {1,2,3,4,5};
		StringBuffer s= new StringBuffer();
		for(int i=0;i<A.length;i++) {
			if(B[i]==A[i]) {
				s.append(B[i]);
				s.append(",");
				
			}
		}
		String x=s.substring(0, s.length()-1);
		System.out.println(x);
		
	}

}
