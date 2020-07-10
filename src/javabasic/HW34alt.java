package javabasic;

public class HW34alt {
	
	public static int[] reverse(int arr[]) {
		
		int[] reverse = new int[arr.length];
		int a = arr.length -1;
		for (int i =0; i<arr.length; i++) {
			reverse[i] = arr[a];
			a--;
		}
		
		return reverse;
		
	}

	public static void printArray(int arr[]) { 
			for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i] + " ");  
	} 

	public static void main(String[] args) {
		int[] list = {23, 54, 43, 33,11,77};
		int[] reversedArray = reverse(list);
		printArray(reversedArray);
	}

}
