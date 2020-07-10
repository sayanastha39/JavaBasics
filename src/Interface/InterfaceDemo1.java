package Interface;

// public abstract interface InterfaceDemo{ //same thing if we don’t write abstract compiler will write it
public interface  InterfaceDemo1 {
	
	void m1(); //should not have body and return type
	
	//	void m2() { //will give error if a method has a body
	//	System.out.println("body");
	//	}
	
	//they are all the same thing
	public void m2();
	
	abstract void m3(double v);
	 
	public abstract void m4(int n); //by default by compiler will change to this format
	
	
	//for variable must be initialed with value
	//same as writing int a; static int a; and others 
	public static final int a =5; //by default by compiler
	

}
