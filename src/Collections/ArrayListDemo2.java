package Collections;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List <Integer> list1 = Arrays.asList(10,20,30,10);
		
		System.out.println("======Using Consumer from Java 8=========");
		list1.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.println(i);
			}
		});
		
		System.out.println("======Using lambda for each from Java 8=========");
		list1.forEach((i)-> System.out.println(i));
	}
}
