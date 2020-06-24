package javabasic;

import java.util.Scanner;

public class HW22 {

	public static void main(String[] args) {
		// print the table of given number
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number to print its table: ");
		int n = input.nextInt();
		System.out.println("The table of given number is shown below");
		
		for (int i =1; i<=10; i++) {
			int table = i*n;
			System.out.println(n+ " * "+ i+ " ="+ table);
			
		}

	}

}
