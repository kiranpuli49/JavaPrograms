package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;

public class occarance2 {

	public static void main(String[] args) {
		
		String f="Kiran Kuamr Puli Puli";
		String x=f.toLowerCase();
		
		HashMap<Character, Integer> HM = new HashMap<Character, Integer>();
		
		for(char c:x.toCharArray()) {
			
			if(HM.containsKey(c)) {
				HM.put(c, HM.get(c)+1);
			}
			else {
				HM.put(c, 1);
			}
		}
		
		for(Entry<Character, Integer> c:HM.entrySet()) {
			System.out.println(c);
		}
	}

}
