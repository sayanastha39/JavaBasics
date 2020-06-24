package javabasic;

import java.util.Scanner;

public class HW13 {

	public static void main(String[] args) {
		//print the number entered by user only if the number entered is negative.
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a negative number ");
		int a = input.nextInt();
		if(a<0) {
			System.out.println(a + " is a negative number");
		}
		else {
			System.out.println(" Invalid input or a non negative number");
		}
	}

}
