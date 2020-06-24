package javabasic;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		
		// calculate Simple Interest input by user
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter principal: ");
		int p = input.nextInt();
		System.out.println ("Enter rate: ");
		int r = input.nextInt();
		System.out.println ("Enter time: ");
		int t = input.nextInt();
		
		int si = (p*t*r)/100;
		System.out.println("The simple interest is "+ si);
		
	}

}
