package javabasic;

import java.util.Scanner;

public class HW17 {

	public static void main(String[] args) {
		//calculate leap year.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int a = input.nextInt();
		
		if(a%4 == 0) {
			if(a%100==0) {
				if(a%400==0) {
					System.out.println("is a leap year");
				}else {
					System.out.println("not a leap year");
				}
				
			}else {
				System.out.println("is a leap year");
			}
		}
		else {
			System.out.println("not a leap year");
		}

	}

}
