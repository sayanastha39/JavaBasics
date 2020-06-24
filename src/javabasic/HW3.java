package javabasic;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
		//find sum and average of two numbers input by User 
		
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter first number: ");
		int a = input.nextInt();
		System.out.println ("Enter second number: ");
		int b = input.nextInt();
		
		int sum = a+b;
		int avg = sum/2;
		
		System.out.println("The sum of two input number is " + sum);
		System.out.println("The average of two input number is "+ avg);
		
	}

}
