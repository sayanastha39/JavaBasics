package javabasic;

import java.util.Scanner;

public class HW18 {

	public static void main(String[] args) {
		// largest number from given three values.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = input.nextInt();
		System.out.println("Enter second number: ");
		int b = input.nextInt();
		System.out.println("Enter third number: ");
		int c = input.nextInt();
		
		if(a>b && a>c) {
			System.out.println(" first is the largest number");
		}
		else if (b >a && b>c) {
			System.out.println(" second is the largest number");
		}
		else {
			System.out.println(" third is the largest number");
	
		}
	}

}
