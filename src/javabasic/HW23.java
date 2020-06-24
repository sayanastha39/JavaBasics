package javabasic;

import java.util.Scanner;

public class HW23 {

	public static void main(String[] args) {
		// sum 1 to nth natural numbers
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number to print its sum: ");
		int n = input.nextInt();
		int sum =0;
		
		for(int i=0; i<=n; i++) {
			sum = (i*(i+1))/2;
			
		}
		System.out.println("Sum 1 to nth natural numbers is: " +sum);

	}

}
