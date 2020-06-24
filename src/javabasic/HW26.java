package javabasic;

import java.util.Scanner;

public class HW26 {

	public static void main(String[] args) {
		//reverse the given number. 123 => 321
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number you want to reverse: ");
		int number = input.nextInt();
		
		int reversed =0;
		
		while(number!=0) {
			int digit = number%10;
			reversed = (reversed*10)+digit;
			number = number/10;
		}
		System.out.println(reversed);
		
	}

}
