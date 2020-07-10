 package inclass;

public class ThisDemo3 {
	
	public String sayHello() {
		System.out.println("sayhello called");
		return "hello";
		
	}
	
	public static void greet(ThisDemo3 obj) {
		System.out.println(obj.sayHello()); //prints what's on return
	}
	
	public static void display() {
		
		ThisDemo3 ob = new ThisDemo3();
		greet(ob);
		
	}

	public static void main(String[] args) {
		
		ThisDemo3 obj = new ThisDemo3();
//		obj.greet(obj);
		
		obj.display();
		
		
		
		
	}

}
