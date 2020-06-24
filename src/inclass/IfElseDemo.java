package inclass;

public class IfElseDemo {

	public static void main(String[] args) {
		int a= 9;
		int b= 9;
		
		if (a<b) {
			System.out.println("a is lesser than b");
		}
		else if(a==b){
			System.out.println("a is equal to b");
		}
		else if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("invalid input");
		}
		
		
	}

}
