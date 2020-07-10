package inclass;

public class ThisDemo4 {
	
	//just to create object
	public ThisDemo4 getObj() {
		
		System.out.println("getobj called");
		
//		ThisDemo4 object = new ThisDemo4();
//		return new ThisDemo4();
		System.out.println(this);
		return this; //just return an object
		
	}
	
	public void sayHello() {
		System.out.println("sayHello called");
	}
	
	public void greet() {
		ThisDemo4 object = new ThisDemo4();
		System.out.println("greet called");
		object.sayHello();
		object.getObj();
		
	}

	public static void main(String[] args) {
		
	 new ThisDemo4().greet();
		
	}

}
