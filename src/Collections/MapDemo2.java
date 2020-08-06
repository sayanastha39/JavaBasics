package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo2 {

	public static void main(String[] args) {
		
		System.out.println("using hashmap");
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "a");
		m1.put(4, "b");
		m1.put(2, "c");
		m1.put(3, "d");
		for(Map.Entry<Integer, String> m:m1.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}

		System.out.println("using linked hashmap");
		Map<Integer, String> m2 = new LinkedHashMap<>();
		m2.put(1, "a");
		m2.put(3, "b");
		m2.put(2, "c");
		m2.put(4, "d");
		for(Map.Entry<Integer, String> m:m2.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		
		System.out.println("using treemap");
		Map<Integer, String> m3 = new TreeMap<>();
		m3.put(1, "a");
		m3.put(3, "b");
		m3.put(2, "c");
		m3.put(4, "d");
		for(Map.Entry<Integer, String> m:m3.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
	}

}
