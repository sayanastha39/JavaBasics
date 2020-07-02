package inclass;

import java.util.Scanner;

public class ArrayDemo5 {
	
	//print array elements
		public static void printArray(String[]arr) {
			for (int i=0; i<arr.length; i++) {
				System.out.print("[" + arr[i] + "]");
			}
		}
	
	//return array which doesn't take input as an argument
	
		public static String[] returnArray(Scanner input) {
			System.out.println("Enter size of an array");
			int size = input.nextInt();
			String[] arr = new String[size];
			
			for(int i =0; i<arr.length; i++) {
				System.out.println("Enter the element for " + i+ " th element");
				arr[i] = input.next();
			}
			return arr;
		}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String[] ar =  returnArray(input);
		printArray(ar);
	}

}
