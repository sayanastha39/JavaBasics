package inclass;

public class ThisDemo2 {
	
	String name = "Ram";
	
	//using local variable
	public void m1() {
		String name = "Hari"; 
	}
	
	
	//using method and has to be non static
	public void m2(String name) {
		
	}
	
	//using constructor
	public ThisDemo2(String name) {
		this.name = name; //hari
		//name = this.name; //ram
		System.out.println("name is using constructor: " + name);
		
	}
	
	public void print() {
		System.out.println("name is using method: " + name);
	}
	

	public static void main(String[] args) {
		
		ThisDemo2 ob =  new ThisDemo2("Hari");
		ob.print();
	}

}
