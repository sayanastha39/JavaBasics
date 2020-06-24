package inclass;

public class IdentifierDemo {
	
	//identifier:  name given to class, method, variable and constants
	
	public void hello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		int any_$var = 5; //variables can have only $ and  _ symbol but not good to use
		final double _pi = Math.PI; //final makes variable constant
		System.out.println(_pi);
		
		
	}
}
