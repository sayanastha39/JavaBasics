package javabasic;

import java.util.Scanner;

public class HW8 {

	public static void main(String[] args) {
		//convert Fahrenheit to Celsius and Celsius to Fahrenheit.
		
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter celcius: ");
		int c = input.nextInt();
		System.out.println ("Enter fahrenheit: ");
		int f = input.nextInt();
		
		int ctof = (c*9/5)+32;
		int ftoc = 5/9*(f-32);
		
		System.out.println ("Fahrenheit to Celsius is : " + ftoc);
		System.out.println ("Celsius to Fahrenheit is : " + ctof);
		

	}

}
