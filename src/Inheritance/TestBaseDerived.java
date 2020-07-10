package Inheritance;

public class TestBaseDerived {

	public static void main(String[] args) {
		
		Base parent = new Base();
		System.out.println(parent.name);
		parent.sayHello();
		
		
		System.out.println("=========");
		Derived child = new Derived();
		System.out.println(child.name);
		child.sayHello();
		
		System.out.println("=========");
		Children children = new Children();
		System.out.println(children.name);
		children.sayHello();
	}

}
