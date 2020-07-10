package inclass;

public class ObjectClass {
	
	public void test() {
		System.out.println("non static method test");
	}

	public static void main(String[] args) {
		ObjectClass obj = new ObjectClass();
		Calculator calc = new Calculator();
		
		obj.test();
		System.out.println(obj.getClass());
		System.out.println(calc.getClass()); //get class is a method of root class Object 
		
	}

}
