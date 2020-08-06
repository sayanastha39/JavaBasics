package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		List <Integer> l= new ArrayList<>();
		
		l.add(1);
		l.add(5);
		l.add(3);
		l.add(0);
		
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}

}
