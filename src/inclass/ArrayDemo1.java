package inclass;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		// <datatype> [] <arrayname> = new <datatype> [size of array]; is the convention
		int [] arr = new int[3]; // way to define array
		System.out.println(arr); //prints out object id
		System.out.println(arr.length); //prints out size of array
		System.out.println(arr[0]); //prints the element in that index here default is 0 for int since nothing is assigned 
		System.out.println(arr[1]);
		
		//assign value in the array
		arr[2] = 5;
		System.out.println(arr[2]);
		 
	}

}
