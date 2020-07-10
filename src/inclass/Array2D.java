package inclass;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row = 2;
		int column = 3;
		//int [][]arr =  {{1,2,3}, {4,5,6}};
		int [][]arr =  new int [row][column];
		for(int i=0; i<row; i++) {
			for (int j =0; j<column; j++) {
				System.out.println("Enter the number: ");
				arr[i][j] = input.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			for (int j =0; j<column; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	
	}

}
