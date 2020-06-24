package inclass;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = input.nextInt();
		
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
			
		System.out.println("Sum of a " + a + " and b " + b+ " is:" + sum);
		System.out.println("Subtraction of a " + a + " and b " + b+ " is:" + sub);
		System.out.println("Multiplication of a " + a + " and b " + b+ " is:" + mul);
		System.out.println("Division of a " + a + " and b " + b+ " is:" + div);
		
		
		

	}
	

}
