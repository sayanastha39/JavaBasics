 package Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {

	public static void main(String[] args) {
		Set <Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		System.out.println("The size of list is " +set1.size());
		
		System.out.println("===Using enhanced for loop=======");
		
		for (int a: set1) {
			System.out.println(a);
		}
		
		System.out.println("====Using Iterator=========");
		Iterator<Integer> it = set1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("======Using Consumer from Java 8=========");
		set1.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		});
		
		System.out.println("======Using lambda for each from Java 8=========");
		set1.forEach((i)-> System.out.println(i));
	}
}


