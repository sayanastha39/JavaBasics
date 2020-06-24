package inclass;

public class OperatorDemo {

	public static void main(String[] args) {
		
		//Arithmetic Operator
		int a= 4+4-0+3*2%2;
		System.out.println (a);
		
		// Assignment Operator
		a=2;
		a+=2;
		System.out.println (a); //4
		
		a-=1; //a=a-1; Right to left so will do calculation first
		System.out.println (a);
		
		//Relational Operator : true or false 
		int x =9;
		int y = 3;
		System.out.println (x<y); //false
		
		//Logical Operator
		//&& both has to be true
		System.out.println (true&&true); //true
		System.out.println (false&&false); //false
		System.out.println (true&&false); //false
		 
		// || one has to be true
		System.out.println (true||true); //true
		System.out.println (false||false); //false
		System.out.println (true||false); //true
		
	}

}
