package Inheritance;

public class Sub extends Super{
	
	//default constructor
	public Sub() {
		//super(44); //if you always want to call parent's arg constructor
		//super(); //don't need to write as the compile will do in compile time
		System.out.println("sub's default constructor");
	}
	
	//argumented constructor
	public Sub(int a) {
		super(44);
		System.out.println("sub's argumented constructor");
	}
	
	String name = " child name";
	public void greet() {
		System.out.println(super.name);
		System.out.println("hello from sub");
		super.greet();
	}


}
