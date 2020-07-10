package inclass;

public class Array2Ddemo {

	public static void main(String[] args) {
		int[][] arr = {{11,22,33},{44,55,66}};
		
		for(int [] a:arr) {
			for(int b:a) {
				System.out.print(b+ " ");
			}
			System.out.println();
		}
		
	}

}
