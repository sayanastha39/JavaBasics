package javabasic;

import java.util.Scanner;

public class HW29 {
	
	
	
	public static void sum (int a) {
		int sum =0;
		for (int i=1; i<=a; i++) {
			sum = sum+ (i/findFactorial(i));
		}
		System.out.println("sum of nth term is"+ sum);
		
	}
	
	public static int findFactorial(int n) {
		int factorial =1;
		for (int i=1; i<=n; i++) {
			factorial = factorial*i;
		}
		System.out.println("factorial is" + factorial);
		return factorial;
	}
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = input.nextInt();
		
		HW29.sum(n);
		input.close();
	}

}
