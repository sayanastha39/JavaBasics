package Inheritance;

public class Super {
	
	String name = "super's name";
	
	public Super() {
		System.out.println("super's default constructor");
	}
	
	public Super(int a) {
		System.out.println("super's argumented constructor");
	}
	
	public void greet() {
		System.out.println("hello from super");
	}

}
