package JavaPractice;

public class OccuranceOfCharInString {

	public static void main(String[] args) {
		String x = "KiranKIKKK";
		String b = x.toLowerCase();
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (b.indexOf(c) == i) {
				int count = 0;
				for (int z = 0; z < b.length(); z++) {
					if (b.charAt(i) == b.charAt(z)) {
						count++;
					}
				}
				System.out.println(c + ":" + count);

			}
		}

	}

	}
