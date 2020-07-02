package javabasic;

public class HW36 {
	
	//find duplicate elements in an array.
	public static void duplicate (int arr[]) {
		
		for (int i =0; i<arr.length; i++) {
			for (int j =i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+ " ");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		int[] list = {4, 2, 4, 5, 2, 3, 1};
		duplicate(list);
	}

}
