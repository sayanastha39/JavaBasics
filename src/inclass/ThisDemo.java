package inclass;

public class ThisDemo {
	//instance variable
	int a= 4;
	
	public void print() {
		System.out.println(a);
		int a= 5; //global variable is hiding the instance variable now which is called shadowing
		System.out.println(a);
		//int sum = a+a; //10
		int sum = a+this.a; //9
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		ThisDemo ob = new ThisDemo();
		
		ob.print();
	}

}
