package Java;

public class rangeprime {

	public static void main(String[] args) {
		 
		for (int i = 1; i < 100; i++) {
			int count = 0;
			if (i == 1 || i == 2) {
				count = 1;
			} else {
				for (int k = 1; k <= i; k++) {
					if (i % k == 0) {
						count++;
					}
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}

	}

}
