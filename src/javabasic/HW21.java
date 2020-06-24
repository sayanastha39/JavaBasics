package javabasic;

import java.util.Scanner;

public class HW21 {

	public static void main(String[] args) {
		//(1...7) and translate to its equivalent name of the day of the week.
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number");
		int a = input.nextInt();
		
		switch(a){
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("MONDAY");
			break;
		case 3:
			System.out.println("TUESDAY");
			break;
		case 4:
			System.out.println("WEDNESDAY");
			break;
		case 5:
			System.out.println("THURSDAY");
			break;
		case 6:
			System.out.println("FRIDAY");
			break;
		case 7:
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println("Wrong input");
			break;
		}

	}

}
