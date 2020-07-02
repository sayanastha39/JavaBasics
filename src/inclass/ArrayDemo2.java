package inclass;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int [] arr = new int[4];
		int sum  =0;
		//to input value in array
		for(int i =0; i<arr.length; i++) {
			System.out.println("Enter the element for " + i+ " th element");
			arr[i] = input.nextInt();
		}
		
		// to calculate the sum of the array element
		for (int i =0; i<arr.length; i++) {
			sum = sum+arr[i];
		}
		System.out.println("The sum of elements of the array is "+ sum);

	}

}
