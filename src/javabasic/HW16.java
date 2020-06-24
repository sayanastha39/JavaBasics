package javabasic;

import java.util.Scanner;

public class HW16 {

	public static void main(String[] args) {
		//find the given number is even or odd.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = input.nextInt();
		
		if(a%2 == 0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}

	}

}
