package JavaPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class stringSample {

	public static void main(String[] args) {
		
		String str = "Kiarn Puli Heroo";
		List<String> words = Arrays.asList(str.split(" "));
		Collections.reverse(words);
		String reversedString = String.join(" ", words);
		System.out.println(reversedString);
		
	}

}
