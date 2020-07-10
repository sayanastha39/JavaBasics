package Inheritance;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		//Implicit
		Sub sub = new Sub();
		Super sup  = sub;
		//Super sup = new Sub(); same thing
		sup.greet();
		
		System.out.println(" ====== ");
		
		//Explicit (Sub)  is type casting
		Super sups = new Super();
		//Sub sub =  new Super(); can't be done
		Sub subs = (Sub) sups;
		
	}

}
 