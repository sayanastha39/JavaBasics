package inclass;


public class ArrayDemo4 {

	//print array elements
	public static void printArray(int[]arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.print("[" + arr[i] + "]");
		}
	}
	
	public static void main(String[] args) {
		
		int[] ar =  {1,2,3,4};
		
		printArray(ar);
		System.out.println("");
		printArray(new int[]{20, 12,18,34});
	}

}
