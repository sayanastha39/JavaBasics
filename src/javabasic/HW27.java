package javabasic;

import java.util.Scanner;

public class HW27 {

	public static void main(String[] args) {
		//sum each digit of given number as well as product
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		int sum =0;
		int product = 1;
		
		
		while (number!=0) {
			int digit = number%10;
			sum = sum+digit;
			product = product *digit;
			number = number/10;
			
		}
		System.out.println("The sum is: "+ sum);
		System.out.println("The product is: "+ product);

	}

}
