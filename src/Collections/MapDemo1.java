package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo1 {

	public static void main(String[] args) {
Map<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "a");
		m1.put(2, "b");
		m1.put(3, "c");
		m1.put(1, "d");
		
		System.out.println(m1);
		System.out.println("=====Using Map.Entry=====");
		for(Map.Entry<Integer, String> m:m1.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		System.out.println("=====Using BiConsumer=====");
		m1.forEach(new BiConsumer<Integer, String>(){

			@Override
			public void accept(Integer t, String u) {
				System.out.println(t + " "+ u );
			}
		});
		
		System.out.println("=====Using Lambda=====");
		m1.forEach ((t, u)->{
			System.out.println(t + " "+ u );
		});
	}

}
