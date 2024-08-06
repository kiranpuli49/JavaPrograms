package JavaPractice;

public class ArrayindexSum {

	public static void main(String[] args) {
		int a[] = { 1, 5, 6 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}

		for (int z = 0; z < a.length; z++) {

			int sum1 = sum - a[z];
			System.out.println(sum1);
			

		}

	}

}
