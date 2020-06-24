package javabasic;

import java.util.Scanner;

public class HW20 {

	public static void main(String[] args) {
		//four-function calculator
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter any math operation: + - * / ");
		String operation= input.nextLine();

		System.out.println("Enter first number");
		int a = input.nextInt();
		System.out.println("Enter second number");
		int b = input.nextInt();
		
		switch(operation){
		case "+":
			int sum = a+b;
			System.out.println("Sum is:  "+ sum);
			break;
		case "-":
			int sub = a-b;
			System.out.println("Diff is:  "+ sub);
			break;
		case "*":
			int mul = a*b;
			System.out.println("Product is:  "+ mul);
			break;
		case "/":
			int div = a/b;
			System.out.println("Division is:  "+ div);
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
		
	}

}
