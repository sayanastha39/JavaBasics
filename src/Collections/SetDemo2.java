package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		
		System.out.println("===Using HashSet=======");
		Set <Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(10);
		System.out.println(set1);
		
		System.out.println("===Using Linked hashset=======");
		Set <Integer> set2 = new LinkedHashSet<>();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(10);
		System.out.println(set2);
		
		System.out.println("===Using Treeset=======");
		Set <Integer> set3 = new TreeSet <>();
		set3.add(10);
		set3.add(20);
		set3.add(30);
		set3.add(10);
		System.out.println(set3);
	}

}
