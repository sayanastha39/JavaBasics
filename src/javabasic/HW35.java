package javabasic;

public class HW35 {
	//find second largest number in given array.
	//display number in ascending order in array.
		public static void second(int ...arr) {
			int temp;
			
			for(int i=0; i< arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) { //iterates arr.length times when i =0
	                if (arr[i] > arr[j]) 
	                {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
			}
			System.out.print("Array Elements in Ascending Order: ");
	        for (int i = 0; i < arr.length - 1; i++) 
	        {
	           
	        }
	        System.out.print(arr[arr.length - 2]);
			
		}

	public static void main(String[] args) {
		int[] list = new int []{23, 54,33,11, 44};
		second(list);
	}

}
