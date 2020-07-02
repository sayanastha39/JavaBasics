package javabasic;

public class HW34 {
	//to reverse the element of an array
	public static void reverse(int arr[], int start, int end) {
		
			while (start < end) 
		    { 
		        int temp = arr[start];  
		        arr[start] = arr[end]; 
		        arr[end] = temp; 
		        start++; 
		        end--; 
		    } 
	}
	
	public static void printArray(int arr[],  int size) { 
			for (int i = 0; i < size; i++) 
			System.out.print(arr[i] + " ");  
	}   

	public static void main(String[] args) {
		int[] list = new int []{23, 54, 43, 33,11,77};
		reverse( list,0, list.length-1);
		 printArray(list,list.length);
		
	}

}
