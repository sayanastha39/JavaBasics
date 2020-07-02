package javabasic;

import java.util.Scanner;

public class HW32 {
	
	// accepts 5 values in array and display their sum.
	public static int[] returnArray(Scanner input) {
		System.out.println("Enter size of an array");
		int size = input.nextInt();
		int[] arr = new int[size];
		
		for(int i =0; i<arr.length; i++) {
			System.out.println("Enter the element for " + i+ " th element");
			arr[i] = input.nextInt();
		}
		return arr;
	}
	
	//... don't need to create an array and data can be variable number
		//(String name, int ...arr) has to be last argument 
		public static void SumArray(int ...arr) {
			int sum  =0;
			for (int i =0; i<arr.length; i++) {
				sum = sum+arr[i];
			}
			System.out.println("The sum of elements of the array is "+ sum);
		}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] arr = returnArray(input);
		SumArray(arr);
	}

}
