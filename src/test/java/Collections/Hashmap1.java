package Collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"Kiran");
		map.put(2,"RajiGood");
		map.put(3, "Kiran");
		map.put(2, "Naveen");
		System.out.println(map);
		map.remove(3);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get(1));
		
		for(Object k:map.keySet())
		{
			System.out.println(k+"  "+ map.get(k));
		}
		for(Map.Entry<Integer, String> m :map.entrySet()) {
			System.out.println(m.getValue()+ ":"+m.getKey());
		}

	}

}
