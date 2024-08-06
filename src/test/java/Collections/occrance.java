package Collections;

import java.util.HashMap;
import java.util.Map;

public class occrance {

	public static void main(String[] args) {
		
		String x="KiranKk";
		String s=x.toLowerCase();
		HashMap<Character,Integer> HP = new HashMap <Character,Integer>();
		
		
		for(char c :s.toCharArray()) {
			if(HP.containsKey(c)) {

				HP.put(c, HP.get(c)+1);
			}
			else {
				HP.put(c, 1);
			}
		}
		
		for(char c: HP.keySet()) {
			 System.out.println(c + ": " + HP.get(c));
		}
		
		System.out.println("occrance In String   K :"+HP.get('k'));

}
}
