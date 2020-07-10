package Polymorphism;

public class CompileTPoly {
	
	public static void sum() {
		int a =5;
		int b =6; 
		int sum = a+b;
		System.out.println("Sum is: "+ sum);
	}
	
	
	public static int sum(int a , int b) {
		int sum  = a+b;
		System.out.println("Sum is: "+ sum);
		return sum;
	}

	public static void main(String[] args) {
		sum();
		sum(2,3);
	}

}
