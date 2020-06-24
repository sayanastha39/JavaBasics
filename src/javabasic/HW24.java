package javabasic;

import java.util.Scanner;

public class HW24 {

	public static void main(String[] args) {
		//print the factorial number of given numbers.
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number to print its factorial: ");
		int n = input.nextInt();
		for (int i =1; i<=n; i++) {
			if ((n%i) == 0){
				System.out.print(i + " ");
			}
		}
	}

}
