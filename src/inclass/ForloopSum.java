package inclass;

import java.util.Scanner;

public class ForloopSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = input.nextInt();
		
		int sum = 0;
		for (int i = 0; i<=n; i++) {
			sum = sum+i;
			
		}
		System.out.println("sum of the entered number is " + sum);
	}

}
