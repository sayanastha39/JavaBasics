package javabasic;

import java.util.Scanner;

public class HW9 {

	public static void main(String[] args) {
		// converts pounds into kg
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter number of pounds: ");
		double pounds = input.nextDouble();
		
		double kg = 0.454*pounds;
		
		System.out.println("Pound to kg is: " + kg);
		
		
	}

}
