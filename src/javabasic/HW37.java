package javabasic;

public class HW37 {
	
	public static void sumOfArray(int arr1[][], int arr2[][]) {
		
		int[][] sum =  new int[3][3];
		
		for (int i =0; i< arr1.length; i++) {
			for (int j =0; j< arr2.length; j++) {
				sum [i][j]= arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		int[][] list1 = {{23,54,43}, {33,11,77}, {11,20,32}};
		int[][] list2 = {{11,23,21}, {17,29,22}, {23,42,22}};
		sumOfArray(list1, list2);
	}
}
