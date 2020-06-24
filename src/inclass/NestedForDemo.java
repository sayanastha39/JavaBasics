package inclass;

public class NestedForDemo {

	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println(i  + " " + j);
			}
			System.out.println();
		}
		
		System.out.println("Exited loop");
	}

}
