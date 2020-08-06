package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo2 {

	public static void main(String[] args) {
		List <Integer> l= new ArrayList<>();
		l.add(1);
		l.add(5);
		l.add(3);
		l.add(0);
		System.out.println(l);
		
		List <Integer> ll= Collections.unmodifiableList(l);
		System.out.println(ll);
		
		ll.add(5);
		System.out.println(ll);

	}

}
