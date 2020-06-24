package javabasic;

import java.util.Scanner;

public class HW14 {

	public static void main(String[] args) {
		// two integers entered by user using = =or > or < sign
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a first number ");
		int a = input.nextInt();
		System.out.println("Enter a second number ");
		int b = input.nextInt();
		
		if(a<b) {
			System.out.println("a is less than b");
		}
		else if(a>b) {
			System.out.println("a is greater than b");
		}
		else if(a==b) {
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("invalid inputs");
		}
	}

}
