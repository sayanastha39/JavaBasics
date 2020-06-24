package javabasic;

import java.util.Scanner;

public class HW11 {

	public static void main(String[] args) {
		// swap two numbers using temp variable
		
		Scanner input = new Scanner(System.in);
		System.out.println("first: ");
		int first = input.nextInt();
		System.out.println("second: ");
		int second = input.nextInt();
		
		int temp = first;
		
		first = second;
		second = temp;
		System.out.println("Swapped first: "+ first);
		System.out.println("Swapped second: "+ second);
		
		System.out.println("=============");
		
		// swap two numbers without using temp variable
		
		System.out.println("first: ");
		int a = input.nextInt();
		System.out.println("second: ");
		int b = input.nextInt();
		
		a=a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("Swapped first: "+ a);
		System.out.println("Swapped second: "+ b);
	}

}
