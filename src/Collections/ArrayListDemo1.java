package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


//iterator in list
public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//list.get()good for small list but not practical for long list to individually print it's element
		List <Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println("The size of list is " +list1.size());
		System.out.println("====Using get method of arraylist=========");
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		System.out.println("====Using for loop=========");
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("===Using enhanced for loop=======");
		
		for (int a: list1) {
			System.out.println(a);
		}
		
		System.out.println("====Using Iterator=========");
		Iterator<Integer> it = list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("====Using ListIterator=========");
		ListIterator <Integer> lit = list1.listIterator();
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}

	}

}
