package javabasic;

import java.util.Scanner;

public class HW19 {

	public static void main(String[] args) {
		//accept three sides of triangle and display which kind of triangle is formed.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first side: ");
		int a = input.nextInt();
		System.out.println("Enter second side: ");
		int b = input.nextInt();
		System.out.println("Enter third side: ");
		int c = input.nextInt();
		
		if(a==b && b==c) {
			System.out.println("Equiltaeral triangle");
		}
		else if(a==b || a==c || b==c) {
			System.out.println("Isoceles triangle");
		}
		else{
			System.out.println("Scalene triangle");
		}

	}

}
