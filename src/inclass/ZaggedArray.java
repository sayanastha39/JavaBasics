package inclass;

public class ZaggedArray {

	public static void main(String[] args) {
		
		int [][] arr = new int [3][];
		
		arr[0] = new int[1];
		arr[0][0] = 10;
		
		arr[1] = new int[2];
		arr[1][0] = 11;
		arr[1][1] = 12;
		
		arr[2] = new int[3];
		arr[2][0] = 13;
		arr[2][1] = 14;
		arr[2][2] = 15;
		
		for (int [] ar:arr) {
			for(int a:ar) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
